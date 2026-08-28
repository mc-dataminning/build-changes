import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fhi extends fgx {
   private static final alf a = new alf("widget/checkbox_selected_highlighted");
   private static final alf b = new alf("widget/checkbox_selected");
   private static final alf c = new alf("widget/checkbox_highlighted");
   private static final alf d = new alf("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fhi.b p;

   fhi(int $$0, int $$1, xp $$2, fgr $$3, boolean $$4, fhi.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fhi.a a(xp $$0, fgr $$1) {
      return new fhi.a($$0, $$1);
   }

   public static int a(fgr $$0) {
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
   public void a(flc $$0) {
      $$0.a(flb.a, this.aJ_());
      if (this.j) {
         if (this.aH_()) {
            $$0.a(flb.d, xp.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(flb.d, xp.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fgt $$0, int $$1, int $$2, float $$3) {
      ffh $$4 = ffh.Q();
      RenderSystem.enableDepthTest();
      fgr $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      alf $$6;
      if (this.o) {
         $$6 = this.aH_() ? a : b;
      } else {
         $$6 = this.aH_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.C() + $$8 + 4;
      int $$10 = this.D() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.C(), this.D(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.y(), $$9, $$10, 14737632 | ayz.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final xp a;
      private final fgr b;
      private int c = 0;
      private int d = 0;
      private fhi.b e = fhi.b.a;
      private boolean f = false;
      @Nullable
      private ffk<Boolean> g = null;
      @Nullable
      private fir h = null;

      a(xp $$0, fgr $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhi.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fhi.a a(fhi.b $$0) {
         this.e = $$0;
         return this;
      }

      public fhi.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fhi.a a(ffk<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fhi.a a(fir $$0) {
         this.h = $$0;
         return this;
      }

      public fhi a() {
         fhi.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fhi $$1 = new fhi(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fhi.b a = ($$0, $$1) -> {
      };

      void onValueChange(fhi var1, boolean var2);
   }
}
