import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fhg extends fgv {
   private static final alf a = new alf("widget/checkbox_selected_highlighted");
   private static final alf b = new alf("widget/checkbox_selected");
   private static final alf c = new alf("widget/checkbox_highlighted");
   private static final alf d = new alf("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fhg.b p;

   fhg(int $$0, int $$1, xp $$2, fgp $$3, boolean $$4, fhg.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fhg.a a(xp $$0, fgp $$1) {
      return new fhg.a($$0, $$1);
   }

   public static int a(fgp $$0) {
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
   public void a(fla $$0) {
      $$0.a(fkz.a, this.aJ_());
      if (this.j) {
         if (this.aH_()) {
            $$0.a(fkz.d, xp.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fkz.d, xp.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fgr $$0, int $$1, int $$2, float $$3) {
      fff $$4 = fff.Q();
      RenderSystem.enableDepthTest();
      fgp $$5 = $$4.h;
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
      private final fgp b;
      private int c = 0;
      private int d = 0;
      private fhg.b e = fhg.b.a;
      private boolean f = false;
      @Nullable
      private ffi<Boolean> g = null;
      @Nullable
      private fip h = null;

      a(xp $$0, fgp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhg.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fhg.a a(fhg.b $$0) {
         this.e = $$0;
         return this;
      }

      public fhg.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fhg.a a(ffi<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fhg.a a(fip $$0) {
         this.h = $$0;
         return this;
      }

      public fhg a() {
         fhg.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fhg $$1 = new fhg(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fhg.b a = ($$0, $$1) -> {
      };

      void onValueChange(fhg var1, boolean var2);
   }
}
