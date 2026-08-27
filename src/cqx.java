import javax.annotation.Nullable;

public class cqx extends coy {
   public cqx(coy.a $$0) {
      super($$0);
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      cpd $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(atv.c.b(this));
      return blx.a($$3, $$0.y_());
   }

   public static boolean a(@Nullable sw $$0) {
      if ($$0 == null) {
         return false;
      } else if (!$$0.b("pages", 9)) {
         return false;
      } else {
         tc $$1 = $$0.c("pages", 8);

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
