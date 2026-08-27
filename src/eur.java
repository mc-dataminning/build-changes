import com.mojang.blaze3d.systems.RenderSystem;

public abstract class eur extends eux {
   protected static final int e = 2;
   private static final ewm a = new ewm(new agi("widget/button"), new agi("widget/button_disabled"), new agi("widget/button_highlighted"));

   public eur(int $$0, int $$1, int $$2, int $$3, ur $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(euo $$0, int $$1, int $$2, float $$3) {
      etd $$4 = etd.N();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.i, this.n()), this.p(), this.r(), this.k(), this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | atm.f(this.k * 255.0F) << 24);
   }

   public void a(euo $$0, eum $$1, int $$2) {
      this.a($$0, $$1, 2, $$2);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.b();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (!this.i || !this.j) {
         return false;
      } else if (eyx.a($$0)) {
         this.a(etd.N().ah());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
