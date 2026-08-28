import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class ciy extends cgy {
   public static final buo bY = buo.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cfs<? extends cfr<? super ciy>>> bZ = ImmutableList.of(cfs.c, cfs.d, cfs.b, cfs.o, cfs.f, cfs.r);
   protected static final ImmutableList<cel<?>> ca = ImmutableList.of(
      cel.n, cel.h, cel.m, cel.E, cel.t, cel.av, cel.r, cel.S, cel.T, cel.O, cel.K, cel.P, new cel[]{cel.R, cel.V, cel.W, cel.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final akm<Boolean> ch = akq.a(ciy.class, ako.k);
   private static final akm<Boolean> ci = akq.a(ciy.class, ako.k);
   private static final akm<Boolean> cj = akq.a(ciy.class, ako.k);
   private boolean ck;
   private int cl;

   public ciy(bus<? extends ciy> $$0, dfm $$1) {
      super($$0, $$1);
      this.L().a(true);
      this.a(esm.f, -1.0F);
      this.a(esm.g, -1.0F);
   }

   public cwm n() {
      azu $$0 = azu.a((long)this.cG().hashCode());
      axs<cwf> $$1 = this.gy() ? axk.b : axk.a;
      return this.dV().J_().e(ma.I).a($$1, $$0).map($$0x -> cwg.a(cwq.wA, $$0x)).orElseGet(() -> new cwm(cwq.wA));
   }

   @Override
   protected bwj.b<ciy> ec() {
      return bwj.a(ca, bZ);
   }

   @Override
   protected bwj<?> a(Dynamic<?> $$0) {
      return ciz.a(this.ec().a($$0));
   }

   public static bwo.a q() {
      return cgy.gr().a(bwp.s, 10.0).a(bwp.v, 0.2F).a(bwp.c, 2.0);
   }

   @Override
   protected void i() {
      if (this.e_()) {
         this.g(bwp.c).a(1.0);
         this.gq();
      } else {
         this.g(bwp.c).a(2.0);
         this.gp();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected awm t() {
      return this.gy() ? awn.kU : awn.kL;
   }

   @Override
   protected awm e(btb $$0) {
      return this.gy() ? awn.kX : awn.kO;
   }

   @Override
   protected awm n_() {
      return this.gy() ? awn.kV : awn.kM;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.lc, 0.15F, 1.0F);
   }

   protected awm v() {
      return this.gy() ? awn.kZ : awn.kQ;
   }

   @Nullable
   public ciy b(arp $$0, buc $$1) {
      ciy $$2 = bus.ag.a($$0, bur.e);
      if ($$2 != null) {
         ciz.a($$2, $$0.G_());
         buc $$3 = (buc)($$0.G_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof ciy $$4 && $$4.gy() || $$0.G_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bwj<ciy> eb() {
      return (bwj<ciy>)super.eb();
   }

   @Override
   protected void a(arp $$0) {
      bou $$1 = bot.a();
      $$1.a("goatBrain");
      this.eb().a($$0, this);
      $$1.c();
      $$1.a("goatActivityUpdate");
      ciz.a(this);
      $$1.c();
      super.a($$0);
   }

   @Override
   public int aa() {
      return 15;
   }

   @Override
   public void q(float $$0) {
      int $$1 = this.aa();
      float $$2 = azm.c(this.aW, $$0);
      float $$3 = azm.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aW + $$3);
   }

   @Override
   protected void gs() {
      this.dV().a(null, this, this.gy() ? awn.kW : awn.kN, awo.g, 1.0F, azm.b(this.dV().A, 0.8F, 1.2F));
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.af);
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(cwq.qz) && !this.e_()) {
         $$0.a(this.v(), 1.0F, 1.0F);
         cwm $$3 = cwp.a($$2, $$0, cwq.qF.o());
         $$0.a($$1, $$3);
         return bsk.a;
      } else {
         bsk $$4 = super.b($$0, $$1);
         if ($$4.a() && this.j($$2)) {
            this.gs();
         }

         return $$4;
      }
   }

   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azu $$4 = $$0.G_();
      ciz.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.i();
      if (!this.e_() && (double)$$4.i() < 0.1F) {
         akm<Boolean> $$5 = $$4.h() ? ci : cj;
         this.al.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void Y() {
      super.Y();
      agt.a(this);
   }

   @Override
   public buo e(bvt $$0) {
      return $$0 == bvt.g ? bY.a(this.ei()) : super.e($$0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gy());
      $$0.a("HasLeftHorn", this.gm());
      $$0.a("HasRightHorn", this.gn());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.x($$0.q("IsScreamingGoat"));
      this.al.a(ci, $$0.q("HasLeftHorn"));
      this.al.a(cj, $$0.q("HasRightHorn"));
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
   public void d_() {
      if (this.ck) {
         this.cl++;
      } else {
         this.cl -= 2;
      }

      this.cl = azm.a(this.cl, 0, 20);
      super.d_();
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
      $$0.a(ci, true);
      $$0.a(cj, true);
   }

   public boolean gm() {
      return this.al.a(ci);
   }

   public boolean gn() {
      return this.al.a(cj);
   }

   public boolean go() {
      boolean $$0 = this.gm();
      boolean $$1 = this.gn();
      if (!$$0 && !$$1) {
         return false;
      } else {
         akm<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.ae.h() ? ci : cj;
         }

         this.al.a($$2, false);
         ezy $$5 = this.dt();
         cwm $$6 = this.n();
         double $$7 = (double)azm.b(this.ae, -0.2F, 0.2F);
         double $$8 = (double)azm.b(this.ae, 0.3F, 0.7F);
         double $$9 = (double)azm.b(this.ae, -0.2F, 0.2F);
         clc $$10 = new clc(this.dV(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dV().b($$10);
         return true;
      }
   }

   public void gp() {
      this.al.a(ci, true);
      this.al.a(cj, true);
   }

   public void gq() {
      this.al.a(ci, false);
      this.al.a(cj, false);
   }

   public boolean gy() {
      return this.al.a(ch);
   }

   public void x(boolean $$0) {
      this.al.a(ch, $$0);
   }

   public float gz() {
      return (float)this.cl / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bus<? extends cgy> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      return $$1.a_($$3.e()).a(axc.ca) && a($$1, $$3);
   }
}
