import java.util.function.Predicate;

public interface bnd {
   bnd b = new bnd() {
      @Override
      public cmy a() {
         return cmy.f;
      }

      @Override
      public boolean a(cmy $$0) {
         return false;
      }
   };

   static bnd a(final bju $$0, final int $$1, final Predicate<cmy> $$2) {
      return new bnd() {
         @Override
         public cmy a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cmy $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bnd a(bju $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bnd a(final bml $$0, final bma $$1, final Predicate<cmy> $$2) {
      return new bnd() {
         @Override
         public cmy a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cmy $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bnd a(bml $$0, bma $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cmy a();

   boolean a(cmy var1);
}
