import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface buw {
   buw a = new buw() {
      @Override
      public cvl a() {
         return cvl.k;
      }

      @Override
      public boolean a(cvl $$0) {
         return false;
      }
   };

   static buw a(final Supplier<cvl> $$0, final Consumer<cvl> $$1) {
      return new buw() {
         @Override
         public cvl a() {
            return $$0.get();
         }

         @Override
         public boolean a(cvl $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static buw a(final brd $$0, final int $$1, final Predicate<cvl> $$2) {
      return new buw() {
         @Override
         public cvl a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cvl $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static buw a(brd $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static buw a(final buf $$0, final btr $$1, final Predicate<cvl> $$2) {
      return new buw() {
         @Override
         public cvl a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cvl $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static buw a(buf $$0, btr $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cvl a();

   boolean a(cvl var1);
}
