import com.mojang.blaze3d.systems.RenderSystem;

public abstract class ezf extends ezm {
   protected static final int e = 2;
   private static final fbb a = new fbb(new aiy("widget/button"), new aiy("widget/button_disabled"), new aiy("widget/button_highlighted"));

   public ezf(int $$0, int $$1, int $$2, int $$3, vq $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(ezb $$0, int $$1, int $$2, float $$3) {
      exo $$4 = exo.P();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.j, this.z()), this.B(), this.C(), this.w(), this.u());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | awi.f(this.l * 255.0F) << 24);
   }

   public void a(ezb $$0, eyz $$1, int $$2) {
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
      } else if (fdo.a($$0)) {
         this.a(exo.P().aj());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
