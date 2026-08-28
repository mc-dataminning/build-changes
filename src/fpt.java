import org.joml.Matrix4f;

public interface fpt {
   static fpt a(ayj $$0) {
      return new fps($$0);
   }

   static fpt a(crx $$0) {
      if ($$0 instanceof crw $$1) {
         return new fpr($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fgn var1);

   default void a(fgn $$0, int $$1, int $$2, Matrix4f $$3, gdm.a $$4) {
   }

   default void a(fgn $$0, int $$1, int $$2, fgp $$3) {
   }
}
