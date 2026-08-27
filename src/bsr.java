import java.util.function.Predicate;

public interface bsr {
   bsr b = new bsr() {
      @Override
      public csz a() {
         return csz.i;
      }

      @Override
      public boolean a(csz $$0) {
         return false;
      }
   };

   static bsr a(final bpf $$0, final int $$1, final Predicate<csz> $$2) {
      return new bsr() {
         @Override
         public csz a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(csz $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bsr a(bpf $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bsr a(final bsa $$0, final bro $$1, final Predicate<csz> $$2) {
      return new bsr() {
         @Override
         public csz a() {
            return $$0.d($$1);
         }

         @Override
         public boolean a(csz $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bsr a(bsa $$0, bro $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   csz a();

   boolean a(csz var1);
}
