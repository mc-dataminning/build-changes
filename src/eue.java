import com.mojang.blaze3d.systems.RenderSystem;

public abstract class eue extends euk {
   protected static final int e = 2;
   private static final evz a = new evz(new agg("widget/button"), new agg("widget/button_disabled"), new agg("widget/button_highlighted"));

   public eue(int $$0, int $$1, int $$2, int $$3, ur $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(eub $$0, int $$1, int $$2, float $$3) {
      esr $$4 = esr.N();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.i, this.n()), this.p(), this.r(), this.k(), this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | ati.f(this.k * 255.0F) << 24);
   }

   public void a(eub $$0, etz $$1, int $$2) {
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
      } else if (eyk.a($$0)) {
         this.a(esr.N().ah());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
