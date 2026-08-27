import com.mojang.blaze3d.systems.RenderSystem;

public abstract class ese extends esg {
   private static final aep a = new aep("widget/slider");
   private static final aep d = new aep("widget/slider_highlighted");
   private static final aep e = new aep("widget/slider_handle");
   private static final aep l = new aep("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 20;
   private static final int n = 4;
   private static final int o = 8;
   protected double c;
   private boolean p;

   public ese(int $$0, int $$1, int $$2, int $$3, te $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private aep e() {
      return this.ax_() && !this.p ? d : a;
   }

   private aep f() {
      return !this.h && !this.p ? e : l;
   }

   @Override
   protected tr aB_() {
      return te.a("gui.narrate.slider", this.l());
   }

   @Override
   public void a(evt $$0) {
      $$0.a(evs.a, this.aB_());
      if (this.i) {
         if (this.ax_()) {
            $$0.a(evs.d, te.c("narration.slider.usage.focused"));
         } else {
            $$0.a(evs.d, te.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      eqn $$4 = eqn.N();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.e(), this.p(), this.r(), this.k(), this.h());
      $$0.a(this.f(), this.p() + (int)(this.c * (double)(this.f - 8)), this.r(), 8, 20);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | aro.f(this.k * 255.0F) << 24);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.a($$0);
   }

   @Override
   public void c_(boolean $$0) {
      super.c_($$0);
      if (!$$0) {
         this.p = false;
      } else {
         eqk $$1 = eqn.N().aT();
         if ($$1 == eqk.b || $$1 == eqk.d) {
            this.p = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (evy.a($$0)) {
         this.p = !this.p;
         return true;
      } else {
         if (this.p) {
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
      this.c = aro.a($$0, 0.0, 1.0);
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
   public void a(gcs $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(eqn.N().ah());
   }

   protected abstract void b();

   @Override
   protected abstract void a();
}
