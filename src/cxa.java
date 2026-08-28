import java.util.OptionalInt;

public interface cxa {
   cpk a(dff var1, ka var2, cwf var3, jm var4);

   default cxa.a b() {
      return cxa.a.a;
   }

   default void a(cpk $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cxa.b b, float c, float d, OptionalInt e) {
      public static final cxa.a a = a().a();

      public static cxa.a.a a() {
         return new cxa.a.a();
      }

      public static class a {
         private cxa.b a = ($$0, $$1) -> dko.a($$0, 0.7, new ezr(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cxa.a.a a(cxa.b $$0) {
            this.a = $$0;
            return this;
         }

         public cxa.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cxa.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cxa.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cxa.a a() {
            return new cxa.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ka getDispensePosition(ky var1, jm var2);
   }
}
