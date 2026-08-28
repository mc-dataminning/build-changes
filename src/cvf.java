import java.util.OptionalInt;

public interface cvf {
   cnn a(dbw var1, js var2, cun var3, je var4);

   default cvf.a c() {
      return cvf.a.a;
   }

   default void a(cnn $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cvf.b b, float c, float d, OptionalInt e) {
      public static final cvf.a a = a().a();

      public static cvf.a.a a() {
         return new cvf.a.a();
      }

      public static class a {
         private cvf.b a = ($$0, $$1) -> dhc.a($$0, 0.7, new evp(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cvf.a.a a(cvf.b $$0) {
            this.a = $$0;
            return this;
         }

         public cvf.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cvf.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cvf.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cvf.a a() {
            return new cvf.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      js getDispensePosition(kq var1, je var2);
   }
}
