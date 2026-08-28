import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fjq implements fjo {
   private static final alf g = new alf("toast/tutorial");
   public static final int a = 154;
   public static final int d = 1;
   public static final int e = 3;
   public static final int f = 28;
   private final fjq.a h;
   private final xp i;
   @Nullable
   private final xp j;
   private fjo.a k = fjo.a.a;
   private long l;
   private float m;
   private float n;
   private final boolean o;

   public fjq(fjq.a $$0, xp $$1, @Nullable xp $$2, boolean $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.o = $$3;
   }

   @Override
   public fjo.a a(fgs $$0, fjp $$1, long $$2) {
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
         float $$3 = ayz.b(this.m, this.n, (float)($$2 - this.l) / 100.0F);
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
      this.k = fjo.a.b;
   }

   public void a(float $$0) {
      this.n = $$0;
   }

   public static enum a {
      a(new alf("toast/movement_keys")),
      b(new alf("toast/mouse")),
      c(new alf("toast/tree")),
      d(new alf("toast/recipe_book")),
      e(new alf("toast/wooden_planks")),
      f(new alf("toast/social_interactions")),
      g(new alf("toast/right_click"));

      private final alf h;

      private a(final alf $$0) {
         this.h = $$0;
      }

      public void a(fgs $$0, int $$1, int $$2) {
         RenderSystem.enableBlend();
         $$0.a(this.h, $$1, $$2, 20, 20);
      }
   }
}
