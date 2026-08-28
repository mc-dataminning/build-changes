import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bwt {
   bwt a = new bwt() {
      @Override
      public cxk a() {
         return cxk.k;
      }

      @Override
      public boolean a(cxk $$0) {
         return false;
      }
   };

   static bwt a(final Supplier<cxk> $$0, final Consumer<cxk> $$1) {
      return new bwt() {
         @Override
         public cxk a() {
            return $$0.get();
         }

         @Override
         public boolean a(cxk $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bwt a(final bsx $$0, final int $$1, final Predicate<cxk> $$2) {
      return new bwt() {
         @Override
         public cxk a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxk $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwt a(bsx $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bwt a(final bwb $$0, final bvn $$1, final Predicate<cxk> $$2) {
      return new bwt() {
         @Override
         public cxk a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxk $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwt a(bwb $$0, bvn $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cxk a();

   boolean a(cxk var1);
}
