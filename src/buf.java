import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface buf {
   buf a = new buf() {
      @Override
      public cun a() {
         return cun.l;
      }

      @Override
      public boolean a(cun $$0) {
         return false;
      }
   };

   static buf a(final Supplier<cun> $$0, final Consumer<cun> $$1) {
      return new buf() {
         @Override
         public cun a() {
            return $$0.get();
         }

         @Override
         public boolean a(cun $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static buf a(final bql $$0, final int $$1, final Predicate<cun> $$2) {
      return new buf() {
         @Override
         public cun a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cun $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static buf a(bql $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static buf a(final btn $$0, final bsz $$1, final Predicate<cun> $$2) {
      return new buf() {
         @Override
         public cun a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cun $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static buf a(btn $$0, bsz $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cun a();

   boolean a(cun var1);
}
