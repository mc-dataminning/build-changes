import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class evg extends euw {
   private static final agm a = new agm("widget/checkbox_selected_highlighted");
   private static final agm b = new agm("widget/checkbox_selected");
   private static final agm c = new agm("widget/checkbox_highlighted");
   private static final agm d = new agm("widget/checkbox");
   private static final int l = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final evg.b p;

   evg(int $$0, int $$1, uv $$2, eur $$3, boolean $$4, evg.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static evg.a a(uv $$0, eur $$1) {
      return new evg.a($$0, $$1);
   }

   private static int a(eur $$0) {
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
   public void a(eyx $$0) {
      $$0.a(eyw.a, this.aN_());
      if (this.i) {
         if (this.aK_()) {
            $$0.a(eyw.d, uv.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(eyw.d, uv.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      eti $$4 = eti.N();
      RenderSystem.enableDepthTest();
      eur $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.k);
      RenderSystem.enableBlend();
      agm $$6;
      if (this.o) {
         $$6 = this.aK_() ? a : b;
      } else {
         $$6 = this.aK_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.p() + $$8 + 4;
      int $$10 = this.r() + (this.g >> 1) - (9 >> 1);
      $$0.a($$6, this.p(), this.r(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.l(), $$9, $$10, 14737632 | atq.f(this.k * 255.0F) << 24);
   }

   public static class a {
      private final uv a;
      private final eur b;
      private int c = 0;
      private int d = 0;
      private evg.b e = evg.b.a;
      private boolean f = false;
      @Nullable
      private etl<Boolean> g = null;
      @Nullable
      private ewp h = null;

      a(uv $$0, eur $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public evg.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public evg.a a(evg.b $$0) {
         this.e = $$0;
         return this;
      }

      public evg.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public evg.a a(etl<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public evg.a a(ewp $$0) {
         this.h = $$0;
         return this;
      }

      public evg a() {
         evg.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         evg $$1 = new evg(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      evg.b a = ($$0, $$1) -> {
      };

      void onValueChange(evg var1, boolean var2);
   }
}
