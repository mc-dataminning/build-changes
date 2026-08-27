import org.joml.Matrix4f;

public interface exh {
   static exh a(aom $$0) {
      return new exg($$0);
   }

   static exh a(cdf $$0) {
      if ($$0 instanceof cde) {
         return new exf((cde)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(eov var1);

   default void a(eov $$0, int $$1, int $$2, Matrix4f $$3, fjx.a $$4) {
   }

   default void a(eov $$0, int $$1, int $$2, eox $$3) {
   }
}
