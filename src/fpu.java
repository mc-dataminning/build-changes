import org.joml.Matrix4f;

public interface fpu {
   static fpu a(axs $$0) {
      return new fpt($$0);
   }

   static fpu a(cro $$0) {
      if ($$0 instanceof crn $$1) {
         return new fps($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fhf var1);

   default void a(fhf $$0, int $$1, int $$2, Matrix4f $$3, gef.a $$4) {
   }

   default void a(fhf $$0, int $$1, int $$2, fhh $$3) {
   }
}
