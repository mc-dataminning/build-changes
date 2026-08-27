import org.joml.Matrix4f;

public interface fav {
   static fav a(arn $$0) {
      return new fau($$0);
   }

   static fav a(cgr $$0) {
      if ($$0 instanceof cgq) {
         return new fat((cgq)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(erx var1);

   default void a(erx $$0, int $$1, int $$2, Matrix4f $$3, foa.a $$4) {
   }

   default void a(erx $$0, int $$1, int $$2, erz $$3) {
   }
}
