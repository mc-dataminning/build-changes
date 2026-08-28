import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fig extends fii {
   private static final akr a = akr.b("widget/slider");
   private static final akr d = akr.b("widget/slider_highlighted");
   private static final akr e = akr.b("widget/slider_handle");
   private static final akr f = akr.b("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public fig(int $$0, int $$1, int $$2, int $$3, wz $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private akr c() {
      return this.aO_() && !this.o ? d : a;
   }

   private akr e() {
      return !this.i && !this.o ? e : f;
   }

   @Override
   protected xn aQ_() {
      return wz.a("gui.narrate.slider", this.z());
   }

   @Override
   public void a(fmg $$0) {
      $$0.a(fmf.a, this.aQ_());
      if (this.j) {
         if (this.aO_()) {
            $$0.a(fmf.d, wz.c("narration.slider.usage.focused"));
         } else {
            $$0.a(fmf.d, wz.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      fgm $$4 = fgm.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.c(), this.D(), this.E(), this.y(), this.w());
      $$0.a(this.e(), this.D() + (int)(this.c * (double)(this.g - 8)), this.E(), 8, this.w());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | ayo.f(this.l * 255.0F) << 24);
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
         fgj $$1 = fgm.Q().aU();
         if ($$1 == fgj.b || $$1 == fgj.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fml.a($$0)) {
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
      this.b(($$0 - (double)(this.D() + 4)) / (double)(this.g - 8));
   }

   private void b(double $$0) {
      double $$1 = this.c;
      this.c = ayo.a($$0, 0.0, 1.0);
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
   public void a(gvd $$0) {
   }

   @Override
   public void a_(double $$0, double $$1) {
      super.a(fgm.Q().aj());
   }

   protected abstract void b();

   protected abstract void a();
}
