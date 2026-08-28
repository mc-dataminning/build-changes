import org.joml.Matrix4f;

public interface fpx {
   static fpx a(ayl $$0) {
      return new fpw($$0);
   }

   static fpx a(csb $$0) {
      if ($$0 instanceof csa $$1) {
         return new fpv($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fgr var1);

   default void a(fgr $$0, int $$1, int $$2, Matrix4f $$3, gdq.a $$4) {
   }

   default void a(fgr $$0, int $$1, int $$2, fgt $$3) {
   }
}
