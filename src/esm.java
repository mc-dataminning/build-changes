import com.mojang.blaze3d.systems.RenderSystem;

public abstract class esm extends eso {
   private static final aew a = new aew("widget/slider");
   private static final aew d = new aew("widget/slider_highlighted");
   private static final aew e = new aew("widget/slider_handle");
   private static final aew l = new aew("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public esm(int $$0, int $$1, int $$2, int $$3, tl $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private aew e() {
      return this.aC_() && !this.o ? d : a;
   }

   private aew f() {
      return !this.h && !this.o ? e : l;
   }

   @Override
   protected ty aE_() {
      return tl.a("gui.narrate.slider", this.m());
   }

   @Override
   public void a(ewi $$0) {
      $$0.a(ewh.a, this.aE_());
      if (this.i) {
         if (this.aC_()) {
            $$0.a(ewh.d, tl.c("narration.slider.usage.focused"));
         } else {
            $$0.a(ewh.d, tl.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      eqv $$4 = eqv.O();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.e(), this.r(), this.t(), this.l(), this.i());
      $$0.a(this.f(), this.r() + (int)(this.c * (double)(this.f - 8)), this.t(), 8, this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | arw.f(this.k * 255.0F) << 24);
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
         eqs $$1 = eqv.O().aU();
         if ($$1 == eqs.b || $$1 == eqs.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ewn.a($$0)) {
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
      this.b(($$0 - (double)(this.r() + 4)) / (double)(this.f - 8));
   }

   private void b(double $$0) {
      double $$1 = this.c;
      this.c = arw.a($$0, 0.0, 1.0);
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
   public void a(gdq $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(eqv.O().ai());
   }

   protected abstract void b();

   @Override
   protected abstract void a();
}
