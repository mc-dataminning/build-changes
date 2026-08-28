import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cim extends cgm {
   public static final buc bY = buc.b(0.9F, 1.3F).a(0.7F);
   private static final int cf = 2;
   private static final int cg = 1;
   protected static final ImmutableList<cfg<? extends cff<? super cim>>> bZ = ImmutableList.of(cfg.c, cfg.d, cfg.b, cfg.o, cfg.f, cfg.r);
   protected static final ImmutableList<cdz<?>> ca = ImmutableList.of(
      cdz.n, cdz.h, cdz.m, cdz.E, cdz.t, cdz.av, cdz.r, cdz.S, cdz.T, cdz.O, cdz.K, cdz.P, new cdz[]{cdz.R, cdz.V, cdz.W, cdz.Z}
   );
   public static final int cc = 10;
   public static final double cd = 0.02;
   public static final double ce = 0.1F;
   private static final akk<Boolean> ch = ako.a(cim.class, akm.k);
   private static final akk<Boolean> ci = ako.a(cim.class, akm.k);
   private static final akk<Boolean> cj = ako.a(cim.class, akm.k);
   private boolean ck;
   private int cl;

   public cim(bug<? extends cim> $$0, dev $$1) {
      super($$0, $$1);
      this.P().a(true);
      this.a(erv.f, -1.0F);
      this.a(erv.g, -1.0F);
   }

   public cvx q() {
      azr $$0 = azr.a((long)this.cH().hashCode());
      axp<cvq> $$1 = this.gH() ? axh.b : axh.a;
      return this.dX().H_().e(ly.I).a($$1, $$0).map($$0x -> cvr.a(cwb.wk, $$0x)).orElseGet(() -> new cvx(cwb.wk));
   }

   @Override
   protected bvx.b<cim> ee() {
      return bvx.a(ca, bZ);
   }

   @Override
   protected bvx<?> a(Dynamic<?> $$0) {
      return cin.a(this.ee().a($$0));
   }

   public static bwc.a t() {
      return cgm.gA().a(bwd.s, 10.0).a(bwd.v, 0.2F).a(bwd.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.g(bwd.c).a(1.0);
         this.gz();
      } else {
         this.g(bwd.c).a(2.0);
         this.gy();
      }
   }

   @Override
   protected int e(float $$0, float $$1) {
      return super.e($$0, $$1) - 10;
   }

   @Override
   protected awj w() {
      return this.gH() ? awk.kU : awk.kL;
   }

   @Override
   protected awj d(bsp $$0) {
      return this.gH() ? awk.kX : awk.kO;
   }

   @Override
   protected awj o_() {
      return this.gH() ? awk.kV : awk.kM;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.lc, 0.15F, 1.0F);
   }

   protected awj y() {
      return this.gH() ? awk.kZ : awk.kQ;
   }

   @Nullable
   public cim b(arm $$0, btq $$1) {
      cim $$2 = bug.X.a($$0, buf.e);
      if ($$2 != null) {
         cin.a($$2, $$0.E_());
         btq $$3 = (btq)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cim $$4 && $$4.gH() || $$0.E_().j() < 0.02;
         $$2.x($$5);
      }

      return $$2;
   }

   @Override
   public bvx<cim> ed() {
      return (bvx<cim>)super.ed();
   }

   @Override
   protected void ac() {
      this.dX().ah().a("goatBrain");
      this.ed().a((arm)this.dX(), this);
      this.dX().ah().c();
      this.dX().ah().a("goatActivityUpdate");
      cin.a(this);
      this.dX().ah().c();
      super.ac();
   }

   @Override
   public int ae() {
      return 15;
   }

   @Override
   public void q(float $$0) {
      int $$1 = this.ae();
      float $$2 = azj.c(this.aU, $$0);
      float $$3 = azj.a($$2, (float)(-$$1), (float)$$1);
      super.q(this.aU + $$3);
   }

   @Override
   protected void gB() {
      this.dX().a(null, this, this.gH() ? awk.kW : awk.kN, awl.g, 1.0F, azj.b(this.dX().A, 0.8F, 1.2F));
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.ac);
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(cwb.qz) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         cvx $$3 = cwa.a($$2, $$0, cwb.qF.o());
         $$0.a($$1, $$3);
         return bry.a;
      } else {
         bry $$4 = super.b($$0, $$1);
         if ($$4.a() && this.l($$2)) {
            this.gB();
         }

         return $$4;
      }
   }

   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      azr $$4 = $$0.E_();
      cin.a(this, $$4);
      this.x($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         akk<Boolean> $$5 = $$4.h() ? ci : cj;
         this.am.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void ab() {
      super.ab();
      agr.a(this);
   }

   @Override
   public buc e(bvh $$0) {
      return $$0 == bvh.g ? bY.a(this.ek()) : super.e($$0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gH());
      $$0.a("HasLeftHorn", this.gv());
      $$0.a("HasRightHorn", this.gw());
   }

   @Override
   public void a(uj $$0) {
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

      this.cl = azj.a(this.cl, 0, 20);
      super.n_();
   }

   @Override
   protected void a(ako.a $$0) {
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
         akk<Boolean> $$2;
         if (!$$0) {
            $$2 = cj;
         } else if (!$$1) {
            $$2 = ci;
         } else {
            $$2 = this.af.h() ? ci : cj;
         }

         this.am.a($$2, false);
         ezh $$5 = this.dv();
         cvx $$6 = this.q();
         double $$7 = (double)azj.b(this.af, -0.2F, 0.2F);
         double $$8 = (double)azj.b(this.af, 0.3F, 0.7F);
         double $$9 = (double)azj.b(this.af, -0.2F, 0.2F);
         ckq $$10 = new ckq(this.dX(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dX().b($$10);
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

   public static boolean c(bug<? extends cgm> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.a_($$3.e()).a(awz.ca) && a($$1, $$3);
   }
}
