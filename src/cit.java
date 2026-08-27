import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cit implements bmw, bni {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final iu<cqm> i = iu.a(36, cqm.h);
   public final iu<cqm> j = iu.a(4, cqm.h);
   public final iu<cqm> k = iu.a(1, cqm.h);
   private final List<iu<cqm>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final ciu m;
   private int p;

   public cit(ciu $$0) {
      this.m = $$0;
   }

   public cqm f() {
      return d(this.l) ? this.i.get(this.l) : cqm.h;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cqm $$0, cqm $$1) {
      return !$$0.b() && cqm.c($$0, $$1) && $$0.h() && $$0.M() < $$0.g() && $$0.M() < this.ak_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(cqm $$0) {
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
      cqm $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(cqm $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b() && cqm.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(cqm $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         cqm $$2 = this.i.get($$1);
         if (!this.i.get($$1).b() && cqm.c($$0, this.i.get($$1)) && !this.i.get($$1).k() && !$$2.F() && !$$2.B()) {
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
         if (!this.i.get($$3).F()) {
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

   public int a(Predicate<cqm> $$0, int $$1, bmw $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bmx.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bmx.a($$2, $$0, $$1 - $$3, $$4);
      cqm $$5 = this.m.bZ.g();
      $$3 += bmx.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.m.bZ.b(cqm.h);
      }

      return $$3;
   }

   private int i(cqm $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.M() : this.d($$1, $$0);
   }

   private int d(int $$0, cqm $$1) {
      int $$2 = $$1.M();
      cqm $$3 = this.a($$0);
      if ($$3.b()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = $$2;
      if ($$2 > $$3.g() - $$3.M()) {
         $$4 = $$3.g() - $$3.M();
      }

      if ($$4 > this.ak_() - $$3.M()) {
         $$4 = this.ak_() - $$3.M();
      }

      if ($$4 == 0) {
         return $$2;
      } else {
         $$2 -= $$4;
         $$3.g($$4);
         $$3.e(5);
         return $$2;
      }
   }

   public int d(cqm $$0) {
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
      for (iu<cqm> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.m.dM(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(cqm $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cqm $$1) {
      if ($$1.b()) {
         return false;
      } else {
         try {
            if ($$1.k()) {
               if ($$0 == -1) {
                  $$0 = this.h();
               }

               if ($$0 >= 0) {
                  this.i.set($$0, $$1.c());
                  this.i.get($$0).e(5);
                  return true;
               } else if (this.m.fM()) {
                  $$1.f(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int $$2;
               do {
                  $$2 = $$1.M();
                  if ($$0 == -1) {
                     $$1.f(this.i($$1));
                  } else {
                     $$1.f(this.d($$0, $$1));
                  }
               } while (!$$1.b() && $$1.M() < $$2);

               if ($$1.M() == $$2 && this.m.fM()) {
                  $$1.f(0);
                  return true;
               } else {
                  return $$1.M() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cqh.a($$1.d()));
            $$5.a("Item data", $$1.l());
            $$5.a("Item name", () -> $$1.z().getString());
            throw new y($$4);
         }
      }
   }

   public void f(cqm $$0) {
      this.a($$0, true);
   }

   public void a(cqm $$0, boolean $$1) {
      while (!$$0.b()) {
         int $$2 = this.d($$0);
         if ($$2 == -1) {
            $$2 = this.h();
         }

         if ($$2 == -1) {
            this.m.a($$0, false);
            break;
         }

         int $$3 = $$0.g() - this.a($$2).M();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof apg) {
            ((apg)this.m).d.b(new abj(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public cqm a(int $$0, int $$1) {
      List<cqm> $$2 = null;

      for (iu<cqm> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).b() ? bmx.a($$2, $$0, $$1) : cqm.h;
   }

   public void g(cqm $$0) {
      for (iu<cqm> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cqm.h);
               break;
            }
         }
      }
   }

   @Override
   public cqm b(int $$0) {
      iu<cqm> $$1 = null;

      for (iu<cqm> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         cqm $$3 = $$1.get($$0);
         $$1.set($$0, cqm.h);
         return $$3;
      } else {
         return cqm.h;
      }
   }

   @Override
   public void a(int $$0, cqm $$1) {
      iu<cqm> $$2 = null;

      for (iu<cqm> $$3 : this.o) {
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

   public float a(dnb $$0) {
      return this.i.get(this.l).a($$0);
   }

   public tg a(tg $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b()) {
            ta $$2 = new ta();
            $$2.a("Slot", (byte)$$1);
            this.i.get($$1).b($$2);
            $$0.add($$2);
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).b()) {
            ta $$4 = new ta();
            $$4.a("Slot", (byte)($$3 + 100));
            this.j.get($$3).b($$4);
            $$0.add($$4);
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).b()) {
            ta $$6 = new ta();
            $$6.a("Slot", (byte)($$5 + 150));
            this.k.get($$5).b($$6);
            $$0.add($$6);
         }
      }

      return $$0;
   }

   public void b(tg $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ta $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cqm $$4 = cqm.a($$2);
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
   public boolean ai_() {
      for (cqm $$0 : this.i) {
         if (!$$0.b()) {
            return false;
         }
      }

      for (cqm $$1 : this.j) {
         if (!$$1.b()) {
            return false;
         }
      }

      for (cqm $$2 : this.k) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cqm a(int $$0) {
      List<cqm> $$1 = null;

      for (iu<cqm> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cqm.h : $$1.get($$0);
   }

   @Override
   public vu ad() {
      return vu.c("container.inventory");
   }

   public cqm e(int $$0) {
      return this.j.get($$0);
   }

   public void a(bnw $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for (int $$3 : $$2) {
            cqm $$4 = this.j.get($$3);
            if ((!$$0.a(aup.j) || !$$4.d().x()) && $$4.d() instanceof cny) {
               $$4.a((int)$$1, this.m, bpe.a(bpe.a.b, $$3));
            }
         }
      }
   }

   public void k() {
      for (List<cqm> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cqm $$2 = $$0.get($$1);
            if (!$$2.b()) {
               this.m.a($$2, true, false);
               $$0.set($$1, cqm.h);
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
   public boolean a(ciu $$0) {
      return $$0.b(this.m, 4.0);
   }

   public boolean h(cqm $$0) {
      for (List<cqm> $$1 : this.o) {
         for (cqm $$2 : $$1) {
            if (!$$2.b() && cqm.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(avd<cqh> $$0) {
      for (List<cqm> $$1 : this.o) {
         for (cqm $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<cqm> $$0) {
      for (List<cqm> $$1 : this.o) {
         for (cqm $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cit $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<cqm> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(ciy $$0) {
      for (cqm $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public cqm a(boolean $$0) {
      cqm $$1 = this.f();
      return $$1.b() ? cqm.h : this.a(this.l, $$0 ? $$1.M() : 1);
   }
}
