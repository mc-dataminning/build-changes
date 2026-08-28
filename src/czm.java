import java.util.OptionalInt;

public interface czm {
   crm a(dip var1, jo var2, cys var3, ja var4);

   default czm.a a() {
      return czm.a.a;
   }

   default void a(crm $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(czm.b b, float c, float d, OptionalInt e) {
      public static final czm.a a = a().a();

      public static czm.a.a a() {
         return new czm.a.a();
      }

      public static class a {
         private czm.b a = ($$0, $$1) -> doa.a($$0, 0.7, new fdw(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public czm.a.a a(czm.b $$0) {
            this.a = $$0;
            return this;
         }

         public czm.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public czm.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public czm.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public czm.a a() {
            return new czm.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jo getDispensePosition(ld var1, ja var2);
   }
}
