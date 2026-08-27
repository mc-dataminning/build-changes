import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fea extends fdp {
   private static final ajv a = new ajv("widget/checkbox_selected_highlighted");
   private static final ajv b = new ajv("widget/checkbox_selected");
   private static final ajv c = new ajv("widget/checkbox_highlighted");
   private static final ajv d = new ajv("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fea.b p;

   fea(int $$0, int $$1, wi $$2, fdj $$3, boolean $$4, fea.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fea.a a(wi $$0, fdj $$1) {
      return new fea.a($$0, $$1);
   }

   public static int a(fdj $$0) {
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
   public void a(fhu $$0) {
      $$0.a(fht.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fht.d, wi.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fht.d, wi.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
      fby $$4 = fby.Q();
      RenderSystem.enableDepthTest();
      fdj $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      ajv $$6;
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
      $$0.b($$5, this.y(), $$9, $$10, 14737632 | axm.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final wi a;
      private final fdj b;
      private int c = 0;
      private int d = 0;
      private fea.b e = fea.b.a;
      private boolean f = false;
      @Nullable
      private fcb<Boolean> g = null;
      @Nullable
      private ffj h = null;

      a(wi $$0, fdj $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fea.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fea.a a(fea.b $$0) {
         this.e = $$0;
         return this;
      }

      public fea.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fea.a a(fcb<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fea.a a(ffj $$0) {
         this.h = $$0;
         return this;
      }

      public fea a() {
         fea.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fea $$1 = new fea(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fea.b a = ($$0, $$1) -> {
      };

      void onValueChange(fea var1, boolean var2);
   }
}
