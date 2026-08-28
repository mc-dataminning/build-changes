import java.util.OptionalInt;

public interface czx {
   crx a(dja var1, jo var2, czd var3, ja var4);

   default czx.a a() {
      return czx.a.a;
   }

   default void a(crx $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(czx.b b, float c, float d, OptionalInt e) {
      public static final czx.a a = a().a();

      public static czx.a.a a() {
         return new czx.a.a();
      }

      public static class a {
         private czx.b a = ($$0, $$1) -> dol.a($$0, 0.7, new feq(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public czx.a.a a(czx.b $$0) {
            this.a = $$0;
            return this;
         }

         public czx.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public czx.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public czx.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public czx.a a() {
            return new czx.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jo getDispensePosition(ld var1, ja var2);
   }
}
