import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bvz {
   bvz a = new bvz() {
      @Override
      public cwp a() {
         return cwp.j;
      }

      @Override
      public boolean a(cwp $$0) {
         return false;
      }
   };

   static bvz a(final Supplier<cwp> $$0, final Consumer<cwp> $$1) {
      return new bvz() {
         @Override
         public cwp a() {
            return $$0.get();
         }

         @Override
         public boolean a(cwp $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bvz a(final bsd $$0, final int $$1, final Predicate<cwp> $$2) {
      return new bvz() {
         @Override
         public cwp a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwp $$0x) {
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

   static bvz a(final bvh $$0, final but $$1, final Predicate<cwp> $$2) {
      return new bvz() {
         @Override
         public cwp a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwp $$0x) {
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

   cwp a();

   boolean a(cwp var1);
}
