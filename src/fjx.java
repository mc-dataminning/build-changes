import org.joml.Matrix4f;

public interface fjx {
   static fjx a(awi $$0) {
      return new fjw($$0);
   }

   static fjx a(cnr $$0) {
      if ($$0 instanceof cnq) {
         return new fjv((cnq)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(far var1);

   default void a(far $$0, int $$1, int $$2, Matrix4f $$3, fxq.a $$4) {
   }

   default void a(far $$0, int $$1, int $$2, fat $$3) {
   }
}
