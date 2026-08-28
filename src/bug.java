import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bug {
   bug a = new bug() {
      @Override
      public cuo a() {
         return cuo.l;
      }

      @Override
      public boolean a(cuo $$0) {
         return false;
      }
   };

   static bug a(final Supplier<cuo> $$0, final Consumer<cuo> $$1) {
      return new bug() {
         @Override
         public cuo a() {
            return $$0.get();
         }

         @Override
         public boolean a(cuo $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bug a(final bqm $$0, final int $$1, final Predicate<cuo> $$2) {
      return new bug() {
         @Override
         public cuo a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cuo $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bug a(bqm $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bug a(final bto $$0, final bta $$1, final Predicate<cuo> $$2) {
      return new bug() {
         @Override
         public cuo a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cuo $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bug a(bto $$0, bta $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cuo a();

   boolean a(cuo var1);
}
