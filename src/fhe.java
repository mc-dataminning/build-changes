import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fhe extends fgt {
   private static final ale a = new ale("widget/checkbox_selected_highlighted");
   private static final ale b = new ale("widget/checkbox_selected");
   private static final ale c = new ale("widget/checkbox_highlighted");
   private static final ale d = new ale("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fhe.b p;

   fhe(int $$0, int $$1, xo $$2, fgn $$3, boolean $$4, fhe.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fhe.a a(xo $$0, fgn $$1) {
      return new fhe.a($$0, $$1);
   }

   public static int a(fgn $$0) {
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
   public void a(fky $$0) {
      $$0.a(fkx.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fkx.d, xo.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fkx.d, xo.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fgp $$0, int $$1, int $$2, float $$3) {
      ffd $$4 = ffd.Q();
      RenderSystem.enableDepthTest();
      fgn $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      ale $$6;
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
      $$0.b($$5, this.y(), $$9, $$10, 14737632 | ayx.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final xo a;
      private final fgn b;
      private int c = 0;
      private int d = 0;
      private fhe.b e = fhe.b.a;
      private boolean f = false;
      @Nullable
      private ffg<Boolean> g = null;
      @Nullable
      private fin h = null;

      a(xo $$0, fgn $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhe.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fhe.a a(fhe.b $$0) {
         this.e = $$0;
         return this;
      }

      public fhe.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fhe.a a(ffg<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fhe.a a(fin $$0) {
         this.h = $$0;
         return this;
      }

      public fhe a() {
         fhe.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fhe $$1 = new fhe(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fhe.b a = ($$0, $$1) -> {
      };

      void onValueChange(fhe var1, boolean var2);
   }
}
