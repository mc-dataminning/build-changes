import java.util.OptionalInt;

public interface cvm {
   cnp a(dcw var1, jw var2, cuq var3, ji var4);

   default cvm.a c() {
      return cvm.a.a;
   }

   default void a(cnp $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cvm.b b, float c, float d, OptionalInt e) {
      public static final cvm.a a = a().a();

      public static cvm.a.a a() {
         return new cvm.a.a();
      }

      public static class a {
         private cvm.b a = ($$0, $$1) -> did.a($$0, 0.7, new exa(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cvm.a.a a(cvm.b $$0) {
            this.a = $$0;
            return this;
         }

         public cvm.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cvm.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cvm.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cvm.a a() {
            return new cvm.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jw getDispensePosition(ku var1, ji var2);
   }
}
