import java.util.Map;

public class dah extends dar {
   public dah(czx $$0) {
      super("", $$0, das.a(Map.of('#', daf.a(cwb.qP), 'x', daf.a(cwb.rV)), "###", "#x#", "###"), new cvx(cwb.ul));
   }

   @Override
   public boolean a(czy $$0, dev $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cvx $$2 = a($$0);
         if ($$2.f()) {
            return false;
         } else {
            esy $$3 = cwk.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cvx a(czy $$0, jr.a $$1) {
      cvx $$2 = a($$0).c(1);
      $$2.b(kt.M, cys.b);
      return $$2;
   }

   private static cvx a(czy $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         cvx $$2 = $$0.a($$1);
         if ($$2.a(cwb.rV)) {
            return $$2;
         }
      }

      return cvx.k;
   }

   @Override
   public boolean aq_() {
      return true;
   }

   @Override
   public dao<?> ar_() {
      return dao.f;
   }
}
