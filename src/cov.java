import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cov implements bsc, bsm {
   public static final int b = 5;
   public static final int c = 36;
   public static final int d = 9;
   public static final int e = 40;
   public static final int f = -1;
   public final ka<cwo> g = ka.a(36, cwo.j);
   public final ka<cwo> h = ka.a(4, cwo.j);
   public final ka<cwo> i = ka.a(1, cwo.j);
   private final List<ka<cwo>> l = ImmutableList.of(this.g, this.h, this.i);
   public int j;
   public final cow k;
   private int m;

   public cov(cow $$0) {
      this.k = $$0;
   }

   public cwo f() {
      return d(this.j) ? this.g.get(this.j) : cwo.j;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cwo $$0, cwo $$1) {
      return !$$0.f() && cwo.c($$0, $$1) && $$0.l() && $$0.M() < this.e_($$0);
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.g.size(); $$0++) {
         if (this.g.get($$0).f()) {
            return $$0;
         }
      }

      return -1;
   }

   public void b(cwo $$0) {
      this.j = this.i();
      if (!this.g.get(this.j).f()) {
         int $$1 = this.h();
         if ($$1 != -1) {
            this.g.set($$1, this.g.get(this.j));
         }
      }

      this.g.set(this.j, $$0);
   }

   public void c(int $$0) {
      this.j = this.i();
      cwo $$1 = this.g.get(this.j);
      this.g.set(this.j, this.g.get($$0));
      this.g.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int c(cwo $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         if (!this.g.get($$1).f() && cwo.c($$0, this.g.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public static boolean d(cwo $$0) {
      return !$$0.n() && !$$0.F() && !$$0.b(kv.g);
   }

   public int a(jr<cwk> $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         cwo $$2 = this.g.get($$1);
         if (!$$2.f() && $$2.a($$0) && d($$2)) {
            return $$1;
         }
      }

      return -1;
   }

   public int i() {
      for (int $$0 = 0; $$0 < 9; $$0++) {
         int $$1 = (this.j + $$0) % 9;
         if (this.g.get($$1).f()) {
            return $$1;
         }
      }

      for (int $$2 = 0; $$2 < 9; $$2++) {
         int $$3 = (this.j + $$2) % 9;
         if (!this.g.get($$3).F()) {
            return $$3;
         }
      }

      return this.j;
   }

   public void e(int $$0) {
      this.j = $$0;
   }

   public int a(Predicate<cwo> $$0, int $$1, bsc $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bsd.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bsd.a($$2, $$0, $$1 - $$3, $$4);
      cwo $$5 = this.k.cd.g();
      $$3 += bsd.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.f()) {
         this.k.cd.b(cwo.j);
      }

      return $$3;
   }

   private int j(cwo $$0) {
      int $$1 = this.e($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.M() : this.d($$1, $$0);
   }

   private int d(int $$0, cwo $$1) {
      int $$2 = $$1.M();
      cwo $$3 = this.a($$0);
      if ($$3.f()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = this.e_($$3) - $$3.M();
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

   public int e(cwo $$0) {
      if (this.a(this.a(this.j), $$0)) {
         return this.j;
      } else if (this.a(this.a(40), $$0)) {
         return 40;
      } else {
         for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
            if (this.a(this.g.get($$1), $$0)) {
               return $$1;
            }
         }

         return -1;
      }
   }

   public void j() {
      for (ka<cwo> $$0 : this.l) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).f()) {
               $$0.get($$1).a(this.k.dV(), this.k, $$1, this.j == $$1);
            }
         }
      }
   }

   public boolean f(cwo $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cwo $$1) {
      if ($$1.f()) {
         return false;
      } else {
         try {
            if ($$1.n()) {
               if ($$0 == -1) {
                  $$0 = this.h();
               }

               if ($$0 >= 0) {
                  this.g.set($$0, $$1.g());
                  this.g.get($$0).d(5);
                  return true;
               } else if (this.k.fV()) {
                  $$1.e(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int $$2;
               do {
                  $$2 = $$1.M();
                  if ($$0 == -1) {
                     $$1.e(this.j($$1));
                  } else {
                     $$1.e(this.d($$0, $$1));
                  }
               } while (!$$1.f() && $$1.M() < $$2);

               if ($$1.M() == $$2 && this.k.fV()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.M() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cwk.a($$1.h()));
            $$5.a("Item data", $$1.o());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new z($$4);
         }
      }
   }

   public void g(cwo $$0) {
      this.a($$0, true);
   }

   public void a(cwo $$0, boolean $$1) {
      while (!$$0.f()) {
         int $$2 = this.e($$0);
         if ($$2 == -1) {
            $$2 = this.h();
         }

         if ($$2 == -1) {
            this.k.a($$0, false);
            break;
         }

         int $$3 = $$0.k() - this.a($$2).M();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.k instanceof are $$4) {
            $$4.f.b(this.f($$2));
         }
      }
   }

   public afe f(int $$0) {
      return new afe($$0, this.a($$0).v());
   }

   @Override
   public cwo a(int $$0, int $$1) {
      List<cwo> $$2 = null;

      for (ka<cwo> $$3 : this.l) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).f() ? bsd.a($$2, $$0, $$1) : cwo.j;
   }

   public void h(cwo $$0) {
      for (ka<cwo> $$1 : this.l) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cwo.j);
               break;
            }
         }
      }
   }

   @Override
   public cwo b(int $$0) {
      ka<cwo> $$1 = null;

      for (ka<cwo> $$2 : this.l) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).f()) {
         cwo $$3 = $$1.get($$0);
         $$1.set($$0, cwo.j);
         return $$3;
      } else {
         return cwo.j;
      }
   }

   @Override
   public void a(int $$0, cwo $$1) {
      ka<cwo> $$2 = null;

      for (ka<cwo> $$3 : this.l) {
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

   public float a(dww $$0) {
      return this.g.get(this.j).a($$0);
   }

   public tw a(tw $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         if (!this.g.get($$1).f()) {
            tq $$2 = new tq();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.g.get($$1).b(this.k.dX(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.h.size(); $$3++) {
         if (!this.h.get($$3).f()) {
            tq $$4 = new tq();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.h.get($$3).b(this.k.dX(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.i.size(); $$5++) {
         if (!this.i.get($$5).f()) {
            tq $$6 = new tq();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.i.get($$5).b(this.k.dX(), $$6));
         }
      }

      return $$0;
   }

   public void b(tw $$0) {
      this.g.clear();
      this.h.clear();
      this.i.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         tq $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cwo $$4 = cwo.a(this.k.dX(), (un)$$2).orElse(cwo.j);
         if ($$3 >= 0 && $$3 < this.g.size()) {
            this.g.set($$3, $$4);
         } else if ($$3 >= 100 && $$3 < this.h.size() + 100) {
            this.h.set($$3 - 100, $$4);
         } else if ($$3 >= 150 && $$3 < this.i.size() + 150) {
            this.i.set($$3 - 150, $$4);
         }
      }
   }

   @Override
   public int b() {
      return this.g.size() + this.h.size() + this.i.size();
   }

   @Override
   public boolean c() {
      for (cwo $$0 : this.g) {
         if (!$$0.f()) {
            return false;
         }
      }

      for (cwo $$1 : this.h) {
         if (!$$1.f()) {
            return false;
         }
      }

      for (cwo $$2 : this.i) {
         if (!$$2.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwo a(int $$0) {
      List<cwo> $$1 = null;

      for (ka<cwo> $$2 : this.l) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cwo.j : $$1.get($$0);
   }

   @Override
   public wp al() {
      return wp.c("container.inventory");
   }

   public cwo g(int $$0) {
      return this.h.get($$0);
   }

   public void k() {
      for (List<cwo> $$0 : this.l) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cwo $$2 = $$0.get($$1);
            if (!$$2.f()) {
               this.k.a($$2, true, false);
               $$0.set($$1, cwo.j);
            }
         }
      }
   }

   @Override
   public void e() {
      this.m++;
   }

   public int l() {
      return this.m;
   }

   @Override
   public boolean a(cow $$0) {
      return $$0.b(this.k, 4.0);
   }

   public boolean i(cwo $$0) {
      for (List<cwo> $$1 : this.l) {
         for (cwo $$2 : $$1) {
            if (!$$2.f() && cwo.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(axf<cwk> $$0) {
      for (List<cwo> $$1 : this.l) {
         for (cwo $$2 : $$1) {
            if (!$$2.f() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<cwo> $$0) {
      for (List<cwo> $$1 : this.l) {
         for (cwo $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cov $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.j = $$0.j;
   }

   @Override
   public void a() {
      for (List<cwo> $$0 : this.l) {
         $$0.clear();
      }
   }

   public void a(cpb $$0) {
      for (cwo $$1 : this.g) {
         $$0.a($$1);
      }
   }

   public cwo a(boolean $$0) {
      cwo $$1 = this.f();
      return $$1.f() ? cwo.j : this.a(this.j, $$0 ? $$1.M() : 1);
   }
}
