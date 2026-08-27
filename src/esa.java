import com.mojang.blaze3d.systems.RenderSystem;

public abstract class esa extends esg {
   protected static final int e = 2;
   private static final ett a = new ett(new aep("widget/button"), new aep("widget/button_disabled"), new aep("widget/button_highlighted"));

   public esa(int $$0, int $$1, int $$2, int $$3, te $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void c();

   @Override
   protected void b(erx $$0, int $$1, int $$2, float $$3) {
      eqn $$4 = eqn.N();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.i, this.n()), this.p(), this.r(), this.k(), this.h());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | aro.f(this.k * 255.0F) << 24);
   }

   public void a(erx $$0, erv $$1, int $$2) {
      this.a($$0, $$1, 2, $$2);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.c();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.i || !this.j) {
         return false;
      } else if (evy.a($$0)) {
         this.a(eqn.N().ah());
         this.c();
         return true;
      } else {
         return false;
      }
   }
}
