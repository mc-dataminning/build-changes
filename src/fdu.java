import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fdu extends fdw {
   private static final ajv a = new ajv("widget/slider");
   private static final ajv d = new ajv("widget/slider_highlighted");
   private static final ajv e = new ajv("widget/slider_handle");
   private static final ajv f = new ajv("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public fdu(int $$0, int $$1, int $$2, int $$3, wi $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private ajv d() {
      return this.aI_() && !this.o ? d : a;
   }

   private ajv e() {
      return !this.i && !this.o ? e : f;
   }

   @Override
   protected ww aK_() {
      return wi.a("gui.narrate.slider", this.y());
   }

   @Override
   public void a(fhu $$0) {
      $$0.a(fht.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fht.d, wi.c("narration.slider.usage.focused"));
         } else {
            $$0.a(fht.d, wi.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      fby $$4 = fby.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.d(), this.C(), this.D(), this.x(), this.v());
      $$0.a(this.e(), this.C() + (int)(this.c * (double)(this.g - 8)), this.D(), 8, this.v());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | axm.f(this.l * 255.0F) << 24);
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
         fbv $$1 = fby.Q().aX();
         if ($$1 == fbv.b || $$1 == fbv.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fhz.a($$0)) {
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
      this.c = axm.a($$0, 0.0, 1.0);
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
   public void a(gqj $$0) {
   }

   @Override
   public void a_(double $$0, double $$1) {
      super.a(fby.Q().ak());
   }

   protected abstract void b();

   protected abstract void a();
}
