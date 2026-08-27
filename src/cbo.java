import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cbo implements bgm, bgx {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final hp<cja> i = hp.a(36, cja.b);
   public final hp<cja> j = hp.a(4, cja.b);
   public final hp<cja> k = hp.a(1, cja.b);
   private final List<hp<cja>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final cbp m;
   private int p;

   public cbo(cbp $$0) {
      this.m = $$0;
   }

   public cja f() {
      return d(this.l) ? this.i.get(this.l) : cja.b;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cja $$0, cja $$1) {
      return !$$0.b() && cja.c($$0, $$1) && $$0.h() && $$0.L() < $$0.g() && $$0.L() < this.ab_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(cja $$0) {
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
      cja $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(cja $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b() && cja.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(cja $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         cja $$2 = this.i.get($$1);
         if (!this.i.get($$1).b() && cja.c($$0, this.i.get($$1)) && !this.i.get($$1).j() && !$$2.E() && !$$2.A()) {
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

   public int a(Predicate<cja> $$0, int $$1, bgm $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bgn.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bgn.a($$2, $$0, $$1 - $$3, $$4);
      cja $$5 = this.m.bQ.g();
      $$3 += bgn.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.m.bQ.b(cja.b);
      }

      return $$3;
   }

   private int i(cja $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.L() : this.d($$1, $$0);
   }

   private int d(int $$0, cja $$1) {
      civ $$2 = $$1.d();
      int $$3 = $$1.L();
      cja $$4 = this.a($$0);
      if ($$4.b()) {
         $$4 = new cja($$2, 0);
         if ($$1.u()) {
            $$4.c($$1.v().h());
         }

         this.a($$0, $$4);
      }

      int $$5 = $$3;
      if ($$3 > $$4.g() - $$4.L()) {
         $$5 = $$4.g() - $$4.L();
      }

      if ($$5 > this.ab_() - $$4.L()) {
         $$5 = this.ab_() - $$4.L();
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

   public int d(cja $$0) {
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
      for (hp<cja> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.m.dK(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(cja $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cja $$1) {
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
               } else if (this.m.fR().d) {
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

               if ($$1.L() == $$2 && this.m.fR().d) {
                  $$1.f(0);
                  return true;
               } else {
                  return $$1.L() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", civ.a($$1.d()));
            $$5.a("Item data", $$1.k());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new y($$4);
         }
      }
   }

   public void f(cja $$0) {
      this.a($$0, true);
   }

   public void a(cja $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof ako) {
            ((ako)this.m).c.b(new xp(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public cja a(int $$0, int $$1) {
      List<cja> $$2 = null;

      for (hp<cja> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).b() ? bgn.a($$2, $$0, $$1) : cja.b;
   }

   public void g(cja $$0) {
      for (hp<cja> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cja.b);
               break;
            }
         }
      }
   }

   @Override
   public cja b(int $$0) {
      hp<cja> $$1 = null;

      for (hp<cja> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         cja $$3 = $$1.get($$0);
         $$1.set($$0, cja.b);
         return $$3;
      } else {
         return cja.b;
      }
   }

   @Override
   public void a(int $$0, cja $$1) {
      hp<cja> $$2 = null;

      for (hp<cja> $$3 : this.o) {
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

   public float a(dfe $$0) {
      return this.i.get(this.l).a($$0);
   }

   public ra a(ra $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b()) {
            qu $$2 = new qu();
            $$2.a("Slot", (byte)$$1);
            this.i.get($$1).b($$2);
            $$0.add($$2);
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).b()) {
            qu $$4 = new qu();
            $$4.a("Slot", (byte)($$3 + 100));
            this.j.get($$3).b($$4);
            $$0.add($$4);
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).b()) {
            qu $$6 = new qu();
            $$6.a("Slot", (byte)($$5 + 150));
            this.k.get($$5).b($$6);
            $$0.add($$6);
         }
      }

      return $$0;
   }

   public void b(ra $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qu $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cja $$4 = cja.a($$2);
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
   public boolean aa_() {
      for (cja $$0 : this.i) {
         if (!$$0.b()) {
            return false;
         }
      }

      for (cja $$1 : this.j) {
         if (!$$1.b()) {
            return false;
         }
      }

      for (cja $$2 : this.k) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cja a(int $$0) {
      List<cja> $$1 = null;

      for (hp<cja> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cja.b : $$1.get($$0);
   }

   @Override
   public ti ab() {
      return ti.c("container.inventory");
   }

   public cja e(int $$0) {
      return this.j.get($$0);
   }

   public void a(bhj $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for (int $$3 : $$2) {
            cja $$4 = this.j.get($$3);
            if ((!$$0.a(apq.i) || !$$4.d().w()) && $$4.d() instanceof cgk) {
               $$4.a((int)$$1, this.m, $$1x -> $$1x.d(biq.a(biq.a.b, $$3)));
            }
         }
      }
   }

   public void k() {
      for (List<cja> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cja $$2 = $$0.get($$1);
            if (!$$2.b()) {
               this.m.a($$2, true, false);
               $$0.set($$1, cja.b);
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
   public boolean a(cbp $$0) {
      return this.m.dF() ? false : !($$0.f(this.m) > 64.0);
   }

   public boolean h(cja $$0) {
      for (List<cja> $$1 : this.o) {
         for (cja $$2 : $$1) {
            if (!$$2.b() && cja.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(aqd<civ> $$0) {
      for (List<cja> $$1 : this.o) {
         for (cja $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cbo $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<cja> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(cbt $$0) {
      for (cja $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public cja a(boolean $$0) {
      cja $$1 = this.f();
      return $$1.b() ? cja.b : this.a(this.l, $$0 ? $$1.L() : 1);
   }
}
