import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fuf {
   private static final alz a = alz.b("advancements/title_box");
   private static final int b = 26;
   private static final int c = 0;
   private static final int d = 200;
   private static final int e = 26;
   private static final int f = 8;
   private static final int g = 5;
   private static final int h = 26;
   private static final int i = 3;
   private static final int j = 5;
   private static final int k = 32;
   private static final int l = 9;
   private static final int m = 163;
   private static final int[] n = new int[]{0, 10, -10, 25, -25};
   private final fud o;
   private final ai p;
   private final at q;
   private final azq r;
   private final int s;
   private final List<azq> t;
   private final fmf u;
   @Nullable
   private fuf v;
   private final List<fuf> w = Lists.newArrayList();
   @Nullable
   private aj x;
   private final int y;
   private final int z;

   public fuf(fud $$0, fmf $$1, ai $$2, at $$3) {
      this.o = $$0;
      this.p = $$2;
      this.q = $$3;
      this.u = $$1;
      this.r = us.a().a($$1.h.a($$3.a(), 163));
      this.y = bae.d($$3.f() * 28.0F);
      this.z = bae.d($$3.g() * 27.0F);
      int $$4 = this.e();
      int $$5 = 29 + $$1.h.a(this.r) + $$4;
      this.t = us.a().a(this.a(xy.a($$3.b().f(), ys.a.a($$3.e().a())), $$5));

      for (azq $$6 : this.t) {
         $$5 = Math.max($$5, $$1.h.a($$6));
      }

      this.s = $$5 + 3 + 5;
   }

   private int e() {
      int $$0 = this.p.a().f().a();
      if ($$0 <= 1) {
         return 0;
      } else {
         int $$1 = 8;
         xv $$2 = xv.a("advancements.progress", $$0, $$0);
         return this.u.h.a($$2) + 8;
      }
   }

   private static float a(fmp $$0, List<ya> $$1) {
      return (float)$$1.stream().mapToDouble($$0::a).max().orElse(0.0);
   }

   private List<ya> a(xv $$0, int $$1) {
      fmp $$2 = this.u.h.b();
      List<ya> $$3 = null;
      float $$4 = Float.MAX_VALUE;

      for (int $$5 : n) {
         List<ya> $$6 = $$2.b($$0, $$1 - $$5, ys.a);
         float $$7 = Math.abs(a($$2, $$6) - (float)$$1);
         if ($$7 <= 10.0F) {
            return $$6;
         }

         if ($$7 < $$4) {
            $$4 = $$7;
            $$3 = $$6;
         }
      }

      return $$3;
   }

   @Nullable
   private fuf a(ai $$0) {
      do {
         $$0 = $$0.c();
      } while ($$0 != null && $$0.a().c().isEmpty());

      return $$0 != null && !$$0.a().c().isEmpty() ? this.o.a($$0.b()) : null;
   }

   public void a(fnr $$0, int $$1, int $$2, boolean $$3) {
      if (this.v != null) {
         int $$4 = $$1 + this.v.y + 13;
         int $$5 = $$1 + this.v.y + 26 + 4;
         int $$6 = $$2 + this.v.z + 13;
         int $$7 = $$1 + this.y + 13;
         int $$8 = $$2 + this.z + 13;
         int $$9 = $$3 ? -16777216 : -1;
         if ($$3) {
            $$0.a($$5, $$4, $$6 - 1, $$9);
            $$0.a($$5 + 1, $$4, $$6, $$9);
            $$0.a($$5, $$4, $$6 + 1, $$9);
            $$0.a($$7, $$5 - 1, $$8 - 1, $$9);
            $$0.a($$7, $$5 - 1, $$8, $$9);
            $$0.a($$7, $$5 - 1, $$8 + 1, $$9);
            $$0.b($$5 - 1, $$8, $$6, $$9);
            $$0.b($$5 + 1, $$8, $$6, $$9);
         } else {
            $$0.a($$5, $$4, $$6, $$9);
            $$0.a($$7, $$5, $$8, $$9);
            $$0.b($$5, $$8, $$6, $$9);
         }
      }

      for (fuf $$10 : this.w) {
         $$10.a($$0, $$1, $$2, $$3);
      }
   }

   public void a(fnr $$0, int $$1, int $$2) {
      if (!this.q.j() || this.x != null && this.x.a()) {
         float $$3 = this.x == null ? 0.0F : this.x.c();
         fug $$4;
         if ($$3 >= 1.0F) {
            $$4 = fug.a;
         } else {
            $$4 = fug.b;
         }

         $$0.a(glu::C, $$4.a(this.q.e()), $$1 + this.y + 3, $$2 + this.z, 26, 26);
         $$0.b(this.q.c(), $$1 + this.y + 8, $$2 + this.z + 5);
      }

      for (fuf $$6 : this.w) {
         $$6.a($$0, $$1, $$2);
      }
   }

   public int a() {
      return this.s;
   }

   public void a(aj $$0) {
      this.x = $$0;
   }

   public void a(fuf $$0) {
      this.w.add($$0);
   }

   public void a(fnr $$0, int $$1, int $$2, float $$3, int $$4, int $$5) {
      boolean $$6 = $$4 + $$1 + this.y + this.s + 26 >= this.o.f().n;
      xv $$7 = this.x == null ? null : this.x.d();
      int $$8 = $$7 == null ? 0 : this.u.h.a($$7);
      boolean $$9 = 113 - $$2 - this.z - 26 <= 6 + this.t.size() * 9;
      float $$10 = this.x == null ? 0.0F : this.x.c();
      int $$11 = bae.d($$10 * (float)this.s);
      fug $$12;
      fug $$13;
      fug $$14;
      if ($$10 >= 1.0F) {
         $$11 = this.s / 2;
         $$12 = fug.a;
         $$13 = fug.a;
         $$14 = fug.a;
      } else if ($$11 < 2) {
         $$11 = this.s / 2;
         $$12 = fug.b;
         $$13 = fug.b;
         $$14 = fug.b;
      } else if ($$11 > this.s - 2) {
         $$11 = this.s / 2;
         $$12 = fug.a;
         $$13 = fug.a;
         $$14 = fug.b;
      } else {
         $$12 = fug.a;
         $$13 = fug.b;
         $$14 = fug.b;
      }

      int $$24 = this.s - $$11;
      int $$25 = $$2 + this.z;
      int $$26;
      if ($$6) {
         $$26 = $$1 + this.y - this.s + 26 + 6;
      } else {
         $$26 = $$1 + this.y;
      }

      int $$28 = 32 + this.t.size() * 9;
      if (!this.t.isEmpty()) {
         if ($$9) {
            $$0.a(glu::C, a, $$26, $$25 + 26 - $$28, this.s, $$28);
         } else {
            $$0.a(glu::C, a, $$26, $$25, this.s, $$28);
         }
      }

      $$0.a(glu::C, $$12.a(), 200, 26, 0, 0, $$26, $$25, $$11, 26);
      $$0.a(glu::C, $$13.a(), 200, 26, 200 - $$24, 0, $$26 + $$11, $$25, $$24, 26);
      $$0.a(glu::C, $$14.a(this.q.e()), $$1 + this.y + 3, $$2 + this.z, 26, 26);
      if ($$6) {
         $$0.b(this.u.h, this.r, $$26 + 5, $$2 + this.z + 9, -1);
         if ($$7 != null) {
            $$0.b(this.u.h, $$7, $$1 + this.y - $$8, $$2 + this.z + 9, -1);
         }
      } else {
         $$0.b(this.u.h, this.r, $$1 + this.y + 32, $$2 + this.z + 9, -1);
         if ($$7 != null) {
            $$0.b(this.u.h, $$7, $$1 + this.y + this.s - $$8 - 5, $$2 + this.z + 9, -1);
         }
      }

      if ($$9) {
         for (int $$29 = 0; $$29 < this.t.size(); $$29++) {
            $$0.a(this.u.h, this.t.get($$29), $$26 + 5, $$25 + 26 - $$28 + 7 + $$29 * 9, -5592406, false);
         }
      } else {
         for (int $$30 = 0; $$30 < this.t.size(); $$30++) {
            $$0.a(this.u.h, this.t.get($$30), $$26 + 5, $$2 + this.z + 9 + 17 + $$30 * 9, -5592406, false);
         }
      }

      $$0.b(this.q.c(), $$1 + this.y + 8, $$2 + this.z + 5);
   }

   public boolean a(int $$0, int $$1, int $$2, int $$3) {
      if (!this.q.j() || this.x != null && this.x.a()) {
         int $$4 = $$0 + this.y;
         int $$5 = $$4 + 26;
         int $$6 = $$1 + this.z;
         int $$7 = $$6 + 26;
         return $$2 >= $$4 && $$2 <= $$5 && $$3 >= $$6 && $$3 <= $$7;
      } else {
         return false;
      }
   }

   public void b() {
      if (this.v == null && this.p.c() != null) {
         this.v = this.a(this.p);
         if (this.v != null) {
            this.v.a(this);
         }
      }
   }

   public int c() {
      return this.z;
   }

   public int d() {
      return this.y;
   }
}
