import java.util.OptionalInt;

public interface das {
   css a(djx var1, jp var2, czy var3, jb var4);

   default das.a a() {
      return das.a.a;
   }

   default void a(css $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(das.b b, float c, float d, OptionalInt e) {
      public static final das.a a = a().a();

      public static das.a.a a() {
         return new das.a.a();
      }

      public static class a {
         private das.b a = ($$0, $$1) -> dpi.a($$0, 0.7, new ffq(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public das.a.a a(das.b $$0) {
            this.a = $$0;
            return this;
         }

         public das.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public das.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public das.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public das.a a() {
            return new das.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jp getDispensePosition(le var1, jb var2);
   }
}
