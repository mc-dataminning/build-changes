import java.util.function.Predicate;

public interface bjy {
   bjy b = new bjy() {
      @Override
      public cjf a() {
         return cjf.b;
      }

      @Override
      public boolean a(cjf $$0) {
         return false;
      }
   };

   static bjy a(final bgr $$0, final int $$1, final Predicate<cjf> $$2) {
      return new bjy() {
         @Override
         public cjf a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cjf $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bjy a(bgr $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bjy a(final bjg $$0, final biv $$1, final Predicate<cjf> $$2) {
      return new bjy() {
         @Override
         public cjf a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cjf $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bjy a(bjg $$0, biv $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cjf a();

   boolean a(cjf var1);
}
