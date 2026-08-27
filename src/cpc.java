import javax.annotation.Nullable;

public class cpc extends cnb {
   public cpc(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      cng $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(asd.c.b(this));
      return bkd.a($$3, $$0.y_());
   }

   public static boolean a(@Nullable so $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         su $$1 = $$0.c("pages", 8);

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
