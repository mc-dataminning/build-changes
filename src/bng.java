import java.util.function.Predicate;

public interface bng {
   bng b = new bng() {
      @Override
      public cng a() {
         return cng.f;
      }

      @Override
      public boolean a(cng $$0) {
         return false;
      }
   };

   static bng a(final bjv $$0, final int $$1, final Predicate<cng> $$2) {
      return new bng() {
         @Override
         public cng a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cng $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bng a(bjv $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bng a(final bmo $$0, final bmd $$1, final Predicate<cng> $$2) {
      return new bng() {
         @Override
         public cng a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cng $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bng a(bmo $$0, bmd $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cng a();

   boolean a(cng var1);
}
