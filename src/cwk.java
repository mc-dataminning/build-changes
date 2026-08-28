import java.util.OptionalInt;

public interface cwk {
   coo a(deg var1, jx var2, cvp var3, jj var4);

   default cwk.a c() {
      return cwk.a.a;
   }

   default void a(coo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cwk.b b, float c, float d, OptionalInt e) {
      public static final cwk.a a = a().a();

      public static cwk.a.a a() {
         return new cwk.a.a();
      }

      public static class a {
         private cwk.b a = ($$0, $$1) -> djo.a($$0, 0.7, new eys(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cwk.a.a a(cwk.b $$0) {
            this.a = $$0;
            return this;
         }

         public cwk.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cwk.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cwk.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cwk.a a() {
            return new cwk.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jx getDispensePosition(kv var1, jj var2);
   }
}
