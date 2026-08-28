import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bvw {
   bvw a = new bvw() {
      @Override
      public cwf a() {
         return cwf.k;
      }

      @Override
      public boolean a(cwf $$0) {
         return false;
      }
   };

   static bvw a(final Supplier<cwf> $$0, final Consumer<cwf> $$1) {
      return new bvw() {
         @Override
         public cwf a() {
            return $$0.get();
         }

         @Override
         public boolean a(cwf $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bvw a(final bsa $$0, final int $$1, final Predicate<cwf> $$2) {
      return new bvw() {
         @Override
         public cwf a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwf $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvw a(bsa $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bvw a(final bve $$0, final buq $$1, final Predicate<cwf> $$2) {
      return new bvw() {
         @Override
         public cwf a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwf $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvw a(bve $$0, buq $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cwf a();

   boolean a(cwf var1);
}
