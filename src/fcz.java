import org.joml.Matrix4f;

public interface fcz {
   static fcz a(asu $$0) {
      return new fcy($$0);
   }

   static fcz a(cih $$0) {
      if ($$0 instanceof cig) {
         return new fcx((cig)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(etz var1);

   default void a(etz $$0, int $$1, int $$2, Matrix4f $$3, fqh.a $$4) {
   }

   default void a(etz $$0, int $$1, int $$2, eub $$3) {
   }
}
