import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fip extends fie {
   private static final akt a = new akt("widget/checkbox_selected_highlighted");
   private static final akt b = new akt("widget/checkbox_selected");
   private static final akt c = new akt("widget/checkbox_highlighted");
   private static final akt d = new akt("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fip.b p;

   fip(int $$0, int $$1, xe $$2, fhy $$3, boolean $$4, fip.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fip.a a(xe $$0, fhy $$1) {
      return new fip.a($$0, $$1);
   }

   public static int a(fhy $$0) {
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
   public void a(fmj $$0) {
      $$0.a(fmi.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fmi.d, xe.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fmi.d, xe.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
      fgj $$4 = fgj.Q();
      RenderSystem.enableDepthTest();
      fhy $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      akt $$6;
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
      $$0.b($$5, this.y(), $$9, $$10, 14737632 | aym.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final xe a;
      private final fhy b;
      private int c = 0;
      private int d = 0;
      private fip.b e = fip.b.a;
      private boolean f = false;
      @Nullable
      private fgm<Boolean> g = null;
      @Nullable
      private fjy h = null;

      a(xe $$0, fhy $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fip.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fip.a a(fip.b $$0) {
         this.e = $$0;
         return this;
      }

      public fip.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fip.a a(fgm<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fip.a a(fjy $$0) {
         this.h = $$0;
         return this;
      }

      public fip a() {
         fip.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fip $$1 = new fip(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fip.b a = ($$0, $$1) -> {
      };

      void onValueChange(fip var1, boolean var2);
   }
}
