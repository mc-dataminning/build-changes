import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface bwq {
   bwq a = new bwq() {
      @Override
      public cxh a() {
         return cxh.k;
      }

      @Override
      public boolean a(cxh $$0) {
         return false;
      }
   };

   static bwq a(final Supplier<cxh> $$0, final Consumer<cxh> $$1) {
      return new bwq() {
         @Override
         public cxh a() {
            return $$0.get();
         }

         @Override
         public boolean a(cxh $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static bwq a(final bsr $$0, final int $$1, final Predicate<cxh> $$2) {
      return new bwq() {
         @Override
         public cxh a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxh $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwq a(bsr $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bwq a(final bvy $$0, final bvj $$1, final Predicate<cxh> $$2) {
      return new bwq() {
         @Override
         public cxh a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cxh $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bwq a(bvy $$0, bvj $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cxh a();

   boolean a(cxh var1);
}
