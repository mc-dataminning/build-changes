import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bwy {
   bwy a = new bwy() {
      @Override
      public cxp a() {
         return cxp.j;
      }

      @Override
      public boolean a(cxp $$0) {
         return false;
      }
   };

   static bwy a(final Supplier<cxp> $$0, final Consumer<cxp> $$1) {
      return new bwy() {
         @Override
         public cxp a() {
            return $$0.get();
         }

         @Override
         public boolean a(cxp $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bwy a(final btc $$0, final int $$1, final Predicate<cxp> $$2) {
      return new bwy() {
         @Override
         public cxp a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxp $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwy a(btc $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bwy a(final bwg $$0, final bvs $$1, final Predicate<cxp> $$2) {
      return new bwy() {
         @Override
         public cxp a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxp $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwy a(bwg $$0, bvs $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cxp a();

   boolean a(cxp var1);
}
