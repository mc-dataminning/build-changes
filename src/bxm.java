import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bxm extends bvr {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bup<? extends buo<? super bxm>>> e = ImmutableList.of(bup.c, bup.d, bup.f, bup.r);
   protected static final ImmutableList<btk<?>> bT = ImmutableList.of(btk.n, btk.h, btk.m, btk.E, btk.t, btk.J, btk.O, btk.Q, btk.N, btk.r, btk.Y);

   public bxm(bjx<? extends bvr> $$0, cqz $$1) {
      super($$0, $$1);
      this.bL = new bqj(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bqi(this, 10);
   }

   @Override
   protected bts b(cqz $$0) {
      return new btu(this, $$0);
   }

   @Override
   protected blj.b<bxm> dO() {
      return blj.a(bT, e);
   }

   @Override
   protected blj<?> a(Dynamic<?> $$0) {
      return bxn.a(this.dO().a($$0));
   }

   @Override
   public blj<bxm> dN() {
      return (blj<bxm>)super.dN();
   }

   @Override
   protected aqc gf() {
      return aqd.xJ;
   }

   @Override
   protected void X() {
      this.dL().ad().a("tadpoleBrain");
      this.dN().a((alq)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("tadpoleActivityUpdate");
      bxn.a(this);
      this.dL().ad().c();
      super.X();
   }

   public static blo.a gg() {
      return bkl.A().a(blp.m, 1.0).a(blp.l, 6.0);
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dL().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected aqc w() {
      return null;
   }

   @Nullable
   @Override
   protected aqc d(bir $$0) {
      return aqd.xL;
   }

   @Nullable
   @Override
   protected aqc m_() {
      return aqd.xI;
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bib.a(this.dL().B);
      } else {
         return bvw.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void W() {
      super.W();
      abz.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(ckj $$0) {
      bvw.a(this, $$0);
      rt $$1 = $$0.w();
      $$1.a("Age", this.gh());
   }

   @Override
   public void c(rt $$0) {
      bvw.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public ckj b() {
      return new ckj(ckm.pW);
   }

   @Override
   public aqc y() {
      return aqd.cG;
   }

   private boolean m(ckj $$0) {
      return bxj.bT.a($$0);
   }

   private void a(ccx $$0, ckj $$1) {
      this.b($$0, $$1);
      this.c(bjo.d_(this.gj()));
      this.dL().a(js.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(ccx $$0, ckj $$1) {
      if (!$$0.fT().d) {
         $$1.h(1);
      }
   }

   private int gh() {
      return this.bU;
   }

   private void c(int $$0) {
      this.s(this.bU + $$0 * 20);
   }

   private void s(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.gi();
      }
   }

   private void gi() {
      if (this.dL() instanceof alq $$0) {
         bxj $$1 = bjx.O.a(this.dL());
         if ($$1 != null) {
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.a($$0, this.dL().d_($$1.dl()), bkn.i, null, null);
            $$1.t(this.fU());
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            $$1.fJ();
            this.a(aqd.xK, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ak();
         }
      }
   }

   private int gj() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean eb() {
      return false;
   }
}
