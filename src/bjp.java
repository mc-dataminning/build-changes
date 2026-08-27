import java.util.function.Predicate;

public interface bjp {
   bjp b = new bjp() {
      @Override
      public ciw a() {
         return ciw.b;
      }

      @Override
      public boolean a(ciw $$0) {
         return false;
      }
   };

   static bjp a(final bgh $$0, final int $$1, final Predicate<ciw> $$2) {
      return new bjp() {
         @Override
         public ciw a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(ciw $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bjp a(bgh $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bjp a(final biw $$0, final bil $$1, final Predicate<ciw> $$2) {
      return new bjp() {
         @Override
         public ciw a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(ciw $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bjp a(biw $$0, bil $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   ciw a();

   boolean a(ciw var1);
}
