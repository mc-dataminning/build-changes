import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bve {
   bve a = new bve() {
      @Override
      public cvs a() {
         return cvs.k;
      }

      @Override
      public boolean a(cvs $$0) {
         return false;
      }
   };

   static bve a(final Supplier<cvs> $$0, final Consumer<cvs> $$1) {
      return new bve() {
         @Override
         public cvs a() {
            return $$0.get();
         }

         @Override
         public boolean a(cvs $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bve a(final brl $$0, final int $$1, final Predicate<cvs> $$2) {
      return new bve() {
         @Override
         public cvs a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cvs $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bve a(brl $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bve a(final bun $$0, final btz $$1, final Predicate<cvs> $$2) {
      return new bve() {
         @Override
         public cvs a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cvs $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bve a(bun $$0, btz $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cvs a();

   boolean a(cvs var1);
}
