import java.util.OptionalInt;

public interface cxi {
   cpo a(dgg var1, kb var2, cwn var3, jn var4);

   default cxi.a b() {
      return cxi.a.a;
   }

   default void a(cpo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cxi.b b, float c, float d, OptionalInt e) {
      public static final cxi.a a = a().a();

      public static cxi.a.a a() {
         return new cxi.a.a();
      }

      public static class a {
         private cxi.b a = ($$0, $$1) -> dlq.a($$0, 0.7, new fay(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cxi.a.a a(cxi.b $$0) {
            this.a = $$0;
            return this;
         }

         public cxi.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cxi.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cxi.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cxi.a a() {
            return new cxi.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      kb getDispensePosition(kz var1, jn var2);
   }
}
