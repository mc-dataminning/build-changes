import com.mojang.blaze3d.systems.RenderSystem;

public abstract class ffq extends ffx {
   protected static final int e = 2;
   private static final fhm a = new fhm(new akm("widget/button"), new akm("widget/button_disabled"), new akm("widget/button_highlighted"));

   public ffq(int $$0, int $$1, int $$2, int $$3, wx $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   public abstract void b();

   @Override
   protected void b(ffm $$0, int $$1, int $$2, float $$3) {
      fdz $$4 = fdz.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.enableDepthTest();
      $$0.a(a.a(this.j, this.A()), this.C(), this.D(), this.x(), this.v());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, $$5 | ayd.f(this.l * 255.0F) << 24);
   }

   public void a(ffm $$0, ffk $$1, int $$2) {
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
      } else if (fka.a($$0)) {
         this.a(fdz.Q().ak());
         this.b();
         return true;
      } else {
         return false;
      }
   }
}
