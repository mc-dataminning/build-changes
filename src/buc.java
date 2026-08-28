import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface buc {
   buc a = new buc() {
      @Override
      public cuk a() {
         return cuk.l;
      }

      @Override
      public boolean a(cuk $$0) {
         return false;
      }
   };

   static buc a(final Supplier<cuk> $$0, final Consumer<cuk> $$1) {
      return new buc() {
         @Override
         public cuk a() {
            return $$0.get();
         }

         @Override
         public boolean a(cuk $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static buc a(final bqi $$0, final int $$1, final Predicate<cuk> $$2) {
      return new buc() {
         @Override
         public cuk a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cuk $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static buc a(bqi $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static buc a(final btk $$0, final bsw $$1, final Predicate<cuk> $$2) {
      return new buc() {
         @Override
         public cuk a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cuk $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static buc a(btk $$0, bsw $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cuk a();

   boolean a(cuk var1);
}
