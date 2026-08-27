import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fky implements fkw {
   private static final akt g = new akt("toast/tutorial");
   public static final int a = 154;
   public static final int d = 1;
   public static final int e = 3;
   public static final int f = 28;
   private final fky.a h;
   private final xe i;
   @Nullable
   private final xe j;
   private fkw.a k = fkw.a.a;
   private long l;
   private float m;
   private float n;
   private final boolean o;

   public fky(fky.a $$0, xe $$1, @Nullable xe $$2, boolean $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.o = $$3;
   }

   @Override
   public fkw.a a(fia $$0, fkx $$1, long $$2) {
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
         float $$3 = aym.b(this.m, this.n, (float)($$2 - this.l) / 100.0F);
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
      this.k = fkw.a.b;
   }

   public void a(float $$0) {
      this.n = $$0;
   }

   public static enum a {
      a(new akt("toast/movement_keys")),
      b(new akt("toast/mouse")),
      c(new akt("toast/tree")),
      d(new akt("toast/recipe_book")),
      e(new akt("toast/wooden_planks")),
      f(new akt("toast/social_interactions")),
      g(new akt("toast/right_click"));

      private final akt h;

      private a(akt $$0) {
         this.h = $$0;
      }

      public void a(fia $$0, int $$1, int $$2) {
         RenderSystem.enableBlend();
         $$0.a(this.h, $$1, $$2, 20, 20);
      }
   }
}
