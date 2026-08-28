import java.util.OptionalInt;

public interface cxh {
   cpn a(dfm var1, ka var2, cwm var3, jm var4);

   default cxh.a b() {
      return cxh.a.a;
   }

   default void a(cpn $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cxh.b b, float c, float d, OptionalInt e) {
      public static final cxh.a a = a().a();

      public static cxh.a.a a() {
         return new cxh.a.a();
      }

      public static class a {
         private cxh.b a = ($$0, $$1) -> dkv.a($$0, 0.7, new ezy(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cxh.a.a a(cxh.b $$0) {
            this.a = $$0;
            return this;
         }

         public cxh.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cxh.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cxh.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cxh.a a() {
            return new cxh.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ka getDispensePosition(ky var1, jm var2);
   }
}
