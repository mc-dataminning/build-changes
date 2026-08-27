import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cbl implements bgj, bgu {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final hn<cix> i = hn.a(36, cix.b);
   public final hn<cix> j = hn.a(4, cix.b);
   public final hn<cix> k = hn.a(1, cix.b);
   private final List<hn<cix>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final cbm m;
   private int p;

   public cbl(cbm $$0) {
      this.m = $$0;
   }

   public cix f() {
      return d(this.l) ? this.i.get(this.l) : cix.b;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cix $$0, cix $$1) {
      return !$$0.b() && cix.c($$0, $$1) && $$0.h() && $$0.L() < $$0.g() && $$0.L() < this.ab_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(cix $$0) {
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
      cix $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(cix $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b() && cix.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(cix $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         cix $$2 = this.i.get($$1);
         if (!this.i.get($$1).b() && cix.c($$0, this.i.get($$1)) && !this.i.get($$1).j() && !$$2.E() && !$$2.A()) {
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

   public int a(Predicate<cix> $$0, int $$1, bgj $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bgk.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bgk.a($$2, $$0, $$1 - $$3, $$4);
      cix $$5 = this.m.bQ.g();
      $$3 += bgk.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.m.bQ.b(cix.b);
      }

      return $$3;
   }

   private int i(cix $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.L() : this.d($$1, $$0);
   }

   private int d(int $$0, cix $$1) {
      cis $$2 = $$1.d();
      int $$3 = $$1.L();
      cix $$4 = this.a($$0);
      if ($$4.b()) {
         $$4 = new cix($$2, 0);
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

   public int d(cix $$0) {
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
      for (hn<cix> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.m.dK(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(cix $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cix $$1) {
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
            $$5.a("Item ID", cis.a($$1.d()));
            $$5.a("Item data", $$1.k());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new y($$4);
         }
      }
   }

   public void f(cix $$0) {
      this.a($$0, true);
   }

   public void a(cix $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof akl) {
            ((akl)this.m).c.b(new xm(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public cix a(int $$0, int $$1) {
      List<cix> $$2 = null;

      for (hn<cix> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).b() ? bgk.a($$2, $$0, $$1) : cix.b;
   }

   public void g(cix $$0) {
      for (hn<cix> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cix.b);
               break;
            }
         }
      }
   }

   @Override
   public cix b(int $$0) {
      hn<cix> $$1 = null;

      for (hn<cix> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         cix $$3 = $$1.get($$0);
         $$1.set($$0, cix.b);
         return $$3;
      } else {
         return cix.b;
      }
   }

   @Override
   public void a(int $$0, cix $$1) {
      hn<cix> $$2 = null;

      for (hn<cix> $$3 : this.o) {
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

   public float a(dez $$0) {
      return this.i.get(this.l).a($$0);
   }

   public qx a(qx $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b()) {
            qr $$2 = new qr();
            $$2.a("Slot", (byte)$$1);
            this.i.get($$1).b($$2);
            $$0.add($$2);
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).b()) {
            qr $$4 = new qr();
            $$4.a("Slot", (byte)($$3 + 100));
            this.j.get($$3).b($$4);
            $$0.add($$4);
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).b()) {
            qr $$6 = new qr();
            $$6.a("Slot", (byte)($$5 + 150));
            this.k.get($$5).b($$6);
            $$0.add($$6);
         }
      }

      return $$0;
   }

   public void b(qx $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qr $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cix $$4 = cix.a($$2);
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
      for (cix $$0 : this.i) {
         if (!$$0.b()) {
            return false;
         }
      }

      for (cix $$1 : this.j) {
         if (!$$1.b()) {
            return false;
         }
      }

      for (cix $$2 : this.k) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cix a(int $$0) {
      List<cix> $$1 = null;

      for (hn<cix> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cix.b : $$1.get($$0);
   }

   @Override
   public tf ab() {
      return tf.c("container.inventory");
   }

   public cix e(int $$0) {
      return this.j.get($$0);
   }

   public void a(bhg $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for (int $$3 : $$2) {
            cix $$4 = this.j.get($$3);
            if ((!$$0.a(apn.i) || !$$4.d().w()) && $$4.d() instanceof cgh) {
               $$4.a((int)$$1, this.m, $$1x -> $$1x.d(bin.a(bin.a.b, $$3)));
            }
         }
      }
   }

   public void k() {
      for (List<cix> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cix $$2 = $$0.get($$1);
            if (!$$2.b()) {
               this.m.a($$2, true, false);
               $$0.set($$1, cix.b);
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
   public boolean a(cbm $$0) {
      return this.m.dF() ? false : !($$0.f(this.m) > 64.0);
   }

   public boolean h(cix $$0) {
      for (List<cix> $$1 : this.o) {
         for (cix $$2 : $$1) {
            if (!$$2.b() && cix.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(aqa<cis> $$0) {
      for (List<cix> $$1 : this.o) {
         for (cix $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cbl $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<cix> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(cbq $$0) {
      for (cix $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public cix a(boolean $$0) {
      cix $$1 = this.f();
      return $$1.b() ? cix.b : this.a(this.l, $$0 ? $$1.L() : 1);
   }
}
