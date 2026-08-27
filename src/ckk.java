import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class ckk implements boj, bov {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final je<csd> i = je.a(36, csd.i);
   public final je<csd> j = je.a(4, csd.i);
   public final je<csd> k = je.a(1, csd.i);
   private final List<je<csd>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final ckl m;
   private int p;

   public ckk(ckl $$0) {
      this.m = $$0;
   }

   public csd f() {
      return d(this.l) ? this.i.get(this.l) : csd.i;
   }

   public static int g() {
      return 9;
   }

   private boolean a(csd $$0, csd $$1) {
      return !$$0.d() && csd.c($$0, $$1) && $$0.j() && $$0.G() < $$0.i() && $$0.G() < this.ah_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).d()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(csd $$0) {
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
      csd $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(csd $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).d() && csd.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(csd $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         csd $$2 = this.i.get($$1);
         if (!this.i.get($$1).d() && csd.c($$0, this.i.get($$1)) && !this.i.get($$1).l() && !$$2.A() && !$$2.b(jz.d)) {
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

   public int a(Predicate<csd> $$0, int $$1, boj $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bok.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bok.a($$2, $$0, $$1 - $$3, $$4);
      csd $$5 = this.m.cc.g();
      $$3 += bok.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.d()) {
         this.m.cc.b(csd.i);
      }

      return $$3;
   }

   private int i(csd $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.G() : this.d($$1, $$0);
   }

   private int d(int $$0, csd $$1) {
      int $$2 = $$1.G();
      csd $$3 = this.a($$0);
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

   public int d(csd $$0) {
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
      for (je<csd> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).d()) {
               $$0.get($$1).a(this.m.dN(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(csd $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, csd $$1) {
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
               } else if (this.m.fN()) {
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

               if ($$1.G() == $$2 && this.m.fN()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.G() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cry.a($$1.f()));
            $$5.a("Item data", $$1.m());
            $$5.a("Item name", () -> $$1.w().getString());
            throw new y($$4);
         }
      }
   }

   public void f(csd $$0) {
      this.a($$0, true);
   }

   public void a(csd $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof aqf) {
            ((aqf)this.m).d.b(new ach(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public csd a(int $$0, int $$1) {
      List<csd> $$2 = null;

      for (je<csd> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).d() ? bok.a($$2, $$0, $$1) : csd.i;
   }

   public void g(csd $$0) {
      for (je<csd> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, csd.i);
               break;
            }
         }
      }
   }

   @Override
   public csd b(int $$0) {
      je<csd> $$1 = null;

      for (je<csd> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).d()) {
         csd $$3 = $$1.get($$0);
         $$1.set($$0, csd.i);
         return $$3;
      } else {
         return csd.i;
      }
   }

   @Override
   public void a(int $$0, csd $$1) {
      je<csd> $$2 = null;

      for (je<csd> $$3 : this.o) {
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

   public float a(dpy $$0) {
      return this.i.get(this.l).a($$0);
   }

   public ue a(ue $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).d()) {
            ty $$2 = new ty();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.i.get($$1).b(this.m.dP(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).d()) {
            ty $$4 = new ty();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.j.get($$3).b(this.m.dP(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).d()) {
            ty $$6 = new ty();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.k.get($$5).b(this.m.dP(), $$6));
         }
      }

      return $$0;
   }

   public void b(ue $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ty $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         csd $$4 = csd.a(this.m.dP(), (uv)$$2).orElse(csd.i);
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
      for (csd $$0 : this.i) {
         if (!$$0.d()) {
            return false;
         }
      }

      for (csd $$1 : this.j) {
         if (!$$1.d()) {
            return false;
         }
      }

      for (csd $$2 : this.k) {
         if (!$$2.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public csd a(int $$0) {
      List<csd> $$1 = null;

      for (je<csd> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? csd.i : $$1.get($$0);
   }

   @Override
   public ws ad() {
      return ws.c("container.inventory");
   }

   public csd e(int $$0) {
      return this.j.get($$0);
   }

   public void k() {
      for (List<csd> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            csd $$2 = $$0.get($$1);
            if (!$$2.d()) {
               this.m.a($$2, true, false);
               $$0.set($$1, csd.i);
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
   public boolean a(ckl $$0) {
      return $$0.b(this.m, 4.0);
   }

   public boolean h(csd $$0) {
      for (List<csd> $$1 : this.o) {
         for (csd $$2 : $$1) {
            if (!$$2.d() && csd.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(awd<cry> $$0) {
      for (List<csd> $$1 : this.o) {
         for (csd $$2 : $$1) {
            if (!$$2.d() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<csd> $$0) {
      for (List<csd> $$1 : this.o) {
         for (csd $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(ckk $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<csd> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(ckp $$0) {
      for (csd $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public csd a(boolean $$0) {
      csd $$1 = this.f();
      return $$1.d() ? csd.i : this.a(this.l, $$0 ? $$1.G() : 1);
   }
}
