import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fbi extends fax {
   private static final ajh a = new ajh("widget/checkbox_selected_highlighted");
   private static final ajh b = new ajh("widget/checkbox_selected");
   private static final ajh c = new ajh("widget/checkbox_highlighted");
   private static final ajh d = new ajh("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fbi.b p;

   fbi(int $$0, int $$1, vu $$2, far $$3, boolean $$4, fbi.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fbi.a a(vu $$0, far $$1) {
      return new fbi.a($$0, $$1);
   }

   private static int a(far $$0) {
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
   public void a(ffc $$0) {
      $$0.a(ffb.a, this.aL_());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(ffb.d, vu.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(ffb.d, vu.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      ezg $$4 = ezg.Q();
      RenderSystem.enableDepthTest();
      far $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      ajh $$6;
      if (this.o) {
         $$6 = this.aJ_() ? a : b;
      } else {
         $$6 = this.aJ_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.B() + $$8 + 4;
      int $$10 = this.C() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.B(), this.C(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.x(), $$9, $$10, 14737632 | aww.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final vu a;
      private final far b;
      private int c = 0;
      private int d = 0;
      private fbi.b e = fbi.b.a;
      private boolean f = false;
      @Nullable
      private ezj<Boolean> g = null;
      @Nullable
      private fcr h = null;

      a(vu $$0, far $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fbi.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fbi.a a(fbi.b $$0) {
         this.e = $$0;
         return this;
      }

      public fbi.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fbi.a a(ezj<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fbi.a a(fcr $$0) {
         this.h = $$0;
         return this;
      }

      public fbi a() {
         fbi.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fbi $$1 = new fbi(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fbi.b a = ($$0, $$1) -> {
      };

      void onValueChange(fbi var1, boolean var2);
   }
}
