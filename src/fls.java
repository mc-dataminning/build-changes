public abstract class fls extends flu {
   private static final all a = all.b("widget/slider");
   private static final all d = all.b("widget/slider_highlighted");
   private static final all e = all.b("widget/slider_handle");
   private static final all f = all.b("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public fls(int $$0, int $$1, int $$2, int $$3, xl $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private all c() {
      return this.aM_() && !this.o ? d : a;
   }

   private all e() {
      return !this.i && !this.o ? e : f;
   }

   @Override
   protected xz aO_() {
      return xl.a("gui.narrate.slider", this.z());
   }

   @Override
   public void a(fpu $$0) {
      $$0.a(fpt.a, this.aO_());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(fpt.d, xl.c("narration.slider.usage.focused"));
         } else {
            $$0.a(fpt.d, xl.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      fjx $$4 = fjx.Q();
      $$0.a(gjh::B, this.c(), this.D(), this.E(), this.y(), this.w(), axy.a(this.l));
      $$0.a(gjh::B, this.e(), this.D() + (int)(this.c * (double)(this.g - 8)), this.E(), 8, this.w(), axy.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | azn.f(this.l * 255.0F) << 24);
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
         fju $$1 = fjx.Q().aY();
         if ($$1 == fju.b || $$1 == fju.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fpz.a($$0)) {
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
      this.c = azn.a($$0, 0.0, 1.0);
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
   public void a(hdv $$0) {
   }

   @Override
   public void a_(double $$0, double $$1) {
      super.a(fjx.Q().ak());
   }

   protected abstract void b();

   protected abstract void a();
}
