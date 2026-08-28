import java.util.OptionalInt;

public interface cxl {
   cpr a(dgj var1, kb var2, cwq var3, jn var4);

   default cxl.a b() {
      return cxl.a.a;
   }

   default void a(cpr $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cxl.b b, float c, float d, OptionalInt e) {
      public static final cxl.a a = a().a();

      public static cxl.a.a a() {
         return new cxl.a.a();
      }

      public static class a {
         private cxl.b a = ($$0, $$1) -> dlt.a($$0, 0.7, new fbb(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cxl.a.a a(cxl.b $$0) {
            this.a = $$0;
            return this;
         }

         public cxl.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cxl.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cxl.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cxl.a a() {
            return new cxl.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      kb getDispensePosition(kz var1, jn var2);
   }
}
