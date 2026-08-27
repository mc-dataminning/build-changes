import java.util.function.Predicate;

public interface bmx {
   bmx b = new bmx() {
      @Override
      public cmr a() {
         return cmr.f;
      }

      @Override
      public boolean a(cmr $$0) {
         return false;
      }
   };

   static bmx a(final bjo $$0, final int $$1, final Predicate<cmr> $$2) {
      return new bmx() {
         @Override
         public cmr a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cmr $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bmx a(bjo $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bmx a(final bmf $$0, final blu $$1, final Predicate<cmr> $$2) {
      return new bmx() {
         @Override
         public cmr a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cmr $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bmx a(bmf $$0, blu $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cmr a();

   boolean a(cmr var1);
}
