import java.util.function.Predicate;

public interface blb {
   blb b = new blb() {
      @Override
      public ckj a() {
         return ckj.b;
      }

      @Override
      public boolean a(ckj $$0) {
         return false;
      }
   };

   static blb a(final bhu $$0, final int $$1, final Predicate<ckj> $$2) {
      return new blb() {
         @Override
         public ckj a() {
            return $$0.a($$1);
         }

         @Override
         public boolean a(ckj $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static blb a(bhu $$0, int $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   static blb a(final bkj $$0, final bjy $$1, final Predicate<ckj> $$2) {
      return new blb() {
         @Override
         public ckj a() {
            return $$0.c($$1);
         }

         @Override
         public boolean a(ckj $$0x) {
            if (!$$2.test($$0)) {
               return false;
            } else {
               $$0.a($$1, $$0);
               return true;
            }
         }
      };
   }

   static blb a(bkj $$0, bjy $$1) {
      return a($$0, $$1, $$0x -> true);
   }

   ckj a();

   boolean a(ckj var1);
}
