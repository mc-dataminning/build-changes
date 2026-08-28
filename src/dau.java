import java.util.OptionalInt;

public interface dau {
   csu a(djz var1, jq var2, daa var3, jc var4);

   default dau.a a() {
      return dau.a.a;
   }

   default void a(csu $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(dau.b b, float c, float d, OptionalInt e) {
      public static final dau.a a = a().a();

      public static dau.a.a a() {
         return new dau.a.a();
      }

      public static class a {
         private dau.b a = ($$0, $$1) -> dpk.a($$0, 0.7, new ffs(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public dau.a.a a(dau.b $$0) {
            this.a = $$0;
            return this;
         }

         public dau.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public dau.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public dau.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public dau.a a() {
            return new dau.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jq getDispensePosition(lf var1, jc var2);
   }
}
