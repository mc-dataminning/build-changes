public abstract class fom extends fop {
   private static final aku a = aku.b("widget/slider");
   private static final aku d = aku.b("widget/slider_highlighted");
   private static final aku e = aku.b("widget/slider_handle");
   private static final aku f = aku.b("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public fom(int $$0, int $$1, int $$2, int $$3, wo $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private aku c() {
      return this.aM_() && !this.o ? d : a;
   }

   private aku e() {
      return !this.i && !this.o ? e : f;
   }

   @Override
   protected xc d() {
      return wo.a("gui.narrate.slider", this.B());
   }

   @Override
   public void a(fsp $$0) {
      $$0.a(fso.a, this.d());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(fso.d, wo.c("narration.slider.usage.focused"));
         } else {
            $$0.a(fso.d, wo.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fod $$0, int $$1, int $$2, float $$3) {
      flj $$4 = flj.Q();
      $$0.a(gmh::H, this.c(), this.F(), this.G(), this.A(), this.y(), axk.a(this.l));
      $$0.a(gmh::H, this.e(), this.F() + (int)(this.c * (double)(this.g - 8)), this.G(), 8, this.y(), axk.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | ayz.f(this.l * 255.0F) << 24);
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
         flg $$1 = flj.Q().aX();
         if ($$1 == flg.b || $$1 == flg.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fsu.a($$0)) {
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
      this.c = ayz.a($$0, 0.0, 1.0);
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
   public void a(hjo $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(flj.Q().ak());
   }

   protected abstract void b();

   protected abstract void a();
}
