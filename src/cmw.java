import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cmw implements bqn, bqz {
   public static final int b = 5;
   public static final int c = 36;
   private static final int m = 9;
   public static final int d = 40;
   public static final int e = -1;
   public static final int[] f = new int[]{0, 1, 2, 3};
   public static final int[] g = new int[]{3};
   public final jr<cup> h = jr.a(36, cup.l);
   public final jr<cup> i = jr.a(4, cup.l);
   public final jr<cup> j = jr.a(1, cup.l);
   private final List<jr<cup>> n = ImmutableList.of(this.h, this.i, this.j);
   public int k;
   public final cmx l;
   private int o;

   public cmw(cmx $$0) {
      this.l = $$0;
   }

   public cup f() {
      return d(this.k) ? this.h.get(this.k) : cup.l;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cup $$0, cup $$1) {
      return !$$0.e() && cup.c($$0, $$1) && $$0.k() && $$0.I() < this.e_($$0);
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.h.size(); $$0++) {
         if (this.h.get($$0).e()) {
            return $$0;
         }
      }

      return -1;
   }

   public void b(cup $$0) {
      int $$1 = this.c($$0);
      if (d($$1)) {
         this.k = $$1;
      } else {
         if ($$1 == -1) {
            this.k = this.i();
            if (!this.h.get(this.k).e()) {
               int $$2 = this.h();
               if ($$2 != -1) {
                  this.h.set($$2, this.h.get(this.k));
               }
            }

            this.h.set(this.k, $$0);
         } else {
            this.c($$1);
         }
      }
   }

   public void c(int $$0) {
      this.k = this.i();
      cup $$1 = this.h.get(this.k);
      this.h.set(this.k, this.h.get($$0));
      this.h.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int c(cup $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         if (!this.h.get($$1).e() && cup.c($$0, this.h.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int d(cup $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         cup $$2 = this.h.get($$1);
         if (!this.h.get($$1).e() && cup.c($$0, this.h.get($$1)) && !this.h.get($$1).m() && !$$2.B() && !$$2.b(km.g)) {
            return $$1;
         }
      }

      return -1;
   }

   public int i() {
      for (int $$0 = 0; $$0 < 9; $$0++) {
         int $$1 = (this.k + $$0) % 9;
         if (this.h.get($$1).e()) {
            return $$1;
         }
      }

      for (int $$2 = 0; $$2 < 9; $$2++) {
         int $$3 = (this.k + $$2) % 9;
         if (!this.h.get($$3).B()) {
            return $$3;
         }
      }

      return this.k;
   }

   public void a(double $$0) {
      int $$1 = (int)Math.signum($$0);
      this.k -= $$1;

      while (this.k < 0) {
         this.k += 9;
      }

      while (this.k >= 9) {
         this.k -= 9;
      }
   }

   public int a(Predicate<cup> $$0, int $$1, bqn $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bqo.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bqo.a($$2, $$0, $$1 - $$3, $$4);
      cup $$5 = this.l.cb.g();
      $$3 += bqo.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.e()) {
         this.l.cb.b(cup.l);
      }

      return $$3;
   }

   private int j(cup $$0) {
      int $$1 = this.e($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.I() : this.d($$1, $$0);
   }

   private int d(int $$0, cup $$1) {
      int $$2 = $$1.I();
      cup $$3 = this.a($$0);
      if ($$3.e()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = this.e_($$3) - $$3.I();
      int $$5 = Math.min($$2, $$4);
      if ($$5 == 0) {
         return $$2;
      } else {
         $$2 -= $$5;
         $$3.g($$5);
         $$3.d(5);
         return $$2;
      }
   }

   public int e(cup $$0) {
      if (this.a(this.a(this.k), $$0)) {
         return this.k;
      } else if (this.a(this.a(40), $$0)) {
         return 40;
      } else {
         for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
            if (this.a(this.h.get($$1), $$0)) {
               return $$1;
            }
         }

         return -1;
      }
   }

   public void j() {
      for (jr<cup> $$0 : this.n) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).e()) {
               $$0.get($$1).a(this.l.dP(), this.l, $$1, this.k == $$1);
            }
         }
      }
   }

   public boolean f(cup $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cup $$1) {
      if ($$1.e()) {
         return false;
      } else {
         try {
            if ($$1.m()) {
               if ($$0 == -1) {
                  $$0 = this.h();
               }

               if ($$0 >= 0) {
                  this.h.set($$0, $$1.f());
                  this.h.get($$0).d(5);
                  return true;
               } else if (this.l.fP()) {
                  $$1.e(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int $$2;
               do {
                  $$2 = $$1.I();
                  if ($$0 == -1) {
                     $$1.e(this.j($$1));
                  } else {
                     $$1.e(this.d($$0, $$1));
                  }
               } while (!$$1.e() && $$1.I() < $$2);

               if ($$1.I() == $$2 && this.l.fP()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.I() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cuk.a($$1.g()));
            $$5.a("Item data", $$1.n());
            $$5.a("Item name", () -> $$1.x().getString());
            throw new y($$4);
         }
      }
   }

   public void g(cup $$0) {
      this.a($$0, true);
   }

   public void a(cup $$0, boolean $$1) {
      while (!$$0.e()) {
         int $$2 = this.e($$0);
         if ($$2 == -1) {
            $$2 = this.h();
         }

         if ($$2 == -1) {
            this.l.a($$0, false);
            break;
         }

         int $$3 = $$0.j() - this.a($$2).I();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.l instanceof arg) {
            ((arg)this.l).c.b(new adf(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public cup a(int $$0, int $$1) {
      List<cup> $$2 = null;

      for (jr<cup> $$3 : this.n) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).e() ? bqo.a($$2, $$0, $$1) : cup.l;
   }

   public void h(cup $$0) {
      for (jr<cup> $$1 : this.n) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cup.l);
               break;
            }
         }
      }
   }

   @Override
   public cup b(int $$0) {
      jr<cup> $$1 = null;

      for (jr<cup> $$2 : this.n) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).e()) {
         cup $$3 = $$1.get($$0);
         $$1.set($$0, cup.l);
         return $$3;
      } else {
         return cup.l;
      }
   }

   @Override
   public void a(int $$0, cup $$1) {
      jr<cup> $$2 = null;

      for (jr<cup> $$3 : this.n) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      if ($$2 != null) {
         $$2.set($$0, $$1);
      }
   }

   public float a(dsc $$0) {
      return this.h.get(this.k).a($$0);
   }

   public uy a(uy $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         if (!this.h.get($$1).e()) {
            us $$2 = new us();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.h.get($$1).b(this.l.dR(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.i.size(); $$3++) {
         if (!this.i.get($$3).e()) {
            us $$4 = new us();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.i.get($$3).b(this.l.dR(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.j.size(); $$5++) {
         if (!this.j.get($$5).e()) {
            us $$6 = new us();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.j.get($$5).b(this.l.dR(), $$6));
         }
      }

      return $$0;
   }

   public void b(uy $$0) {
      this.h.clear();
      this.i.clear();
      this.j.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         us $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cup $$4 = cup.a(this.l.dR(), (vp)$$2).orElse(cup.l);
         if ($$3 >= 0 && $$3 < this.h.size()) {
            this.h.set($$3, $$4);
         } else if ($$3 >= 100 && $$3 < this.i.size() + 100) {
            this.i.set($$3 - 100, $$4);
         } else if ($$3 >= 150 && $$3 < this.j.size() + 150) {
            this.j.set($$3 - 150, $$4);
         }
      }
   }

   @Override
   public int b() {
      return this.h.size() + this.i.size() + this.j.size();
   }

   @Override
   public boolean c() {
      for (cup $$0 : this.h) {
         if (!$$0.e()) {
            return false;
         }
      }

      for (cup $$1 : this.i) {
         if (!$$1.e()) {
            return false;
         }
      }

      for (cup $$2 : this.j) {
         if (!$$2.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cup a(int $$0) {
      List<cup> $$1 = null;

      for (jr<cup> $$2 : this.n) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cup.l : $$1.get($$0);
   }

   @Override
   public xp af() {
      return xp.c("container.inventory");
   }

   public cup e(int $$0) {
      return this.i.get($$0);
   }

   public void k() {
      for (List<cup> $$0 : this.n) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cup $$2 = $$0.get($$1);
            if (!$$2.e()) {
               this.l.a($$2, true, false);
               $$0.set($$1, cup.l);
            }
         }
      }
   }

   @Override
   public void e() {
      this.o++;
   }

   public int l() {
      return this.o;
   }

   @Override
   public boolean a(cmx $$0) {
      return $$0.b(this.l, 4.0);
   }

   public boolean i(cup $$0) {
      for (List<cup> $$1 : this.n) {
         for (cup $$2 : $$1) {
            if (!$$2.e() && cup.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(axf<cuk> $$0) {
      for (List<cup> $$1 : this.n) {
         for (cup $$2 : $$1) {
            if (!$$2.e() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<cup> $$0) {
      for (List<cup> $$1 : this.n) {
         for (cup $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cmw $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.k = $$0.k;
   }

   @Override
   public void a() {
      for (List<cup> $$0 : this.n) {
         $$0.clear();
      }
   }

   public void a(cnb $$0) {
      for (cup $$1 : this.h) {
         $$0.a($$1);
      }
   }

   public cup a(boolean $$0) {
      cup $$1 = this.f();
      return $$1.e() ? cup.l : this.a(this.k, $$0 ? $$1.I() : 1);
   }
}
