import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fbk extends faz {
   private static final ajh a = new ajh("widget/checkbox_selected_highlighted");
   private static final ajh b = new ajh("widget/checkbox_selected");
   private static final ajh c = new ajh("widget/checkbox_highlighted");
   private static final ajh d = new ajh("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fbk.b p;

   fbk(int $$0, int $$1, vu $$2, fat $$3, boolean $$4, fbk.b $$5) {
      super($$0, $$1, a($$3) + 4 + $$3.a($$2), a($$3), $$2);
      this.o = $$4;
      this.p = $$5;
   }

   public static fbk.a a(vu $$0, fat $$1) {
      return new fbk.a($$0, $$1);
   }

   private static int a(fat $$0) {
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
   public void a(ffe $$0) {
      $$0.a(ffd.a, this.aL_());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(ffd.d, vu.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(ffd.d, vu.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      ezi $$4 = ezi.Q();
      RenderSystem.enableDepthTest();
      fat $$5 = $$4.h;
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
      private final fat b;
      private int c = 0;
      private int d = 0;
      private fbk.b e = fbk.b.a;
      private boolean f = false;
      @Nullable
      private ezl<Boolean> g = null;
      @Nullable
      private fct h = null;

      a(vu $$0, fat $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fbk.a a(int $$0, int $$1) {
         this.c = $$0;
         this.d = $$1;
         return this;
      }

      public fbk.a a(fbk.b $$0) {
         this.e = $$0;
         return this;
      }

      public fbk.a a(boolean $$0) {
         this.f = $$0;
         this.g = null;
         return this;
      }

      public fbk.a a(ezl<Boolean> $$0) {
         this.g = $$0;
         this.f = $$0.c();
         return this;
      }

      public fbk.a a(fct $$0) {
         this.h = $$0;
         return this;
      }

      public fbk a() {
         fbk.b $$0 = this.g == null ? this.e : ($$0x, $$1x) -> {
            this.g.a($$1x);
            this.e.onValueChange($$0x, $$1x);
         };
         fbk $$1 = new fbk(this.c, this.d, this.a, this.b, this.f, $$0);
         $$1.a(this.h);
         return $$1;
      }
   }

   public interface b {
      fbk.b a = ($$0, $$1) -> {
      };

      void onValueChange(fbk var1, boolean var2);
   }
}
