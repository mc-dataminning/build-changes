import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ext extends exi {
   private static final ahh a = new ahh("widget/checkbox_selected_highlighted");
   private static final ahh b = new ahh("widget/checkbox_selected");
   private static final ahh c = new ahh("widget/checkbox_highlighted");
   private static final ahh d = new ahh("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final ext.b p;

   ext(int $$0, int $$1, vg $$2, exc $$3, boolean $$4, ext.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static ext.a a(vg $$0, exc $$1) {
      return new ext.a($$0, $$1);
   }

   private static int a(exc $$0) {
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
   public void a(fbk $$0) {
      $$0.a(fbj.a, this.aM_());
      if (this.j) {
         if (this.aK_()) {
            $$0.a(fbj.d, vg.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fbj.d, vg.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      evr $$4 = evr.O();
      RenderSystem.enableDepthTest();
      exc $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      ahh $$6;
      if (this.o) {
         $$6 = this.aK_() ? a : b;
      } else {
         $$6 = this.aK_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.B() + $$8 + 4;
      int $$10 = this.C() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.B(), this.C(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.x(), $$9, $$10, 14737632 | aup.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final vg a;
      private final exc b;
      private int c = 0;
      private int d = 0;
      private ext.b e = ext.b.a;
      private boolean f = false;
      @Nullable
      private evu<Boolean> g = null;
      @Nullable
      private ezc h = null;

      a(vg $$0, exc $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ext.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public ext.a a(ext.b $$0) {
         this.e = $$0;
         return this;
      }

      public ext.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public ext.a a(evu<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public ext.a a(ezc $$0) {
         this.h = $$0;
         return this;
      }

      public ext a() {
         ext.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         ext $$1 = new ext(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      ext.b a = ($$0, $$1) -> {
      };

      void onValueChange(ext var1, boolean var2);
   }
}
