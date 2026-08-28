public abstract class fug extends fuj {
   private static final ali a = ali.b("widget/slider");
   private static final ali d = ali.b("widget/slider_highlighted");
   private static final ali e = ali.b("widget/slider_handle");
   private static final ali f = ali.b("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public fug(int $$0, int $$1, int $$2, int $$3, xa $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private ali c() {
      return this.E() && this.aN_() && !this.o ? d : a;
   }

   private ali e() {
      return !this.E() || !this.i && !this.o ? e : f;
   }

   @Override
   protected xo d() {
      return xa.a("gui.narrate.slider", this.B());
   }

   @Override
   public void a(fyi $$0) {
      $$0.a(fyh.a, this.d());
      if (this.j) {
         if (this.aN_()) {
            $$0.a(fyh.d, xa.c("narration.slider.usage.focused"));
         } else {
            $$0.a(fyh.d, xa.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      frd $$4 = frd.Q();
      $$0.a(gsl::H, this.c(), this.F(), this.G(), this.A(), this.y(), axy.a(this.l));
      $$0.a(gsl::H, this.e(), this.F() + (int)(this.c * (double)(this.g - 8)), this.G(), 8, this.y(), axy.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | azo.f(this.l * 255.0F) << 24);
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
         fra $$1 = frd.Q().aX();
         if ($$1 == fra.b || $$1 == fra.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fyn.a($$0)) {
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
      this.b(($$0 - (double)(this.F() + 4)) / (double)(this.g - 8));
   }

   private void b(double $$0) {
      double $$1 = this.c;
      this.c = azo.a($$0, 0.0, 1.0);
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
   public void a(hqd $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(frd.Q().ak());
   }

   protected abstract void b();

   protected abstract void a();
}
