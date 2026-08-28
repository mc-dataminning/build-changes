import com.mojang.blaze3d.systems.RenderSystem;

public record fkp(int a, int b, boolean c, int d) implements fkq<fjr> {
   public fjr a() {
      return new fjs(null, this.a, this.b, this.c);
   }

   public void a(fjr $$0) {
      if (this.c) {
         RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures($$0.c(), this.d, $$0.d(), 1.0);
      } else {
         RenderSystem.getDevice().createCommandEncoder().clearColorTexture($$0.c(), this.d);
      }
   }

   public void b(fjr $$0) {
      $$0.a();
   }

   @Override
   public boolean a(fkq<?> $$0) {
      return !($$0 instanceof fkp $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
   }

   public int b() {
      return this.a;
   }

   public int c() {
      return this.b;
   }

   public boolean d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }
}
