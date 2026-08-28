import java.util.OptionalInt;

public interface cyf {
   cql a(dha var1, ka var2, cxk var3, jm var4);

   default cyf.a b() {
      return cyf.a.a;
   }

   default void a(cql $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cyf.b b, float c, float d, OptionalInt e) {
      public static final cyf.a a = a().a();

      public static cyf.a.a a() {
         return new cyf.a.a();
      }

      public static class a {
         private cyf.b a = ($$0, $$1) -> dml.a($$0, 0.7, new fbs(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cyf.a.a a(cyf.b $$0) {
            this.a = $$0;
            return this;
         }

         public cyf.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cyf.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cyf.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cyf.a a() {
            return new cyf.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ka getDispensePosition(ky var1, jm var2);
   }
}
