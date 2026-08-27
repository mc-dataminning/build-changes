import org.joml.Matrix4f;

public interface fbu {
   static fbu a(ask $$0) {
      return new fbt($$0);
   }

   static fbu a(chp $$0) {
      if ($$0 instanceof cho) {
         return new fbs((cho)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(esw var1);

   default void a(esw $$0, int $$1, int $$2, Matrix4f $$3, fpb.a $$4) {
   }

   default void a(esw $$0, int $$1, int $$2, esy $$3) {
   }
}
