import java.util.Map;

public class cyw extends cze {
   public cyw(cyn $$0) {
      super("", $$0, czf.a(Map.of('#', cyu.a(cuu.qO), 'x', cyu.a(cuu.rU)), "###", "#x#", "###"), new cur(cuu.uj));
   }

   @Override
   public boolean a(cqm $$0, dca $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         cur $$2 = a($$0);
         if ($$2.e()) {
            return false;
         } else {
            epm $$3 = cuz.b($$2, $$1);
            if ($$3 == null) {
               return false;
            } else {
               return $$3.g() ? false : $$3.f < 4;
            }
         }
      }
   }

   @Override
   public cur a(cqm $$0, jk.a $$1) {
      cur $$2 = a($$0).c(1);
      $$2.b(km.D, cxs.b);
      return $$2;
   }

   private static cur a(cqm $$0) {
      for (int $$1 = 0; $$1 < $$0.b(); $$1++) {
         cur $$2 = $$0.a($$1);
         if ($$2.a(cuu.rU)) {
            return $$2;
         }
      }

      return cur.l;
   }

   @Override
   public boolean an_() {
      return true;
   }

   @Override
   public czb<?> ao_() {
      return czb.f;
   }
}
