import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bvx {
   bvx a = new bvx() {
      @Override
      public cwn a() {
         return cwn.j;
      }

      @Override
      public boolean a(cwn $$0) {
         return false;
      }
   };

   static bvx a(final Supplier<cwn> $$0, final Consumer<cwn> $$1) {
      return new bvx() {
         @Override
         public cwn a() {
            return $$0.get();
         }

         @Override
         public boolean a(cwn $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bvx a(final bsb $$0, final int $$1, final Predicate<cwn> $$2) {
      return new bvx() {
         @Override
         public cwn a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwn $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvx a(bsb $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bvx a(final bvf $$0, final bur $$1, final Predicate<cwn> $$2) {
      return new bvx() {
         @Override
         public cwn a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwn $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvx a(bvf $$0, bur $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cwn a();

   boolean a(cwn var1);
}
