import com.mojang.blaze3d.systems.RenderSystem;

public abstract class euv extends eux {
   private static final agi a = new agi("widget/slider");
   private static final agi d = new agi("widget/slider_highlighted");
   private static final agi e = new agi("widget/slider_handle");
   private static final agi l = new agi("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public euv(int $$0, int $$1, int $$2, int $$3, ur $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private agi e() {
      return this.aJ_() && !this.o ? d : a;
   }

   private agi f() {
      return !this.h && !this.o ? e : l;
   }

   @Override
   protected vf aM_() {
      return ur.a("gui.narrate.slider", this.l());
   }

   @Override
   public void a(eys $$0) {
      $$0.a(eyr.a, this.aM_());
      if (this.i) {
         if (this.aJ_()) {
            $$0.a(eyr.d, ur.c("narration.slider.usage.focused"));
         } else {
            $$0.a(eyr.d, ur.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      etd $$4 = etd.N();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.e(), this.p(), this.r(), this.k(), this.i());
      $$0.a(this.f(), this.p() + (int)(this.c * (double)(this.f - 8)), this.r(), 8, this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | atm.f(this.k * 255.0F) << 24);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.a($$0);
   }

   @Override
   public void b_(boolean $$0) {
      super.b_($$0);
      if (!$$0) {
         this.o = false;
      } else {
         eta $$1 = etd.N().aT();
         if ($$1 == eta.b || $$1 == eta.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (eyx.a($$0)) {
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
      this.c = atm.a($$0, 0.0, 1.0);
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
   public void a(ggg $$0) {
   }

   @Override
   public void c(double $$0, double $$1) {
      super.a(etd.N().ah());
   }

   protected abstract void b();

   protected abstract void a();
}
