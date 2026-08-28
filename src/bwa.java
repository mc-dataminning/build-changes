import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bwa {
   bwa a = new bwa() {
      @Override
      public cwq a() {
         return cwq.j;
      }

      @Override
      public boolean a(cwq $$0) {
         return false;
      }
   };

   static bwa a(final Supplier<cwq> $$0, final Consumer<cwq> $$1) {
      return new bwa() {
         @Override
         public cwq a() {
            return $$0.get();
         }

         @Override
         public boolean a(cwq $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bwa a(final bse $$0, final int $$1, final Predicate<cwq> $$2) {
      return new bwa() {
         @Override
         public cwq a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwq $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwa a(bse $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bwa a(final bvi $$0, final buu $$1, final Predicate<cwq> $$2) {
      return new bwa() {
         @Override
         public cwq a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwq $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwa a(bvi $$0, buu $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cwq a();

   boolean a(cwq var1);
}
