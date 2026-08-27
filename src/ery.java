import com.mojang.blaze3d.systems.RenderSystem;

public abstract class ery extends ese {
   protected static final int e = 2;
   private static final ets a = new ets(new aer("widget/button"), new aer("widget/button_disabled"), new aer("widget/button_highlighted"));

   public ery(int $$0, int $$1, int $$2, int $$3, tf $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void c();

   @Override
   protected void b(erv $$0, int $$1, int $$2, float $$3) {
      eql $$4 = eql.O();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.i, this.o()), this.r(), this.t(), this.l(), this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | arp.f(this.k * 255.0F) << 24);
   }

   public void a(erv $$0, ert $$1, int $$2) {
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
      } else if (ewd.a($$0)) {
         this.a(eql.O().ai());
         this.c();
         return true;
      } else {
         return false;
      }
   }
}
