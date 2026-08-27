import java.util.function.Predicate;

public interface bmd {
   bmd b = new bmd() {
      @Override
      public clo a() {
         return clo.b;
      }

      @Override
      public boolean a(clo $$0) {
         return false;
      }
   };

   static bmd a(final biu $$0, final int $$1, final Predicate<clo> $$2) {
      return new bmd() {
         @Override
         public clo a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(clo $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bmd a(biu $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bmd a(final bll $$0, final bla $$1, final Predicate<clo> $$2) {
      return new bmd() {
         @Override
         public clo a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(clo $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bmd a(bll $$0, bla $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   clo a();

   boolean a(clo var1);
}
