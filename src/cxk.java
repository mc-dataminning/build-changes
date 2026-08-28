import java.util.OptionalInt;

public interface cxk {
   cpq a(dgi var1, kb var2, cwp var3, jn var4);

   default cxk.a b() {
      return cxk.a.a;
   }

   default void a(cpq $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cxk.b b, float c, float d, OptionalInt e) {
      public static final cxk.a a = a().a();

      public static cxk.a.a a() {
         return new cxk.a.a();
      }

      public static class a {
         private cxk.b a = ($$0, $$1) -> dls.a($$0, 0.7, new fba(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cxk.a.a a(cxk.b $$0) {
            this.a = $$0;
            return this;
         }

         public cxk.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cxk.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cxk.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cxk.a a() {
            return new cxk.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      kb getDispensePosition(kz var1, jn var2);
   }
}
