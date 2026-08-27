import java.util.OptionalInt;

public interface cug {
   cmo a(dax var1, jh var2, cto var3, it var4);

   default cug.a c() {
      return cug.a.a;
   }

   default void a(cmo $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cug.b b, float c, float d, OptionalInt e) {
      public static final cug.a a = a().a();

      public static cug.a.a a() {
         return new cug.a.a();
      }

      public static class a {
         private cug.b a = ($$0, $$1) -> dgd.a($$0, 0.7, new euk(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cug.a.a a(cug.b $$0) {
            this.a = $$0;
            return this;
         }

         public cug.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cug.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cug.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cug.a a() {
            return new cug.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jh getDispensePosition(kf var1, it var2);
   }
}
