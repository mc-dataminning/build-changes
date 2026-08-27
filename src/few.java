import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class few extends fel {
   private static final akf a = new akf("widget/checkbox_selected_highlighted");
   private static final akf b = new akf("widget/checkbox_selected");
   private static final akf c = new akf("widget/checkbox_highlighted");
   private static final akf d = new akf("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final few.b p;

   few(int $$0, int $$1, ws $$2, fef $$3, boolean $$4, few.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static few.a a(ws $$0, fef $$1) {
      return new few.a($$0, $$1);
   }

   public static int a(fef $$0) {
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
   public void a(fiq $$0) {
      $$0.a(fip.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fip.d, ws.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fip.d, ws.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(feh $$0, int $$1, int $$2, float $$3) {
      fcu $$4 = fcu.Q();
      RenderSystem.enableDepthTest();
      fef $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      akf $$6;
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
      $$0.b($$5, this.y(), $$9, $$10, 14737632 | axw.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final ws a;
      private final fef b;
      private int c = 0;
      private int d = 0;
      private few.b e = few.b.a;
      private boolean f = false;
      @Nullable
      private fcx<Boolean> g = null;
      @Nullable
      private fgf h = null;

      a(ws $$0, fef $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public few.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public few.a a(few.b $$0) {
         this.e = $$0;
         return this;
      }

      public few.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public few.a a(fcx<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public few.a a(fgf $$0) {
         this.h = $$0;
         return this;
      }

      public few a() {
         few.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         few $$1 = new few(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      few.b a = ($$0, $$1) -> {
      };

      void onValueChange(few var1, boolean var2);
   }
}
