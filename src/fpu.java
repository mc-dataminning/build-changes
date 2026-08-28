import org.joml.Matrix4f;

public interface fpu {
   static fpu a(ayk $$0) {
      return new fpt($$0);
   }

   static fpu a(cry $$0) {
      if ($$0 instanceof crx $$1) {
         return new fps($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fgo var1);

   default void a(fgo $$0, int $$1, int $$2, Matrix4f $$3, gdn.a $$4) {
   }

   default void a(fgo $$0, int $$1, int $$2, fgq $$3) {
   }
}
