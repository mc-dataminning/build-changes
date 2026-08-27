import org.joml.Matrix4f;

public interface fmf {
   static fmf a(aww $$0) {
      return new fme($$0);
   }

   static fmf a(cot $$0) {
      if ($$0 instanceof cos $$1) {
         return new fmd($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fda var1);

   default void a(fda $$0, int $$1, int $$2, Matrix4f $$3, fzz.a $$4) {
   }

   default void a(fda $$0, int $$1, int $$2, fdc $$3) {
   }
}
