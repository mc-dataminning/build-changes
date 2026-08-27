import java.util.function.Predicate;

public interface bgs {
   bgs b = new bgs() {
      @Override
      public cfz a() {
         return cfz.b;
      }

      @Override
      public boolean a(cfz $$0) {
         return false;
      }
   };

   static bgs a(final bdq $$0, final int $$1, final Predicate<cfz> $$2) {
      return new bgs() {
         @Override
         public cfz a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cfz $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bgs a(bdq $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bgs a(final bfz $$0, final bfo $$1, final Predicate<cfz> $$2) {
      return new bgs() {
         @Override
         public cfz a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cfz $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bgs a(bfz $$0, bfo $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cfz a();

   boolean a(cfz var1);
}
