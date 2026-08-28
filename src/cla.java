import java.util.function.Predicate;

public abstract class cla extends bus implements cks {
   protected cla(btv<? extends cla> $$0, deg $$1) {
      super($$0, $$1);
      this.bN = 5;
   }

   @Override
   public awf di() {
      return awf.f;
   }

   @Override
   public void m_() {
      this.eU();
      this.gu();
      super.m_();
   }

   protected void gu() {
      float $$0 = this.bx();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean ab() {
      return true;
   }

   @Override
   protected awd aT() {
      return awe.mZ;
   }

   @Override
   protected awd aU() {
      return awe.mY;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.mW;
   }

   @Override
   protected awd n_() {
      return awe.mV;
   }

   @Override
   public buk.a eK() {
      return new buk.a(awe.mX, awe.mU);
   }

   @Override
   public float a(je $$0, dej $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dew $$0, je $$1, azl $$2) {
      if ($$0.a(dep.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dyk $$3 = $$0.B_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(dep.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ad() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(btv<? extends cla> $$0, dew $$1, btu $$2, je $$3, azl $$4) {
      return $$1.am() != brm.a && (btu.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(btv<? extends cla> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.am() != brm.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bvq.a gv() {
      return bum.E().a(bvr.c);
   }

   @Override
   public boolean ei() {
      return true;
   }

   @Override
   protected boolean ej() {
      return true;
   }

   public boolean a(cnu $$0) {
      return true;
   }

   @Override
   public cvp f(cvp $$0) {
      if ($$0.h() instanceof cwl) {
         Predicate<cvp> $$1 = ((cwl)$$0.h()).d();
         cvp $$2 = cwl.a(this, $$1);
         return $$2.f() ? new cvp(cvt.ox) : $$2;
      } else {
         return cvp.k;
      }
   }
}
