import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface buh {
   buh a = new buh() {
      @Override
      public cup a() {
         return cup.l;
      }

      @Override
      public boolean a(cup $$0) {
         return false;
      }
   };

   static buh a(final Supplier<cup> $$0, final Consumer<cup> $$1) {
      return new buh() {
         @Override
         public cup a() {
            return $$0.get();
         }

         @Override
         public boolean a(cup $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static buh a(final bqn $$0, final int $$1, final Predicate<cup> $$2) {
      return new buh() {
         @Override
         public cup a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cup $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static buh a(bqn $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static buh a(final btp $$0, final btb $$1, final Predicate<cup> $$2) {
      return new buh() {
         @Override
         public cup a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cup $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static buh a(btp $$0, btb $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cup a();

   boolean a(cup var1);
}
