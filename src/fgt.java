import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fgt extends fha {
   protected static final int e = 2;
   private static final fip a = new fip(new ale("widget/button"), new ale("widget/button_disabled"), new ale("widget/button_highlighted"));

   public fgt(int $$0, int $$1, int $$2, int $$3, xo $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fgp $$0, int $$1, int $$2, float $$3) {
      ffd $$4 = ffd.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.j, this.A()), this.C(), this.D(), this.x(), this.v());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | ayx.f(this.l * 255.0F) << 24);
   }

   public void a(fgp $$0, fgn $$1, int $$2) {
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
      } else if (fld.a($$0)) {
         this.a(ffd.Q().aj());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
