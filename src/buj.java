import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface buj {
   buj a = new buj() {
      @Override
      public cur a() {
         return cur.l;
      }

      @Override
      public boolean a(cur $$0) {
         return false;
      }
   };

   static buj a(final Supplier<cur> $$0, final Consumer<cur> $$1) {
      return new buj() {
         @Override
         public cur a() {
            return $$0.get();
         }

         @Override
         public boolean a(cur $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static buj a(final bqp $$0, final int $$1, final Predicate<cur> $$2) {
      return new buj() {
         @Override
         public cur a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cur $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static buj a(bqp $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static buj a(final btr $$0, final btd $$1, final Predicate<cur> $$2) {
      return new buj() {
         @Override
         public cur a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cur $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static buj a(btr $$0, btd $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cur a();

   boolean a(cur var1);
}
