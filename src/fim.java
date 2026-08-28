import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fim extends fib {
   private static final akr a = akr.b("widget/checkbox_selected_highlighted");
   private static final akr b = akr.b("widget/checkbox_selected");
   private static final akr c = akr.b("widget/checkbox_highlighted");
   private static final akr d = akr.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fim.b p;

   fim(int $$0, int $$1, wz $$2, fhv $$3, boolean $$4, fim.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fim.a a(wz $$0, fhv $$1) {
      return new fim.a($$0, $$1);
   }

   public static int a(fhv $$0) {
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
   public void a(fmg $$0) {
      $$0.a(fmf.a, this.aQ_());
      if (this.j) {
         if (this.aO_()) {
            $$0.a(fmf.d, wz.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fmf.d, wz.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      fgm $$4 = fgm.Q();
      RenderSystem.enableDepthTest();
      fhv $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      akr $$6;
      if (this.o) {
         $$6 = this.aO_() ? a : b;
      } else {
         $$6 = this.aO_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.D(), this.E(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.z(), $$9, $$10, 14737632 | ayo.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final wz a;
      private final fhv b;
      private int c = 0;
      private int d = 0;
      private fim.b e = fim.b.a;
      private boolean f = false;
      @Nullable
      private fgp<Boolean> g = null;
      @Nullable
      private fjv h = null;

      a(wz $$0, fhv $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fim.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fim.a a(fim.b $$0) {
         this.e = $$0;
         return this;
      }

      public fim.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fim.a a(fgp<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fim.a a(fjv $$0) {
         this.h = $$0;
         return this;
      }

      public fim a() {
         fim.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fim $$1 = new fim(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fim.b a = ($$0, $$1) -> {
      };

      void onValueChange(fim var1, boolean var2);
   }
}
