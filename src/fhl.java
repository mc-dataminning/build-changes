import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fhl extends fhs {
   protected static final int e = 2;
   private static final fjh a = new fjh(new akk("widget/button"), new akk("widget/button_disabled"), new akk("widget/button_highlighted"));

   public fhl(int $$0, int $$1, int $$2, int $$3, wu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fhh $$0, int $$1, int $$2, float $$3) {
      ffw $$4 = ffw.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.j, this.B()), this.D(), this.E(), this.y(), this.w());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | ayg.f(this.l * 255.0F) << 24);
   }

   public void a(fhh $$0, fhf $$1, int $$2) {
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
      } else if (flv.a($$0)) {
         this.a(ffw.Q().aj());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
