import java.util.OptionalInt;

public interface cuu {
   cnc a(dcf var1, jt var2, cuc var3, jf var4);

   default cuu.a c() {
      return cuu.a.a;
   }

   default void a(cnc $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cuu.b b, float c, float d, OptionalInt e) {
      public static final cuu.a a = a().a();

      public static cuu.a.a a() {
         return new cuu.a.a();
      }

      public static class a {
         private cuu.b a = ($$0, $$1) -> dhm.a($$0, 0.7, new ewf(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cuu.a.a a(cuu.b $$0) {
            this.a = $$0;
            return this;
         }

         public cuu.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cuu.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cuu.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cuu.a a() {
            return new cuu.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jt getDispensePosition(kr var1, jf var2);
   }
}
