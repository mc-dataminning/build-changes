import java.util.function.Predicate;

public abstract class cjc extends bsx implements ciu {
   protected cjc(bsa<? extends cjc> $$0, dax $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public avi de() {
      return avi.f;
   }

   @Override
   public void n_() {
      this.eV();
      this.gu();
      super.n_();
   }

   protected void gu() {
      float $$0 = this.bt();
      if ($$0 > 0.5F) {
         this.bg += 2;
      }
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   protected avg aP() {
      return avh.mY;
   }

   @Override
   protected avg aQ() {
      return avh.mX;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.mV;
   }

   @Override
   protected avg o_() {
      return avh.mU;
   }

   @Override
   public bso.a eL() {
      return new bso.a(avh.mW, avh.mT);
   }

   @Override
   public float a(io $$0, dba $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dbm $$0, io $$1, ayk $$2) {
      if ($$0.a(dbg.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dut $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dbg.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ab() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bsa<? extends cjc> $$0, dbm $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.ak() != bpr.a && (bss.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bsa<? extends cjc> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.ak() != bpr.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static btv.a gv() {
      return bsq.A().a(btw.c);
   }

   @Override
   public boolean eh() {
      return true;
   }

   @Override
   protected boolean ei() {
      return true;
   }

   public boolean f(clw $$0) {
      return true;
   }

   @Override
   public cto g(cto $$0) {
      if ($$0.g() instanceof cuh) {
         Predicate<cto> $$1 = ((cuh)$$0.g()).d();
         cto $$2 = cuh.a(this, $$1);
         return $$2.e() ? new cto(ctr.ov) : $$2;
      } else {
         return cto.i;
      }
   }
}
