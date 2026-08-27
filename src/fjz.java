import org.joml.Matrix4f;

public interface fjz {
   static fjz a(awi $$0) {
      return new fjy($$0);
   }

   static fjz a(cnt $$0) {
      if ($$0 instanceof cns) {
         return new fjx((cns)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fat var1);

   default void a(fat $$0, int $$1, int $$2, Matrix4f $$3, fxs.a $$4) {
   }

   default void a(fat $$0, int $$1, int $$2, fav $$3) {
   }
}
