import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bvy {
   bvy a = new bvy() {
      @Override
      public cwo a() {
         return cwo.j;
      }

      @Override
      public boolean a(cwo $$0) {
         return false;
      }
   };

   static bvy a(final Supplier<cwo> $$0, final Consumer<cwo> $$1) {
      return new bvy() {
         @Override
         public cwo a() {
            return $$0.get();
         }

         @Override
         public boolean a(cwo $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bvy a(final bsc $$0, final int $$1, final Predicate<cwo> $$2) {
      return new bvy() {
         @Override
         public cwo a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwo $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvy a(bsc $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bvy a(final bvg $$0, final bus $$1, final Predicate<cwo> $$2) {
      return new bvy() {
         @Override
         public cwo a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwo $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvy a(bvg $$0, bus $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cwo a();

   boolean a(cwo var1);
}
