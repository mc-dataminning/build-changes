import javax.annotation.Nullable;

public class csf extends cqf {
   public csf(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      cqk $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(aui.c.b(this));
      return bnd.a($$3, $$0.x_());
   }

   public static boolean a(@Nullable ta $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         tg $$1 = $$0.c("pages", 8);

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
