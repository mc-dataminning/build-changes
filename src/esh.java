import com.mojang.blaze3d.systems.RenderSystem;

public abstract class esh extends esj {
   private static final aeu a = new aeu("widget/slider");
   private static final aeu d = new aeu("widget/slider_highlighted");
   private static final aeu e = new aeu("widget/slider_handle");
   private static final aeu l = new aeu("widget/slider_handle_highlighted");
   protected static final int b = 2;
   private static final int m = 8;
   private static final int n = 4;
   protected double c;
   private boolean o;

   public esh(int $$0, int $$1, int $$2, int $$3, ti $$4, double $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.c = $$5;
   }

   private aeu e() {
      return this.ay_() && !this.o ? d : a;
   }

   private aeu f() {
      return !this.h && !this.o ? e : l;
   }

   @Override
   protected tv aA_() {
      return ti.a("gui.narrate.slider", this.m());
   }

   @Override
   public void a(ewd $$0) {
      $$0.a(ewc.a, this.aA_());
      if (this.i) {
         if (this.ay_()) {
            $$0.a(ewc.d, ti.c("narration.slider.usage.focused"));
         } else {
            $$0.a(ewc.d, ti.c("narration.slider.usage.hovered"));
         }
      }
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      eqq $$4 = eqq.O();
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      $$0.a(this.e(), this.r(), this.t(), this.l(), this.i());
      $$0.a(this.f(), this.r() + (int)(this.c * (double)(this.f - 8)), this.t(), 8, this.i());
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      int $$5 = this.i ? 16777215 : 10526880;
      this.a($$0, $$4.h, 2, $$5 | ars.f(this.k * 255.0F) << 24);
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
         eqn $$1 = eqq.O().aU();
         if ($$1 == eqn.b || $$1 == eqn.d) {
            this.o = true;
         }
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if (ewi.a($$0)) {
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
      this.c = ars.a($$0, 0.0, 1.0);
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
   public void a(gdl $$0) {
   }

   @Override
   public void b(double $$0, double $$1) {
      super.a(eqq.O().ai());
   }

   protected abstract void b();

   @Override
   protected abstract void a();
}
