import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fdl extends fdn {
   private static final ajt a = new ajt("widget/slider");
   private static final ajt d = new ajt("widget/slider_highlighted");
   private static final ajt e = new ajt("widget/slider_handle");
   private static final ajt f = new ajt("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public fdl(int $$0, int $$1, int $$2, int $$3, wg $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private ajt d() {
      return this.aJ_() && !this.o ? d : a;
   }

   private ajt e() {
      return !this.i && !this.o ? e : f;
   }

   @Override
   protected wu aL_() {
      return wg.a("gui.narrate.slider", this.y());
   }

   @Override
   public void a(fhl $$0) {
      $$0.a(fhk.a, this.aL_());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(fhk.d, wg.c("narration.slider.usage.focused"));
         } else {
            $$0.a(fhk.d, wg.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      fbp $$4 = fbp.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.d(), this.C(), this.D(), this.x(), this.v());
      $$0.a(this.e(), this.C() + (int)(this.c * (double)(this.g - 8)), this.D(), 8, this.v());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | axk.f(this.l * 255.0F) << 24);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.a($$0);
   }

   @Override
   public void a(boolean $$0) {
      super.a($$0);
      if (!$$0) {
         this.o = false;
      } else {
         fbm $$1 = fbp.Q().aX();
         if ($$1 == fbm.b || $$1 == fbm.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fhq.a($$0)) {
         this.o = !this.o;
         return true;
      } else {
         if (this.o) {
            boolean $$3 = $$0 == 263;
            if ($$3 || $$0 == 262) {
               float $$4 = $$3 ? -1.0F : 1.0F;
               this.b(this.c + (double)($$4 / (float)(this.g - 8)));
               return true;
            }
         }

         return false;
      }
   }

   private void a(double $$0) {
      this.b(($$0 - (double)(this.C() + 4)) / (double)(this.g - 8));
   }

   private void b(double $$0) {
      double $$1 = this.c;
      this.c = axk.a($$0, 0.0, 1.0);
      if ($$1 != this.c) {
         this.a();
      }

      this.b();
   }

   @Override
   protected void b(double $$0, double $$1, double $$2, double $$3) {
      this.a($$0);
      super.b($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(gqa $$0) {
   }

   @Override
   public void a_(double $$0, double $$1) {
      super.a(fbp.Q().ak());
   }

   protected abstract void b();

   protected abstract void a();
}
