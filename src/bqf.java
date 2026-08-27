import java.util.function.Predicate;

public interface bqf {
   bqf b = new bqf() {
      @Override
      public cqk a() {
         return cqk.h;
      }

      @Override
      public boolean a(cqk $$0) {
         return false;
      }
   };

   static bqf a(final bmv $$0, final int $$1, final Predicate<cqk> $$2) {
      return new bqf() {
         @Override
         public cqk a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cqk $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bqf a(bmv $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bqf a(final bpo $$0, final bpd $$1, final Predicate<cqk> $$2) {
      return new bqf() {
         @Override
         public cqk a() {
            return $$0.d($$1);
         }

         @Override
         public boolean a(cqk $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bqf a(bpo $$0, bpd $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cqk a();

   boolean a(cqk var1);
}
