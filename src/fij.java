import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fij extends fil {
   private static final akt a = new akt("widget/slider");
   private static final akt d = new akt("widget/slider_highlighted");
   private static final akt e = new akt("widget/slider_handle");
   private static final akt f = new akt("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public fij(int $$0, int $$1, int $$2, int $$3, xe $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private akt d() {
      return this.aI_() && !this.o ? d : a;
   }

   private akt e() {
      return !this.i && !this.o ? e : f;
   }

   @Override
   protected xs aK_() {
      return xe.a("gui.narrate.slider", this.y());
   }

   @Override
   public void a(fmj $$0) {
      $$0.a(fmi.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fmi.d, xe.c("narration.slider.usage.focused"));
         } else {
            $$0.a(fmi.d, xe.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      fgj $$4 = fgj.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.d(), this.C(), this.D(), this.x(), this.v());
      $$0.a(this.e(), this.C() + (int)(this.c * (double)(this.g - 8)), this.D(), 8, this.v());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | aym.f(this.l * 255.0F) << 24);
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
         fgg $$1 = fgj.Q().aY();
         if ($$1 == fgg.b || $$1 == fgg.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fmo.a($$0)) {
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
      this.c = aym.a($$0, 0.0, 1.0);
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
   public void a(gvq $$0) {
   }

   @Override
   public void a_(double $$0, double $$1) {
      super.a(fgj.Q().ak());
   }

   protected abstract void b();

   protected abstract void a();
}
