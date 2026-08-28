import org.joml.Matrix4f;

public enum fex {
   a(fhw.a, ($$0, $$1) -> $$0.scale(1.0F - $$1 / 4096.0F)),
   b(fhw.b, ($$0, $$1) -> $$0.translate(0.0F, 0.0F, $$1 / 512.0F));

   private final fhw c;
   private final fex.a d;

   private fex(final fhw $$0, final fex.a $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public fhw a() {
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
