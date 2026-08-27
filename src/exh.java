import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class exh extends eww {
   private static final ahg a = new ahg("widget/checkbox_selected_highlighted");
   private static final ahg b = new ahg("widget/checkbox_selected");
   private static final ahg c = new ahg("widget/checkbox_highlighted");
   private static final ahg d = new ahg("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final exh.b p;

   exh(int $$0, int $$1, vf $$2, ewr $$3, boolean $$4, exh.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static exh.a a(vf $$0, ewr $$1) {
      return new exh.a($$0, $$1);
   }

   private static int a(ewr $$0) {
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
   public void a(fay $$0) {
      $$0.a(fax.a, this.aK_());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fax.d, vf.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fax.d, vf.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      evh $$4 = evh.O();
      RenderSystem.enableDepthTest();
      ewr $$5 = $$4.h;
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
      private final ewr b;
      private int c = 0;
      private int d = 0;
      private exh.b e = exh.b.a;
      private boolean f = false;
      @Nullable
      private evk<Boolean> g = null;
      @Nullable
      private eyq h = null;

      a(vf $$0, ewr $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public exh.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public exh.a a(exh.b $$0) {
         this.e = $$0;
         return this;
      }

      public exh.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public exh.a a(evk<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public exh.a a(eyq $$0) {
         this.h = $$0;
         return this;
      }

      public exh a() {
         exh.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         exh $$1 = new exh(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      exh.b a = ($$0, $$1) -> {
      };

      void onValueChange(exh var1, boolean var2);
   }
}
