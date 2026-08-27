import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class exg extends ewv {
   private static final ahg a = new ahg("widget/checkbox_selected_highlighted");
   private static final ahg b = new ahg("widget/checkbox_selected");
   private static final ahg c = new ahg("widget/checkbox_highlighted");
   private static final ahg d = new ahg("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final exg.b p;

   exg(int $$0, int $$1, vf $$2, ewq $$3, boolean $$4, exg.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static exg.a a(vf $$0, ewq $$1) {
      return new exg.a($$0, $$1);
   }

   private static int a(ewq $$0) {
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
   public void a(fax $$0) {
      $$0.a(faw.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(faw.d, vf.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(faw.d, vf.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      evg $$4 = evg.O();
      RenderSystem.enableDepthTest();
      ewq $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      ahg $$6;
      if (this.o) {
         $$6 = this.aI_() ? a : b;
      } else {
         $$6 = this.aI_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.B() + $$8 + 4;
      int $$10 = this.C() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.B(), this.C(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.x(), $$9, $$10, 14737632 | aun.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final vf a;
      private final ewq b;
      private int c = 0;
      private int d = 0;
      private exg.b e = exg.b.a;
      private boolean f = false;
      @Nullable
      private evj<Boolean> g = null;
      @Nullable
      private eyp h = null;

      a(vf $$0, ewq $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public exg.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public exg.a a(exg.b $$0) {
         this.e = $$0;
         return this;
      }

      public exg.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public exg.a a(evj<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public exg.a a(eyp $$0) {
         this.h = $$0;
         return this;
      }

      public exg a() {
         exg.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         exg $$1 = new exg(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      exg.b a = ($$0, $$1) -> {
      };

      void onValueChange(exg var1, boolean var2);
   }
}
