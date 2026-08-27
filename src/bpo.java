import java.util.function.Predicate;

public interface bpo {
   bpo b = new bpo() {
      @Override
      public cpq a() {
         return cpq.h;
      }

      @Override
      public boolean a(cpq $$0) {
         return false;
      }
   };

   static bpo a(final bme $$0, final int $$1, final Predicate<cpq> $$2) {
      return new bpo() {
         @Override
         public cpq a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cpq $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bpo a(bme $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bpo a(final box $$0, final bom $$1, final Predicate<cpq> $$2) {
      return new bpo() {
         @Override
         public cpq a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cpq $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bpo a(box $$0, bom $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cpq a();

   boolean a(cpq var1);
}
