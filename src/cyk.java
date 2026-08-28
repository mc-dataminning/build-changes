import java.util.OptionalInt;

public interface cyk {
   cqq a(dhi var1, ka var2, cxp var3, jm var4);

   default cyk.a b() {
      return cyk.a.a;
   }

   default void a(cqq $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cyk.b b, float c, float d, OptionalInt e) {
      public static final cyk.a a = a().a();

      public static cyk.a.a a() {
         return new cyk.a.a();
      }

      public static class a {
         private cyk.b a = ($$0, $$1) -> dmt.a($$0, 0.7, new fby(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cyk.a.a a(cyk.b $$0) {
            this.a = $$0;
            return this;
         }

         public cyk.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cyk.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cyk.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cyk.a a() {
            return new cyk.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ka getDispensePosition(ky var1, jm var2);
   }
}
