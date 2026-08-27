import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class evb extends eur {
   private static final agi a = new agi("widget/checkbox_selected_highlighted");
   private static final agi b = new agi("widget/checkbox_selected");
   private static final agi c = new agi("widget/checkbox_highlighted");
   private static final agi d = new agi("widget/checkbox");
   private static final int l = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final evb.b p;

   evb(int $$0, int $$1, ur $$2, eum $$3, boolean $$4, evb.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static evb.a a(ur $$0, eum $$1) {
      return new evb.a($$0, $$1);
   }

   private static int a(eum $$0) {
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
   public void a(eys $$0) {
      $$0.a(eyr.a, this.aM_());
      if (this.i) {
         if (this.aJ_()) {
            $$0.a(eyr.d, ur.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(eyr.d, ur.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      etd $$4 = etd.N();
      RenderSystem.enableDepthTest();
      eum $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      agi $$6;
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
      $$0.b($$5, this.l(), $$9, $$10, 14737632 | atm.f(this.k * 255.0F) << 24);
   }

   public static class a {
      private final ur a;
      private final eum b;
      private int c = 0;
      private int d = 0;
      private evb.b e = evb.b.a;
      private boolean f = false;
      @Nullable
      private etg<Boolean> g = null;
      @Nullable
      private ewk h = null;

      a(ur $$0, eum $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public evb.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public evb.a a(evb.b $$0) {
         this.e = $$0;
         return this;
      }

      public evb.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public evb.a a(etg<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public evb.a a(ewk $$0) {
         this.h = $$0;
         return this;
      }

      public evb a() {
         evb.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         evb $$1 = new evb(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      evb.b a = ($$0, $$1) -> {
      };

      void onValueChange(evb var1, boolean var2);
   }
}
