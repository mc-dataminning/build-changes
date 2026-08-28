import java.util.OptionalInt;

public interface cyb {
   cqk a(dgz var1, kb var2, cxh var3, jn var4);

   default cyb.a b() {
      return cyb.a.a;
   }

   default void a(cqk $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      $$0.c($$1, $$2, $$3, $$4, $$5);
   }

   public static record a(cyb.b b, float c, float d, OptionalInt e) {
      public static final cyb.a a = a().a();

      public static cyb.a.a a() {
         return new cyb.a.a();
      }

      public static class a {
         private cyb.b a = ($$0, $$1) -> dmk.a($$0, 0.7, new fbx(0.0, 0.1, 0.0));
         private float b = 6.0F;
         private float c = 1.1F;
         private OptionalInt d = OptionalInt.empty();

         public cyb.a.a a(cyb.b $$0) {
            this.a = $$0;
            return this;
         }

         public cyb.a.a a(float $$0) {
            this.b = $$0;
            return this;
         }

         public cyb.a.a b(float $$0) {
            this.c = $$0;
            return this;
         }

         public cyb.a.a a(int $$0) {
            this.d = OptionalInt.of($$0);
            return this;
         }

         public cyb.a a() {
            return new cyb.a(this.a, this.b, this.c, this.d);
         }
      }
   }

   @FunctionalInterface
   public interface b {
      kb getDispensePosition(kz var1, jn var2);
   }
}
