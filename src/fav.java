import org.joml.Matrix4f;

public interface fav {
   static fav a(arf $$0) {
      return new fau($$0);
   }

   static fav a(cgg $$0) {
      if ($$0 instanceof cgf) {
         return new fat((cgf)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(ery var1);

   default void a(ery $$0, int $$1, int $$2, Matrix4f $$3, fnz.a $$4) {
   }

   default void a(ery $$0, int $$1, int $$2, esa $$3) {
   }
}
