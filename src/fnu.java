import org.joml.Matrix4f;

public interface fnu {
   static fnu a(axl $$0) {
      return new fnt($$0);
   }

   static fnu a(cqj $$0) {
      if ($$0 instanceof cqi $$1) {
         return new fns($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fep var1);

   default void a(fep $$0, int $$1, int $$2, Matrix4f $$3, gbo.a $$4) {
   }

   default void a(fep $$0, int $$1, int $$2, fer $$3) {
   }
}
