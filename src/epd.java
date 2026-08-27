import com.mojang.blaze3d.systems.RenderSystem;

public abstract class epd extends epf {
   private static final acq a = new acq("textures/gui/slider.png");
   protected static final int b = 200;
   protected static final int c = 20;
   protected static final int d = 20;
   protected static final int e = 4;
   protected static final int f = 2;
   private static final int h = 20;
   private static final int i = 4;
   private static final int j = 8;
   private static final int k = 0;
   private static final int l = 1;
   private static final int u = 2;
   private static final int v = 3;
   protected double g;
   private boolean w;

   public epd(int $$0, int $$1, int $$2, int $$3, sw $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.g = $$5;
   }

   private int e() {
      int $$0 = this.aB_() && !this.w ? 1 : 0;
      return $$0 * 20;
   }

   private int f() {
      int $$0 = !this.q && !this.w ? 2 : 3;
      return $$0 * 20;
   }

   @Override
   protected tj aE_() {
      return sw.a("gui.narrate.slider", this.l());
   }

   @Override
   public void a(esp $$0) {
      $$0.a(eso.a, this.aE_());
      if (this.r) {
         if (this.aB_()) {
            $$0.a(eso.d, sw.c("narration.slider.usage.focused"));
         } else {
            $$0.a(eso.d, sw.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      enn $$4 = enn.N();
      $$0.a(1.0F, 1.0F, 1.0F, this.t);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(a, this.p(), this.r(), this.k(), this.h(), 20, 4, 200, 20, 0, this.e());
      $$0.a(a, this.p() + (int)(this.g * (double)(this.o - 8)), this.r(), 8, 20, 20, 4, 200, 20, 0, this.f());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.r ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | apa.f(this.t * 255.0F) << 24);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.a($$0);
   }

   @Override
   public void b_(boolean $$0) {
      super.b_($$0);
      if (!$$0) {
         this.w = false;
      } else {
         enk $$1 = enn.N().aT();
         if ($$1 == enk.b || $$1 == enk.d) {
            this.w = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (esu.a($$0)) {
         this.w = !this.w;
         return true;
      } else {
         if (this.w) {
            boolean $$3 = $$0 == 263;
            if ($$3 || $$0 == 262) {
               float $$4 = $$3 ? -1.0F : 1.0F;
               this.b(this.g + (double)($$4 / (float)(this.o - 8)));
               return true;
            }
         }

         return false;
      }
   }

   private void a(double $$0) {
      this.b(($$0 - (double)(this.p() + 4)) / (double)(this.o - 8));
   }

   private void b(double $$0) {
      double $$1 = this.g;
      this.g = apa.a($$0, 0.0, 1.0);
      if ($$1 != this.g) {
         this.a();
      }

      this.b();
   }

   @Override
   protected void a(double $$0, double $$1, double $$2, double $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(fzc $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(enn.N().ah());
   }

   protected abstract void b();

   @Override
   protected abstract void a();
}
