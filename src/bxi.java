import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bxi {
   bxi a = new bxi() {
      @Override
      public cxy a() {
         return cxy.k;
      }

      @Override
      public boolean a(cxy $$0) {
         return false;
      }
   };

   static bxi a(final Supplier<cxy> $$0, final Consumer<cxy> $$1) {
      return new bxi() {
         @Override
         public cxy a() {
            return $$0.get();
         }

         @Override
         public boolean a(cxy $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bxi a(final btj $$0, final int $$1, final Predicate<cxy> $$2) {
      return new bxi() {
         @Override
         public cxy a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxy $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bxi a(btj $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bxi a(final bwr $$0, final bwc $$1, final Predicate<cxy> $$2) {
      return new bxi() {
         @Override
         public cxy a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxy $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bxi a(bwr $$0, bwc $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cxy a();

   boolean a(cxy var1);
}
