import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bug {
   bug a = new bug() {
      @Override
      public cuq a() {
         return cuq.l;
      }

      @Override
      public boolean a(cuq $$0) {
         return false;
      }
   };

   static bug a(final Supplier<cuq> $$0, final Consumer<cuq> $$1) {
      return new bug() {
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

   static bug a(final bqk $$0, final int $$1, final Predicate<cuq> $$2) {
      return new bug() {
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

   static bug a(bqk $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bug a(final btn $$0, final bsy $$1, final Predicate<cuq> $$2) {
      return new bug() {
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

   static bug a(btn $$0, bsy $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cuq a();

   boolean a(cuq var1);
}
