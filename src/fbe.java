import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fbe extends fbg {
   private static final ajh a = new ajh("widget/slider");
   private static final ajh d = new ajh("widget/slider_highlighted");
   private static final ajh e = new ajh("widget/slider_handle");
   private static final ajh f = new ajh("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public fbe(int $$0, int $$1, int $$2, int $$3, vu $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private ajh d() {
      return this.aJ_() && !this.o ? d : a;
   }

   private ajh e() {
      return !this.i && !this.o ? e : f;
   }

   @Override
   protected wi aL_() {
      return vu.a("gui.narrate.slider", this.x());
   }

   @Override
   public void a(ffe $$0) {
      $$0.a(ffd.a, this.aL_());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(ffd.d, vu.c("narration.slider.usage.focused"));
         } else {
            $$0.a(ffd.d, vu.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      ezi $$4 = ezi.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.d(), this.B(), this.C(), this.w(), this.u());
      $$0.a(this.e(), this.B() + (int)(this.c * (double)(this.g - 8)), this.C(), 8, this.u());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | aww.f(this.l * 255.0F) << 24);
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
         ezf $$1 = ezi.Q().aX();
         if ($$1 == ezf.b || $$1 == ezf.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ffj.a($$0)) {
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
      this.b(($$0 - (double)(this.B() + 4)) / (double)(this.g - 8));
   }

   private void b(double $$0) {
      double $$1 = this.c;
      this.c = aww.a($$0, 0.0, 1.0);
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
   public void a(gnt $$0) {
   }

   @Override
   public void a_(double $$0, double $$1) {
      super.a(ezi.Q().ak());
   }

   protected abstract void b();

   protected abstract void a();
}
