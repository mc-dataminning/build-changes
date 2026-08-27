import java.util.function.Predicate;

public interface btf {
   btf b = new btf() {
      @Override
      public cuh a() {
         return cuh.i;
      }

      @Override
      public boolean a(cuh $$0) {
         return false;
      }
   };

   static btf a(final bpt $$0, final int $$1, final Predicate<cuh> $$2) {
      return new btf() {
         @Override
         public cuh a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cuh $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static btf a(bpt $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static btf a(final bso $$0, final bsc $$1, final Predicate<cuh> $$2) {
      return new btf() {
         @Override
         public cuh a() {
            return $$0.d($$1);
         }

         @Override
         public boolean a(cuh $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static btf a(bso $$0, bsc $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cuh a();

   boolean a(cuh var1);
}
