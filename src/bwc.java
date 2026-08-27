import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bwc extends buh {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<btf<? extends bte<? super bwc>>> e = ImmutableList.of(btf.c, btf.d, btf.f, btf.r);
   protected static final ImmutableList<bsa<?>> bT = ImmutableList.of(bsa.n, bsa.h, bsa.m, bsa.E, bsa.t, bsa.J, bsa.O, bsa.Q, bsa.N, bsa.r, bsa.Y);

   public bwc(bim<? extends buh> $$0, cpm $$1) {
      super($$0, $$1);
      this.bL = new boz(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new boy(this, 10);
   }

   @Override
   protected bsi b(cpm $$0) {
      return new bsk(this, $$0);
   }

   @Override
   protected bjz.b<bwc> dN() {
      return bjz.a(bT, e);
   }

   @Override
   protected bjz<?> a(Dynamic<?> $$0) {
      return bwd.a(this.dN().a($$0));
   }

   @Override
   public bjz<bwc> dM() {
      return (bjz<bwc>)super.dM();
   }

   @Override
   protected aov ga() {
      return aow.xC;
   }

   @Override
   protected void V() {
      this.dK().ad().a("tadpoleBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("tadpoleActivityUpdate");
      bwd.a(this);
      this.dK().ad().c();
      super.V();
   }

   public static bke.a gb() {
      return bja.x().a(bkf.d, 1.0).a(bkf.a, 6.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected aov r() {
      return null;
   }

   @Nullable
   @Override
   protected aov d(bhg $$0) {
      return aow.xE;
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.xB;
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bgq.a(this.dK().B);
      } else {
         return bum.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(ciy $$0) {
      bum.a(this, $$0);
      qr $$1 = $$0.w();
      $$1.a("Age", this.gc());
   }

   @Override
   public void c(qr $$0) {
      bum.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public ciy b() {
      return new ciy(cjb.pW);
   }

   @Override
   public aov t() {
      return aow.cG;
   }

   private boolean m(ciy $$0) {
      return bvz.bT.a($$0);
   }

   private void a(cbn $$0, ciy $$1) {
      this.b($$0, $$1);
      this.c(bid.d_(this.ge()));
      this.dK().a(iv.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cbn $$0, ciy $$1) {
      if (!$$0.fR().d) {
         $$1.h(1);
      }
   }

   private int gc() {
      return this.bU;
   }

   private void c(int $$0) {
      this.s(this.bU + $$0 * 20);
   }

   private void s(int $$0) {
      this.bU = $$0;
      if (this.bU >= b) {
         this.gd();
      }
   }

   private void gd() {
      if (this.dK() instanceof akk $$0) {
         bvz $$1 = bim.O.a(this.dK());
         if ($$1 != null) {
            $$1.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$1.a($$0, this.dK().d_($$1.dk()), bjc.i, null, null);
            $$1.t(this.fQ());
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            $$1.fF();
            this.a(aow.xD, 0.15F, 1.0F);
            $$0.a_($$1);
            this.ak();
         }
      }
   }

   private int ge() {
      return Math.max(0, b - this.bU);
   }

   @Override
   public boolean ea() {
      return false;
   }
}
