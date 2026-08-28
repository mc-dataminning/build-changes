import org.joml.Matrix4f;

public enum fdb {
   a(fga.a, ($$0, $$1) -> $$0.scale(1.0F - $$1 / 4096.0F)),
   b(fga.b, ($$0, $$1) -> $$0.translate(0.0F, 0.0F, $$1 / 512.0F));

   private final fga c;
   private final fdb.a d;

   private fdb(final fga $$0, final fdb.a $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public fga a() {
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
