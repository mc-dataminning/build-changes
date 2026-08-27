import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fam extends fab {
   private static final ajc a = new ajc("widget/checkbox_selected_highlighted");
   private static final ajc b = new ajc("widget/checkbox_selected");
   private static final ajc c = new ajc("widget/checkbox_highlighted");
   private static final ajc d = new ajc("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fam.b p;

   fam(int $$0, int $$1, vs $$2, ezv $$3, boolean $$4, fam.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fam.a a(vs $$0, ezv $$1) {
      return new fam.a($$0, $$1);
   }

   private static int a(ezv $$0) {
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
   public void a(fef $$0) {
      $$0.a(fee.a, this.aM_());
      if (this.j) {
         if (this.aK_()) {
            $$0.a(fee.d, vs.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fee.d, vs.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      eyk $$4 = eyk.P();
      RenderSystem.enableDepthTest();
      ezv $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      ajc $$6;
      if (this.o) {
         $$6 = this.aK_() ? a : b;
      } else {
         $$6 = this.aK_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.B() + $$8 + 4;
      int $$10 = this.C() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.B(), this.C(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.x(), $$9, $$10, 14737632 | awm.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final vs a;
      private final ezv b;
      private int c = 0;
      private int d = 0;
      private fam.b e = fam.b.a;
      private boolean f = false;
      @Nullable
      private eyn<Boolean> g = null;
      @Nullable
      private fbv h = null;

      a(vs $$0, ezv $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fam.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fam.a a(fam.b $$0) {
         this.e = $$0;
         return this;
      }

      public fam.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fam.a a(eyn<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fam.a a(fbv $$0) {
         this.h = $$0;
         return this;
      }

      public fam a() {
         fam.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fam $$1 = new fam(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fam.b a = ($$0, $$1) -> {
      };

      void onValueChange(fam var1, boolean var2);
   }
}
