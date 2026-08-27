import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class chz implements bme, bmq {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final iu<cpq> i = iu.a(36, cpq.h);
   public final iu<cpq> j = iu.a(4, cpq.h);
   public final iu<cpq> k = iu.a(1, cpq.h);
   private final List<iu<cpq>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final cia m;
   private int p;

   public chz(cia $$0) {
      this.m = $$0;
   }

   public cpq f() {
      return d(this.l) ? this.i.get(this.l) : cpq.h;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cpq $$0, cpq $$1) {
      return !$$0.b() && cpq.c($$0, $$1) && $$0.h() && $$0.M() < $$0.g() && $$0.M() < this.al_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(cpq $$0) {
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
      cpq $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(cpq $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b() && cpq.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(cpq $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         cpq $$2 = this.i.get($$1);
         if (!this.i.get($$1).b() && cpq.c($$0, this.i.get($$1)) && !this.i.get($$1).k() && !$$2.F() && !$$2.B()) {
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

   public int a(Predicate<cpq> $$0, int $$1, bme $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bmf.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bmf.a($$2, $$0, $$1 - $$3, $$4);
      cpq $$5 = this.m.bX.g();
      $$3 += bmf.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.m.bX.b(cpq.h);
      }

      return $$3;
   }

   private int i(cpq $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.M() : this.d($$1, $$0);
   }

   private int d(int $$0, cpq $$1) {
      int $$2 = $$1.M();
      cpq $$3 = this.a($$0);
      if ($$3.b()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = $$2;
      if ($$2 > $$3.g() - $$3.M()) {
         $$4 = $$3.g() - $$3.M();
      }

      if ($$4 > this.al_() - $$3.M()) {
         $$4 = this.al_() - $$3.M();
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

   public int d(cpq $$0) {
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
      for (iu<cpq> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.m.dJ(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(cpq $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cpq $$1) {
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
               } else if (this.m.fW().d) {
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

               if ($$1.M() == $$2 && this.m.fW().d) {
                  $$1.f(0);
                  return true;
               } else {
                  return $$1.M() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cpl.a($$1.d()));
            $$5.a("Item data", $$1.l());
            $$5.a("Item name", () -> $$1.z().getString());
            throw new y($$4);
         }
      }
   }

   public void f(cpq $$0) {
      this.a($$0, true);
   }

   public void a(cpq $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof apb) {
            ((apb)this.m).d.b(new abf(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public cpq a(int $$0, int $$1) {
      List<cpq> $$2 = null;

      for (iu<cpq> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).b() ? bmf.a($$2, $$0, $$1) : cpq.h;
   }

   public void g(cpq $$0) {
      for (iu<cpq> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cpq.h);
               break;
            }
         }
      }
   }

   @Override
   public cpq b(int $$0) {
      iu<cpq> $$1 = null;

      for (iu<cpq> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         cpq $$3 = $$1.get($$0);
         $$1.set($$0, cpq.h);
         return $$3;
      } else {
         return cpq.h;
      }
   }

   @Override
   public void a(int $$0, cpq $$1) {
      iu<cpq> $$2 = null;

      for (iu<cpq> $$3 : this.o) {
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

   public float a(dme $$0) {
      return this.i.get(this.l).a($$0);
   }

   public te a(te $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b()) {
            sy $$2 = new sy();
            $$2.a("Slot", (byte)$$1);
            this.i.get($$1).b($$2);
            $$0.add($$2);
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).b()) {
            sy $$4 = new sy();
            $$4.a("Slot", (byte)($$3 + 100));
            this.j.get($$3).b($$4);
            $$0.add($$4);
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).b()) {
            sy $$6 = new sy();
            $$6.a("Slot", (byte)($$5 + 150));
            this.k.get($$5).b($$6);
            $$0.add($$6);
         }
      }

      return $$0;
   }

   public void b(te $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sy $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cpq $$4 = cpq.a($$2);
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
      for (cpq $$0 : this.i) {
         if (!$$0.b()) {
            return false;
         }
      }

      for (cpq $$1 : this.j) {
         if (!$$1.b()) {
            return false;
         }
      }

      for (cpq $$2 : this.k) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cpq a(int $$0) {
      List<cpq> $$1 = null;

      for (iu<cpq> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cpq.h : $$1.get($$0);
   }

   @Override
   public vs ad() {
      return vs.c("container.inventory");
   }

   public cpq e(int $$0) {
      return this.j.get($$0);
   }

   public void a(bne $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for (int $$3 : $$2) {
            cpq $$4 = this.j.get($$3);
            if ((!$$0.a(aug.j) || !$$4.d().x()) && $$4.d() instanceof cnc) {
               $$4.a((int)$$1, this.m, bom.a(bom.a.b, $$3));
            }
         }
      }
   }

   public void k() {
      for (List<cpq> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cpq $$2 = $$0.get($$1);
            if (!$$2.b()) {
               this.m.a($$2, true, false);
               $$0.set($$1, cpq.h);
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
   public boolean a(cia $$0) {
      return $$0.b(this.m, 4.0);
   }

   public boolean h(cpq $$0) {
      for (List<cpq> $$1 : this.o) {
         for (cpq $$2 : $$1) {
            if (!$$2.b() && cpq.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(aut<cpl> $$0) {
      for (List<cpq> $$1 : this.o) {
         for (cpq $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<cpq> $$0) {
      for (List<cpq> $$1 : this.o) {
         for (cpq $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(chz $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<cpq> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(cie $$0) {
      for (cpq $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public cpq a(boolean $$0) {
      cpq $$1 = this.f();
      return $$1.b() ? cpq.h : this.a(this.l, $$0 ? $$1.M() : 1);
   }
}
