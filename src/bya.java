import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bya {
   bya a = new bya() {
      @Override
      public czk a() {
         return czk.k;
      }

      @Override
      public boolean a(czk $$0) {
         return false;
      }
   };

   static bya a(final Supplier<czk> $$0, final Consumer<czk> $$1) {
      return new bya() {
         @Override
         public czk a() {
            return $$0.get();
         }

         @Override
         public boolean a(czk $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bya a(final btz $$0, final int $$1, final Predicate<czk> $$2) {
      return new bya() {
         @Override
         public czk a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(czk $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bya a(btz $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bya a(final bxj $$0, final bws $$1, final Predicate<czk> $$2) {
      return new bya() {
         @Override
         public czk a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(czk $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bya a(bxj $$0, bws $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   czk a();

   boolean a(czk var1);
}
