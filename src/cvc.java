import java.util.OptionalInt;

public interface cvc {
   cnk a(dbt var1, js var2, cuk var3, je var4);

   default cvc.a c() {
      return cvc.a.a;
   }

   default void a(cnk $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cvc.b b, float c, float d, OptionalInt e) {
      public static final cvc.a a = a().a();

      public static cvc.a.a a() {
         return new cvc.a.a();
      }

      public static class a {
         private cvc.b a = ($$0, $$1) -> dgz.a($$0, 0.7, new evm(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cvc.a.a a(cvc.b $$0) {
            this.a = $$0;
            return this;
         }

         public cvc.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cvc.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cvc.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cvc.a a() {
            return new cvc.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      js getDispensePosition(kq var1, je var2);
   }
}
