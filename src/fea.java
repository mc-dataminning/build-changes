import org.joml.Matrix4f;

public enum fea {
   a(fgz.a, ($$0, $$1) -> $$0.scale(1.0F - $$1 / 4096.0F)),
   b(fgz.b, ($$0, $$1) -> $$0.translate(0.0F, 0.0F, $$1 / 512.0F));

   private final fgz c;
   private final fea.a d;

   private fea(final fgz $$0, final fea.a $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public fgz a() {
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
