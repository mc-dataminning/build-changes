import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class byj extends bwo {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bvm<? extends bvl<? super byj>>> e = ImmutableList.of(bvm.c, bvm.d, bvm.f, bvm.r);
   protected static final ImmutableList<buh<?>> bT = ImmutableList.of(buh.n, buh.h, buh.m, buh.E, buh.t, buh.J, buh.O, buh.Q, buh.N, buh.r, buh.Y);

   public byj(bku<? extends bwo> $$0, csa $$1) {
      super($$0, $$1);
      this.bL = new brg(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new brf(this, 10);
   }

   @Override
   protected bup b(csa $$0) {
      return new bur(this, $$0);
   }

   @Override
   protected bmg.b<byj> dQ() {
      return bmg.a(bT, e);
   }

   @Override
   protected bmg<?> a(Dynamic<?> $$0) {
      return byk.a(this.dQ().a($$0));
   }

   @Override
   public bmg<byj> dP() {
      return (bmg<byj>)super.dP();
   }

   @Override
   protected aqq gg() {
      return aqr.yc;
   }

   @Override
   protected void Z() {
      this.dN().ae().a("tadpoleBrain");
      this.dP().a((ame)this.dN(), this);
      this.dN().ae().c();
      this.dN().ae().a("tadpoleActivityUpdate");
      byk.a(this);
      this.dN().ae().c();
      super.Z();
   }

   public static bml.a gh() {
      return bli.C().a(bmm.m, 1.0).a(bmm.l, 6.0);
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dN().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected aqq y() {
      return null;
   }

   @Nullable
   @Override
   protected aqq d(bjo $$0) {
      return aqr.ye;
   }

   @Nullable
   @Override
   protected aqq m_() {
      return aqr.yb;
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bix.a(this.dN().B);
      } else {
         return bwt.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void Y() {
      super.Y();
      ack.a(this);
   }

   @Override
   public boolean w() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(clj $$0) {
      bwt.a(this, $$0);
      rz $$1 = $$0.w();
      $$1.a("Age", this.gi());
   }

   @Override
   public void c(rz $$0) {
      bwt.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public clj b() {
      return new clj(clm.qH);
   }

   @Override
   public aqq A() {
      return aqr.cG;
   }

   private boolean m(clj $$0) {
      return byg.bT.a($$0);
   }

   private void a(cdu $$0, clj $$1) {
      this.b($$0, $$1);
      this.c(bkl.d_(this.gk()));
      this.dN().a(js.K, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cdu $$0, clj $$1) {
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
      if (this.dN() instanceof ame $$0) {
         byg $$1 = bku.O.a(this.dN());
         if ($$1 != null) {
            $$1.b(this.ds(), this.du(), this.dy(), this.dD(), this.dF());
            $$1.a($$0, this.dN().d_($$1.dn()), blk.i, null, null);
            $$1.t(this.fV());
            if (this.ae()) {
               $$1.b(this.af());
               $$1.n(this.cB());
            }

            $$1.fK();
            this.a(aqr.yd, 0.15F, 1.0F);
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
