import java.util.function.Predicate;

public interface brf {
   brf b = new brf() {
      @Override
      public crj a() {
         return crj.i;
      }

      @Override
      public boolean a(crj $$0) {
         return false;
      }
   };

   static brf a(final bnt $$0, final int $$1, final Predicate<crj> $$2) {
      return new brf() {
         @Override
         public crj a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(crj $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static brf a(bnt $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static brf a(final bqo $$0, final bqc $$1, final Predicate<crj> $$2) {
      return new brf() {
         @Override
         public crj a() {
            return $$0.d($$1);
         }

         @Override
         public boolean a(crj $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static brf a(bqo $$0, bqc $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   crj a();

   boolean a(crj var1);
}
