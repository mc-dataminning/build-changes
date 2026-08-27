import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fev extends ffc {
   protected static final int e = 2;
   private static final fgr a = new fgr(new akh("widget/button"), new akh("widget/button_disabled"), new akh("widget/button_highlighted"));

   public fev(int $$0, int $$1, int $$2, int $$3, wu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fer $$0, int $$1, int $$2, float $$3) {
      fde $$4 = fde.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.j, this.A()), this.C(), this.D(), this.x(), this.v());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | axz.f(this.l * 255.0F) << 24);
   }

   public void a(fer $$0, fep $$1, int $$2) {
      this.a($$0, $$1, 2, $$2);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.b();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.j || !this.k) {
         return false;
      } else if (fjf.a($$0)) {
         this.a(fde.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
