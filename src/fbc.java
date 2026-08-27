import org.joml.Matrix4f;

public interface fbc {
   static fbc a(arl $$0) {
      return new fbb($$0);
   }

   static fbc a(cgn $$0) {
      if ($$0 instanceof cgm) {
         return new fba((cgm)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(esf var1);

   default void a(esf $$0, int $$1, int $$2, Matrix4f $$3, fog.a $$4) {
   }

   default void a(esf $$0, int $$1, int $$2, esh $$3) {
   }
}
