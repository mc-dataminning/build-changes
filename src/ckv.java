import java.util.function.Predicate;

public abstract class ckv extends bun implements ckn {
   protected ckv(btq<? extends ckv> $$0, dds $$1) {
      super($$0, $$1);
      this.bO = 5;
   }

   @Override
   public awe di() {
      return awe.f;
   }

   @Override
   public void m_() {
      this.eU();
      this.gt();
      super.m_();
   }

   protected void gt() {
      float $$0 = this.bx();
      if ($$0 > 0.5F) {
         this.bc += 2;
      }
   }

   @Override
   protected boolean ab() {
      return true;
   }

   @Override
   protected awc aT() {
      return awd.mZ;
   }

   @Override
   protected awc aU() {
      return awd.mY;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.mW;
   }

   @Override
   protected awc n_() {
      return awd.mV;
   }

   @Override
   public buf.a eK() {
      return new buf.a(awd.mX, awd.mU);
   }

   @Override
   public float a(je $$0, ddv $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(dei $$0, je $$1, azk $$2) {
      if ($$0.a(deb.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dxw $$3 = $$0.B_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(deb.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().ad() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(btq<? extends ckv> $$0, dei $$1, btp $$2, je $$3, azk $$4) {
      return $$1.am() != brh.a && (btp.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(btq<? extends ckv> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.am() != brh.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bvl.a gu() {
      return buh.E().a(bvm.c);
   }

   @Override
   public boolean ei() {
      return true;
   }

   @Override
   protected boolean ej() {
      return true;
   }

   public boolean a(cnp $$0) {
      return true;
   }

   @Override
   public cvl h(cvl $$0) {
      if ($$0.h() instanceof cwi) {
         Predicate<cvl> $$1 = ((cwi)$$0.h()).d();
         cvl $$2 = cwi.a(this, $$1);
         return $$2.f() ? new cvl(cvo.ox) : $$2;
      } else {
         return cvl.k;
      }
   }
}
