import com.mojang.blaze3d.systems.RenderSystem;

public abstract class eva extends evc {
   private static final agm a = new agm("widget/slider");
   private static final agm d = new agm("widget/slider_highlighted");
   private static final agm e = new agm("widget/slider_handle");
   private static final agm l = new agm("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public eva(int $$0, int $$1, int $$2, int $$3, uv $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private agm e() {
      return this.aK_() && !this.o ? d : a;
   }

   private agm f() {
      return !this.h && !this.o ? e : l;
   }

   @Override
   protected vj aN_() {
      return uv.a("gui.narrate.slider", this.l());
   }

   @Override
   public void a(eyx $$0) {
      $$0.a(eyw.a, this.aN_());
      if (this.i) {
         if (this.aK_()) {
            $$0.a(eyw.d, uv.c("narration.slider.usage.focused"));
         } else {
            $$0.a(eyw.d, uv.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      eti $$4 = eti.N();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.e(), this.p(), this.r(), this.k(), this.i());
      $$0.a(this.f(), this.p() + (int)(this.c * (double)(this.f - 8)), this.r(), 8, this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | atq.f(this.k * 255.0F) << 24);
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
         etf $$1 = eti.N().aT();
         if ($$1 == etf.b || $$1 == etf.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ezc.a($$0)) {
         this.o = !this.o;
         return true;
      } else {
         if (this.o) {
            boolean $$3 = $$0 == 263;
            if ($$3 || $$0 == 262) {
               float $$4 = $$3 ? -1.0F : 1.0F;
               this.b(this.c + (double)($$4 / (float)(this.f - 8)));
               return true;
            }
         }

         return false;
      }
   }

   private void a(double $$0) {
      this.b(($$0 - (double)(this.p() + 4)) / (double)(this.f - 8));
   }

   private void b(double $$0) {
      double $$1 = this.c;
      this.c = atq.a($$0, 0.0, 1.0);
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
   public void a(ggl $$0) {
   }

   @Override
   public void c(double $$0, double $$1) {
      super.a(eti.N().ah());
   }

   protected abstract void b();

   protected abstract void a();
}
