import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fab implements ezz {
   private static final ahh g = new ahh("toast/tutorial");
   public static final int a = 154;
   public static final int d = 1;
   public static final int e = 3;
   public static final int f = 28;
   private final fab.a h;
   private final vg i;
   @Nullable
   private final vg j;
   private ezz.a k = ezz.a.a;
   private long l;
   private float m;
   private float n;
   private final boolean o;

   public fab(fab.a $$0, vg $$1, @Nullable vg $$2, boolean $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.o = $$3;
   }

   @Override
   public ezz.a a(exe $$0, faa $$1, long $$2) {
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
         float $$3 = aup.b(this.m, this.n, (float)($$2 - this.l) / 100.0F);
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
      this.k = ezz.a.b;
   }

   public void a(float $$0) {
      this.n = $$0;
   }

   public static enum a {
      a(new ahh("toast/movement_keys")),
      b(new ahh("toast/mouse")),
      c(new ahh("toast/tree")),
      d(new ahh("toast/recipe_book")),
      e(new ahh("toast/wooden_planks")),
      f(new ahh("toast/social_interactions")),
      g(new ahh("toast/right_click"));

      private final ahh h;

      private a(ahh $$0) {
         this.h = $$0;
      }

      public void a(exe $$0, int $$1, int $$2) {
         RenderSystem.enableBlend();
         $$0.a(this.h, $$1, $$2, 20, 20);
      }
   }
}
