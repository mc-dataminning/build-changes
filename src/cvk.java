import java.util.OptionalInt;

public interface cvk {
   cnn a(dcu var1, jw var2, cuo var3, ji var4);

   default cvk.a c() {
      return cvk.a.a;
   }

   default void a(cnn $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cvk.b b, float c, float d, OptionalInt e) {
      public static final cvk.a a = a().a();

      public static cvk.a.a a() {
         return new cvk.a.a();
      }

      public static class a {
         private cvk.b a = ($$0, $$1) -> dib.a($$0, 0.7, new eww(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cvk.a.a a(cvk.b $$0) {
            this.a = $$0;
            return this;
         }

         public cvk.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cvk.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cvk.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cvk.a a() {
            return new cvk.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jw getDispensePosition(ku var1, ji var2);
   }
}
