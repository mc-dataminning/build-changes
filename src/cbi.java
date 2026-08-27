import java.util.function.Predicate;

public abstract class cbi extends blp implements cba {
   protected cbi(bku<? extends cbi> $$0, csa $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public aqs dc() {
      return aqs.f;
   }

   @Override
   public void c_() {
      this.eR();
      this.gk();
      super.c_();
   }

   protected void gk() {
      float $$0 = this.bo();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   protected aqq aN() {
      return aqr.lQ;
   }

   @Override
   protected aqq aO() {
      return aqr.lP;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.lN;
   }

   @Override
   protected aqq m_() {
      return aqr.lM;
   }

   @Override
   public blg.a eH() {
      return new blg.a(aqr.lO, aqr.lL);
   }

   @Override
   public float a(ht $$0, csd $$1) {
      return -$$1.v($$0);
   }

   public static boolean a(csp $$0, ht $$1, ats $$2) {
      if ($$0.a(csj.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         dkr $$3 = $$0.D_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(csj.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.D().Z() ? $$0.c($$1, 10) : $$0.z($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bku<? extends cbi> $$0, csp $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.aj() != biu.a && a($$1, $$3, $$4) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bku<? extends cbi> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.aj() != biu.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bml.a gl() {
      return bli.C().a(bmm.c);
   }

   @Override
   public boolean ed() {
      return true;
   }

   @Override
   protected boolean ee() {
      return true;
   }

   public boolean f(cdu $$0) {
      return true;
   }

   @Override
   public clj g(clj $$0) {
      if ($$0.d() instanceof clz) {
         Predicate<clj> $$1 = ((clz)$$0.d()).e();
         clj $$2 = clz.a(this, $$1);
         return $$2.b() ? new clj(clm.os) : $$2;
      } else {
         return clj.b;
      }
   }
}
