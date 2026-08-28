import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fhb extends fgq {
   private static final alb a = new alb("widget/checkbox_selected_highlighted");
   private static final alb b = new alb("widget/checkbox_selected");
   private static final alb c = new alb("widget/checkbox_highlighted");
   private static final alb d = new alb("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fhb.b p;

   fhb(int $$0, int $$1, xl $$2, fgk $$3, boolean $$4, fhb.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fhb.a a(xl $$0, fgk $$1) {
      return new fhb.a($$0, $$1);
   }

   public static int a(fgk $$0) {
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
   public void a(fkv $$0) {
      $$0.a(fku.a, this.aL_());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(fku.d, xl.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fku.d, xl.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      ffa $$4 = ffa.Q();
      RenderSystem.enableDepthTest();
      fgk $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      alb $$6;
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
      $$0.b($$5, this.y(), $$9, $$10, 14737632 | ayu.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final xl a;
      private final fgk b;
      private int c = 0;
      private int d = 0;
      private fhb.b e = fhb.b.a;
      private boolean f = false;
      @Nullable
      private ffd<Boolean> g = null;
      @Nullable
      private fik h = null;

      a(xl $$0, fgk $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhb.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fhb.a a(fhb.b $$0) {
         this.e = $$0;
         return this;
      }

      public fhb.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fhb.a a(ffd<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fhb.a a(fik $$0) {
         this.h = $$0;
         return this;
      }

      public fhb a() {
         fhb.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fhb $$1 = new fhb(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fhb.b a = ($$0, $$1) -> {
      };

      void onValueChange(fhb var1, boolean var2);
   }
}
