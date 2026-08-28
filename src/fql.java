import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fql implements fqj {
   private static final alp h = alp.b("toast/tutorial");
   public static final int a = 154;
   public static final int e = 1;
   public static final int f = 3;
   public static final int g = 4;
   private static final int i = 7;
   private static final int j = 3;
   private static final int k = 11;
   private static final int l = 30;
   private static final int m = 126;
   private final fql.a n;
   private final List<azg> o;
   private fqj.a p = fqj.a.a;
   private long q;
   private float r;
   private float s;
   private final boolean t;
   private final int u;

   public fql(fnj $$0, fql.a $$1, xk $$2, @Nullable xk $$3, boolean $$4, int $$5) {
      this.n = $$1;
      this.o = new ArrayList<>(2);
      this.o.addAll($$0.c($$2.f().b(-11534256), 126));
      if ($$3 != null) {
         this.o.addAll($$0.c($$3, 126));
      }

      this.t = $$4;
      this.u = $$5;
   }

   public fql(fnj $$0, fql.a $$1, xk $$2, @Nullable xk $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, 0);
   }

   @Override
   public fqj.a a() {
      return this.p;
   }

   @Override
   public void a(fqk $$0, long $$1) {
      if (this.u > 0) {
         this.s = Math.min((float)$$1 / (float)this.u, 1.0F);
         this.r = this.s;
         this.q = $$1;
         if ($$1 > (long)this.u) {
            this.d();
         }
      } else if (this.t) {
         this.r = azu.b(this.r, this.s, (float)($$1 - this.q) / 100.0F);
         this.q = $$1;
      }
   }

   @Override
   public int c() {
      return 7 + this.e() + 3;
   }

   private int e() {
      return Math.max(this.o.size(), 2) * 11;
   }

   @Override
   public void a(fnl $$0, fnj $$1, long $$2) {
      int $$3 = this.c();
      $$0.a(glq::H, h, 0, 0, this.b(), $$3);
      this.n.a($$0, 6, 6);
      int $$4 = this.o.size() * 11;
      int $$5 = 7 + (this.e() - $$4) / 2;

      for (int $$6 = 0; $$6 < this.o.size(); $$6++) {
         $$0.a($$1, this.o.get($$6), 30, $$5 + $$6 * 11, -16777216, false);
      }

      if (this.t) {
         int $$7 = $$3 - 4;
         $$0.a(3, $$7, 157, $$7 + 1, -1);
         int $$8;
         if (this.s >= this.r) {
            $$8 = -16755456;
         } else {
            $$8 = -11206656;
         }

         $$0.a(3, $$7, (int)(3.0F + 154.0F * this.r), $$7 + 1, $$8);
      }
   }

   public void d() {
      this.p = fqj.a.b;
   }

   public void a(float $$0) {
      this.s = $$0;
   }

   public static enum a {
      a(alp.b("toast/movement_keys")),
      b(alp.b("toast/mouse")),
      c(alp.b("toast/tree")),
      d(alp.b("toast/recipe_book")),
      e(alp.b("toast/wooden_planks")),
      f(alp.b("toast/social_interactions")),
      g(alp.b("toast/right_click"));

      private final alp h;

      private a(final alp $$0) {
         this.h = $$0;
      }

      public void a(fnl $$0, int $$1, int $$2) {
         $$0.a(glq::H, this.h, $$1, $$2, 20, 20);
      }
   }
}
