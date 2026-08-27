import org.joml.Matrix4f;

public interface fal {
   static fal a(ara $$0) {
      return new fak($$0);
   }

   static fal a(cgc $$0) {
      if ($$0 instanceof cgb) {
         return new faj((cgb)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(erv var1);

   default void a(erv $$0, int $$1, int $$2, Matrix4f $$3, fng.a $$4) {
   }

   default void a(erv $$0, int $$1, int $$2, erx $$3) {
   }
}
