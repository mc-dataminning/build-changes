import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bwx {
   bwx a = new bwx() {
      @Override
      public cxo a() {
         return cxo.k;
      }

      @Override
      public boolean a(cxo $$0) {
         return false;
      }
   };

   static bwx a(final Supplier<cxo> $$0, final Consumer<cxo> $$1) {
      return new bwx() {
         @Override
         public cxo a() {
            return $$0.get();
         }

         @Override
         public boolean a(cxo $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bwx a(final btb $$0, final int $$1, final Predicate<cxo> $$2) {
      return new bwx() {
         @Override
         public cxo a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxo $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwx a(btb $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bwx a(final bwf $$0, final bvr $$1, final Predicate<cxo> $$2) {
      return new bwx() {
         @Override
         public cxo a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxo $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwx a(bwf $$0, bvr $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cxo a();

   boolean a(cxo var1);
}
