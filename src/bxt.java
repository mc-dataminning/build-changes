import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bxt {
   bxt a = new bxt() {
      @Override
      public cyy a() {
         return cyy.k;
      }

      @Override
      public boolean a(cyy $$0) {
         return false;
      }
   };

   static bxt a(final Supplier<cyy> $$0, final Consumer<cyy> $$1) {
      return new bxt() {
         @Override
         public cyy a() {
            return $$0.get();
         }

         @Override
         public boolean a(cyy $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bxt a(final btu $$0, final int $$1, final Predicate<cyy> $$2) {
      return new bxt() {
         @Override
         public cyy a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cyy $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bxt a(btu $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bxt a(final bxc $$0, final bwn $$1, final Predicate<cyy> $$2) {
      return new bxt() {
         @Override
         public cyy a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cyy $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bxt a(bxc $$0, bwn $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cyy a();

   boolean a(cyy var1);
}
