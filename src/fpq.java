import org.joml.Matrix4f;

public interface fpq {
   static fpq a(ayg $$0) {
      return new fpp($$0);
   }

   static fpq a(cru $$0) {
      if ($$0 instanceof crt $$1) {
         return new fpo($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fgk var1);

   default void a(fgk $$0, int $$1, int $$2, Matrix4f $$3, gdj.a $$4) {
   }

   default void a(fgk $$0, int $$1, int $$2, fgm $$3) {
   }
}
