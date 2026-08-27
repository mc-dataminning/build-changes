import org.joml.Matrix4f;

public interface ffl {
   static ffl a(atu $$0) {
      return new ffk($$0);
   }

   static ffl a(cjx $$0) {
      if ($$0 instanceof cjw) {
         return new ffj((cjw)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(ewk var1);

   default void a(ewk $$0, int $$1, int $$2, Matrix4f $$3, fsz.a $$4) {
   }

   default void a(ewk $$0, int $$1, int $$2, ewm $$3) {
   }
}
