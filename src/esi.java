import com.mojang.blaze3d.systems.RenderSystem;

public abstract class esi extends eso {
   protected static final int e = 2;
   private static final euc a = new euc(new aex("widget/button"), new aex("widget/button_disabled"), new aex("widget/button_highlighted"));

   public esi(int $$0, int $$1, int $$2, int $$3, tm $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void c();

   @Override
   protected void b(esf $$0, int $$1, int $$2, float $$3) {
      eqv $$4 = eqv.O();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.i, this.o()), this.r(), this.t(), this.l(), this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | arx.f(this.k * 255.0F) << 24);
   }

   public void a(esf $$0, esd $$1, int $$2) {
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
      } else if (ewn.a($$0)) {
         this.a(eqv.O().ai());
         this.c();
         return true;
      } else {
         return false;
      }
   }
}
