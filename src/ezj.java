import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ezj extends eyy {
   private static final aiy a = new aiy("widget/checkbox_selected_highlighted");
   private static final aiy b = new aiy("widget/checkbox_selected");
   private static final aiy c = new aiy("widget/checkbox_highlighted");
   private static final aiy d = new aiy("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final ezj.b p;

   ezj(int $$0, int $$1, vq $$2, eys $$3, boolean $$4, ezj.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static ezj.a a(vq $$0, eys $$1) {
      return new ezj.a($$0, $$1);
   }

   private static int a(eys $$0) {
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
   public void a(fdc $$0) {
      $$0.a(fdb.a, this.aN_());
      if (this.j) {
         if (this.aL_()) {
            $$0.a(fdb.d, vq.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fdb.d, vq.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      exh $$4 = exh.O();
      RenderSystem.enableDepthTest();
      eys $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      aiy $$6;
      if (this.o) {
         $$6 = this.aL_() ? a : b;
      } else {
         $$6 = this.aL_() ? c : d;
      }

      int $$8 = a($$5);
      int $$9 = this.B() + $$8 + 4;
      int $$10 = this.C() + (this.h >> 1) - (9 >> 1);
      $$0.a($$6, this.B(), this.C(), $$8, $$8);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
      $$0.b($$5, this.x(), $$9, $$10, 14737632 | awh.f(this.l * 255.0F) << 24);
   }

   public static class a {
      private final vq a;
      private final eys b;
      private int c = 0;
      private int d = 0;
      private ezj.b e = ezj.b.a;
      private boolean f = false;
      @Nullable
      private exk<Boolean> g = null;
      @Nullable
      private fas h = null;

      a(vq $$0, eys $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public ezj.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public ezj.a a(ezj.b $$0) {
         this.e = $$0;
         return this;
      }

      public ezj.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public ezj.a a(exk<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public ezj.a a(fas $$0) {
         this.h = $$0;
         return this;
      }

      public ezj a() {
         ezj.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         ezj $$1 = new ezj(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      ezj.b a = ($$0, $$1) -> {
      };

      void onValueChange(ezj var1, boolean var2);
   }
}
