import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fgw extends fhd {
   protected static final int e = 2;
   private static final fis a = new fis(new alf("widget/button"), new alf("widget/button_disabled"), new alf("widget/button_highlighted"));

   public fgw(int $$0, int $$1, int $$2, int $$3, xp $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fgs $$0, int $$1, int $$2, float $$3) {
      ffg $$4 = ffg.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.j, this.A()), this.C(), this.D(), this.x(), this.v());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | ayz.f(this.l * 255.0F) << 24);
   }

   public void a(fgs $$0, fgq $$1, int $$2) {
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
      } else if (flg.a($$0)) {
         this.a(ffg.Q().aj());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
