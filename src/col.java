import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class col implements brw, bsg {
   public static final int b = 5;
   public static final int c = 36;
   public static final int d = 9;
   public static final int e = 40;
   public static final int f = -1;
   public final jz<cwb> g = jz.a(36, cwb.k);
   public final jz<cwb> h = jz.a(4, cwb.k);
   public final jz<cwb> i = jz.a(1, cwb.k);
   private final List<jz<cwb>> l = ImmutableList.of(this.g, this.h, this.i);
   public int j;
   public final com k;
   private int m;

   public col(com $$0) {
      this.k = $$0;
   }

   public cwb f() {
      return d(this.j) ? this.g.get(this.j) : cwb.k;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cwb $$0, cwb $$1) {
      return !$$0.f() && cwb.c($$0, $$1) && $$0.l() && $$0.L() < this.e_($$0);
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.g.size(); $$0++) {
         if (this.g.get($$0).f()) {
            return $$0;
         }
      }

      return -1;
   }

   public void b(cwb $$0) {
      int $$1 = this.c($$0);
      if (d($$1)) {
         this.j = $$1;
      } else {
         if ($$1 == -1) {
            this.j = this.i();
            if (!this.g.get(this.j).f()) {
               int $$2 = this.h();
               if ($$2 != -1) {
                  this.g.set($$2, this.g.get(this.j));
               }
            }

            this.g.set(this.j, $$0);
         } else {
            this.c($$1);
         }
      }
   }

   public void c(int $$0) {
      this.j = this.i();
      cwb $$1 = this.g.get(this.j);
      this.g.set(this.j, this.g.get($$0));
      this.g.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int c(cwb $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         if (!this.g.get($$1).f() && cwb.c($$0, this.g.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public static boolean d(cwb $$0) {
      return !$$0.n() && !$$0.E() && !$$0.b(ku.g);
   }

   public int a(jq<cvx> $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         cwb $$2 = this.g.get($$1);
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
         if (!this.g.get($$3).E()) {
            return $$3;
         }
      }

      return this.j;
   }

   public void e(int $$0) {
      this.j = $$0;
   }

   public int a(Predicate<cwb> $$0, int $$1, brw $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += brx.a(this, $$0, $$1 - $$3, $$4);
      $$3 += brx.a($$2, $$0, $$1 - $$3, $$4);
      cwb $$5 = this.k.cd.g();
      $$3 += brx.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.f()) {
         this.k.cd.b(cwb.k);
      }

      return $$3;
   }

   private int j(cwb $$0) {
      int $$1 = this.e($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.L() : this.d($$1, $$0);
   }

   private int d(int $$0, cwb $$1) {
      int $$2 = $$1.L();
      cwb $$3 = this.a($$0);
      if ($$3.f()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = this.e_($$3) - $$3.L();
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

   public int e(cwb $$0) {
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
      for (jz<cwb> $$0 : this.l) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).f()) {
               $$0.get($$1).a(this.k.dX(), this.k, $$1, this.j == $$1);
            }
         }
      }
   }

   public boolean f(cwb $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cwb $$1) {
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
               } else if (this.k.fX()) {
                  $$1.e(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int $$2;
               do {
                  $$2 = $$1.L();
                  if ($$0 == -1) {
                     $$1.e(this.j($$1));
                  } else {
                     $$1.e(this.d($$0, $$1));
                  }
               } while (!$$1.f() && $$1.L() < $$2);

               if ($$1.L() == $$2 && this.k.fX()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.L() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cvx.a($$1.h()));
            $$5.a("Item data", $$1.o());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new z($$4);
         }
      }
   }

   public void g(cwb $$0) {
      this.a($$0, true);
   }

   public void a(cwb $$0, boolean $$1) {
      while (!$$0.f()) {
         int $$2 = this.e($$0);
         if ($$2 == -1) {
            $$2 = this.h();
         }

         if ($$2 == -1) {
            this.k.a($$0, false);
            break;
         }

         int $$3 = $$0.k() - this.a($$2).L();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.k instanceof aro $$4) {
            $$4.g.b(this.f($$2));
         }
      }
   }

   public aft f(int $$0) {
      return new aft($$0, this.a($$0).v());
   }

   @Override
   public cwb a(int $$0, int $$1) {
      List<cwb> $$2 = null;

      for (jz<cwb> $$3 : this.l) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).f() ? brx.a($$2, $$0, $$1) : cwb.k;
   }

   public void h(cwb $$0) {
      for (jz<cwb> $$1 : this.l) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cwb.k);
               break;
            }
         }
      }
   }

   @Override
   public cwb b(int $$0) {
      jz<cwb> $$1 = null;

      for (jz<cwb> $$2 : this.l) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).f()) {
         cwb $$3 = $$1.get($$0);
         $$1.set($$0, cwb.k);
         return $$3;
      } else {
         return cwb.k;
      }
   }

   @Override
   public void a(int $$0, cwb $$1) {
      jz<cwb> $$2 = null;

      for (jz<cwb> $$3 : this.l) {
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

   public float a(dvj $$0) {
      return this.g.get(this.j).a($$0);
   }

   public uq a(uq $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         if (!this.g.get($$1).f()) {
            uk $$2 = new uk();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.g.get($$1).b(this.k.dZ(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.h.size(); $$3++) {
         if (!this.h.get($$3).f()) {
            uk $$4 = new uk();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.h.get($$3).b(this.k.dZ(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.i.size(); $$5++) {
         if (!this.i.get($$5).f()) {
            uk $$6 = new uk();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.i.get($$5).b(this.k.dZ(), $$6));
         }
      }

      return $$0;
   }

   public void b(uq $$0) {
      this.g.clear();
      this.h.clear();
      this.i.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         uk $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cwb $$4 = cwb.a(this.k.dZ(), (vh)$$2).orElse(cwb.k);
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
      for (cwb $$0 : this.g) {
         if (!$$0.f()) {
            return false;
         }
      }

      for (cwb $$1 : this.h) {
         if (!$$1.f()) {
            return false;
         }
      }

      for (cwb $$2 : this.i) {
         if (!$$2.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cwb a(int $$0) {
      List<cwb> $$1 = null;

      for (jz<cwb> $$2 : this.l) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cwb.k : $$1.get($$0);
   }

   @Override
   public xi am() {
      return xi.c("container.inventory");
   }

   public cwb g(int $$0) {
      return this.h.get($$0);
   }

   public void k() {
      for (List<cwb> $$0 : this.l) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cwb $$2 = $$0.get($$1);
            if (!$$2.f()) {
               this.k.a($$2, true, false);
               $$0.set($$1, cwb.k);
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
   public boolean a(com $$0) {
      return $$0.b(this.k, 4.0);
   }

   public boolean i(cwb $$0) {
      for (List<cwb> $$1 : this.l) {
         for (cwb $$2 : $$1) {
            if (!$$2.f() && cwb.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(axq<cvx> $$0) {
      for (List<cwb> $$1 : this.l) {
         for (cwb $$2 : $$1) {
            if (!$$2.f() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<cwb> $$0) {
      for (List<cwb> $$1 : this.l) {
         for (cwb $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(col $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.j = $$0.j;
   }

   @Override
   public void a() {
      for (List<cwb> $$0 : this.l) {
         $$0.clear();
      }
   }

   public void a(cos $$0) {
      for (cwb $$1 : this.g) {
         $$0.a($$1);
      }
   }

   public cwb a(boolean $$0) {
      cwb $$1 = this.f();
      return $$1.f() ? cwb.k : this.a(this.j, $$0 ? $$1.L() : 1);
   }
}
