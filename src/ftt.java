public abstract class ftt extends ftw {
   private static final alr a = alr.b("widget/slider");
   private static final alr d = alr.b("widget/slider_highlighted");
   private static final alr e = alr.b("widget/slider_handle");
   private static final alr f = alr.b("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public ftt(int $$0, int $$1, int $$2, int $$3, xg $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private alr c() {
      return this.E() && this.aO_() && !this.o ? d : a;
   }

   private alr e() {
      return !this.E() || !this.i && !this.o ? e : f;
   }

   @Override
   protected xu d() {
      return xg.a("gui.narrate.slider", this.B());
   }

   @Override
   public void a(fxv $$0) {
      $$0.a(fxu.a, this.d());
      if (this.j) {
         if (this.aO_()) {
            $$0.a(fxu.d, xg.c("narration.slider.usage.focused"));
         } else {
            $$0.a(fxu.d, xg.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      fqq $$4 = fqq.Q();
      $$0.a(gry::H, this.c(), this.F(), this.G(), this.A(), this.y(), ayh.a(this.l));
      $$0.a(gry::H, this.e(), this.F() + (int)(this.c * (double)(this.g - 8)), this.G(), 8, this.y(), ayh.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | azz.f(this.l * 255.0F) << 24);
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
         fqn $$1 = fqq.Q().aX();
         if ($$1 == fqn.b || $$1 == fqn.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fya.a($$0)) {
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
      this.c = azz.a($$0, 0.0, 1.0);
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
   public void a(hpt $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(fqq.Q().ak());
   }

   protected abstract void b();

   protected abstract void a();
}
