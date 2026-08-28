import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface btq {
   btq a = new btq() {
      @Override
      public cua a() {
         return cua.l;
      }

      @Override
      public boolean a(cua $$0) {
         return false;
      }
   };

   static btq a(final Supplier<cua> $$0, final Consumer<cua> $$1) {
      return new btq() {
         @Override
         public cua a() {
            return $$0.get();
         }

         @Override
         public boolean a(cua $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static btq a(final bpw $$0, final int $$1, final Predicate<cua> $$2) {
      return new btq() {
         @Override
         public cua a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cua $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static btq a(bpw $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static btq a(final bsy $$0, final bsk $$1, final Predicate<cua> $$2) {
      return new btq() {
         @Override
         public cua a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cua $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static btq a(bsy $$0, bsk $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cua a();

   boolean a(cua var1);
}
