import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cfh implements bju, bkf {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final iq<cmy> i = iq.a(36, cmy.f);
   public final iq<cmy> j = iq.a(4, cmy.f);
   public final iq<cmy> k = iq.a(1, cmy.f);
   private final List<iq<cmy>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final cfi m;
   private int p;

   public cfh(cfi $$0) {
      this.m = $$0;
   }

   public cmy f() {
      return d(this.l) ? this.i.get(this.l) : cmy.f;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cmy $$0, cmy $$1) {
      return !$$0.b() && cmy.c($$0, $$1) && $$0.h() && $$0.L() < $$0.g() && $$0.L() < this.ak_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(cmy $$0) {
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
      cmy $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(cmy $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b() && cmy.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(cmy $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         cmy $$2 = this.i.get($$1);
         if (!this.i.get($$1).b() && cmy.c($$0, this.i.get($$1)) && !this.i.get($$1).j() && !$$2.E() && !$$2.A()) {
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

   public int a(Predicate<cmy> $$0, int $$1, bju $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bjv.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bjv.a($$2, $$0, $$1 - $$3, $$4);
      cmy $$5 = this.m.bS.g();
      $$3 += bjv.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.m.bS.b(cmy.f);
      }

      return $$3;
   }

   private int i(cmy $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.L() : this.d($$1, $$0);
   }

   private int d(int $$0, cmy $$1) {
      cmt $$2 = $$1.d();
      int $$3 = $$1.L();
      cmy $$4 = this.a($$0);
      if ($$4.b()) {
         $$4 = new cmy($$2, 0);
         if ($$1.u()) {
            $$4.c($$1.v().h());
         }

         this.a($$0, $$4);
      }

      int $$5 = $$3;
      if ($$3 > $$4.g() - $$4.L()) {
         $$5 = $$4.g() - $$4.L();
      }

      if ($$5 > this.ak_() - $$4.L()) {
         $$5 = this.ak_() - $$4.L();
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

   public int d(cmy $$0) {
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
      for (iq<cmy> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.m.dM(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(cmy $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cmy $$1) {
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
            $$5.a("Item ID", cmt.a($$1.d()));
            $$5.a("Item data", $$1.k());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new y($$4);
         }
      }
   }

   public void f(cmy $$0) {
      this.a($$0, true);
   }

   public void a(cmy $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof ane) {
            ((ane)this.m).c.b(new zw(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public cmy a(int $$0, int $$1) {
      List<cmy> $$2 = null;

      for (iq<cmy> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).b() ? bjv.a($$2, $$0, $$1) : cmy.f;
   }

   public void g(cmy $$0) {
      for (iq<cmy> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cmy.f);
               break;
            }
         }
      }
   }

   @Override
   public cmy b(int $$0) {
      iq<cmy> $$1 = null;

      for (iq<cmy> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         cmy $$3 = $$1.get($$0);
         $$1.set($$0, cmy.f);
         return $$3;
      } else {
         return cmy.f;
      }
   }

   @Override
   public void a(int $$0, cmy $$1) {
      iq<cmy> $$2 = null;

      for (iq<cmy> $$3 : this.o) {
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

   public float a(djh $$0) {
      return this.i.get(this.l).a($$0);
   }

   public st a(st $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b()) {
            sn $$2 = new sn();
            $$2.a("Slot", (byte)$$1);
            this.i.get($$1).b($$2);
            $$0.add($$2);
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).b()) {
            sn $$4 = new sn();
            $$4.a("Slot", (byte)($$3 + 100));
            this.j.get($$3).b($$4);
            $$0.add($$4);
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).b()) {
            sn $$6 = new sn();
            $$6.a("Slot", (byte)($$5 + 150));
            this.k.get($$5).b($$6);
            $$0.add($$6);
         }
      }

      return $$0;
   }

   public void b(st $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         sn $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cmy $$4 = cmy.a($$2);
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
      for (cmy $$0 : this.i) {
         if (!$$0.b()) {
            return false;
         }
      }

      for (cmy $$1 : this.j) {
         if (!$$1.b()) {
            return false;
         }
      }

      for (cmy $$2 : this.k) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmy a(int $$0) {
      List<cmy> $$1 = null;

      for (iq<cmy> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cmy.f : $$1.get($$0);
   }

   @Override
   public vf ad() {
      return vf.c("container.inventory");
   }

   public cmy e(int $$0) {
      return this.j.get($$0);
   }

   public void a(bkt $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for (int $$3 : $$2) {
            cmy $$4 = this.j.get($$3);
            if ((!$$0.a(asj.j) || !$$4.d().w()) && $$4.d() instanceof cki) {
               $$4.a((int)$$1, this.m, $$1x -> $$1x.d(bma.a(bma.a.b, $$3)));
            }
         }
      }
   }

   public void k() {
      for (List<cmy> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cmy $$2 = $$0.get($$1);
            if (!$$2.b()) {
               this.m.a($$2, true, false);
               $$0.set($$1, cmy.f);
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
   public boolean a(cfi $$0) {
      return this.m.dH() ? false : !($$0.f(this.m) > 64.0);
   }

   public boolean h(cmy $$0) {
      for (List<cmy> $$1 : this.o) {
         for (cmy $$2 : $$1) {
            if (!$$2.b() && cmy.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(asw<cmt> $$0) {
      for (List<cmy> $$1 : this.o) {
         for (cmy $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cfh $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<cmy> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(cfm $$0) {
      for (cmy $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public cmy a(boolean $$0) {
      cmy $$1 = this.f();
      return $$1.b() ? cmy.f : this.a(this.l, $$0 ? $$1.L() : 1);
   }
}
