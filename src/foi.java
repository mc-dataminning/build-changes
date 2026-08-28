import javax.annotation.Nullable;

public class foi implements fog {
   private static final all h = all.b("toast/tutorial");
   public static final int a = 154;
   public static final int e = 1;
   public static final int f = 3;
   public static final int g = 28;
   private final foi.a i;
   private final xl j;
   @Nullable
   private final xl k;
   private fog.a l = fog.a.a;
   private long m;
   private float n;
   private float o;
   private final boolean p;
   private final int q;

   public foi(foi.a $$0, xl $$1, @Nullable xl $$2, boolean $$3, int $$4) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.p = $$3;
      this.q = $$4;
   }

   public foi(foi.a $$0, xl $$1, @Nullable xl $$2, boolean $$3) {
      this($$0, $$1, $$2, $$3, 0);
   }

   @Override
   public fog.a a() {
      return this.l;
   }

   @Override
   public void a(foh $$0, long $$1) {
      if (this.q > 0) {
         this.o = Math.min((float)$$1 / (float)this.q, 1.0F);
         this.n = this.o;
         this.m = $$1;
         if ($$1 > (long)this.q) {
            this.d();
         }
      } else if (this.p) {
         this.n = azn.b(this.n, this.o, (float)($$1 - this.m) / 100.0F);
         this.m = $$1;
      }
   }

   @Override
   public void a(flj $$0, flh $$1, long $$2) {
      $$0.a(gjh::B, h, 0, 0, this.b(), this.c());
      this.i.a($$0, 6, 6);
      if (this.k == null) {
         $$0.a($$1, this.j, 30, 12, -11534256, false);
      } else {
         $$0.a($$1, this.j, 30, 7, -11534256, false);
         $$0.a($$1, this.k, 30, 18, -16777216, false);
      }

      if (this.p) {
         $$0.a(3, 28, 157, 29, -1);
         int $$3;
         if (this.o >= this.n) {
            $$3 = -16755456;
         } else {
            $$3 = -11206656;
         }

         $$0.a(3, 28, (int)(3.0F + 154.0F * this.n), 29, $$3);
      }
   }

   public void d() {
      this.l = fog.a.b;
   }

   public void a(float $$0) {
      this.o = $$0;
   }

   public static enum a {
      a(all.b("toast/movement_keys")),
      b(all.b("toast/mouse")),
      c(all.b("toast/tree")),
      d(all.b("toast/recipe_book")),
      e(all.b("toast/wooden_planks")),
      f(all.b("toast/social_interactions")),
      g(all.b("toast/right_click"));

      private final all h;

      private a(final all $$0) {
         this.h = $$0;
      }

      public void a(flj $$0, int $$1, int $$2) {
         $$0.a(gjh::B, this.h, $$1, $$2, 20, 20);
      }
   }
}
