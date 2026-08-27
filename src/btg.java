import java.util.function.Predicate;

public interface btg {
   btg b = new btg() {
      @Override
      public cto a() {
         return cto.i;
      }

      @Override
      public boolean a(cto $$0) {
         return false;
      }
   };

   static btg a(final bpn $$0, final int $$1, final Predicate<cto> $$2) {
      return new btg() {
         @Override
         public cto a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cto $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static btg a(bpn $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static btg a(final bso $$0, final bsb $$1, final Predicate<cto> $$2) {
      return new btg() {
         @Override
         public cto a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cto $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static btg a(bso $$0, bsb $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cto a();

   boolean a(cto var1);
}
