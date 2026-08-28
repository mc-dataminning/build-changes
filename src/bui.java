import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bui {
   bui a = new bui() {
      @Override
      public cuq a() {
         return cuq.l;
      }

      @Override
      public boolean a(cuq $$0) {
         return false;
      }
   };

   static bui a(final Supplier<cuq> $$0, final Consumer<cuq> $$1) {
      return new bui() {
         @Override
         public cuq a() {
            return $$0.get();
         }

         @Override
         public boolean a(cuq $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bui a(final bqo $$0, final int $$1, final Predicate<cuq> $$2) {
      return new bui() {
         @Override
         public cuq a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cuq $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bui a(bqo $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bui a(final btq $$0, final btc $$1, final Predicate<cuq> $$2) {
      return new bui() {
         @Override
         public cuq a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cuq $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bui a(btq $$0, btc $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cuq a();

   boolean a(cuq var1);
}
