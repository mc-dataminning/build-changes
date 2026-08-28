import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bxv {
   bxv a = new bxv() {
      @Override
      public czd a() {
         return czd.k;
      }

      @Override
      public boolean a(czd $$0) {
         return false;
      }
   };

   static bxv a(final Supplier<czd> $$0, final Consumer<czd> $$1) {
      return new bxv() {
         @Override
         public czd a() {
            return $$0.get();
         }

         @Override
         public boolean a(czd $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bxv a(final btw $$0, final int $$1, final Predicate<czd> $$2) {
      return new bxv() {
         @Override
         public czd a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(czd $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bxv a(btw $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bxv a(final bxe $$0, final bwp $$1, final Predicate<czd> $$2) {
      return new bxv() {
         @Override
         public czd a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(czd $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bxv a(bxe $$0, bwp $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   czd a();

   boolean a(czd var1);
}
