import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fho extends fhd {
   private static final akk a = new akk("widget/checkbox_selected_highlighted");
   private static final akk b = new akk("widget/checkbox_selected");
   private static final akk c = new akk("widget/checkbox_highlighted");
   private static final akk d = new akk("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fho.b p;

   fho(int $$0, int $$1, wu $$2, fgx $$3, boolean $$4, fho.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fho.a a(wu $$0, fgx $$1) {
      return new fho.a($$0, $$1);
   }

   public static int a(fgx $$0) {
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
   public void a(fli $$0) {
      $$0.a(flh.a, this.aL_());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(flh.d, wu.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(flh.d, wu.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      ffn $$4 = ffn.Q();
      RenderSystem.enableDepthTest();
      fgx $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      akk $$6;
      if (this.o) {
         $$6 = this.aJ_() ? a : b;
      } else {
         $$6 = this.aJ_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.D(), this.E(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.z(), $$9, $$10, 14737632 | aye.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final wu a;
      private final fgx b;
      private int c = 0;
      private int d = 0;
      private fho.b e = fho.b.a;
      private boolean f = false;
      @Nullable
      private ffq<Boolean> g = null;
      @Nullable
      private fix h = null;

      a(wu $$0, fgx $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fho.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fho.a a(fho.b $$0) {
         this.e = $$0;
         return this;
      }

      public fho.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fho.a a(ffq<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fho.a a(fix $$0) {
         this.h = $$0;
         return this;
      }

      public fho a() {
         fho.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fho $$1 = new fho(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fho.b a = ($$0, $$1) -> {
      };

      void onValueChange(fho var1, boolean var2);
   }
}
