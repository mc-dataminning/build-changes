import javax.annotation.Nullable;

public class fqq implements fqo {
   private static final alz h = alz.b("toast/tutorial");
   public static final int a = 154;
   public static final int e = 1;
   public static final int f = 3;
   public static final int g = 28;
   private final fqq.a i;
   private final xv j;
   @Nullable
   private final xv k;
   private fqo.a l = fqo.a.a;
   private long m;
   private float n;
   private float o;
   private final boolean p;
   private final int q;

   public fqq(fqq.a $$0, xv $$1, @Nullable xv $$2, boolean $$3, int $$4) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
      this.p = $$3;
      this.q = $$4;
   }

   public fqq(fqq.a $$0, xv $$1, @Nullable xv $$2, boolean $$3) {
      this($$0, $$1, $$2, $$3, 0);
   }

   @Override
   public fqo.a a() {
      return this.l;
   }

   @Override
   public void a(fqp $$0, long $$1) {
      if (this.q > 0) {
         this.o = Math.min((float)$$1 / (float)this.q, 1.0F);
         this.n = this.o;
         this.m = $$1;
         if ($$1 > (long)this.q) {
            this.d();
         }
      } else if (this.p) {
         this.n = bae.b(this.n, this.o, (float)($$1 - this.m) / 100.0F);
         this.m = $$1;
      }
   }

   @Override
   public void a(fnq $$0, fno $$1, long $$2) {
      $$0.a(glt::B, h, 0, 0, this.b(), this.c());
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
      this.l = fqo.a.b;
   }

   public void a(float $$0) {
      this.o = $$0;
   }

   public static enum a {
      a(alz.b("toast/movement_keys")),
      b(alz.b("toast/mouse")),
      c(alz.b("toast/tree")),
      d(alz.b("toast/recipe_book")),
      e(alz.b("toast/wooden_planks")),
      f(alz.b("toast/social_interactions")),
      g(alz.b("toast/right_click"));

      private final alz h;

      private a(final alz $$0) {
         this.h = $$0;
      }

      public void a(fnq $$0, int $$1, int $$2) {
         $$0.a(glt::B, this.h, $$1, $$2, 20, 20);
      }
   }
}
