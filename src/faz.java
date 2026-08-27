import com.mojang.blaze3d.systems.RenderSystem;

public abstract class faz extends fbg {
   protected static final int e = 2;
   private static final fcv a = new fcv(new ajh("widget/button"), new ajh("widget/button_disabled"), new ajh("widget/button_highlighted"));

   public faz(int $$0, int $$1, int $$2, int $$3, vu $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fav $$0, int $$1, int $$2, float $$3) {
      ezi $$4 = ezi.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.j, this.z()), this.B(), this.C(), this.w(), this.u());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | aww.f(this.l * 255.0F) << 24);
   }

   public void a(fav $$0, fat $$1, int $$2) {
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
      } else if (ffj.a($$0)) {
         this.a(ezi.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
