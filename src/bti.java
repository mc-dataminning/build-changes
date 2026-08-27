import java.util.function.Predicate;

public interface bti {
   bti b = new bti() {
      @Override
      public ctq a() {
         return ctq.i;
      }

      @Override
      public boolean a(ctq $$0) {
         return false;
      }
   };

   static bti a(final bpp $$0, final int $$1, final Predicate<ctq> $$2) {
      return new bti() {
         @Override
         public ctq a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(ctq $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bti a(bpp $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bti a(final bsq $$0, final bsd $$1, final Predicate<ctq> $$2) {
      return new bti() {
         @Override
         public ctq a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(ctq $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bti a(bsq $$0, bsd $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   ctq a();

   boolean a(ctq var1);
}
