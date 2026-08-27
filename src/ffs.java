import org.joml.Matrix4f;

public interface ffs {
   static ffs a(atz $$0) {
      return new ffr($$0);
   }

   static ffs a(ckd $$0) {
      if ($$0 instanceof ckc) {
         return new ffq((ckc)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(ewr var1);

   default void a(ewr $$0, int $$1, int $$2, Matrix4f $$3, ftg.a $$4) {
   }

   default void a(ewr $$0, int $$1, int $$2, ewt $$3) {
   }
}
