import org.joml.Matrix4f;

public interface fdm {
   static fdm a(asy $$0) {
      return new fdl($$0);
   }

   static fdm a(cip $$0) {
      if ($$0 instanceof cio) {
         return new fdk((cio)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(eum var1);

   default void a(eum $$0, int $$1, int $$2, Matrix4f $$3, fqu.a $$4) {
   }

   default void a(eum $$0, int $$1, int $$2, euo $$3) {
   }
}
