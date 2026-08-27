import org.joml.Matrix4f;

public interface foq {
   static foq a(axr $$0) {
      return new fop($$0);
   }

   static foq a(cra $$0) {
      if ($$0 instanceof cqz $$1) {
         return new foo($$1.a());
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(ffl var1);

   default void a(ffl $$0, int $$1, int $$2, Matrix4f $$3, gck.a $$4) {
   }

   default void a(ffl $$0, int $$1, int $$2, ffn $$3) {
   }
}
