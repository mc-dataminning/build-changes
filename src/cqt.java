import javax.annotation.Nullable;

public class cqt extends cou {
   public cqt(cou.a $$0) {
      super($$0);
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      $$1.a($$3, $$2);
      $$1.b(atu.c.b(this));
      return blv.a($$3, $$0.y_());
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
