public abstract class flz extends fmb {
   private static final alj a = alj.b("widget/slider");
   private static final alj d = alj.b("widget/slider_highlighted");
   private static final alj e = alj.b("widget/slider_handle");
   private static final alj f = alj.b("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public flz(int $$0, int $$1, int $$2, int $$3, xj $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private alj c() {
      return this.aL_() && !this.o ? d : a;
   }

   private alj e() {
      return !this.i && !this.o ? e : f;
   }

   @Override
   protected xx aN_() {
      return xj.a("gui.narrate.slider", this.z());
   }

   @Override
   public void a(fqb $$0) {
      $$0.a(fqa.a, this.aN_());
      if (this.j) {
         if (this.aL_()) {
            $$0.a(fqa.d, xj.c("narration.slider.usage.focused"));
         } else {
            $$0.a(fqa.d, xj.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      fke $$4 = fke.Q();
      $$0.a(gjq::B, this.c(), this.D(), this.E(), this.y(), this.w(), axx.a(this.l));
      $$0.a(gjq::B, this.e(), this.D() + (int)(this.c * (double)(this.g - 8)), this.E(), 8, this.w(), axx.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | azm.f(this.l * 255.0F) << 24);
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
         fkb $$1 = fke.Q().aY();
         if ($$1 == fkb.b || $$1 == fkb.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fqg.a($$0)) {
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
      this.c = azm.a($$0, 0.0, 1.0);
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
   public void a(heg $$0) {
   }

   @Override
   public void a_(double $$0, double $$1) {
      super.a(fke.Q().ak());
   }

   protected abstract void b();

   protected abstract void a();
}
