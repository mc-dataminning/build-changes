import java.util.function.Predicate;

public interface box {
   box b = new box() {
      @Override
      public coz a() {
         return coz.h;
      }

      @Override
      public boolean a(coz $$0) {
         return false;
      }
   };

   static box a(final bln $$0, final int $$1, final Predicate<coz> $$2) {
      return new box() {
         @Override
         public coz a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(coz $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static box a(bln $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static box a(final bog $$0, final bnv $$1, final Predicate<coz> $$2) {
      return new box() {
         @Override
         public coz a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(coz $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static box a(bog $$0, bnv $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   coz a();

   boolean a(coz var1);
}
