import java.util.OptionalInt;

public interface cvh {
   cnp a(dby var1, js var2, cup var3, je var4);

   default cvh.a c() {
      return cvh.a.a;
   }

   default void a(cnp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cvh.b b, float c, float d, OptionalInt e) {
      public static final cvh.a a = a().a();

      public static cvh.a.a a() {
         return new cvh.a.a();
      }

      public static class a {
         private cvh.b a = ($$0, $$1) -> dhe.a($$0, 0.7, new evr(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cvh.a.a a(cvh.b $$0) {
            this.a = $$0;
            return this;
         }

         public cvh.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cvh.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cvh.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cvh.a a() {
            return new cvh.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      js getDispensePosition(kq var1, je var2);
   }
}
