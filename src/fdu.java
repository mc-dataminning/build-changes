import org.joml.Matrix4f;

public enum fdu {
   a(fgt.a, ($$0, $$1) -> $$0.scale(1.0F - $$1 / 4096.0F)),
   b(fgt.b, ($$0, $$1) -> $$0.translate(0.0F, 0.0F, $$1 / 512.0F));

   private final fgt c;
   private final fdu.a d;

   private fdu(final fgt $$0, final fdu.a $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public fgt a() {
      return this.c;
   }

   public void a(Matrix4f $$0, float $$1) {
      this.d.apply($$0, $$1);
   }

   @FunctionalInterface
   interface a {
      void apply(Matrix4f var1, float var2);
   }
}
