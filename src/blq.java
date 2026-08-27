import java.util.function.Predicate;

public interface blq {
   blq b = new blq() {
      @Override
      public clb a() {
         return clb.b;
      }

      @Override
      public boolean a(clb $$0) {
         return false;
      }
   };

   static blq a(final bij $$0, final int $$1, final Predicate<clb> $$2) {
      return new blq() {
         @Override
         public clb a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(clb $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static blq a(bij $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static blq a(final bky $$0, final bkn $$1, final Predicate<clb> $$2) {
      return new blq() {
         @Override
         public clb a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(clb $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static blq a(bky $$0, bkn $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   clb a();

   boolean a(clb var1);
}
