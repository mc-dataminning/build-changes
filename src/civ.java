import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class civ extends cgv {
   public static final bul bY = bul.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cfp<? extends cfo<? super civ>>> bZ = ImmutableList.of(cfp.c, cfp.d, cfp.b, cfp.o, cfp.f, cfp.r);
   protected static final ImmutableList<cei<?>> ca = ImmutableList.of(
      cei.n, cei.h, cei.m, cei.E, cei.t, cei.av, cei.r, cei.S, cei.T, cei.O, cei.K, cei.P, new cei[]{cei.R, cei.V, cei.W, cei.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final ako<Boolean> ch = aks.a(civ.class, akq.k);
   private static final ako<Boolean> ci = aks.a(civ.class, akq.k);
   private static final ako<Boolean> cj = aks.a(civ.class, akq.k);
   private boolean ck;
   private int cl;

   public civ(bup<? extends civ> $$0, dff $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(esf.f, -1.0F);
      this.a(esf.g, -1.0F);
   }

   public cwf q() {
      azv $$0 = azv.a((long)this.cI().hashCode());
      axt<cvy> $$1 = this.gH() ? axl.b : axl.a;
      return this.dY().H_().e(ma.I).a($$1, $$0).map($$0x -> cvz.a(cwj.wA, $$0x)).orElseGet(() -> new cwf(cwj.wA));
   }

   @Override
   protected bwg.b<civ> ef() {
      return bwg.a(ca, bZ);
   }

   @Override
   protected bwg<?> a(Dynamic<?> $$0) {
      return ciw.a(this.ef().a($$0));
   }

   public static bwl.a t() {
      return cgv.gA().a(bwm.s, 10.0).a(bwm.v, 0.2F).a(bwm.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.g(bwm.c).a(1.0);
         this.gz();
      } else {
         this.g(bwm.c).a(2.0);
         this.gy();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected awn w() {
      return this.gH() ? awo.kU : awo.kL;
   }

   @Override
   protected awn d(bsy $$0) {
      return this.gH() ? awo.kX : awo.kO;
   }

   @Override
   protected awn o_() {
      return this.gH() ? awo.kV : awo.kM;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.lc, 0.15F, 1.0F);
   }

   protected awn y() {
      return this.gH() ? awo.kZ : awo.kQ;
   }

   @Nullable
   public civ b(arq $$0, btz $$1) {
      civ $$2 = bup.X.a($$0, buo.e);
      if ($$2 != null) {
         ciw.a($$2, $$0.E_());
         btz $$3 = (btz)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof civ $$4 && $$4.gH() || $$0.E_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bwg<civ> ee() {
      return (bwg<civ>)super.ee();
   }

   @Override
   protected void ac() {
      bor $$0 = boq.a();
      $$0.a("goatBrain");
      this.ee().a((arq)this.dY(), this);
      $$0.c();
      $$0.a("goatActivityUpdate");
      ciw.a(this);
      $$0.c();
      super.ac();
   }

   @Override
   public int ae() {
      return 15;
   }

   @Override
   public void q(float $$0) {
      int $$1 = this.ae();
      float $$2 = azn.c(this.aX, $$0);
      float $$3 = azn.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aX + $$3);
   }

   @Override
   protected void gB() {
      this.dY().a(null, this, this.gH() ? awo.kW : awo.kN, awp.g, 1.0F, azn.b(this.dY().A, 0.8F, 1.2F));
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.af);
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(cwj.qz) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cwf $$3 = cwi.a($$2, $$0, cwj.qF.o());
         $$0.a($$1, $$3);
         return bsh.a;
      } else {
         bsh $$4 = super.b($$0, $$1);
         if ($$4.a() && this.l($$2)) {
            this.gB();
         }

         return $$4;
      }
   }

   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      azv $$4 = $$0.E_();
      ciw.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         ako<Boolean> $$5 = $$4.h() ? ci : cj;
         this.am.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ab() {
      super.ab();
      agv.a(this);
   }

   @Override
   public bul e(bvq $$0) {
      return $$0 == bvq.g ? bY.a(this.el()) : super.e($$0);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gH());
      $$0.a("HasLeftHorn", this.gv());
      $$0.a("HasRightHorn", this.gw());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.x($$0.q("IsScreamingGoat"));
      this.am.a(ci, $$0.q("HasLeftHorn"));
      this.am.a(cj, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.ck = true;
      } else if ($$0 == 59) {
         this.ck = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void n_() {
      if (this.ck) {
         this.cl++;
      } else {
         this.cl -= 2;
      }

      this.cl = azn.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean gv() {
      return this.am.a(ci);
   }

   public boolean gw() {
      return this.am.a(cj);
   }

   public boolean gx() {
      boolean $$0 = this.gv();
      boolean $$1 = this.gw();
      if (!$$0 && !$$1) {
         return false;
      } else {
         ako<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.af.h() ? ci : cj;
         }

         this.am.a($$2, false);
         ezr $$5 = this.dw();
         cwf $$6 = this.q();
         double $$7 = (double)azn.b(this.af, -0.2F, 0.2F);
         double $$8 = (double)azn.b(this.af, 0.3F, 0.7F);
         double $$9 = (double)azn.b(this.af, -0.2F, 0.2F);
         ckz $$10 = new ckz(this.dY(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dY().b($$10);
         return true;
      }
   }

   public void gy() {
      this.am.a(ci, true);
      this.am.a(cj, true);
   }

   public void gz() {
      this.am.a(ci, false);
      this.am.a(cj, false);
   }

   public boolean gH() {
      return this.am.a(ch);
   }

   public void x(boolean $$0) {
      this.am.a(ch, $$0);
   }

   public float gI() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bup<? extends cgv> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axd.ca) && a($$1, $$3);
   }
}
