import java.util.function.Predicate;

public interface bmn {
   bmn b = new bmn() {
      @Override
      public cmh a() {
         return cmh.f;
      }

      @Override
      public boolean a(cmh $$0) {
         return false;
      }
   };

   static bmn a(final bje $$0, final int $$1, final Predicate<cmh> $$2) {
      return new bmn() {
         @Override
         public cmh a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cmh $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bmn a(bje $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bmn a(final blv $$0, final blk $$1, final Predicate<cmh> $$2) {
      return new bmn() {
         @Override
         public cmh a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cmh $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bmn a(blv $$0, blk $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cmh a();

   boolean a(cmh var1);
}
