import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cfp implements bjv, bkh {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final iq<cng> i = iq.a(36, cng.f);
   public final iq<cng> j = iq.a(4, cng.f);
   public final iq<cng> k = iq.a(1, cng.f);
   private final List<iq<cng>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final cfq m;
   private int p;

   public cfp(cfq $$0) {
      this.m = $$0;
   }

   public cng f() {
      return d(this.l) ? this.i.get(this.l) : cng.f;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cng $$0, cng $$1) {
      return !$$0.b() && cng.c($$0, $$1) && $$0.h() && $$0.L() < $$0.g() && $$0.L() < this.al_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(cng $$0) {
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
      cng $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(cng $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b() && cng.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(cng $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         cng $$2 = this.i.get($$1);
         if (!this.i.get($$1).b() && cng.c($$0, this.i.get($$1)) && !this.i.get($$1).j() && !$$2.E() && !$$2.A()) {
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

   public int a(Predicate<cng> $$0, int $$1, bjv $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bjw.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bjw.a($$2, $$0, $$1 - $$3, $$4);
      cng $$5 = this.m.bW.g();
      $$3 += bjw.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.m.bW.b(cng.f);
      }

      return $$3;
   }

   private int i(cng $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.L() : this.d($$1, $$0);
   }

   private int d(int $$0, cng $$1) {
      cnb $$2 = $$1.d();
      int $$3 = $$1.L();
      cng $$4 = this.a($$0);
      if ($$4.b()) {
         $$4 = new cng($$2, 0);
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

   public int d(cng $$0) {
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
      for (iq<cng> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.m.dL(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(cng $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cng $$1) {
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
               } else if (this.m.fT().d) {
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

               if ($$1.L() == $$2 && this.m.fT().d) {
                  $$1.f(0);
                  return true;
               } else {
                  return $$1.L() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cnb.a($$1.d()));
            $$5.a("Item data", $$1.k());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new y($$4);
         }
      }
   }

   public void f(cng $$0) {
      this.a($$0, true);
   }

   public void a(cng $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof anf) {
            ((anf)this.m).c.b(new zx(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public cng a(int $$0, int $$1) {
      List<cng> $$2 = null;

      for (iq<cng> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).b() ? bjw.a($$2, $$0, $$1) : cng.f;
   }

   public void g(cng $$0) {
      for (iq<cng> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cng.f);
               break;
            }
         }
      }
   }

   @Override
   public cng b(int $$0) {
      iq<cng> $$1 = null;

      for (iq<cng> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         cng $$3 = $$1.get($$0);
         $$1.set($$0, cng.f);
         return $$3;
      } else {
         return cng.f;
      }
   }

   @Override
   public void a(int $$0, cng $$1) {
      iq<cng> $$2 = null;

      for (iq<cng> $$3 : this.o) {
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

   public float a(djp $$0) {
      return this.i.get(this.l).a($$0);
   }

   public su a(su $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b()) {
            so $$2 = new so();
            $$2.a("Slot", (byte)$$1);
            this.i.get($$1).b($$2);
            $$0.add($$2);
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).b()) {
            so $$4 = new so();
            $$4.a("Slot", (byte)($$3 + 100));
            this.j.get($$3).b($$4);
            $$0.add($$4);
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).b()) {
            so $$6 = new so();
            $$6.a("Slot", (byte)($$5 + 150));
            this.k.get($$5).b($$6);
            $$0.add($$6);
         }
      }

      return $$0;
   }

   public void b(su $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         so $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cng $$4 = cng.a($$2);
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
      for (cng $$0 : this.i) {
         if (!$$0.b()) {
            return false;
         }
      }

      for (cng $$1 : this.j) {
         if (!$$1.b()) {
            return false;
         }
      }

      for (cng $$2 : this.k) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cng a(int $$0) {
      List<cng> $$1 = null;

      for (iq<cng> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cng.f : $$1.get($$0);
   }

   @Override
   public vg ad() {
      return vg.c("container.inventory");
   }

   public cng e(int $$0) {
      return this.j.get($$0);
   }

   public void a(bkv $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for (int $$3 : $$2) {
            cng $$4 = this.j.get($$3);
            if ((!$$0.a(ask.j) || !$$4.d().v()) && $$4.d() instanceof ckr) {
               $$4.a((int)$$1, this.m, $$1x -> $$1x.d(bmd.a(bmd.a.b, $$3)));
            }
         }
      }
   }

   public void k() {
      for (List<cng> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cng $$2 = $$0.get($$1);
            if (!$$2.b()) {
               this.m.a($$2, true, false);
               $$0.set($$1, cng.f);
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
   public boolean a(cfq $$0) {
      return this.m.dG() ? false : !($$0.f(this.m) > 64.0);
   }

   public boolean h(cng $$0) {
      for (List<cng> $$1 : this.o) {
         for (cng $$2 : $$1) {
            if (!$$2.b() && cng.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(asx<cnb> $$0) {
      for (List<cng> $$1 : this.o) {
         for (cng $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<cng> $$0) {
      for (List<cng> $$1 : this.o) {
         for (cng $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cfp $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<cng> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(cfu $$0) {
      for (cng $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public cng a(boolean $$0) {
      cng $$1 = this.f();
      return $$1.b() ? cng.f : this.a(this.l, $$0 ? $$1.L() : 1);
   }
}
