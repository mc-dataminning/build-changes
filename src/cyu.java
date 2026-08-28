import java.util.Map;

public class cyu extends czc {
   public cyu(cyl $$0) {
      super("", $$0, czd.a(Map.of('#', cys.a(cus.qO), 'x', cys.a(cus.rU)), "###", "#x#", "###"), new cup(cus.uj));
   }

   @Override
   public boolean a(cqk $$0, dby $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cup $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            epk $$3 = cux.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cup a(cqk $$0, jk.a $$1) {
      cup $$2 = a($$0).c(1);
      $$2.b(km.D, cxq.b);
      return $$2;
   }

   private static cup a(cqk $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cup $$2 = $$0.a($$1);
         if ($$2.a(cus.rU)) {
            return $$2;
         }
      }

      return cup.l;
   }

   @Override
   public boolean an_() {
      return true;
   }

   @Override
   public cyz<?> ao_() {
      return cyz.f;
   }
}
