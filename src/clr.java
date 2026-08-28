import java.util.function.Predicate;

public abstract class clr extends bvi implements clj {
   protected clr(bul<? extends clr> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awm dn() {
      return awm.f;
   }

   @Override
   public void n_() {
      this.eZ();
      this.gz();
      super.n_();
   }

   protected void gz() {
      float $$0 = this.bz();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   protected awk aW() {
      return awl.mX;
   }

   @Override
   protected awk aX() {
      return awl.mW;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.mU;
   }

   @Override
   protected awk o_() {
      return awl.mT;
   }

   @Override
   public bva.a eP() {
      return new bva.a(awl.mV, awl.mS);
   }

   @Override
   public float a(jh $$0, dfe $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dfr $$0, jh $$1, azs $$2) {
      if ($$0.a(dfk.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dzf $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dfk.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ad() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bul<? extends clr> $$0, dfr $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.ak() != bsa.a && (buk.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bul<? extends clr> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      return $$1.ak() != bsa.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bwh.a gA() {
      return bvc.E().a(bwi.c);
   }

   @Override
   public boolean eo() {
      return true;
   }

   @Override
   protected boolean ep() {
      return true;
   }

   public boolean a(com $$0) {
      return true;
   }

   @Override
   public cwb d(cwb $$0) {
      if ($$0.h() instanceof cwx) {
         Predicate<cwb> $$1 = ((cwx)$$0.h()).d();
         cwb $$2 = cwx.a(this, $$1);
         return $$2.f() ? new cwb(cwf.ox) : $$2;
      } else {
         return cwb.k;
      }
   }
}
