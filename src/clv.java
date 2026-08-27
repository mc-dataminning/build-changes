import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class clv implements bpn, bpz {
   public static final int b = 5;
   public static final int c = 36;
   private static final int m = 9;
   public static final int d = 40;
   public static final int e = -1;
   public static final int[] f = new int[]{0, 1, 2, 3};
   public static final int[] g = new int[]{3};
   public final jg<cto> h = jg.a(36, cto.i);
   public final jg<cto> i = jg.a(4, cto.i);
   public final jg<cto> j = jg.a(1, cto.i);
   private final List<jg<cto>> n = ImmutableList.of(this.h, this.i, this.j);
   public int k;
   public final clw l;
   private int o;

   public clv(clw $$0) {
      this.l = $$0;
   }

   public cto f() {
      return d(this.k) ? this.h.get(this.k) : cto.i;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cto $$0, cto $$1) {
      return !$$0.e() && cto.c($$0, $$1) && $$0.k() && $$0.I() < this.e_($$0);
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.h.size(); $$0++) {
         if (this.h.get($$0).e()) {
            return $$0;
         }
      }

      return -1;
   }

   public void b(cto $$0) {
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
      cto $$1 = this.h.get(this.k);
      this.h.set(this.k, this.h.get($$0));
      this.h.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int c(cto $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         if (!this.h.get($$1).e() && cto.c($$0, this.h.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int d(cto $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         cto $$2 = this.h.get($$1);
         if (!this.h.get($$1).e() && cto.c($$0, this.h.get($$1)) && !this.h.get($$1).m() && !$$2.B() && !$$2.b(kb.f)) {
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

   public int a(Predicate<cto> $$0, int $$1, bpn $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bpo.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bpo.a($$2, $$0, $$1 - $$3, $$4);
      cto $$5 = this.l.cc.g();
      $$3 += bpo.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.e()) {
         this.l.cc.b(cto.i);
      }

      return $$3;
   }

   private int j(cto $$0) {
      int $$1 = this.e($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.I() : this.d($$1, $$0);
   }

   private int d(int $$0, cto $$1) {
      int $$2 = $$1.I();
      cto $$3 = this.a($$0);
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

   public int e(cto $$0) {
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
      for (jg<cto> $$0 : this.n) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).e()) {
               $$0.get($$1).a(this.l.dP(), this.l, $$1, this.k == $$1);
            }
         }
      }
   }

   public boolean f(cto $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cto $$1) {
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
            $$5.a("Item ID", ctj.a($$1.g()));
            $$5.a("Item data", $$1.n());
            $$5.a("Item name", () -> $$1.x().getString());
            throw new y($$4);
         }
      }
   }

   public void g(cto $$0) {
      this.a($$0, true);
   }

   public void a(cto $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.l instanceof aqn) {
            ((aqn)this.l).d.b(new acn(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public cto a(int $$0, int $$1) {
      List<cto> $$2 = null;

      for (jg<cto> $$3 : this.n) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).e() ? bpo.a($$2, $$0, $$1) : cto.i;
   }

   public void h(cto $$0) {
      for (jg<cto> $$1 : this.n) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cto.i);
               break;
            }
         }
      }
   }

   @Override
   public cto b(int $$0) {
      jg<cto> $$1 = null;

      for (jg<cto> $$2 : this.n) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).e()) {
         cto $$3 = $$1.get($$0);
         $$1.set($$0, cto.i);
         return $$3;
      } else {
         return cto.i;
      }
   }

   @Override
   public void a(int $$0, cto $$1) {
      jg<cto> $$2 = null;

      for (jg<cto> $$3 : this.n) {
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

   public float a(drb $$0) {
      return this.h.get(this.k).a($$0);
   }

   public uj a(uj $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         if (!this.h.get($$1).e()) {
            ud $$2 = new ud();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.h.get($$1).b(this.l.dR(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.i.size(); $$3++) {
         if (!this.i.get($$3).e()) {
            ud $$4 = new ud();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.i.get($$3).b(this.l.dR(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.j.size(); $$5++) {
         if (!this.j.get($$5).e()) {
            ud $$6 = new ud();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.j.get($$5).b(this.l.dR(), $$6));
         }
      }

      return $$0;
   }

   public void b(uj $$0) {
      this.h.clear();
      this.i.clear();
      this.j.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ud $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cto $$4 = cto.a(this.l.dR(), (va)$$2).orElse(cto.i);
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
      for (cto $$0 : this.h) {
         if (!$$0.e()) {
            return false;
         }
      }

      for (cto $$1 : this.i) {
         if (!$$1.e()) {
            return false;
         }
      }

      for (cto $$2 : this.j) {
         if (!$$2.e()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cto a(int $$0) {
      List<cto> $$1 = null;

      for (jg<cto> $$2 : this.n) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cto.i : $$1.get($$0);
   }

   @Override
   public wx af() {
      return wx.c("container.inventory");
   }

   public cto e(int $$0) {
      return this.i.get($$0);
   }

   public void k() {
      for (List<cto> $$0 : this.n) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cto $$2 = $$0.get($$1);
            if (!$$2.e()) {
               this.l.a($$2, true, false);
               $$0.set($$1, cto.i);
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
   public boolean a(clw $$0) {
      return $$0.b(this.l, 4.0);
   }

   public boolean i(cto $$0) {
      for (List<cto> $$1 : this.n) {
         for (cto $$2 : $$1) {
            if (!$$2.e() && cto.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(awl<ctj> $$0) {
      for (List<cto> $$1 : this.n) {
         for (cto $$2 : $$1) {
            if (!$$2.e() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<cto> $$0) {
      for (List<cto> $$1 : this.n) {
         for (cto $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(clv $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.k = $$0.k;
   }

   @Override
   public void a() {
      for (List<cto> $$0 : this.n) {
         $$0.clear();
      }
   }

   public void a(cma $$0) {
      for (cto $$1 : this.h) {
         $$0.a($$1);
      }
   }

   public cto a(boolean $$0) {
      cto $$1 = this.f();
      return $$1.e() ? cto.i : this.a(this.k, $$0 ? $$1.I() : 1);
   }
}
