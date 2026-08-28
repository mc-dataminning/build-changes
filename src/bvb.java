import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bvb {
   bvb a = new bvb() {
      @Override
      public cvp a() {
         return cvp.k;
      }

      @Override
      public boolean a(cvp $$0) {
         return false;
      }
   };

   static bvb a(final Supplier<cvp> $$0, final Consumer<cvp> $$1) {
      return new bvb() {
         @Override
         public cvp a() {
            return $$0.get();
         }

         @Override
         public boolean a(cvp $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bvb a(final bri $$0, final int $$1, final Predicate<cvp> $$2) {
      return new bvb() {
         @Override
         public cvp a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cvp $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvb a(bri $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bvb a(final buk $$0, final btw $$1, final Predicate<cvp> $$2) {
      return new bvb() {
         @Override
         public cvp a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cvp $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bvb a(buk $$0, btw $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cvp a();

   boolean a(cvp var1);
}
