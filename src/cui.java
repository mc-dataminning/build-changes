import java.util.OptionalInt;

public interface cui {
   cmq a(daz var1, jh var2, ctq var3, it var4);

   default cui.a c() {
      return cui.a.a;
   }

   default void a(cmq $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cui.b b, float c, float d, OptionalInt e) {
      public static final cui.a a = a().a();

      public static cui.a.a a() {
         return new cui.a.a();
      }

      public static class a {
         private cui.b a = ($$0, $$1) -> dgf.a($$0, 0.7, new eum(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cui.a.a a(cui.b $$0) {
            this.a = $$0;
            return this;
         }

         public cui.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cui.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cui.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cui.a a() {
            return new cui.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jh getDispensePosition(kf var1, it var2);
   }
}
