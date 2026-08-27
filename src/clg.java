import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class clg implements bpf, bpr {
   public static final int b = 5;
   public static final int c = 36;
   private static final int m = 9;
   public static final int d = 40;
   public static final int e = -1;
   public static final int[] f = new int[]{0, 1, 2, 3};
   public static final int[] g = new int[]{3};
   public final jf<csz> h = jf.a(36, csz.i);
   public final jf<csz> i = jf.a(4, csz.i);
   public final jf<csz> j = jf.a(1, csz.i);
   private final List<jf<csz>> n = ImmutableList.of(this.h, this.i, this.j);
   public int k;
   public final clh l;
   private int o;

   public clg(clh $$0) {
      this.l = $$0;
   }

   public csz f() {
      return d(this.k) ? this.h.get(this.k) : csz.i;
   }

   public static int g() {
      return 9;
   }

   private boolean a(csz $$0, csz $$1) {
      return !$$0.d() && csz.c($$0, $$1) && $$0.j() && $$0.G() < this.a($$0);
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.h.size(); $$0++) {
         if (this.h.get($$0).d()) {
            return $$0;
         }
      }

      return -1;
   }

   public void b(csz $$0) {
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
      csz $$1 = this.h.get(this.k);
      this.h.set(this.k, this.h.get($$0));
      this.h.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int c(csz $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         if (!this.h.get($$1).d() && csz.c($$0, this.h.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int d(csz $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         csz $$2 = this.h.get($$1);
         if (!this.h.get($$1).d() && csz.c($$0, this.h.get($$1)) && !this.h.get($$1).l() && !$$2.A() && !$$2.b(ka.f)) {
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

   public int a(Predicate<csz> $$0, int $$1, bpf $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bpg.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bpg.a($$2, $$0, $$1 - $$3, $$4);
      csz $$5 = this.l.cc.g();
      $$3 += bpg.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.d()) {
         this.l.cc.b(csz.i);
      }

      return $$3;
   }

   private int j(csz $$0) {
      int $$1 = this.e($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.G() : this.d($$1, $$0);
   }

   private int d(int $$0, csz $$1) {
      int $$2 = $$1.G();
      csz $$3 = this.a($$0);
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

   public int e(csz $$0) {
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
      for (jf<csz> $$0 : this.n) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).d()) {
               $$0.get($$1).a(this.l.dN(), this.l, $$1, this.k == $$1);
            }
         }
      }
   }

   public boolean f(csz $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, csz $$1) {
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
               } else if (this.l.fN()) {
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

               if ($$1.G() == $$2 && this.l.fN()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.G() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", csu.a($$1.f()));
            $$5.a("Item data", $$1.m());
            $$5.a("Item name", () -> $$1.w().getString());
            throw new y($$4);
         }
      }
   }

   public void g(csz $$0) {
      this.a($$0, true);
   }

   public void a(csz $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.l instanceof aqi) {
            ((aqi)this.l).d.b(new acj(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public csz a(int $$0, int $$1) {
      List<csz> $$2 = null;

      for (jf<csz> $$3 : this.n) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).d() ? bpg.a($$2, $$0, $$1) : csz.i;
   }

   public void h(csz $$0) {
      for (jf<csz> $$1 : this.n) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, csz.i);
               break;
            }
         }
      }
   }

   @Override
   public csz b(int $$0) {
      jf<csz> $$1 = null;

      for (jf<csz> $$2 : this.n) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).d()) {
         csz $$3 = $$1.get($$0);
         $$1.set($$0, csz.i);
         return $$3;
      } else {
         return csz.i;
      }
   }

   @Override
   public void a(int $$0, csz $$1) {
      jf<csz> $$2 = null;

      for (jf<csz> $$3 : this.n) {
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

   public float a(dqh $$0) {
      return this.h.get(this.k).a($$0);
   }

   public ug a(ug $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         if (!this.h.get($$1).d()) {
            ua $$2 = new ua();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.h.get($$1).b(this.l.dP(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.i.size(); $$3++) {
         if (!this.i.get($$3).d()) {
            ua $$4 = new ua();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.i.get($$3).b(this.l.dP(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.j.size(); $$5++) {
         if (!this.j.get($$5).d()) {
            ua $$6 = new ua();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.j.get($$5).b(this.l.dP(), $$6));
         }
      }

      return $$0;
   }

   public void b(ug $$0) {
      this.h.clear();
      this.i.clear();
      this.j.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ua $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         csz $$4 = csz.a(this.l.dP(), (ux)$$2).orElse(csz.i);
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
      for (csz $$0 : this.h) {
         if (!$$0.d()) {
            return false;
         }
      }

      for (csz $$1 : this.i) {
         if (!$$1.d()) {
            return false;
         }
      }

      for (csz $$2 : this.j) {
         if (!$$2.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public csz a(int $$0) {
      List<csz> $$1 = null;

      for (jf<csz> $$2 : this.n) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? csz.i : $$1.get($$0);
   }

   @Override
   public wu ad() {
      return wu.c("container.inventory");
   }

   public csz e(int $$0) {
      return this.i.get($$0);
   }

   public void k() {
      for (List<csz> $$0 : this.n) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            csz $$2 = $$0.get($$1);
            if (!$$2.d()) {
               this.l.a($$2, true, false);
               $$0.set($$1, csz.i);
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
   public boolean a(clh $$0) {
      return $$0.b(this.l, 4.0);
   }

   public boolean i(csz $$0) {
      for (List<csz> $$1 : this.n) {
         for (csz $$2 : $$1) {
            if (!$$2.d() && csz.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(awg<csu> $$0) {
      for (List<csz> $$1 : this.n) {
         for (csz $$2 : $$1) {
            if (!$$2.d() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<csz> $$0) {
      for (List<csz> $$1 : this.n) {
         for (csz $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(clg $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.k = $$0.k;
   }

   @Override
   public void a() {
      for (List<csz> $$0 : this.n) {
         $$0.clear();
      }
   }

   public void a(cll $$0) {
      for (csz $$1 : this.h) {
         $$0.a($$1);
      }
   }

   public csz a(boolean $$0) {
      csz $$1 = this.f();
      return $$1.d() ? csz.i : this.a(this.k, $$0 ? $$1.G() : 1);
   }
}
