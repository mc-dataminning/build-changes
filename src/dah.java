import java.util.OptionalInt;

public interface dah {
   csh a(djm var1, jp var2, czn var3, jb var4);

   default dah.a a() {
      return dah.a.a;
   }

   default void a(csh $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(dah.b b, float c, float d, OptionalInt e) {
      public static final dah.a a = a().a();

      public static dah.a.a a() {
         return new dah.a.a();
      }

      public static class a {
         private dah.b a = ($$0, $$1) -> dox.a($$0, 0.7, new ffc(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public dah.a.a a(dah.b $$0) {
            this.a = $$0;
            return this;
         }

         public dah.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public dah.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public dah.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public dah.a a() {
            return new dah.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jp getDispensePosition(le var1, jb var2);
   }
}
