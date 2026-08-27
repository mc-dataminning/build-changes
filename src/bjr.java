import java.util.function.Predicate;

public interface bjr {
   bjr b = new bjr() {
      @Override
      public ciy a() {
         return ciy.b;
      }

      @Override
      public boolean a(ciy $$0) {
         return false;
      }
   };

   static bjr a(final bgj $$0, final int $$1, final Predicate<ciy> $$2) {
      return new bjr() {
         @Override
         public ciy a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(ciy $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bjr a(bgj $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bjr a(final biy $$0, final bin $$1, final Predicate<ciy> $$2) {
      return new bjr() {
         @Override
         public ciy a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(ciy $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bjr a(biy $$0, bin $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   ciy a();

   boolean a(ciy var1);
}
