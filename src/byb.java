import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class byb extends bwg {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bve<? extends bvd<? super byb>>> e = ImmutableList.of(bve.c, bve.d, bve.f, bve.r);
   protected static final ImmutableList<btz<?>> bT = ImmutableList.of(btz.n, btz.h, btz.m, btz.E, btz.t, btz.J, btz.O, btz.Q, btz.N, btz.r, btz.Y);

   public byb(bkm<? extends bwg> $$0, crs $$1) {
      super($$0, $$1);
      this.bL = new bqy(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bqx(this, 10);
   }

   @Override
   protected buh b(crs $$0) {
      return new buj(this, $$0);
   }

   @Override
   protected bly.b<byb> dO() {
      return bly.a(bT, e);
   }

   @Override
   protected bly<?> a(Dynamic<?> $$0) {
      return byc.a(this.dO().a($$0));
   }

   @Override
   public bly<byb> dN() {
      return (bly<byb>)super.dN();
   }

   @Override
   protected aqm gf() {
      return aqn.xL;
   }

   @Override
   protected void X() {
      this.dL().ad().a("tadpoleBrain");
      this.dN().a((ama)this.dL(), this);
      this.dL().ad().c();
      this.dL().ad().a("tadpoleActivityUpdate");
      byc.a(this);
      this.dL().ad().c();
      super.X();
   }

   public static bmd.a gg() {
      return bla.A().a(bme.m, 1.0).a(bme.l, 6.0);
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dL().B) {
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
   protected aqm w() {
      return null;
   }

   @Nullable
   @Override
   protected aqm d(bjg $$0) {
      return aqn.xN;
   }

   @Nullable
   @Override
   protected aqm m_() {
      return aqn.xK;
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return biq.a(this.dL().B);
      } else {
         return bwl.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void W() {
      super.W();
      aci.a(this);
   }

   @Override
   public boolean t() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(clb $$0) {
      bwl.a(this, $$0);
      rz $$1 = $$0.w();
      $$1.a("Age", this.gh());
   }

   @Override
   public void c(rz $$0) {
      bwl.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public clb b() {
      return new clb(cle.pW);
   }

   @Override
   public aqm y() {
      return aqn.cG;
   }

   private boolean m(clb $$0) {
      return bxy.bT.a($$0);
   }

   private void a(cdm $$0, clb $$1) {
      this.b($$0, $$1);
      this.c(bkd.d_(this.gj()));
      this.dL().a(js.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cdm $$0, clb $$1) {
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
      if (this.dL() instanceof ama $$0) {
         bxy $$1 = bkm.O.a(this.dL());
         if ($$1 != null) {
            $$1.b(this.dq(), this.ds(), this.dw(), this.dB(), this.dD());
            $$1.a($$0, this.dL().d_($$1.dl()), blc.i, null, null);
            $$1.t(this.fU());
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            $$1.fJ();
            this.a(aqn.xM, 0.15F, 1.0F);
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
