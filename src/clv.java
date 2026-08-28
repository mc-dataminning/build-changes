import java.util.function.Predicate;

public abstract class clv extends bvm implements cln {
   protected clv(bup<? extends clv> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awp do() {
      return awp.f;
   }

   @Override
   public void n_() {
      this.fa();
      this.gA();
      super.n_();
   }

   protected void gA() {
      float $$0 = this.bA();
      if ($$0 > 0.5F) {
         this.bf += 2;
      }
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   protected awn aX() {
      return awo.mX;
   }

   @Override
   protected awn aY() {
      return awo.mW;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.mU;
   }

   @Override
   protected awn o_() {
      return awo.mT;
   }

   @Override
   public bve.a eQ() {
      return new bve.a(awo.mV, awo.mS);
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dfw $$0, jh $$1, azv $$2) {
      if ($$0.a(dfo.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dzj $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dfo.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ad() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bup<? extends clv> $$0, dfw $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.ak() != bse.a && (buo.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bup<? extends clv> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      return $$1.ak() != bse.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bwl.a gB() {
      return bvg.E().a(bwm.c);
   }

   @Override
   public boolean ep() {
      return true;
   }

   @Override
   protected boolean eq() {
      return true;
   }

   public boolean a(cor $$0) {
      return true;
   }

   @Override
   public cwf d(cwf $$0) {
      if ($$0.h() instanceof cxb) {
         Predicate<cwf> $$1 = ((cxb)$$0.h()).d();
         cwf $$2 = cxb.a(this, $$1);
         return $$2.f() ? new cwf(cwj.ox) : $$2;
      } else {
         return cwf.k;
      }
   }
}
