import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class bwa extends buf {
   @VisibleForTesting
   public static int b = Math.abs(-24000);
   public static float c = 0.4F;
   public static float d = 0.3F;
   private int bU;
   protected static final ImmutableList<btd<? extends btc<? super bwa>>> e = ImmutableList.of(btd.c, btd.d, btd.f, btd.r);
   protected static final ImmutableList<bry<?>> bT = ImmutableList.of(bry.n, bry.h, bry.m, bry.E, bry.t, bry.J, bry.O, bry.Q, bry.N, bry.r, bry.Y);

   public bwa(bik<? extends buf> $$0, cpk $$1) {
      super($$0, $$1);
      this.bL = new box(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bow(this, 10);
   }

   @Override
   protected bsg b(cpk $$0) {
      return new bsi(this, $$0);
   }

   @Override
   protected bjx.b<bwa> dN() {
      return bjx.a(bT, e);
   }

   @Override
   protected bjx<?> a(Dynamic<?> $$0) {
      return bwb.a(this.dN().a($$0));
   }

   @Override
   public bjx<bwa> dM() {
      return (bjx<bwa>)super.dM();
   }

   @Override
   protected aot ga() {
      return aou.xC;
   }

   @Override
   protected void V() {
      this.dK().ad().a("tadpoleBrain");
      this.dM().a((aki)this.dK(), this);
      this.dK().ad().c();
      this.dK().ad().a("tadpoleActivityUpdate");
      bwb.a(this);
      this.dK().ad().c();
      super.V();
   }

   public static bkc.a gb() {
      return biy.x().a(bkd.d, 1.0).a(bkd.a, 6.0);
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B) {
         this.s(this.bU + 1);
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Age", this.bU);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.s($$0.h("Age"));
   }

   @Nullable
   @Override
   protected aot r() {
      return null;
   }

   @Nullable
   @Override
   protected aot d(bhe $$0) {
      return aou.xE;
   }

   @Nullable
   @Override
   protected aot h_() {
      return aou.xB;
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if (this.m($$2)) {
         this.a($$0, $$2);
         return bgo.a(this.dK().B);
      } else {
         return buk.a($$0, $$1, this).orElse(super.b($$0, $$1));
      }
   }

   @Override
   protected void T() {
      super.T();
      aau.a(this);
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void w(boolean $$0) {
   }

   @Override
   public void l(ciw $$0) {
      buk.a(this, $$0);
      qs $$1 = $$0.w();
      $$1.a("Age", this.gc());
   }

   @Override
   public void c(qs $$0) {
      buk.a(this, $$0);
      if ($$0.e("Age")) {
         this.s($$0.h("Age"));
      }
   }

   @Override
   public ciw b() {
      return new ciw(ciz.pW);
   }

   @Override
   public aot t() {
      return aou.cG;
   }

   private boolean m(ciw $$0) {
      return bvx.bT.a($$0);
   }

   private void a(cbl $$0, ciw $$1) {
      this.b($$0, $$1);
      this.c(bib.d_(this.ge()));
      this.dK().a(iw.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
   }

   private void b(cbl $$0, ciw $$1) {
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
      if (this.dK() instanceof aki $$0) {
         bvx $$1 = bik.O.a(this.dK());
         if ($$1 != null) {
            $$1.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$1.a($$0, this.dK().d_($$1.dk()), bja.i, null, null);
            $$1.t(this.fQ());
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            $$1.fF();
            this.a(aou.xD, 0.15F, 1.0F);
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
