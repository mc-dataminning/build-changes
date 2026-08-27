import com.mojang.blaze3d.systems.RenderSystem;

public abstract class esd extends esf {
   private static final aer a = new aer("widget/slider");
   private static final aer d = new aer("widget/slider_highlighted");
   private static final aer e = new aer("widget/slider_handle");
   private static final aer l = new aer("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public esd(int $$0, int $$1, int $$2, int $$3, tf $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private aer e() {
      return this.ax_() && !this.o ? d : a;
   }

   private aer f() {
      return !this.h && !this.o ? e : l;
   }

   @Override
   protected ts aB_() {
      return tf.a("gui.narrate.slider", this.l());
   }

   @Override
   public void a(evx $$0) {
      $$0.a(evw.a, this.aB_());
      if (this.i) {
         if (this.ax_()) {
            $$0.a(evw.d, tf.c("narration.slider.usage.focused"));
         } else {
            $$0.a(evw.d, tf.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      eqm $$4 = eqm.O();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.e(), this.p(), this.r(), this.k(), this.h());
      $$0.a(this.f(), this.p() + (int)(this.c * (double)(this.f - 8)), this.r(), 8, this.h());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | arp.f(this.k * 255.0F) << 24);
   }

   @Override
   public void a(double $$0, double $$1) {
      this.a($$0);
   }

   @Override
   public void c_(boolean $$0) {
      super.c_($$0);
      if (!$$0) {
         this.o = false;
      } else {
         eqj $$1 = eqm.O().aU();
         if ($$1 == eqj.b || $$1 == eqj.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ewc.a($$0)) {
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
      this.c = arp.a($$0, 0.0, 1.0);
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
   public void a(gcx $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(eqm.O().ai());
   }

   protected abstract void b();

   @Override
   protected abstract void a();
}
