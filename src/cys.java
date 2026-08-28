import java.util.OptionalInt;

public interface cys {
   crb a(dhp var1, kc var2, cxy var3, jo var4);

   default cys.a b() {
      return cys.a.a;
   }

   default void a(crb $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cys.b b, float c, float d, OptionalInt e) {
      public static final cys.a a = a().a();

      public static cys.a.a a() {
         return new cys.a.a();
      }

      public static class a {
         private cys.b a = ($$0, $$1) -> dna.a($$0, 0.7, new fcu(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cys.a.a a(cys.b $$0) {
            this.a = $$0;
            return this;
         }

         public cys.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cys.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cys.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cys.a a() {
            return new cys.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      kc getDispensePosition(lb var1, jo var2);
   }
}
