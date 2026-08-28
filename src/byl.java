import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface byl {
   byl a = new byl() {
      @Override
      public czy a() {
         return czy.k;
      }

      @Override
      public boolean a(czy $$0) {
         return false;
      }
   };

   static byl a(final Supplier<czy> $$0, final Consumer<czy> $$1) {
      return new byl() {
         @Override
         public czy a() {
            return $$0.get();
         }

         @Override
         public boolean a(czy $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static byl a(final buk $$0, final int $$1, final Predicate<czy> $$2) {
      return new byl() {
         @Override
         public czy a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(czy $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static byl a(buk $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static byl a(final bxu $$0, final bxd $$1, final Predicate<czy> $$2) {
      return new byl() {
         @Override
         public czy a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(czy $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static byl a(bxu $$0, bxd $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   czy a();

   boolean a(czy var1);
}
