import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cbv implements bgt, bhe {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final hp<cjh> i = hp.a(36, cjh.b);
   public final hp<cjh> j = hp.a(4, cjh.b);
   public final hp<cjh> k = hp.a(1, cjh.b);
   private final List<hp<cjh>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final cbw m;
   private int p;

   public cbv(cbw $$0) {
      this.m = $$0;
   }

   public cjh f() {
      return d(this.l) ? this.i.get(this.l) : cjh.b;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cjh $$0, cjh $$1) {
      return !$$0.b() && cjh.c($$0, $$1) && $$0.h() && $$0.L() < $$0.g() && $$0.L() < this.ag_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(cjh $$0) {
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
      cjh $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(cjh $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b() && cjh.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(cjh $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         cjh $$2 = this.i.get($$1);
         if (!this.i.get($$1).b() && cjh.c($$0, this.i.get($$1)) && !this.i.get($$1).j() && !$$2.E() && !$$2.A()) {
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

   public int a(Predicate<cjh> $$0, int $$1, bgt $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bgu.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bgu.a($$2, $$0, $$1 - $$3, $$4);
      cjh $$5 = this.m.bS.g();
      $$3 += bgu.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.m.bS.b(cjh.b);
      }

      return $$3;
   }

   private int i(cjh $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.L() : this.d($$1, $$0);
   }

   private int d(int $$0, cjh $$1) {
      cjc $$2 = $$1.d();
      int $$3 = $$1.L();
      cjh $$4 = this.a($$0);
      if ($$4.b()) {
         $$4 = new cjh($$2, 0);
         if ($$1.u()) {
            $$4.c($$1.v().h());
         }

         this.a($$0, $$4);
      }

      int $$5 = $$3;
      if ($$3 > $$4.g() - $$4.L()) {
         $$5 = $$4.g() - $$4.L();
      }

      if ($$5 > this.ag_() - $$4.L()) {
         $$5 = this.ag_() - $$4.L();
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

   public int d(cjh $$0) {
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
      for (hp<cjh> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.m.dL(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(cjh $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cjh $$1) {
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
               } else if (this.m.fS().d) {
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

               if ($$1.L() == $$2 && this.m.fS().d) {
                  $$1.f(0);
                  return true;
               } else {
                  return $$1.L() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cjc.a($$1.d()));
            $$5.a("Item data", $$1.k());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new y($$4);
         }
      }
   }

   public void f(cjh $$0) {
      this.a($$0, true);
   }

   public void a(cjh $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof akt) {
            ((akt)this.m).c.b(new xu(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public cjh a(int $$0, int $$1) {
      List<cjh> $$2 = null;

      for (hp<cjh> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).b() ? bgu.a($$2, $$0, $$1) : cjh.b;
   }

   public void g(cjh $$0) {
      for (hp<cjh> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cjh.b);
               break;
            }
         }
      }
   }

   @Override
   public cjh b(int $$0) {
      hp<cjh> $$1 = null;

      for (hp<cjh> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         cjh $$3 = $$1.get($$0);
         $$1.set($$0, cjh.b);
         return $$3;
      } else {
         return cjh.b;
      }
   }

   @Override
   public void a(int $$0, cjh $$1) {
      hp<cjh> $$2 = null;

      for (hp<cjh> $$3 : this.o) {
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

   public float a(dfl $$0) {
      return this.i.get(this.l).a($$0);
   }

   public re a(re $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b()) {
            qy $$2 = new qy();
            $$2.a("Slot", (byte)$$1);
            this.i.get($$1).b($$2);
            $$0.add($$2);
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).b()) {
            qy $$4 = new qy();
            $$4.a("Slot", (byte)($$3 + 100));
            this.j.get($$3).b($$4);
            $$0.add($$4);
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).b()) {
            qy $$6 = new qy();
            $$6.a("Slot", (byte)($$5 + 150));
            this.k.get($$5).b($$6);
            $$0.add($$6);
         }
      }

      return $$0;
   }

   public void b(re $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         qy $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cjh $$4 = cjh.a($$2);
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
   public boolean af_() {
      for (cjh $$0 : this.i) {
         if (!$$0.b()) {
            return false;
         }
      }

      for (cjh $$1 : this.j) {
         if (!$$1.b()) {
            return false;
         }
      }

      for (cjh $$2 : this.k) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cjh a(int $$0) {
      List<cjh> $$1 = null;

      for (hp<cjh> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cjh.b : $$1.get($$0);
   }

   @Override
   public tn ab() {
      return tn.c("container.inventory");
   }

   public cjh e(int $$0) {
      return this.j.get($$0);
   }

   public void a(bhq $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for (int $$3 : $$2) {
            cjh $$4 = this.j.get($$3);
            if ((!$$0.a(apw.i) || !$$4.d().w()) && $$4.d() instanceof cgr) {
               $$4.a((int)$$1, this.m, $$1x -> $$1x.d(bix.a(bix.a.b, $$3)));
            }
         }
      }
   }

   public void k() {
      for (List<cjh> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cjh $$2 = $$0.get($$1);
            if (!$$2.b()) {
               this.m.a($$2, true, false);
               $$0.set($$1, cjh.b);
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
   public boolean a(cbw $$0) {
      return this.m.dG() ? false : !($$0.f(this.m) > 64.0);
   }

   public boolean h(cjh $$0) {
      for (List<cjh> $$1 : this.o) {
         for (cjh $$2 : $$1) {
            if (!$$2.b() && cjh.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(aqj<cjc> $$0) {
      for (List<cjh> $$1 : this.o) {
         for (cjh $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cbv $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<cjh> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(cca $$0) {
      for (cjh $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public cjh a(boolean $$0) {
      cjh $$1 = this.f();
      return $$1.b() ? cjh.b : this.a(this.l, $$0 ? $$1.L() : 1);
   }
}
