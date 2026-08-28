import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface byw {
   byw a = new byw() {
      @Override
      public dak a() {
         return dak.l;
      }

      @Override
      public boolean a(dak $$0) {
         return false;
      }
   };

   static byw a(final Supplier<dak> $$0, final Consumer<dak> $$1) {
      return new byw() {
         @Override
         public dak a() {
            return $$0.get();
         }

         @Override
         public boolean a(dak $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static byw a(final buv $$0, final int $$1, final Predicate<dak> $$2) {
      return new byw() {
         @Override
         public dak a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(dak $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static byw a(buv $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static byw a(final byf $$0, final bxo $$1, final Predicate<dak> $$2) {
      return new byw() {
         @Override
         public dak a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(dak $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static byw a(byf $$0, bxo $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   dak a();

   boolean a(dak var1);
}
