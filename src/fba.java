import org.joml.Matrix4f;

public interface fba {
   static fba a(arj $$0) {
      return new faz($$0);
   }

   static fba a(cgl $$0) {
      if ($$0 instanceof cgk) {
         return new fay((cgk)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(esd var1);

   default void a(esd $$0, int $$1, int $$2, Matrix4f $$3, foe.a $$4) {
   }

   default void a(esd $$0, int $$1, int $$2, esf $$3) {
   }
}
