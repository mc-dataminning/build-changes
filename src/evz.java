import com.mojang.blaze3d.systems.RenderSystem;

public abstract class evz extends ewf {
   protected static final int e = 2;
   private static final exu a = new exu(new agt("widget/button"), new agt("widget/button_disabled"), new agt("widget/button_highlighted"));

   public evz(int $$0, int $$1, int $$2, int $$3, vb $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(evw $$0, int $$1, int $$2, float $$3) {
      euk $$4 = euk.N();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.i, this.n()), this.p(), this.r(), this.k(), this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | aty.f(this.k * 255.0F) << 24);
   }

   public void a(evw $$0, evu $$1, int $$2) {
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
      } else if (faf.a($$0)) {
         this.a(euk.N().ah());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
