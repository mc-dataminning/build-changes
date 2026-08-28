import java.util.OptionalInt;

public interface cvi {
   cnq a(dbz var1, js var2, cuq var3, je var4);

   default cvi.a c() {
      return cvi.a.a;
   }

   default void a(cnq $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cvi.b b, float c, float d, OptionalInt e) {
      public static final cvi.a a = a().a();

      public static cvi.a.a a() {
         return new cvi.a.a();
      }

      public static class a {
         private cvi.b a = ($$0, $$1) -> dhf.a($$0, 0.7, new evs(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cvi.a.a a(cvi.b $$0) {
            this.a = $$0;
            return this;
         }

         public cvi.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cvi.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cvi.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cvi.a a() {
            return new cvi.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      js getDispensePosition(kq var1, je var2);
   }
}
