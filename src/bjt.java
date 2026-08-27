import java.util.function.Predicate;

public interface bjt {
   bjt b = new bjt() {
      @Override
      public cja a() {
         return cja.b;
      }

      @Override
      public boolean a(cja $$0) {
         return false;
      }
   };

   static bjt a(final bgm $$0, final int $$1, final Predicate<cja> $$2) {
      return new bjt() {
         @Override
         public cja a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cja $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bjt a(bgm $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bjt a(final bjb $$0, final biq $$1, final Predicate<cja> $$2) {
      return new bjt() {
         @Override
         public cja a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cja $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bjt a(bjb $$0, biq $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cja a();

   boolean a(cja var1);
}
