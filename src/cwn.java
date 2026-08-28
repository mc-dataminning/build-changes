import java.util.OptionalInt;

public interface cwn {
   cor a(dej var1, jy var2, cvs var3, jk var4);

   default cwn.a c() {
      return cwn.a.a;
   }

   default void a(cor $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cwn.b b, float c, float d, OptionalInt e) {
      public static final cwn.a a = a().a();

      public static cwn.a.a a() {
         return new cwn.a.a();
      }

      public static class a {
         private cwn.b a = ($$0, $$1) -> djr.a($$0, 0.7, new eyw(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cwn.a.a a(cwn.b $$0) {
            this.a = $$0;
            return this;
         }

         public cwn.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cwn.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cwn.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cwn.a a() {
            return new cwn.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jy getDispensePosition(kw var1, jk var2);
   }
}
