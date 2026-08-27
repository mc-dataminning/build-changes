import com.mojang.blaze3d.systems.RenderSystem;

public abstract class ewd extends ewf {
   private static final agt a = new agt("widget/slider");
   private static final agt d = new agt("widget/slider_highlighted");
   private static final agt e = new agt("widget/slider_handle");
   private static final agt l = new agt("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public ewd(int $$0, int $$1, int $$2, int $$3, vb $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private agt e() {
      return this.aJ_() && !this.o ? d : a;
   }

   private agt f() {
      return !this.h && !this.o ? e : l;
   }

   @Override
   protected vp aM_() {
      return vb.a("gui.narrate.slider", this.l());
   }

   @Override
   public void a(faa $$0) {
      $$0.a(ezz.a, this.aM_());
      if (this.i) {
         if (this.aJ_()) {
            $$0.a(ezz.d, vb.c("narration.slider.usage.focused"));
         } else {
            $$0.a(ezz.d, vb.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      euk $$4 = euk.N();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.e(), this.p(), this.r(), this.k(), this.i());
      $$0.a(this.f(), this.p() + (int)(this.c * (double)(this.f - 8)), this.r(), 8, this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | aty.f(this.k * 255.0F) << 24);
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
         euh $$1 = euk.N().aT();
         if ($$1 == euh.b || $$1 == euh.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (faf.a($$0)) {
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
      this.c = aty.a($$0, 0.0, 1.0);
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
   public void a(gia $$0) {
   }

   @Override
   public void c(double $$0, double $$1) {
      super.a(euk.N().ah());
   }

   protected abstract void b();

   protected abstract void a();
}
