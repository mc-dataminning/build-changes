import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bvs {
   bvs a = new bvs() {
      @Override
      public cwb a() {
         return cwb.k;
      }

      @Override
      public boolean a(cwb $$0) {
         return false;
      }
   };

   static bvs a(final Supplier<cwb> $$0, final Consumer<cwb> $$1) {
      return new bvs() {
         @Override
         public cwb a() {
            return $$0.get();
         }

         @Override
         public boolean a(cwb $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bvs a(final brw $$0, final int $$1, final Predicate<cwb> $$2) {
      return new bvs() {
         @Override
         public cwb a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwb $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvs a(brw $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bvs a(final bva $$0, final bum $$1, final Predicate<cwb> $$2) {
      return new bvs() {
         @Override
         public cwb a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cwb $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvs a(bva $$0, bum $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cwb a();

   boolean a(cwb var1);
}
