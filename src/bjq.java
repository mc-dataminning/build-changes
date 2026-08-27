import java.util.function.Predicate;

public interface bjq {
   bjq b = new bjq() {
      @Override
      public cix a() {
         return cix.b;
      }

      @Override
      public boolean a(cix $$0) {
         return false;
      }
   };

   static bjq a(final bgj $$0, final int $$1, final Predicate<cix> $$2) {
      return new bjq() {
         @Override
         public cix a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cix $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bjq a(bgj $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bjq a(final biy $$0, final bin $$1, final Predicate<cix> $$2) {
      return new bjq() {
         @Override
         public cix a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cix $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bjq a(biy $$0, bin $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cix a();

   boolean a(cix var1);
}
