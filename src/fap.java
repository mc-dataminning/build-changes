import org.joml.Matrix4f;

public interface fap {
   static fap a(arc $$0) {
      return new fao($$0);
   }

   static fap a(cge $$0) {
      if ($$0 instanceof cgd) {
         return new fan((cgd)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(eru var1);

   default void a(eru $$0, int $$1, int $$2, Matrix4f $$3, fnl.a $$4) {
   }

   default void a(eru $$0, int $$1, int $$2, erw $$3) {
   }
}
