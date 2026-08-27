import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cjz implements bny, bok {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final iw<crs> i = iw.a(36, crs.i);
   public final iw<crs> j = iw.a(4, crs.i);
   public final iw<crs> k = iw.a(1, crs.i);
   private final List<iw<crs>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final cka m;
   private int p;

   public cjz(cka $$0) {
      this.m = $$0;
   }

   public crs f() {
      return d(this.l) ? this.i.get(this.l) : crs.i;
   }

   public static int g() {
      return 9;
   }

   private boolean a(crs $$0, crs $$1) {
      return !$$0.d() && crs.c($$0, $$1) && $$0.j() && $$0.G() < $$0.i() && $$0.G() < this.ah_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).d()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(crs $$0) {
      int $$1 = this.b($$0);
      if (d($$1)) {
         this.l = $$1;
      } else {
         if ($$1 == -1) {
            this.l = this.i();
            if (!this.i.get(this.l).d()) {
               int $$2 = this.h();
               if ($$2 != -1) {
                  this.i.set($$2, this.i.get(this.l));
               }
            }

            this.i.set(this.l, $$0);
         } else {
            this.c($$1);
         }
      }
   }

   public void c(int $$0) {
      this.l = this.i();
      crs $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(crs $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).d() && crs.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(crs $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         crs $$2 = this.i.get($$1);
         if (!this.i.get($$1).d() && crs.c($$0, this.i.get($$1)) && !this.i.get($$1).l() && !$$2.A() && !$$2.b(jr.d)) {
            return $$1;
         }
      }

      return -1;
   }

   public int i() {
      for (int $$0 = 0; $$0 < 9; $$0++) {
         int $$1 = (this.l + $$0) % 9;
         if (this.i.get($$1).d()) {
            return $$1;
         }
      }

      for (int $$2 = 0; $$2 < 9; $$2++) {
         int $$3 = (this.l + $$2) % 9;
         if (!this.i.get($$3).A()) {
            return $$3;
         }
      }

      return this.l;
   }

   public void a(double $$0) {
      int $$1 = (int)Math.signum($$0);
      this.l -= $$1;

      while (this.l < 0) {
         this.l += 9;
      }

      while (this.l >= 9) {
         this.l -= 9;
      }
   }

   public int a(Predicate<crs> $$0, int $$1, bny $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bnz.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bnz.a($$2, $$0, $$1 - $$3, $$4);
      crs $$5 = this.m.ca.g();
      $$3 += bnz.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.d()) {
         this.m.ca.b(crs.i);
      }

      return $$3;
   }

   private int i(crs $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.G() : this.d($$1, $$0);
   }

   private int d(int $$0, crs $$1) {
      int $$2 = $$1.G();
      crs $$3 = this.a($$0);
      if ($$3.d()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = $$2;
      if ($$2 > $$3.i() - $$3.G()) {
         $$4 = $$3.i() - $$3.G();
      }

      if ($$4 > this.ah_() - $$3.G()) {
         $$4 = this.ah_() - $$3.G();
      }

      if ($$4 == 0) {
         return $$2;
      } else {
         $$2 -= $$4;
         $$3.f($$4);
         $$3.d(5);
         return $$2;
      }
   }

   public int d(crs $$0) {
      if (this.a(this.a(this.l), $$0)) {
         return this.l;
      } else if (this.a(this.a(40), $$0)) {
         return 40;
      } else {
         for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
            if (this.a(this.i.get($$1), $$0)) {
               return $$1;
            }
         }

         return -1;
      }
   }

   public void j() {
      for (iw<crs> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).d()) {
               $$0.get($$1).a(this.m.dM(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(crs $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, crs $$1) {
      if ($$1.d()) {
         return false;
      } else {
         try {
            if ($$1.l()) {
               if ($$0 == -1) {
                  $$0 = this.h();
               }

               if ($$0 >= 0) {
                  this.i.set($$0, $$1.e());
                  this.i.get($$0).d(5);
                  return true;
               } else if (this.m.fM()) {
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
                     $$1.e(this.i($$1));
                  } else {
                     $$1.e(this.d($$0, $$1));
                  }
               } while (!$$1.d() && $$1.G() < $$2);

               if ($$1.G() == $$2 && this.m.fM()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.G() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", crn.a($$1.f()));
            $$5.a("Item data", $$1.m());
            $$5.a("Item name", () -> $$1.w().getString());
            throw new y($$4);
         }
      }
   }

   public void f(crs $$0) {
      this.a($$0, true);
   }

   public void a(crs $$0, boolean $$1) {
      while (!$$0.d()) {
         int $$2 = this.d($$0);
         if ($$2 == -1) {
            $$2 = this.h();
         }

         if ($$2 == -1) {
            this.m.a($$0, false);
            break;
         }

         int $$3 = $$0.i() - this.a($$2).G();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof apv) {
            ((apv)this.m).d.b(new abx(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public crs a(int $$0, int $$1) {
      List<crs> $$2 = null;

      for (iw<crs> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).d() ? bnz.a($$2, $$0, $$1) : crs.i;
   }

   public void g(crs $$0) {
      for (iw<crs> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, crs.i);
               break;
            }
         }
      }
   }

   @Override
   public crs b(int $$0) {
      iw<crs> $$1 = null;

      for (iw<crs> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).d()) {
         crs $$3 = $$1.get($$0);
         $$1.set($$0, crs.i);
         return $$3;
      } else {
         return crs.i;
      }
   }

   @Override
   public void a(int $$0, crs $$1) {
      iw<crs> $$2 = null;

      for (iw<crs> $$3 : this.o) {
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

   public float a(dpi $$0) {
      return this.i.get(this.l).a($$0);
   }

   public tu a(tu $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).d()) {
            to $$2 = new to();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.i.get($$1).b(this.m.dO(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).d()) {
            to $$4 = new to();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.j.get($$3).b(this.m.dO(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).d()) {
            to $$6 = new to();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.k.get($$5).b(this.m.dO(), $$6));
         }
      }

      return $$0;
   }

   public void b(tu $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         to $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         crs $$4 = crs.a(this.m.dO(), (ul)$$2).orElse(crs.i);
         if ($$3 >= 0 && $$3 < this.i.size()) {
            this.i.set($$3, $$4);
         } else if ($$3 >= 100 && $$3 < this.j.size() + 100) {
            this.j.set($$3 - 100, $$4);
         } else if ($$3 >= 150 && $$3 < this.k.size() + 150) {
            this.k.set($$3 - 150, $$4);
         }
      }
   }

   @Override
   public int b() {
      return this.i.size() + this.j.size() + this.k.size();
   }

   @Override
   public boolean c() {
      for (crs $$0 : this.i) {
         if (!$$0.d()) {
            return false;
         }
      }

      for (crs $$1 : this.j) {
         if (!$$1.d()) {
            return false;
         }
      }

      for (crs $$2 : this.k) {
         if (!$$2.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crs a(int $$0) {
      List<crs> $$1 = null;

      for (iw<crs> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? crs.i : $$1.get($$0);
   }

   @Override
   public wi ad() {
      return wi.c("container.inventory");
   }

   public crs e(int $$0) {
      return this.j.get($$0);
   }

   public void k() {
      for (List<crs> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            crs $$2 = $$0.get($$1);
            if (!$$2.d()) {
               this.m.a($$2, true, false);
               $$0.set($$1, crs.i);
            }
         }
      }
   }

   @Override
   public void e() {
      this.p++;
   }

   public int l() {
      return this.p;
   }

   @Override
   public boolean a(cka $$0) {
      return $$0.b(this.m, 4.0);
   }

   public boolean h(crs $$0) {
      for (List<crs> $$1 : this.o) {
         for (crs $$2 : $$1) {
            if (!$$2.d() && crs.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(avt<crn> $$0) {
      for (List<crs> $$1 : this.o) {
         for (crs $$2 : $$1) {
            if (!$$2.d() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<crs> $$0) {
      for (List<crs> $$1 : this.o) {
         for (crs $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cjz $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<crs> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(cke $$0) {
      for (crs $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public crs a(boolean $$0) {
      crs $$1 = this.f();
      return $$1.d() ? crs.i : this.a(this.l, $$0 ? $$1.G() : 1);
   }
}
