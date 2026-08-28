import java.util.OptionalInt;

public interface dae {
   cse a(djh var1, jp var2, czk var3, jb var4);

   default dae.a a() {
      return dae.a.a;
   }

   default void a(cse $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(dae.b b, float c, float d, OptionalInt e) {
      public static final dae.a a = a().a();

      public static dae.a.a a() {
         return new dae.a.a();
      }

      public static class a {
         private dae.b a = ($$0, $$1) -> dos.a($$0, 0.7, new fex(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public dae.a.a a(dae.b $$0) {
            this.a = $$0;
            return this;
         }

         public dae.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public dae.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public dae.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public dae.a a() {
            return new dae.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jp getDispensePosition(le var1, jb var2);
   }
}
