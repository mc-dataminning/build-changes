import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class byo extends bwt {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bvr<? extends bvq<? super byo>>> e = ImmutableList.of(bvr.c, bvr.d, bvr.f, bvr.r);
   protected static final ImmutableList<bum<?>> bT = ImmutableList.of(bum.n, bum.h, bum.m, bum.E, bum.t, bum.J, bum.O, bum.Q, bum.N, bum.r, bum.Y);

   public byo(bkz<? extends bwt> $$0, csf $$1) {
      super($$0, $$1);
      this.bL = new brl(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new brk(this, 10);
   }

   @Override
   protected buu b(csf $$0) {
      return new buw(this, $$0);
   }

   @Override
   protected bml.b<byo> dQ() {
      return bml.a(bT, e);
   }

   @Override
   protected bml<?> a(Dynamic<?> $$0) {
      return byp.a(this.dQ().a($$0));
   }

   @Override
   public bml<byo> dP() {
      return (bml<byo>)super.dP();
   }

   @Override
   protected aqu gg() {
      return aqv.yc;
   }

   @Override
   protected void Z() {
      this.dN().ae().a("tadpoleBrain");
      this.dP().a((ami)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("tadpoleActivityUpdate");
      byp.a(this);
      this.dN().ae().c();
      super.Z();
   }

   public static bmq.a gh() {
      return bln.C().a(bmr.m, 1.0).a(bmr.l, 6.0);
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dN().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected aqu y() {
      return null;
   }

   @Nullable
   @Override
   protected aqu d(bjt $$0) {
      return aqv.ye;
   }

   @Nullable
   @Override
   protected aqu n_() {
      return aqv.yb;
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bjb.a(this.dN().B);
      } else {
         return bwy.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      aco.a(this);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(clo $$0) {
      bwy.a(this, $$0);
      sd $$1 = $$0.w();
      $$1.a("Age", this.gi());
   }

   @Override
   public void c(sd $$0) {
      bwy.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public clo b() {
      return new clo(clr.qH);
   }

   @Override
   public aqu A() {
      return aqv.cG;
   }

   private boolean m(clo $$0) {
      return byl.bT.a($$0);
   }

   private void a(cdz $$0, clo $$1) {
      this.b($$0, $$1);
      this.c(bkq.d_(this.gk()));
      this.dN().a(jw.K, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cdz $$0, clo $$1) {
      if (!$$0.fU().d) {
         $$1.h(1);
      }
   }

   private int gi() {
      return this.bU;
   }

   private void c(int $$0) {
      this.s(this.bU + $$0 * 20);
   }

   private void s(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.gj();
      }
   }

   private void gj() {
      if (this.dN() instanceof ami $$0) {
         byl $$1 = bkz.O.a(this.dN());
         if ($$1 != null) {
            $$1.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$1.a($$0, this.dN().d_($$1.dn()), blp.i, null, null);
            $$1.t(this.fV());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fK();
            this.a(aqv.yd, 0.15F, 1.0F);
            $$0.a_($$1);
            this.am();
         }
      }
   }

   private int gk() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean ed() {
      return false;
   }
}
