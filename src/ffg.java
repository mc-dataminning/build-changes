import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ffg extends fev {
   private static final akh a = new akh("widget/checkbox_selected_highlighted");
   private static final akh b = new akh("widget/checkbox_selected");
   private static final akh c = new akh("widget/checkbox_highlighted");
   private static final akh d = new akh("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final ffg.b p;

   ffg(int $$0, int $$1, wu $$2, fep $$3, boolean $$4, ffg.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static ffg.a a(wu $$0, fep $$1) {
      return new ffg.a($$0, $$1);
   }

   public static int a(fep $$0) {
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
   public void a(fja $$0) {
      $$0.a(fiz.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fiz.d, wu.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fiz.d, wu.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      fde $$4 = fde.Q();
      RenderSystem.enableDepthTest();
      fep $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      akh $$6;
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
      $$0.b($$5, this.y(), $$9, $$10, 14737632 | axz.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final wu a;
      private final fep b;
      private int c = 0;
      private int d = 0;
      private ffg.b e = ffg.b.a;
      private boolean f = false;
      @Nullable
      private fdh<Boolean> g = null;
      @Nullable
      private fgp h = null;

      a(wu $$0, fep $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ffg.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public ffg.a a(ffg.b $$0) {
         this.e = $$0;
         return this;
      }

      public ffg.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public ffg.a a(fdh<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public ffg.a a(fgp $$0) {
         this.h = $$0;
         return this;
      }

      public ffg a() {
         ffg.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         ffg $$1 = new ffg(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      ffg.b a = ($$0, $$1) -> {
      };

      void onValueChange(ffg var1, boolean var2);
   }
}
