import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ewj extends evz {
   private static final agt a = new agt("widget/checkbox_selected_highlighted");
   private static final agt b = new agt("widget/checkbox_selected");
   private static final agt c = new agt("widget/checkbox_highlighted");
   private static final agt d = new agt("widget/checkbox");
   private static final int l = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final ewj.b p;

   ewj(int $$0, int $$1, vb $$2, evu $$3, boolean $$4, ewj.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static ewj.a a(vb $$0, evu $$1) {
      return new ewj.a($$0, $$1);
   }

   private static int a(evu $$0) {
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
   public void a(faa $$0) {
      $$0.a(ezz.a, this.aM_());
      if (this.i) {
         if (this.aJ_()) {
            $$0.a(ezz.d, vb.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(ezz.d, vb.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      euk $$4 = euk.N();
      RenderSystem.enableDepthTest();
      evu $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      agt $$6;
      if (this.o) {
         $$6 = this.aJ_() ? a : b;
      } else {
         $$6 = this.aJ_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.p() + $$8 + 4;
      int $$10 = this.r() + (this.g >> 1) - (9 >> 1);
      $$0.a($$6, this.p(), this.r(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.l(), $$9, $$10, 14737632 | aty.f(this.k * 255.0F) << 24);
   }

   public static class a {
      private final vb a;
      private final evu b;
      private int c = 0;
      private int d = 0;
      private ewj.b e = ewj.b.a;
      private boolean f = false;
      @Nullable
      private eun<Boolean> g = null;
      @Nullable
      private exs h = null;

      a(vb $$0, evu $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ewj.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public ewj.a a(ewj.b $$0) {
         this.e = $$0;
         return this;
      }

      public ewj.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public ewj.a a(eun<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public ewj.a a(exs $$0) {
         this.h = $$0;
         return this;
      }

      public ewj a() {
         ewj.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         ewj $$1 = new ewj(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      ewj.b a = ($$0, $$1) -> {
      };

      void onValueChange(ewj var1, boolean var2);
   }
}
