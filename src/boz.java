import java.util.function.Predicate;

public interface boz {
   boz b = new boz() {
      @Override
      public cpd a() {
         return cpd.h;
      }

      @Override
      public boolean a(cpd $$0) {
         return false;
      }
   };

   static boz a(final blp $$0, final int $$1, final Predicate<cpd> $$2) {
      return new boz() {
         @Override
         public cpd a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cpd $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static boz a(blp $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static boz a(final boi $$0, final bnx $$1, final Predicate<cpd> $$2) {
      return new boz() {
         @Override
         public cpd a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cpd $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static boz a(boi $$0, bnx $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cpd a();

   boolean a(cpd var1);
}
