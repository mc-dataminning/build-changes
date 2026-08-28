import java.util.OptionalInt;

public interface cyj {
   cqp a(dhh var1, ka var2, cxo var3, jm var4);

   default cyj.a b() {
      return cyj.a.a;
   }

   default void a(cqp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cyj.b b, float c, float d, OptionalInt e) {
      public static final cyj.a a = a().a();

      public static cyj.a.a a() {
         return new cyj.a.a();
      }

      public static class a {
         private cyj.b a = ($$0, $$1) -> dms.a($$0, 0.7, new fbx(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cyj.a.a a(cyj.b $$0) {
            this.a = $$0;
            return this;
         }

         public cyj.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cyj.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cyj.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cyj.a a() {
            return new cyj.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ka getDispensePosition(ky var1, jm var2);
   }
}
