import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface byn {
   byn a = new byn() {
      @Override
      public daa a() {
         return daa.k;
      }

      @Override
      public boolean a(daa $$0) {
         return false;
      }
   };

   static byn a(final Supplier<daa> $$0, final Consumer<daa> $$1) {
      return new byn() {
         @Override
         public daa a() {
            return $$0.get();
         }

         @Override
         public boolean a(daa $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static byn a(final bum $$0, final int $$1, final Predicate<daa> $$2) {
      return new byn() {
         @Override
         public daa a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(daa $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static byn a(bum $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static byn a(final bxw $$0, final bxf $$1, final Predicate<daa> $$2) {
      return new byn() {
         @Override
         public daa a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(daa $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static byn a(bxw $$0, bxf $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   daa a();

   boolean a(daa var1);
}
