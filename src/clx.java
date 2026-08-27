import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class clx implements bpt, bqf {
   public static final int b = 5;
   public static final int c = 36;
   private static final int m = 9;
   public static final int d = 40;
   public static final int e = -1;
   public static final int[] f = new int[]{0, 1, 2, 3};
   public static final int[] g = new int[]{3};
   public final jj<cuh> h = jj.a(36, cuh.i);
   public final jj<cuh> i = jj.a(4, cuh.i);
   public final jj<cuh> j = jj.a(1, cuh.i);
   private final List<jj<cuh>> n = ImmutableList.of(this.h, this.i, this.j);
   public int k;
   public final cly l;
   private int o;

   public clx(cly $$0) {
      this.l = $$0;
   }

   public cuh f() {
      return d(this.k) ? this.h.get(this.k) : cuh.i;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cuh $$0, cuh $$1) {
      return !$$0.d() && cuh.c($$0, $$1) && $$0.j() && $$0.G() < this.a($$0);
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.h.size(); $$0++) {
         if (this.h.get($$0).d()) {
            return $$0;
         }
      }

      return -1;
   }

   public void b(cuh $$0) {
      int $$1 = this.c($$0);
      if (d($$1)) {
         this.k = $$1;
      } else {
         if ($$1 == -1) {
            this.k = this.i();
            if (!this.h.get(this.k).d()) {
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
      cuh $$1 = this.h.get(this.k);
      this.h.set(this.k, this.h.get($$0));
      this.h.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int c(cuh $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         if (!this.h.get($$1).d() && cuh.c($$0, this.h.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int d(cuh $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         cuh $$2 = this.h.get($$1);
         if (!this.h.get($$1).d()
            && (cuh.c($$0, this.h.get($$1)) || $$0.a(cuk.vK) && this.h.get($$1).a(cuk.vK))
            && !this.h.get($$1).l()
            && !$$2.A()
            && !$$2.b(ke.f)) {
            return $$1;
         }
      }

      return -1;
   }

   public int i() {
      for (int $$0 = 0; $$0 < 9; $$0++) {
         int $$1 = (this.k + $$0) % 9;
         if (this.h.get($$1).d()) {
            return $$1;
         }
      }

      for (int $$2 = 0; $$2 < 9; $$2++) {
         int $$3 = (this.k + $$2) % 9;
         if (!this.h.get($$3).A()) {
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

   public int a(Predicate<cuh> $$0, int $$1, bpt $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bpu.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bpu.a($$2, $$0, $$1 - $$3, $$4);
      cuh $$5 = this.l.cq.g();
      $$3 += bpu.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.d()) {
         this.l.cq.b(cuh.i);
      }

      return $$3;
   }

   private int j(cuh $$0) {
      int $$1 = this.e($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.G() : this.d($$1, $$0);
   }

   private int d(int $$0, cuh $$1) {
      int $$2 = $$1.G();
      cuh $$3 = this.a($$0);
      if ($$3.d()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = this.a($$3) - $$3.G();
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

   public int e(cuh $$0) {
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
      int $$0 = 0;

      for (jj<cuh> $$1 : this.n) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            $$0++;
            if (!$$1.get($$2).d()) {
               $$1.get($$2).a(this.l.dU(), this.l, $$0, this.k == $$2);
            }
         }
      }
   }

   public boolean f(cuh $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cuh $$1) {
      if ($$1.d()) {
         return false;
      } else {
         try {
            if ($$1.l()) {
               if ($$0 == -1) {
                  $$0 = this.h();
               }

               if ($$0 >= 0) {
                  this.h.set($$0, $$1.e());
                  this.h.get($$0).d(5);
                  return true;
               } else if (this.l.fY()) {
                  $$1.e(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int $$2;
               do {
                  $$2 = $$1.G();
                  if ($$0 == -1) {
                     $$1.e(this.j($$1));
                  } else {
                     $$1.e(this.d($$0, $$1));
                  }
               } while (!$$1.d() && $$1.G() < $$2);

               if ($$1.G() == $$2 && this.l.fY()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.G() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cuc.a($$1.f()));
            $$5.a("Item data", $$1.m());
            $$5.a("Item name", () -> $$1.w().getString());
            throw new z($$4);
         }
      }
   }

   public void g(cuh $$0) {
      this.a($$0, true);
   }

   public void a(cuh $$0, boolean $$1) {
      while (!$$0.d()) {
         int $$2 = this.e($$0);
         if ($$2 == -1) {
            $$2 = this.h();
         }

         if ($$2 == -1) {
            this.l.a($$0, false);
            break;
         }

         int $$3 = $$0.i() - this.a($$2).G();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.l instanceof aqu) {
            ((aqu)this.l).d.b(new acu(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public cuh a(int $$0, int $$1) {
      List<cuh> $$2 = null;

      for (jj<cuh> $$3 : this.n) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).d() ? bpu.a($$2, $$0, $$1) : cuh.i;
   }

   public void h(cuh $$0) {
      for (jj<cuh> $$1 : this.n) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cuh.i);
               break;
            }
         }
      }
   }

   @Override
   public cuh b(int $$0) {
      jj<cuh> $$1 = null;

      for (jj<cuh> $$2 : this.n) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).d()) {
         cuh $$3 = $$1.get($$0);
         $$1.set($$0, cuh.i);
         return $$3;
      } else {
         return cuh.i;
      }
   }

   @Override
   public void a(int $$0, cuh $$1) {
      jj<cuh> $$2 = null;

      for (jj<cuh> $$3 : this.n) {
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

   public float a(dtc $$0) {
      return this.h.get(this.k).a($$0);
   }

   public uq a(uq $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         if (!this.h.get($$1).d()) {
            uk $$2 = new uk();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.h.get($$1).b(this.l.dY(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.i.size(); $$3++) {
         if (!this.i.get($$3).d()) {
            uk $$4 = new uk();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.i.get($$3).b(this.l.dY(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.j.size(); $$5++) {
         if (!this.j.get($$5).d()) {
            uk $$6 = new uk();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.j.get($$5).b(this.l.dY(), $$6));
         }
      }

      return $$0;
   }

   public void b(uq $$0) {
      this.h.clear();
      this.i.clear();
      this.j.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         uk $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cuh $$4 = cuh.a(this.l.dY(), (vh)$$2).orElse(cuh.i);
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
      for (cuh $$0 : this.h) {
         if (!$$0.d()) {
            return false;
         }
      }

      for (cuh $$1 : this.i) {
         if (!$$1.d()) {
            return false;
         }
      }

      for (cuh $$2 : this.j) {
         if (!$$2.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cuh a(int $$0) {
      List<cuh> $$1 = null;

      for (jj<cuh> $$2 : this.n) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cuh.i : $$1.get($$0);
   }

   @Override
   public xe af() {
      return xe.c("container.inventory");
   }

   public cuh e(int $$0) {
      return this.i.get($$0);
   }

   public void k() {
      for (List<cuh> $$0 : this.n) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cuh $$2 = $$0.get($$1);
            if (!$$2.d()) {
               this.l.a($$2, true, false);
               $$0.set($$1, cuh.i);
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
   public boolean a(cly $$0) {
      return $$0.b(this.l, 4.0);
   }

   public boolean i(cuh $$0) {
      for (List<cuh> $$1 : this.n) {
         for (cuh $$2 : $$1) {
            if (!$$2.d() && cuh.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(awt<cuc> $$0) {
      for (List<cuh> $$1 : this.n) {
         for (cuh $$2 : $$1) {
            if (!$$2.d() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean c(Predicate<cuh> $$0) {
      for (List<cuh> $$1 : this.n) {
         for (cuh $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(clx $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.k = $$0.k;
   }

   @Override
   public void a() {
      for (List<cuh> $$0 : this.n) {
         $$0.clear();
      }
   }

   public void a(cmc $$0) {
      for (cuh $$1 : this.h) {
         $$0.a($$1);
      }
   }

   public cuh a(boolean $$0) {
      cuh $$1 = this.f();
      return $$1.d() ? cuh.i : this.a(this.k, $$0 ? $$1.G() : 1);
   }
}
