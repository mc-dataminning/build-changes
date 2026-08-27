import java.util.function.Predicate;

public interface bqg {
   bqg b = new bqg() {
      @Override
      public cqm a() {
         return cqm.h;
      }

      @Override
      public boolean a(cqm $$0) {
         return false;
      }
   };

   static bqg a(final bmw $$0, final int $$1, final Predicate<cqm> $$2) {
      return new bqg() {
         @Override
         public cqm a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cqm $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bqg a(bmw $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bqg a(final bpp $$0, final bpe $$1, final Predicate<cqm> $$2) {
      return new bqg() {
         @Override
         public cqm a() {
            return $$0.d($$1);
         }

         @Override
         public boolean a(cqm $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bqg a(bpp $$0, bpe $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cqm a();

   boolean a(cqm var1);
}
