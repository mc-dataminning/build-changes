import java.util.function.Predicate;

public interface brv {
   brv b = new brv() {
      @Override
      public csd a() {
         return csd.i;
      }

      @Override
      public boolean a(csd $$0) {
         return false;
      }
   };

   static brv a(final boj $$0, final int $$1, final Predicate<csd> $$2) {
      return new brv() {
         @Override
         public csd a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(csd $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static brv a(boj $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static brv a(final bre $$0, final bqs $$1, final Predicate<csd> $$2) {
      return new brv() {
         @Override
         public csd a() {
            return $$0.d($$1);
         }

         @Override
         public boolean a(csd $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static brv a(bre $$0, bqs $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   csd a();

   boolean a(csd var1);
}
