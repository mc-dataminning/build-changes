import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fcv implements fct {
   private static final ajc g = new ajc("toast/tutorial");
   public static final int a = 154;
   public static final int d = 1;
   public static final int e = 3;
   public static final int f = 28;
   private final fcv.a h;
   private final vs i;
   @Nullable
   private final vs j;
   private fct.a k = fct.a.a;
   private long l;
   private float m;
   private float n;
   private final boolean o;

   public fcv(fcv.a $$0, vs $$1, @Nullable vs $$2, boolean $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.o = $$3;
   }

   @Override
   public fct.a a(ezx $$0, fcu $$1, long $$2) {
      $$0.a(g, 0, 0, this.a(), this.b());
      this.h.a($$0, 6, 6);
      if (this.j == null) {
         $$0.a($$1.b().h, this.i, 30, 12, -11534256, false);
      } else {
         $$0.a($$1.b().h, this.i, 30, 7, -11534256, false);
         $$0.a($$1.b().h, this.j, 30, 18, -16777216, false);
      }

      if (this.o) {
         $$0.a(3, 28, 157, 29, -1);
         float $$3 = awm.b(this.m, this.n, (float)($$2 - this.l) / 100.0F);
         int $$4;
         if (this.n >= this.m) {
            $$4 = -16755456;
         } else {
            $$4 = -11206656;
         }

         $$0.a(3, 28, (int)(3.0F + 154.0F * $$3), 29, $$4);
         this.m = $$3;
         this.l = $$2;
      }

      return this.k;
   }

   public void c() {
      this.k = fct.a.b;
   }

   public void a(float $$0) {
      this.n = $$0;
   }

   public static enum a {
      a(new ajc("toast/movement_keys")),
      b(new ajc("toast/mouse")),
      c(new ajc("toast/tree")),
      d(new ajc("toast/recipe_book")),
      e(new ajc("toast/wooden_planks")),
      f(new ajc("toast/social_interactions")),
      g(new ajc("toast/right_click"));

      private final ajc h;

      private a(ajc $$0) {
         this.h = $$0;
      }

      public void a(ezx $$0, int $$1, int $$2) {
         RenderSystem.enableBlend();
         $$0.a(this.h, $$1, $$2, 20, 20);
      }
   }
}
