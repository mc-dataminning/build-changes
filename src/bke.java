import java.util.function.Predicate;

public interface bke {
   bke b = new bke() {
      @Override
      public cjl a() {
         return cjl.b;
      }

      @Override
      public boolean a(cjl $$0) {
         return false;
      }
   };

   static bke a(final bgx $$0, final int $$1, final Predicate<cjl> $$2) {
      return new bke() {
         @Override
         public cjl a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(cjl $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bke a(bgx $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static bke a(final bjm $$0, final bjb $$1, final Predicate<cjl> $$2) {
      return new bke() {
         @Override
         public cjl a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(cjl $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static bke a(bjm $$0, bjb $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   cjl a();

   boolean a(cjl var1);
}
