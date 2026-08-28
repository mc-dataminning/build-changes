import java.util.OptionalInt;

public interface cuv {
   cnd a(dcg var1, jt var2, cud var3, jf var4);

   default cuv.a c() {
      return cuv.a.a;
   }

   default void a(cnd $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cuv.b b, float c, float d, OptionalInt e) {
      public static final cuv.a a = a().a();

      public static cuv.a.a a() {
         return new cuv.a.a();
      }

      public static class a {
         private cuv.b a = ($$0, $$1) -> dhn.a($$0, 0.7, new ewh(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cuv.a.a a(cuv.b $$0) {
            this.a = $$0;
            return this;
         }

         public cuv.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cuv.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cuv.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cuv.a a() {
            return new cuv.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jt getDispensePosition(kr var1, jf var2);
   }
}
