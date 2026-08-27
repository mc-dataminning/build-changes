import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fdr extends fdg {
   private static final ajt a = new ajt("widget/checkbox_selected_highlighted");
   private static final ajt b = new ajt("widget/checkbox_selected");
   private static final ajt c = new ajt("widget/checkbox_highlighted");
   private static final ajt d = new ajt("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fdr.b p;

   fdr(int $$0, int $$1, wg $$2, fda $$3, boolean $$4, fdr.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fdr.a a(wg $$0, fda $$1) {
      return new fdr.a($$0, $$1);
   }

   public static int a(fda $$0) {
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
   public void a(fhl $$0) {
      $$0.a(fhk.a, this.aL_());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(fhk.d, wg.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fhk.d, wg.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      fbp $$4 = fbp.Q();
      RenderSystem.enableDepthTest();
      fda $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      ajt $$6;
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
      $$0.b($$5, this.y(), $$9, $$10, 14737632 | axk.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final wg a;
      private final fda b;
      private int c = 0;
      private int d = 0;
      private fdr.b e = fdr.b.a;
      private boolean f = false;
      @Nullable
      private fbs<Boolean> g = null;
      @Nullable
      private ffa h = null;

      a(wg $$0, fda $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fdr.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fdr.a a(fdr.b $$0) {
         this.e = $$0;
         return this;
      }

      public fdr.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fdr.a a(fbs<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fdr.a a(ffa $$0) {
         this.h = $$0;
         return this;
      }

      public fdr a() {
         fdr.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fdr $$1 = new fdr(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fdr.b a = ($$0, $$1) -> {
      };

      void onValueChange(fdr var1, boolean var2);
   }
}
