import javax.annotation.Nullable;

public class fna implements fmy {
   private static final ale h = ale.b("toast/tutorial");
   public static final int a = 154;
   public static final int e = 1;
   public static final int f = 3;
   public static final int g = 28;
   private final fna.a i;
   private final xe j;
   @Nullable
   private final xe k;
   private fmy.a l = fmy.a.a;
   private long m;
   private float n;
   private float o;
   private final boolean p;
   private final int q;

   public fna(fna.a $$0, xe $$1, @Nullable xe $$2, boolean $$3, int $$4) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.p = $$3;
      this.q = $$4;
   }

   public fna(fna.a $$0, xe $$1, @Nullable xe $$2, boolean $$3) {
      this($$0, $$1, $$2, $$3, 0);
   }

   @Override
   public fmy.a a() {
      return this.l;
   }

   @Override
   public void a(fmz $$0, long $$1) {
      if (this.q > 0) {
         this.o = Math.min((float)$$1 / (float)this.q, 1.0F);
         this.n = this.o;
         this.m = $$1;
         if ($$1 > (long)this.q) {
            this.d();
         }
      } else if (this.p) {
         this.n = azf.b(this.n, this.o, (float)($$1 - this.m) / 100.0F);
         this.m = $$1;
      }
   }

   @Override
   public void a(fkb $$0, fjz $$1, long $$2) {
      $$0.a(ghv::B, h, 0, 0, this.b(), this.c());
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
      this.l = fmy.a.b;
   }

   public void a(float $$0) {
      this.o = $$0;
   }

   public static enum a {
      a(ale.b("toast/movement_keys")),
      b(ale.b("toast/mouse")),
      c(ale.b("toast/tree")),
      d(ale.b("toast/recipe_book")),
      e(ale.b("toast/wooden_planks")),
      f(ale.b("toast/social_interactions")),
      g(ale.b("toast/right_click"));

      private final ale h;

      private a(final ale $$0) {
         this.h = $$0;
      }

      public void a(fkb $$0, int $$1, int $$2) {
         $$0.a(ghv::B, this.h, $$1, $$2, 20, 20);
      }
   }
}
