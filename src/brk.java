import java.util.function.Predicate;

public interface brk {
   brk b = new brk() {
      @Override
      public crs a() {
         return crs.i;
      }

      @Override
      public boolean a(crs $$0) {
         return false;
      }
   };

   static brk a(final bny $$0, final int $$1, final Predicate<crs> $$2) {
      return new brk() {
         @Override
         public crs a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(crs $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static brk a(bny $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static brk a(final bqt $$0, final bqh $$1, final Predicate<crs> $$2) {
      return new brk() {
         @Override
         public crs a() {
            return $$0.d($$1);
         }

         @Override
         public boolean a(crs $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static brk a(bqt $$0, bqh $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   crs a();

   boolean a(crs var1);
}
