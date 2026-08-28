import java.util.OptionalInt;

public interface cws {
   cpb a(dev var1, jz var2, cvx var3, jl var4);

   default cws.a c() {
      return cws.a.a;
   }

   default void a(cpb $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cws.b b, float c, float d, OptionalInt e) {
      public static final cws.a a = a().a();

      public static cws.a.a a() {
         return new cws.a.a();
      }

      public static class a {
         private cws.b a = ($$0, $$1) -> dkd.a($$0, 0.7, new ezh(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cws.a.a a(cws.b $$0) {
            this.a = $$0;
            return this;
         }

         public cws.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cws.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cws.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cws.a a() {
            return new cws.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jz getDispensePosition(kx var1, jl var2);
   }
}
