public abstract class fok extends fon {
   private static final aku a = aku.b("widget/slider");
   private static final aku d = aku.b("widget/slider_highlighted");
   private static final aku e = aku.b("widget/slider_handle");
   private static final aku f = aku.b("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public fok(int $$0, int $$1, int $$2, int $$3, wo $$4, double $$5) {
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
   public void a(fsn $$0) {
      $$0.a(fsm.a, this.d());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(fsm.d, wo.c("narration.slider.usage.focused"));
         } else {
            $$0.a(fsm.d, wo.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fob $$0, int $$1, int $$2, float $$3) {
      flh $$4 = flh.Q();
      $$0.a(gmf::H, this.c(), this.F(), this.G(), this.A(), this.y(), axj.a(this.l));
      $$0.a(gmf::H, this.e(), this.F() + (int)(this.c * (double)(this.g - 8)), this.G(), 8, this.y(), axj.a(this.l));
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | ayy.f(this.l * 255.0F) << 24);
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
         fle $$1 = flh.Q().aX();
         if ($$1 == fle.b || $$1 == fle.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fss.a($$0)) {
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
      this.c = ayy.a($$0, 0.0, 1.0);
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
   public void a(hjp $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(flh.Q().ak());
   }

   protected abstract void b();

   protected abstract void a();
}
