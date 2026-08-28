import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bxq {
   bxq a = new bxq() {
      @Override
      public cys a() {
         return cys.k;
      }

      @Override
      public boolean a(cys $$0) {
         return false;
      }
   };

   static bxq a(final Supplier<cys> $$0, final Consumer<cys> $$1) {
      return new bxq() {
         @Override
         public cys a() {
            return $$0.get();
         }

         @Override
         public boolean a(cys $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bxq a(final btr $$0, final int $$1, final Predicate<cys> $$2) {
      return new bxq() {
         @Override
         public cys a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cys $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bxq a(btr $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bxq a(final bwz $$0, final bwk $$1, final Predicate<cys> $$2) {
      return new bxq() {
         @Override
         public cys a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cys $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bxq a(bwz $$0, bwk $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cys a();

   boolean a(cys var1);
}
