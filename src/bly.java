import java.util.function.Predicate;

public interface bly {
   bly b = new bly() {
      @Override
      public clj a() {
         return clj.b;
      }

      @Override
      public boolean a(clj $$0) {
         return false;
      }
   };

   static bly a(final biq $$0, final int $$1, final Predicate<clj> $$2) {
      return new bly() {
         @Override
         public clj a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(clj $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bly a(biq $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bly a(final blg $$0, final bkv $$1, final Predicate<clj> $$2) {
      return new bly() {
         @Override
         public clj a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(clj $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bly a(blg $$0, bkv $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   clj a();

   boolean a(clj var1);
}
