import com.mojang.blaze3d.systems.RenderSystem;

public abstract class esc extends ese {
   private static final aer a = new aer("widget/slider");
   private static final aer d = new aer("widget/slider_highlighted");
   private static final aer e = new aer("widget/slider_handle");
   private static final aer l = new aer("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public esc(int $$0, int $$1, int $$2, int $$3, tf $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private aer e() {
      return this.aw_() && !this.o ? d : a;
   }

   private aer f() {
      return !this.h && !this.o ? e : l;
   }

   @Override
   protected ts az_() {
      return tf.a("gui.narrate.slider", this.m());
   }

   @Override
   public void a(evy $$0) {
      $$0.a(evx.a, this.az_());
      if (this.i) {
         if (this.aw_()) {
            $$0.a(evx.d, tf.c("narration.slider.usage.focused"));
         } else {
            $$0.a(evx.d, tf.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      eql $$4 = eql.O();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.e(), this.r(), this.t(), this.l(), this.i());
      $$0.a(this.f(), this.r() + (int)(this.c * (double)(this.f - 8)), this.t(), 8, this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | arp.f(this.k * 255.0F) << 24);
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
         eqi $$1 = eql.O().aU();
         if ($$1 == eqi.b || $$1 == eqi.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ewd.a($$0)) {
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
   public void a(gdg $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(eql.O().ai());
   }

   protected abstract void b();

   @Override
   protected abstract void a();
}
