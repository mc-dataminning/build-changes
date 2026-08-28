import org.joml.Matrix4f;

public interface fpv {
   static fpv a(ayl $$0) {
      return new fpu($$0);
   }

   static fpv a(crz $$0) {
      if ($$0 instanceof cry $$1) {
         return new fpt($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fgp var1);

   default void a(fgp $$0, int $$1, int $$2, Matrix4f $$3, gdo.a $$4) {
   }

   default void a(fgp $$0, int $$1, int $$2, fgr $$3) {
   }
}
