import java.util.OptionalInt;

public interface cxj {
   cpp a(dgh var1, kb var2, cwo var3, jn var4);

   default cxj.a b() {
      return cxj.a.a;
   }

   default void a(cpp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cxj.b b, float c, float d, OptionalInt e) {
      public static final cxj.a a = a().a();

      public static cxj.a.a a() {
         return new cxj.a.a();
      }

      public static class a {
         private cxj.b a = ($$0, $$1) -> dlr.a($$0, 0.7, new faz(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cxj.a.a a(cxj.b $$0) {
            this.a = $$0;
            return this;
         }

         public cxj.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cxj.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cxj.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cxj.a a() {
            return new cxj.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      kb getDispensePosition(kz var1, jn var2);
   }
}
