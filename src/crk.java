import javax.annotation.Nullable;

public class crk extends cpl {
   public crk(cpl.a $$0) {
      super($$0);
   }

   @Override
   public bmm<cpq> a(cwe $$0, cia $$1, bmk $$2) {
      cpq $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(atz.c.b(this));
      return bmm.a($$3, $$0.y_());
   }

   public static boolean a(@Nullable sy $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         te $$1 = $$0.c("pages", 8);

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
