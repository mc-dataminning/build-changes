import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fgb extends ffq {
   private static final akm a = new akm("widget/checkbox_selected_highlighted");
   private static final akm b = new akm("widget/checkbox_selected");
   private static final akm c = new akm("widget/checkbox_highlighted");
   private static final akm d = new akm("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fgb.b p;

   fgb(int $$0, int $$1, wx $$2, ffk $$3, boolean $$4, fgb.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fgb.a a(wx $$0, ffk $$1) {
      return new fgb.a($$0, $$1);
   }

   public static int a(ffk $$0) {
      return 9 + 8;
   }

   @Override
   public void b() {
      this.o = !this.o;
      this.p.onValueChange(this, this.o);
   }

   public boolean a() {
      return this.o;
   }

   @Override
   public void a(fjv $$0) {
      $$0.a(fju.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fju.d, wx.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fju.d, wx.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      fdz $$4 = fdz.Q();
      RenderSystem.enableDepthTest();
      ffk $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      akm $$6;
      if (this.o) {
         $$6 = this.aI_() ? a : b;
      } else {
         $$6 = this.aI_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.C() + $$8 + 4;
      int $$10 = this.D() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.C(), this.D(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.y(), $$9, $$10, 14737632 | ayd.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final wx a;
      private final ffk b;
      private int c = 0;
      private int d = 0;
      private fgb.b e = fgb.b.a;
      private boolean f = false;
      @Nullable
      private fec<Boolean> g = null;
      @Nullable
      private fhk h = null;

      a(wx $$0, ffk $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fgb.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fgb.a a(fgb.b $$0) {
         this.e = $$0;
         return this;
      }

      public fgb.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fgb.a a(fec<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fgb.a a(fhk $$0) {
         this.h = $$0;
         return this;
      }

      public fgb a() {
         fgb.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fgb $$1 = new fgb(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fgb.b a = ($$0, $$1) -> {
      };

      void onValueChange(fgb var1, boolean var2);
   }
}
