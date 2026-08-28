import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bwp {
   bwp a = new bwp() {
      @Override
      public cxg a() {
         return cxg.j;
      }

      @Override
      public boolean a(cxg $$0) {
         return false;
      }
   };

   static bwp a(final Supplier<cxg> $$0, final Consumer<cxg> $$1) {
      return new bwp() {
         @Override
         public cxg a() {
            return $$0.get();
         }

         @Override
         public boolean a(cxg $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bwp a(final bst $$0, final int $$1, final Predicate<cxg> $$2) {
      return new bwp() {
         @Override
         public cxg a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxg $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwp a(bst $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bwp a(final bvx $$0, final bvj $$1, final Predicate<cxg> $$2) {
      return new bwp() {
         @Override
         public cxg a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxg $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwp a(bvx $$0, bvj $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cxg a();

   boolean a(cxg var1);
}
