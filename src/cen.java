import java.util.function.Predicate;

public abstract class cen extends boo implements cef {
   protected cen(bnu<? extends cen> $$0, cvn $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   public atl db() {
      return atl.f;
   }

   @Override
   public void d_() {
      this.eR();
      this.gl();
      super.d_();
   }

   protected void gl() {
      float $$0 = this.bo();
      if ($$0 > 0.5F) {
         this.bb += 2;
      }
   }

   @Override
   protected boolean Y() {
      return true;
   }

   @Override
   protected atj aN() {
      return atk.mz;
   }

   @Override
   protected atj aO() {
      return atk.my;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.mw;
   }

   @Override
   protected atj n_() {
      return atk.mv;
   }

   @Override
   public bog.a eH() {
      return new bog.a(atk.mx, atk.mu);
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      return -$$1.w($$0);
   }

   public static boolean a(cwc $$0, hz $$1, awo $$2) {
      if ($$0.a(cvw.a, $$1) > $$2.a(32)) {
         return false;
      } else {
         doo $$3 = $$0.E_();
         int $$4 = $$3.e();
         if ($$4 < 15 && $$0.a(cvw.b, $$1) > $$4) {
            return false;
         } else {
            int $$5 = $$0.E().aa() ? $$0.c($$1, 10) : $$0.A($$1);
            return $$5 <= $$3.d().a($$2);
         }
      }
   }

   public static boolean b(bnu<? extends cen> $$0, cwc $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.ak() != blr.a && (bok.b($$2) || a($$1, $$3, $$4)) && a($$0, $$1, $$2, $$3, $$4);
   }

   public static boolean c(bnu<? extends cen> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.ak() != blr.a && a($$0, $$1, $$2, $$3, $$4);
   }

   public static bpk.a gm() {
      return boi.C().a(bpl.c);
   }

   @Override
   public boolean ed() {
      return true;
   }

   @Override
   protected boolean ee() {
      return true;
   }

   public boolean f(chh $$0) {
      return true;
   }

   @Override
   public coz g(coz $$0) {
      if ($$0.d() instanceof cpp) {
         Predicate<coz> $$1 = ((cpp)$$0.d()).e();
         coz $$2 = cpp.a(this, $$1);
         return $$2.b() ? new coz(cpc.ou) : $$2;
      } else {
         return coz.h;
      }
   }
}
