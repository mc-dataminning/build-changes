import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fel extends fes {
   protected static final int e = 2;
   private static final fgh a = new fgh(new akf("widget/button"), new akf("widget/button_disabled"), new akf("widget/button_highlighted"));

   public fel(int $$0, int $$1, int $$2, int $$3, ws $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(feh $$0, int $$1, int $$2, float $$3) {
      fcu $$4 = fcu.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.j, this.A()), this.C(), this.D(), this.x(), this.v());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | axw.f(this.l * 255.0F) << 24);
   }

   public void a(feh $$0, fef $$1, int $$2) {
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
      } else if (fiv.a($$0)) {
         this.a(fcu.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
