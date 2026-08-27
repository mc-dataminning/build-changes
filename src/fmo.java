import org.joml.Matrix4f;

public interface fmo {
   static fmo a(awy $$0) {
      return new fmn($$0);
   }

   static fmo a(cpc $$0) {
      if ($$0 instanceof cpb $$1) {
         return new fmm($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fdj var1);

   default void a(fdj $$0, int $$1, int $$2, Matrix4f $$3, gai.a $$4) {
   }

   default void a(fdj $$0, int $$1, int $$2, fdl $$3) {
   }
}
