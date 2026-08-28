import java.util.OptionalInt;

public interface cwh {
   coi a(dds var1, jx var2, cvl var3, jj var4);

   default cwh.a c() {
      return cwh.a.a;
   }

   default void a(coi $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cwh.b b, float c, float d, OptionalInt e) {
      public static final cwh.a a = a().a();

      public static cwh.a.a a() {
         return new cwh.a.a();
      }

      public static class a {
         private cwh.b a = ($$0, $$1) -> dja.a($$0, 0.7, new eye(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cwh.a.a a(cwh.b $$0) {
            this.a = $$0;
            return this;
         }

         public cwh.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cwh.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cwh.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cwh.a a() {
            return new cwh.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      jx getDispensePosition(kv var1, jj var2);
   }
}
