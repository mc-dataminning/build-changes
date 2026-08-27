import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class exa extends ewp {
   private static final ahd a = new ahd("widget/checkbox_selected_highlighted");
   private static final ahd b = new ahd("widget/checkbox_selected");
   private static final ahd c = new ahd("widget/checkbox_highlighted");
   private static final ahd d = new ahd("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final exa.b p;

   exa(int $$0, int $$1, vd $$2, ewk $$3, boolean $$4, exa.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static exa.a a(vd $$0, ewk $$1) {
      return new exa.a($$0, $$1);
   }

   private static int a(ewk $$0) {
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
   public void a(far $$0) {
      $$0.a(faq.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(faq.d, vd.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(faq.d, vd.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      eva $$4 = eva.N();
      RenderSystem.enableDepthTest();
      ewk $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      ahd $$6;
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
      $$0.b($$5, this.x(), $$9, $$10, 14737632 | aui.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final vd a;
      private final ewk b;
      private int c = 0;
      private int d = 0;
      private exa.b e = exa.b.a;
      private boolean f = false;
      @Nullable
      private evd<Boolean> g = null;
      @Nullable
      private eyj h = null;

      a(vd $$0, ewk $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public exa.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public exa.a a(exa.b $$0) {
         this.e = $$0;
         return this;
      }

      public exa.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public exa.a a(evd<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public exa.a a(eyj $$0) {
         this.h = $$0;
         return this;
      }

      public exa a() {
         exa.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         exa $$1 = new exa(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      exa.b a = ($$0, $$1) -> {
      };

      void onValueChange(exa var1, boolean var2);
   }
}
