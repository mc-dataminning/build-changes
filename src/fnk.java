import org.joml.Matrix4f;

public interface fnk {
   static fnk a(axi $$0) {
      return new fnj($$0);
   }

   static fnk a(cpn $$0) {
      if ($$0 instanceof cpm $$1) {
         return new fni($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fef var1);

   default void a(fef $$0, int $$1, int $$2, Matrix4f $$3, gbe.a $$4) {
   }

   default void a(fef $$0, int $$1, int $$2, feh $$3) {
   }
}
