import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface btt {
   btt a = new btt() {
      @Override
      public cuc a() {
         return cuc.l;
      }

      @Override
      public boolean a(cuc $$0) {
         return false;
      }
   };

   static btt a(final Supplier<cuc> $$0, final Consumer<cuc> $$1) {
      return new btt() {
         @Override
         public cuc a() {
            return $$0.get();
         }

         @Override
         public boolean a(cuc $$0x) {
            $$1.accept($$0);
            return true;
         }
      };
   }

   static btt a(final bpz $$0, final int $$1, final Predicate<cuc> $$2) {
      return new btt() {
         @Override
         public cuc a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cuc $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static btt a(bpz $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static btt a(final btb $$0, final bsn $$1, final Predicate<cuc> $$2) {
      return new btt() {
         @Override
         public cuc a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cuc $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static btt a(btb $$0, bsn $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cuc a();

   boolean a(cuc var1);
}
