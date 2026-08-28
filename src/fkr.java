import com.mojang.blaze3d.systems.RenderSystem;

public record fkr(int a, int b, boolean c, int d) implements fks<fjq> {
   public fjq a() {
      return new fjr(null, this.a, this.b, this.c);
   }

   public void a(fjq $$0) {
      if (this.c) {
         RenderSystem.getDevice().b().a($$0.d(), this.d, $$0.e(), 1.0);
      } else {
         RenderSystem.getDevice().b().a($$0.d(), this.d);
      }
   }

   public void b(fjq $$0) {
      $$0.a();
   }

   @Override
   public boolean a(fks<?> $$0) {
      return !($$0 instanceof fkr $$1) ? false : this.a == $$1.a && this.b == $$1.b && this.c == $$1.c;
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
