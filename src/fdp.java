import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fdp extends fdw {
   protected static final int e = 2;
   private static final ffl a = new ffl(new ajv("widget/button"), new ajv("widget/button_disabled"), new ajv("widget/button_highlighted"));

   public fdp(int $$0, int $$1, int $$2, int $$3, wi $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(fdl $$0, int $$1, int $$2, float $$3) {
      fby $$4 = fby.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.j, this.A()), this.C(), this.D(), this.x(), this.v());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | axm.f(this.l * 255.0F) << 24);
   }

   public void a(fdl $$0, fdj $$1, int $$2) {
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
      } else if (fhz.a($$0)) {
         this.a(fby.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
