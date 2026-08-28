import java.util.OptionalInt;

public interface dbe {
   ctd a(dkj var1, jq var2, dak var3, jc var4);

   default dbe.a a() {
      return dbe.a.a;
   }

   default void a(ctd $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(dbe.b b, float c, float d, OptionalInt e) {
      public static final dbe.a a = a().a();

      public static dbe.a.a a() {
         return new dbe.a.a();
      }

      public static class a {
         private dbe.b a = ($$0, $$1) -> dpu.a($$0, 0.7, new fgc(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public dbe.a.a a(dbe.b $$0) {
            this.a = $$0;
            return this;
         }

         public dbe.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public dbe.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public dbe.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public dbe.a a() {
            return new dbe.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jq getDispensePosition(lf var1, jc var2);
   }
}
