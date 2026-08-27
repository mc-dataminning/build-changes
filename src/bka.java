import java.util.function.Predicate;

public interface bka {
   bka b = new bka() {
      @Override
      public cjh a() {
         return cjh.b;
      }

      @Override
      public boolean a(cjh $$0) {
         return false;
      }
   };

   static bka a(final bgt $$0, final int $$1, final Predicate<cjh> $$2) {
      return new bka() {
         @Override
         public cjh a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cjh $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bka a(bgt $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bka a(final bji $$0, final bix $$1, final Predicate<cjh> $$2) {
      return new bka() {
         @Override
         public cjh a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cjh $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bka a(bji $$0, bix $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cjh a();

   boolean a(cjh var1);
}
