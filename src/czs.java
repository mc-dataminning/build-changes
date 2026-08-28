import java.util.OptionalInt;

public interface czs {
   crs a(div var1, jo var2, cyy var3, ja var4);

   default czs.a a() {
      return czs.a.a;
   }

   default void a(crs $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(czs.b b, float c, float d, OptionalInt e) {
      public static final czs.a a = a().a();

      public static czs.a.a a() {
         return new czs.a.a();
      }

      public static class a {
         private czs.b a = ($$0, $$1) -> dog.a($$0, 0.7, new fei(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public czs.a.a a(czs.b $$0) {
            this.a = $$0;
            return this;
         }

         public czs.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public czs.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public czs.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public czs.a a() {
            return new czs.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jo getDispensePosition(ld var1, ja var2);
   }
}
