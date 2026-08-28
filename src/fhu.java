import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fhu extends fhj {
   private static final akk a = new akk("widget/checkbox_selected_highlighted");
   private static final akk b = new akk("widget/checkbox_selected");
   private static final akk c = new akk("widget/checkbox_highlighted");
   private static final akk d = new akk("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fhu.b p;

   fhu(int $$0, int $$1, wu $$2, fhd $$3, boolean $$4, fhu.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fhu.a a(wu $$0, fhd $$1) {
      return new fhu.a($$0, $$1);
   }

   public static int a(fhd $$0) {
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
   public void a(flo $$0) {
      $$0.a(fln.a, this.aM_());
      if (this.j) {
         if (this.aK_()) {
            $$0.a(fln.d, wu.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fln.d, wu.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      fft $$4 = fft.Q();
      RenderSystem.enableDepthTest();
      fhd $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      akk $$6;
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
      $$0.b($$5, this.z(), $$9, $$10, 14737632 | ayg.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final wu a;
      private final fhd b;
      private int c = 0;
      private int d = 0;
      private fhu.b e = fhu.b.a;
      private boolean f = false;
      @Nullable
      private ffw<Boolean> g = null;
      @Nullable
      private fjd h = null;

      a(wu $$0, fhd $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhu.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fhu.a a(fhu.b $$0) {
         this.e = $$0;
         return this;
      }

      public fhu.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fhu.a a(ffw<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fhu.a a(fjd $$0) {
         this.h = $$0;
         return this;
      }

      public fhu a() {
         fhu.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fhu $$1 = new fhu(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fhu.b a = ($$0, $$1) -> {
      };

      void onValueChange(fhu var1, boolean var2);
   }
}
