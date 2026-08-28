import java.util.OptionalInt;

public interface cvg {
   cno a(dbx var1, js var2, cuo var3, je var4);

   default cvg.a c() {
      return cvg.a.a;
   }

   default void a(cno $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cvg.b b, float c, float d, OptionalInt e) {
      public static final cvg.a a = a().a();

      public static cvg.a.a a() {
         return new cvg.a.a();
      }

      public static class a {
         private cvg.b a = ($$0, $$1) -> dhd.a($$0, 0.7, new evq(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cvg.a.a a(cvg.b $$0) {
            this.a = $$0;
            return this;
         }

         public cvg.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cvg.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cvg.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cvg.a a() {
            return new cvg.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      js getDispensePosition(kq var1, je var2);
   }
}
