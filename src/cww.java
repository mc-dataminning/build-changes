import java.util.OptionalInt;

public interface cww {
   cpg a(dfb var1, ka var2, cwb var3, jm var4);

   default cww.a b() {
      return cww.a.a;
   }

   default void a(cpg $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cww.b b, float c, float d, OptionalInt e) {
      public static final cww.a a = a().a();

      public static cww.a.a a() {
         return new cww.a.a();
      }

      public static class a {
         private cww.b a = ($$0, $$1) -> dkj.a($$0, 0.7, new ezn(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cww.a.a a(cww.b $$0) {
            this.a = $$0;
            return this;
         }

         public cww.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cww.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cww.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cww.a a() {
            return new cww.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      ka getDispensePosition(ky var1, jm var2);
   }
}
