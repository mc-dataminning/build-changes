import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cqx implements btu, bue {
   public static final int b = 5;
   public static final int c = 36;
   public static final int d = 9;
   public static final int e = 40;
   public static final int f = -1;
   public final jn<cyy> g = jn.a(36, cyy.k);
   public final jn<cyy> h = jn.a(4, cyy.k);
   public final jn<cyy> i = jn.a(1, cyy.k);
   private final List<jn<cyy>> l = ImmutableList.of(this.g, this.h, this.i);
   public int j;
   public final cqy k;
   private int m;

   public cqx(cqy $$0) {
      this.k = $$0;
   }

   public cyy f() {
      return d(this.j) ? this.g.get(this.j) : cyy.k;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cyy $$0, cyy $$1) {
      return !$$0.f() && cyy.c($$0, $$1) && $$0.l() && $$0.M() < this.f_($$0);
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.g.size(); $$0++) {
         if (this.g.get($$0).f()) {
            return $$0;
         }
      }

      return -1;
   }

   public void b(cyy $$0) {
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
      cyy $$1 = this.g.get(this.j);
      this.g.set(this.j, this.g.get($$0));
      this.g.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int c(cyy $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         if (!this.g.get($$1).f() && cyy.c($$0, this.g.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public static boolean d(cyy $$0) {
      return !$$0.n() && !$$0.F() && !$$0.c(kj.g);
   }

   public int a(je<cyu> $$0, cyy $$1) {
      for (int $$2 = 0; $$2 < this.g.size(); $$2++) {
         cyy $$3 = this.g.get($$2);
         if (!$$3.f() && $$3.a($$0) && d($$3) && ($$1.f() || cyy.c($$1, $$3))) {
            return $$2;
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

   public int a(Predicate<cyy> $$0, int $$1, btu $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += btv.a(this, $$0, $$1 - $$3, $$4);
      $$3 += btv.a($$2, $$0, $$1 - $$3, $$4);
      cyy $$5 = this.k.bQ.g();
      $$3 += btv.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.f()) {
         this.k.bQ.b(cyy.k);
      }

      return $$3;
   }

   private int j(cyy $$0) {
      int $$1 = this.e($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.M() : this.d($$1, $$0);
   }

   private int d(int $$0, cyy $$1) {
      int $$2 = $$1.M();
      cyy $$3 = this.a($$0);
      if ($$3.f()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = this.f_($$3) - $$3.M();
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

   public int e(cyy $$0) {
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
      for (jn<cyy> $$0 : this.l) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).f()) {
               $$0.get($$1).a(this.k.dV(), this.k, $$1, this.j == $$1);
            }
         }
      }
   }

   public boolean f(cyy $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cyy $$1) {
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
               } else if (this.k.fU()) {
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

               if ($$1.M() == $$2 && this.k.fU()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.M() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cyu.a($$1.h()));
            $$5.a("Item data", $$1.o());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new z($$4);
         }
      }
   }

   public void g(cyy $$0) {
      this.a($$0, true);
   }

   public void a(cyy $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.k instanceof arr $$4) {
            $$4.f.b(this.f($$2));
         }
      }
   }

   public afm f(int $$0) {
      return new afm($$0, this.a($$0).v());
   }

   @Override
   public cyy a(int $$0, int $$1) {
      List<cyy> $$2 = null;

      for (jn<cyy> $$3 : this.l) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).f() ? btv.a($$2, $$0, $$1) : cyy.k;
   }

   public void h(cyy $$0) {
      for (jn<cyy> $$1 : this.l) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cyy.k);
               break;
            }
         }
      }
   }

   @Override
   public cyy b(int $$0) {
      jn<cyy> $$1 = null;

      for (jn<cyy> $$2 : this.l) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).f()) {
         cyy $$3 = $$1.get($$0);
         $$1.set($$0, cyy.k);
         return $$3;
      } else {
         return cyy.k;
      }
   }

   @Override
   public void a(int $$0, cyy $$1) {
      jn<cyy> $$2 = null;

      for (jn<cyy> $$3 : this.l) {
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

   public float a(dzz $$0) {
      return this.g.get(this.j).a($$0);
   }

   public uf a(uf $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         if (!this.g.get($$1).f()) {
            tz $$2 = new tz();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.g.get($$1).b(this.k.dX(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.h.size(); $$3++) {
         if (!this.h.get($$3).f()) {
            tz $$4 = new tz();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.h.get($$3).b(this.k.dX(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.i.size(); $$5++) {
         if (!this.i.get($$5).f()) {
            tz $$6 = new tz();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.i.get($$5).b(this.k.dX(), $$6));
         }
      }

      return $$0;
   }

   public void b(uf $$0) {
      this.g.clear();
      this.h.clear();
      this.i.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         tz $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cyy $$4 = cyy.a(this.k.dX(), (uw)$$2).orElse(cyy.k);
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
      for (cyy $$0 : this.g) {
         if (!$$0.f()) {
            return false;
         }
      }

      for (cyy $$1 : this.h) {
         if (!$$1.f()) {
            return false;
         }
      }

      for (cyy $$2 : this.i) {
         if (!$$2.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cyy a(int $$0) {
      List<cyy> $$1 = null;

      for (jn<cyy> $$2 : this.l) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cyy.k : $$1.get($$0);
   }

   @Override
   public wy al() {
      return wy.c("container.inventory");
   }

   public cyy g(int $$0) {
      return this.h.get($$0);
   }

   public void k() {
      for (List<cyy> $$0 : this.l) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cyy $$2 = $$0.get($$1);
            if (!$$2.f()) {
               this.k.a($$2, true, false);
               $$0.set($$1, cyy.k);
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
   public boolean a(cqy $$0) {
      return $$0.b(this.k, 4.0);
   }

   public boolean i(cyy $$0) {
      for (List<cyy> $$1 : this.l) {
         for (cyy $$2 : $$1) {
            if (!$$2.f() && cyy.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(axr<cyu> $$0) {
      for (List<cyy> $$1 : this.l) {
         for (cyy $$2 : $$1) {
            if (!$$2.f() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<cyy> $$0) {
      for (List<cyy> $$1 : this.l) {
         for (cyy $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cqx $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.j = $$0.j;
   }

   @Override
   public void a() {
      for (List<cyy> $$0 : this.l) {
         $$0.clear();
      }
   }

   public void a(crd $$0) {
      for (cyy $$1 : this.g) {
         $$0.a($$1);
      }
   }

   public cyy a(boolean $$0) {
      cyy $$1 = this.f();
      return $$1.f() ? cyy.k : this.a(this.j, $$0 ? $$1.M() : 1);
   }
}
