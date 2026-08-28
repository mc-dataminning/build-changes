import java.util.OptionalInt;

public interface cus {
   cmz a(dcd var1, jt var2, cua var3, jf var4);

   default cus.a c() {
      return cus.a.a;
   }

   default void a(cmz $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cus.b b, float c, float d, OptionalInt e) {
      public static final cus.a a = a().a();

      public static cus.a.a a() {
         return new cus.a.a();
      }

      public static class a {
         private cus.b a = ($$0, $$1) -> dhk.a($$0, 0.7, new evz(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cus.a.a a(cus.b $$0) {
            this.a = $$0;
            return this;
         }

         public cus.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cus.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cus.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cus.a a() {
            return new cus.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jt getDispensePosition(kr var1, jf var2);
   }
}
