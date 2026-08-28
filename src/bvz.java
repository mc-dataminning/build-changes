import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bvz {
   bvz a = new bvz() {
      @Override
      public cwm a() {
         return cwm.k;
      }

      @Override
      public boolean a(cwm $$0) {
         return false;
      }
   };

   static bvz a(final Supplier<cwm> $$0, final Consumer<cwm> $$1) {
      return new bvz() {
         @Override
         public cwm a() {
            return $$0.get();
         }

         @Override
         public boolean a(cwm $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bvz a(final bsd $$0, final int $$1, final Predicate<cwm> $$2) {
      return new bvz() {
         @Override
         public cwm a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwm $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvz a(bsd $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bvz a(final bvh $$0, final but $$1, final Predicate<cwm> $$2) {
      return new bvz() {
         @Override
         public cwm a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwm $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvz a(bvh $$0, but $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cwm a();

   boolean a(cwm var1);
}
