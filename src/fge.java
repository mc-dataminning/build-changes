import org.joml.Matrix4f;

public interface fge {
   static fge a(aub $$0) {
      return new fgd($$0);
   }

   static fge a(ckm $$0) {
      if ($$0 instanceof ckl) {
         return new fgc((ckl)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(exc var1);

   default void a(exc $$0, int $$1, int $$2, Matrix4f $$3, ftt.a $$4) {
   }

   default void a(exc $$0, int $$1, int $$2, exe $$3) {
   }
}
