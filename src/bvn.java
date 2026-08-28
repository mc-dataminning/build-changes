import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bvn {
   bvn a = new bvn() {
      @Override
      public cvx a() {
         return cvx.k;
      }

      @Override
      public boolean a(cvx $$0) {
         return false;
      }
   };

   static bvn a(final Supplier<cvx> $$0, final Consumer<cvx> $$1) {
      return new bvn() {
         @Override
         public cvx a() {
            return $$0.get();
         }

         @Override
         public boolean a(cvx $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bvn a(final brr $$0, final int $$1, final Predicate<cvx> $$2) {
      return new bvn() {
         @Override
         public cvx a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cvx $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvn a(brr $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bvn a(final buv $$0, final buh $$1, final Predicate<cvx> $$2) {
      return new bvn() {
         @Override
         public cvx a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cvx $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvn a(buv $$0, buh $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cvx a();

   boolean a(cvx var1);
}
