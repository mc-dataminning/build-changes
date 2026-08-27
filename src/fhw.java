import org.joml.Matrix4f;

public interface fhw {
   static fhw a(avt $$0) {
      return new fhv($$0);
   }

   static fhw a(cme $$0) {
      if ($$0 instanceof cmd) {
         return new fhu((cmd)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(eys var1);

   default void a(eys $$0, int $$1, int $$2, Matrix4f $$3, fvl.a $$4) {
   }

   default void a(eys $$0, int $$1, int $$2, eyu $$3) {
   }
}
