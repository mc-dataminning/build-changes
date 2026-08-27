import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bwe extends buj {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<bth<? extends btg<? super bwe>>> e = ImmutableList.of(bth.c, bth.d, bth.f, bth.r);
   protected static final ImmutableList<bsc<?>> bT = ImmutableList.of(bsc.n, bsc.h, bsc.m, bsc.E, bsc.t, bsc.J, bsc.O, bsc.Q, bsc.N, bsc.r, bsc.Y);

   public bwe(bip<? extends buj> $$0, cpq $$1) {
      super($$0, $$1);
      this.bL = new bpb(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bpa(this, 10);
   }

   @Override
   protected bsk b(cpq $$0) {
      return new bsm(this, $$0);
   }

   @Override
   protected bkb.b<bwe> dN() {
      return bkb.a(bT, e);
   }

   @Override
   protected bkb<?> a(Dynamic<?> $$0) {
      return bwf.a(this.dN().a($$0));
   }

   @Override
   public bkb<bwe> dM() {
      return (bkb<bwe>)super.dM();
   }

   @Override
   protected aoy gb() {
      return aoz.xH;
   }

   @Override
   protected void V() {
      this.dK().ad().a("tadpoleBrain");
      this.dM().a((akn)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("tadpoleActivityUpdate");
      bwf.a(this);
      this.dK().ad().c();
      super.V();
   }

   public static bkg.a gc() {
      return bjd.x().a(bkh.d, 1.0).a(bkh.a, 6.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected aoy r() {
      return null;
   }

   @Nullable
   @Override
   protected aoy d(bhj $$0) {
      return aoz.xJ;
   }

   @Nullable
   @Override
   protected aoy h_() {
      return aoz.xG;
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bgt.a(this.dK().B);
      } else {
         return buo.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void T() {
      super.T();
      aay.a(this);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(cja $$0) {
      buo.a(this, $$0);
      qu $$1 = $$0.w();
      $$1.a("Age", this.gd());
   }

   @Override
   public void c(qu $$0) {
      buo.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public cja b() {
      return new cja(cjd.pW);
   }

   @Override
   public aoy t() {
      return aoz.cG;
   }

   private boolean m(cja $$0) {
      return bwb.bT.a($$0);
   }

   private void a(cbp $$0, cja $$1) {
      this.b($$0, $$1);
      this.c(big.d_(this.gf()));
      this.dK().a(ix.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cbp $$0, cja $$1) {
      if (!$$0.fR().d) {
         $$1.h(1);
      }
   }

   private int gd() {
      return this.bU;
   }

   private void c(int $$0) {
      this.s(this.bU + $$0 * 20);
   }

   private void s(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.ge();
      }
   }

   private void ge() {
      if (this.dK() instanceof akn $$0) {
         bwb $$1 = bip.O.a(this.dK());
         if ($$1 != null) {
            $$1.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$1.a($$0, this.dK().d_($$1.dk()), bjf.i, null, null);
            $$1.t(this.fQ());
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            $$1.fF();
            this.a(aoz.xI, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ak();
         }
      }
   }

   private int gf() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean ea() {
      return false;
   }
}
