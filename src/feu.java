import org.joml.Matrix4f;

public interface feu {
   static feu a(atk $$0) {
      return new fet($$0);
   }

   static feu a(cjn $$0) {
      if ($$0 instanceof cjm) {
         return new fes((cjm)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(evu var1);

   default void a(evu $$0, int $$1, int $$2, Matrix4f $$3, fsi.a $$4) {
   }

   default void a(evu $$0, int $$1, int $$2, evw $$3) {
   }
}
