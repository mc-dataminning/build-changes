import java.util.function.Predicate;

public interface bnc {
   bnc b = new bnc() {
      @Override
      public cmx a() {
         return cmx.f;
      }

      @Override
      public boolean a(cmx $$0) {
         return false;
      }
   };

   static bnc a(final bjt $$0, final int $$1, final Predicate<cmx> $$2) {
      return new bnc() {
         @Override
         public cmx a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cmx $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bnc a(bjt $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bnc a(final bmk $$0, final blz $$1, final Predicate<cmx> $$2) {
      return new bnc() {
         @Override
         public cmx a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cmx $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bnc a(bmk $$0, blz $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cmx a();

   boolean a(cmx var1);
}
