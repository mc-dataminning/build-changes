import java.util.OptionalInt;

public interface cvj {
   cnr a(dca var1, js var2, cur var3, je var4);

   default cvj.a c() {
      return cvj.a.a;
   }

   default void a(cnr $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cvj.b b, float c, float d, OptionalInt e) {
      public static final cvj.a a = a().a();

      public static cvj.a.a a() {
         return new cvj.a.a();
      }

      public static class a {
         private cvj.b a = ($$0, $$1) -> dhg.a($$0, 0.7, new evt(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cvj.a.a a(cvj.b $$0) {
            this.a = $$0;
            return this;
         }

         public cvj.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cvj.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cvj.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cvj.a a() {
            return new cvj.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      js getDispensePosition(kq var1, je var2);
   }
}
