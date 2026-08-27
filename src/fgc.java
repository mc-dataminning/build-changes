import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fgc extends ffr {
   private static final akn a = new akn("widget/checkbox_selected_highlighted");
   private static final akn b = new akn("widget/checkbox_selected");
   private static final akn c = new akn("widget/checkbox_highlighted");
   private static final akn d = new akn("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fgc.b p;

   fgc(int $$0, int $$1, wx $$2, ffl $$3, boolean $$4, fgc.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fgc.a a(wx $$0, ffl $$1) {
      return new fgc.a($$0, $$1);
   }

   public static int a(ffl $$0) {
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
   public void a(fjw $$0) {
      $$0.a(fjv.a, this.aL_());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(fjv.d, wx.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fjv.d, wx.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
      feb $$4 = feb.Q();
      RenderSystem.enableDepthTest();
      ffl $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      akn $$6;
      if (this.o) {
         $$6 = this.aJ_() ? a : b;
      } else {
         $$6 = this.aJ_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.C() + $$8 + 4;
      int $$10 = this.D() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.C(), this.D(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.y(), $$9, $$10, 14737632 | ayf.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final wx a;
      private final ffl b;
      private int c = 0;
      private int d = 0;
      private fgc.b e = fgc.b.a;
      private boolean f = false;
      @Nullable
      private fee<Boolean> g = null;
      @Nullable
      private fhl h = null;

      a(wx $$0, ffl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fgc.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fgc.a a(fgc.b $$0) {
         this.e = $$0;
         return this;
      }

      public fgc.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fgc.a a(fee<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fgc.a a(fhl $$0) {
         this.h = $$0;
         return this;
      }

      public fgc a() {
         fgc.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fgc $$1 = new fgc(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fgc.b a = ($$0, $$1) -> {
      };

      void onValueChange(fgc var1, boolean var2);
   }
}
