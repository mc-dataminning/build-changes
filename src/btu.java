import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface btu {
   btu a = new btu() {
      @Override
      public cud a() {
         return cud.l;
      }

      @Override
      public boolean a(cud $$0) {
         return false;
      }
   };

   static btu a(final Supplier<cud> $$0, final Consumer<cud> $$1) {
      return new btu() {
         @Override
         public cud a() {
            return $$0.get();
         }

         @Override
         public boolean a(cud $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static btu a(final bqa $$0, final int $$1, final Predicate<cud> $$2) {
      return new btu() {
         @Override
         public cud a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cud $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static btu a(bqa $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static btu a(final btc $$0, final bso $$1, final Predicate<cud> $$2) {
      return new btu() {
         @Override
         public cud a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cud $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static btu a(btc $$0, bso $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cud a();

   boolean a(cud var1);
}
