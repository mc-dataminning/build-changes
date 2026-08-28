import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fii extends fhx {
   private static final akq a = akq.b("widget/checkbox_selected_highlighted");
   private static final akq b = akq.b("widget/checkbox_selected");
   private static final akq c = akq.b("widget/checkbox_highlighted");
   private static final akq d = akq.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fii.b p;

   fii(int $$0, int $$1, wy $$2, fhr $$3, boolean $$4, fii.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fii.a a(wy $$0, fhr $$1) {
      return new fii.a($$0, $$1);
   }

   public static int a(fhr $$0) {
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
   public void a(fmc $$0) {
      $$0.a(fmb.a, this.aM_());
      if (this.j) {
         if (this.aK_()) {
            $$0.a(fmb.d, wy.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fmb.d, wy.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      fgi $$4 = fgi.Q();
      RenderSystem.enableDepthTest();
      fhr $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      akq $$6;
      if (this.o) {
         $$6 = this.aK_() ? a : b;
      } else {
         $$6 = this.aK_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.D(), this.E(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.z(), $$9, $$10, 14737632 | ayn.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final wy a;
      private final fhr b;
      private int c = 0;
      private int d = 0;
      private fii.b e = fii.b.a;
      private boolean f = false;
      @Nullable
      private fgl<Boolean> g = null;
      @Nullable
      private fjr h = null;

      a(wy $$0, fhr $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fii.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fii.a a(fii.b $$0) {
         this.e = $$0;
         return this;
      }

      public fii.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fii.a a(fgl<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fii.a a(fjr $$0) {
         this.h = $$0;
         return this;
      }

      public fii a() {
         fii.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fii $$1 = new fii(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fii.b a = ($$0, $$1) -> {
      };

      void onValueChange(fii var1, boolean var2);
   }
}
