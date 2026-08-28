import com.mojang.blaze3d.systems.RenderSystem;

public abstract class fhi extends fhk {
   private static final akk a = new akk("widget/slider");
   private static final akk d = new akk("widget/slider_highlighted");
   private static final akk e = new akk("widget/slider_handle");
   private static final akk f = new akk("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public fhi(int $$0, int $$1, int $$2, int $$3, wu $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private akk c() {
      return this.aJ_() && !this.o ? d : a;
   }

   private akk e() {
      return !this.i && !this.o ? e : f;
   }

   @Override
   protected xi aL_() {
      return wu.a("gui.narrate.slider", this.z());
   }

   @Override
   public void a(fli $$0) {
      $$0.a(flh.a, this.aL_());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(flh.d, wu.c("narration.slider.usage.focused"));
         } else {
            $$0.a(flh.d, wu.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      ffn $$4 = ffn.Q();
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.c(), this.D(), this.E(), this.y(), this.w());
      $$0.a(this.e(), this.D() + (int)(this.c * (double)(this.g - 8)), this.E(), 8, this.w());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.j ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | aye.f(this.l * 255.0F) << 24);
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
         ffk $$1 = ffn.Q().aW();
         if ($$1 == ffk.b || $$1 == ffk.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (fln.a($$0)) {
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
      this.c = aye.a($$0, 0.0, 1.0);
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
   public void a(gub $$0) {
   }

   @Override
   public void a_(double $$0, double $$1) {
      super.a(ffn.Q().aj());
   }

   protected abstract void b();

   protected abstract void a();
}
