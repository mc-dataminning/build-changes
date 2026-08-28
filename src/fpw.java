import org.joml.Matrix4f;

public interface fpw {
   static fpw a(ayl $$0) {
      return new fpv($$0);
   }

   static fpw a(csa $$0) {
      if ($$0 instanceof crz $$1) {
         return new fpu($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fgq var1);

   default void a(fgq $$0, int $$1, int $$2, Matrix4f $$3, gdp.a $$4) {
   }

   default void a(fgq $$0, int $$1, int $$2, fgs $$3) {
   }
}
