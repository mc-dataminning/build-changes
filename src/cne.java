import javax.annotation.Nullable;

public class cne extends cle {
   public cne(cle.a $$0) {
      super($$0);
   }

   @Override
   public bix a(cnt $$0) {
      csa $$1 = $$0.q();
      ht $$2 = $$0.a();
      dhi $$3 = $$1.a_($$2);
      if ($$3.a(cvc.oa)) {
         return czk.a($$0.o(), $$1, $$2, $$3, $$0.n()) ? bix.a($$1.B) : bix.d;
      } else {
         return bix.d;
      }
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      clj $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(arb.c.b(this));
      return biy.a($$3, $$0.x_());
   }

   public static boolean a(@Nullable rz $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         sf $$1 = $$0.c("pages", 8);

         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            String $$3 = $$1.j($$2);
            if ($$3.length() > 32767) {
               return false;
            }
         }

         return true;
      }
   }
}
