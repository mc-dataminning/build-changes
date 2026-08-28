import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class fre implements frc {
   private static final aku h = aku.b("toast/tutorial");
   public static final int a = 154;
   public static final int e = 1;
   public static final int f = 3;
   public static final int g = 4;
   private static final int i = 7;
   private static final int j = 3;
   private static final int k = 11;
   private static final int l = 30;
   private static final int m = 126;
   private final fre.a n;
   private final List<ayl> o;
   private frc.a p = frc.a.a;
   private long q;
   private float r;
   private float s;
   private final boolean t;
   private final int u;

   public fre(fob $$0, fre.a $$1, wo $$2, @Nullable wo $$3, boolean $$4, int $$5) {
      this.n = $$1;
      this.o = new ArrayList<>(2);
      this.o.addAll($$0.c($$2.f().b(-11534256), 126));
      if ($$3 != null) {
         this.o.addAll($$0.c($$3, 126));
      }

      this.t = $$4;
      this.u = $$5;
   }

   public fre(fob $$0, fre.a $$1, wo $$2, @Nullable wo $$3, boolean $$4) {
      this($$0, $$1, $$2, $$3, $$4, 0);
   }

   @Override
   public frc.a a() {
      return this.p;
   }

   @Override
   public void a(frd $$0, long $$1) {
      if (this.u > 0) {
         this.s = Math.min((float)$$1 / (float)this.u, 1.0F);
         this.r = this.s;
         this.q = $$1;
         if ($$1 > (long)this.u) {
            this.d();
         }
      } else if (this.t) {
         this.r = ayz.b(this.r, this.s, (float)($$1 - this.q) / 100.0F);
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
   public void a(fod $$0, fob $$1, long $$2) {
      int $$3 = this.c();
      $$0.a(gmh::H, h, 0, 0, this.b(), $$3);
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
      this.p = frc.a.b;
   }

   public void a(float $$0) {
      this.s = $$0;
   }

   public static enum a {
      a(aku.b("toast/movement_keys")),
      b(aku.b("toast/mouse")),
      c(aku.b("toast/tree")),
      d(aku.b("toast/recipe_book")),
      e(aku.b("toast/wooden_planks")),
      f(aku.b("toast/social_interactions")),
      g(aku.b("toast/right_click"));

      private final aku h;

      private a(final aku $$0) {
         this.h = $$0;
      }

      public void a(fod $$0, int $$1, int $$2) {
         $$0.a(gmh::H, this.h, $$1, $$2, 20, 20);
      }
   }
}
