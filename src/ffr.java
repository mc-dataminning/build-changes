import org.joml.Matrix4f;

public interface ffr {
   static ffr a(atz $$0) {
      return new ffq($$0);
   }

   static ffr a(ckd $$0) {
      if ($$0 instanceof ckc) {
         return new ffp((ckc)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(ewq var1);

   default void a(ewq $$0, int $$1, int $$2, Matrix4f $$3, ftf.a $$4) {
   }

   default void a(ewq $$0, int $$1, int $$2, ews $$3) {
   }
}
