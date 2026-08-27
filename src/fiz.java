import org.joml.Matrix4f;

public interface fiz {
   static fiz a(avy $$0) {
      return new fiy($$0);
   }

   static fiz a(cmx $$0) {
      if ($$0 instanceof cmw) {
         return new fix((cmw)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(ezv var1);

   default void a(ezv $$0, int $$1, int $$2, Matrix4f $$3, fwq.a $$4) {
   }

   default void a(ezv $$0, int $$1, int $$2, ezx $$3) {
   }
}
