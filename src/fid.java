import org.joml.Matrix4f;

public interface fid {
   static fid a(avu $$0) {
      return new fic($$0);
   }

   static fid a(cmi $$0) {
      if ($$0 instanceof cmh) {
         return new fib((cmh)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(eyz var1);

   default void a(eyz $$0, int $$1, int $$2, Matrix4f $$3, fvt.a $$4) {
   }

   default void a(eyz $$0, int $$1, int $$2, ezb $$3) {
   }
}
