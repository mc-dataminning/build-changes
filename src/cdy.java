import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cdy implements biu, bjf {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final ip<clo> i = ip.a(36, clo.b);
   public final ip<clo> j = ip.a(4, clo.b);
   public final ip<clo> k = ip.a(1, clo.b);
   private final List<ip<clo>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final cdz m;
   private int p;

   public cdy(cdz $$0) {
      this.m = $$0;
   }

   public clo f() {
      return d(this.l) ? this.i.get(this.l) : clo.b;
   }

   public static int g() {
      return 9;
   }

   private boolean a(clo $$0, clo $$1) {
      return !$$0.b() && clo.c($$0, $$1) && $$0.h() && $$0.L() < $$0.g() && $$0.L() < this.al_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(clo $$0) {
      int $$1 = this.b($$0);
      if (d($$1)) {
         this.l = $$1;
      } else {
         if ($$1 == -1) {
            this.l = this.i();
            if (!this.i.get(this.l).b()) {
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
      clo $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(clo $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b() && clo.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(clo $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         clo $$2 = this.i.get($$1);
         if (!this.i.get($$1).b() && clo.c($$0, this.i.get($$1)) && !this.i.get($$1).j() && !$$2.E() && !$$2.A()) {
            return $$1;
         }
      }

      return -1;
   }

   public int i() {
      for (int $$0 = 0; $$0 < 9; $$0++) {
         int $$1 = (this.l + $$0) % 9;
         if (this.i.get($$1).b()) {
            return $$1;
         }
      }

      for (int $$2 = 0; $$2 < 9; $$2++) {
         int $$3 = (this.l + $$2) % 9;
         if (!this.i.get($$3).E()) {
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

   public int a(Predicate<clo> $$0, int $$1, biu $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += biv.a(this, $$0, $$1 - $$3, $$4);
      $$3 += biv.a($$2, $$0, $$1 - $$3, $$4);
      clo $$5 = this.m.bS.g();
      $$3 += biv.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.m.bS.b(clo.b);
      }

      return $$3;
   }

   private int i(clo $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.L() : this.d($$1, $$0);
   }

   private int d(int $$0, clo $$1) {
      clj $$2 = $$1.d();
      int $$3 = $$1.L();
      clo $$4 = this.a($$0);
      if ($$4.b()) {
         $$4 = new clo($$2, 0);
         if ($$1.u()) {
            $$4.c($$1.v().h());
         }

         this.a($$0, $$4);
      }

      int $$5 = $$3;
      if ($$3 > $$4.g() - $$4.L()) {
         $$5 = $$4.g() - $$4.L();
      }

      if ($$5 > this.al_() - $$4.L()) {
         $$5 = this.al_() - $$4.L();
      }

      if ($$5 == 0) {
         return $$3;
      } else {
         $$3 -= $$5;
         $$4.g($$5);
         $$4.e(5);
         return $$3;
      }
   }

   public int d(clo $$0) {
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
      for (ip<clo> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.m.dN(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(clo $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, clo $$1) {
      if ($$1.b()) {
         return false;
      } else {
         try {
            if ($$1.j()) {
               if ($$0 == -1) {
                  $$0 = this.h();
               }

               if ($$0 >= 0) {
                  this.i.set($$0, $$1.c());
                  this.i.get($$0).e(5);
                  return true;
               } else if (this.m.fU().d) {
                  $$1.f(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int $$2;
               do {
                  $$2 = $$1.L();
                  if ($$0 == -1) {
                     $$1.f(this.i($$1));
                  } else {
                     $$1.f(this.d($$0, $$1));
                  }
               } while (!$$1.b() && $$1.L() < $$2);

               if ($$1.L() == $$2 && this.m.fU().d) {
                  $$1.f(0);
                  return true;
               } else {
                  return $$1.L() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", clj.a($$1.d()));
            $$5.a("Item data", $$1.k());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new y($$4);
         }
      }
   }

   public void f(clo $$0) {
      this.a($$0, true);
   }

   public void a(clo $$0, boolean $$1) {
      while (!$$0.b()) {
         int $$2 = this.d($$0);
         if ($$2 == -1) {
            $$2 = this.h();
         }

         if ($$2 == -1) {
            this.m.a($$0, false);
            break;
         }

         int $$3 = $$0.g() - this.a($$2).L();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof amj) {
            ((amj)this.m).c.b(new zd(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public clo a(int $$0, int $$1) {
      List<clo> $$2 = null;

      for (ip<clo> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).b() ? biv.a($$2, $$0, $$1) : clo.b;
   }

   public void g(clo $$0) {
      for (ip<clo> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, clo.b);
               break;
            }
         }
      }
   }

   @Override
   public clo b(int $$0) {
      ip<clo> $$1 = null;

      for (ip<clo> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         clo $$3 = $$1.get($$0);
         $$1.set($$0, clo.b);
         return $$3;
      } else {
         return clo.b;
      }
   }

   @Override
   public void a(int $$0, clo $$1) {
      ip<clo> $$2 = null;

      for (ip<clo> $$3 : this.o) {
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

   public float a(dhn $$0) {
      return this.i.get(this.l).a($$0);
   }

   public sj a(sj $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b()) {
            sd $$2 = new sd();
            $$2.a("Slot", (byte)$$1);
            this.i.get($$1).b($$2);
            $$0.add($$2);
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).b()) {
            sd $$4 = new sd();
            $$4.a("Slot", (byte)($$3 + 100));
            this.j.get($$3).b($$4);
            $$0.add($$4);
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).b()) {
            sd $$6 = new sd();
            $$6.a("Slot", (byte)($$5 + 150));
            this.k.get($$5).b($$6);
            $$0.add($$6);
         }
      }

      return $$0;
   }

   public void b(sj $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sd $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         clo $$4 = clo.a($$2);
         if (!$$4.b()) {
            if ($$3 >= 0 && $$3 < this.i.size()) {
               this.i.set($$3, $$4);
            } else if ($$3 >= 100 && $$3 < this.j.size() + 100) {
               this.j.set($$3 - 100, $$4);
            } else if ($$3 >= 150 && $$3 < this.k.size() + 150) {
               this.k.set($$3 - 150, $$4);
            }
         }
      }
   }

   @Override
   public int b() {
      return this.i.size() + this.j.size() + this.k.size();
   }

   @Override
   public boolean aj_() {
      for (clo $$0 : this.i) {
         if (!$$0.b()) {
            return false;
         }
      }

      for (clo $$1 : this.j) {
         if (!$$1.b()) {
            return false;
         }
      }

      for (clo $$2 : this.k) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public clo a(int $$0) {
      List<clo> $$1 = null;

      for (ip<clo> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? clo.b : $$1.get($$0);
   }

   @Override
   public uv ad() {
      return uv.c("container.inventory");
   }

   public clo e(int $$0) {
      return this.j.get($$0);
   }

   public void a(bjt $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for (int $$3 : $$2) {
            clo $$4 = this.j.get($$3);
            if ((!$$0.a(arm.i) || !$$4.d().w()) && $$4.d() instanceof ciy) {
               $$4.a((int)$$1, this.m, $$1x -> $$1x.d(bla.a(bla.a.b, $$3)));
            }
         }
      }
   }

   public void k() {
      for (List<clo> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            clo $$2 = $$0.get($$1);
            if (!$$2.b()) {
               this.m.a($$2, true, false);
               $$0.set($$1, clo.b);
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
   public boolean a(cdz $$0) {
      return this.m.dI() ? false : !($$0.f(this.m) > 64.0);
   }

   public boolean h(clo $$0) {
      for (List<clo> $$1 : this.o) {
         for (clo $$2 : $$1) {
            if (!$$2.b() && clo.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(arz<clj> $$0) {
      for (List<clo> $$1 : this.o) {
         for (clo $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cdy $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<clo> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(ced $$0) {
      for (clo $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public clo a(boolean $$0) {
      clo $$1 = this.f();
      return $$1.b() ? clo.b : this.a(this.l, $$0 ? $$1.L() : 1);
   }
}
