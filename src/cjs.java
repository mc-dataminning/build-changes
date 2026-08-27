import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cjs implements bnt, bof {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final iu<crj> i = iu.a(36, crj.i);
   public final iu<crj> j = iu.a(4, crj.i);
   public final iu<crj> k = iu.a(1, crj.i);
   private final List<iu<crj>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final cjt m;
   private int p;

   public cjs(cjt $$0) {
      this.m = $$0;
   }

   public crj f() {
      return d(this.l) ? this.i.get(this.l) : crj.i;
   }

   public static int g() {
      return 9;
   }

   private boolean a(crj $$0, crj $$1) {
      return !$$0.d() && crj.c($$0, $$1) && $$0.j() && $$0.G() < $$0.i() && $$0.G() < this.aj_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).d()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(crj $$0) {
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
      crj $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(crj $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).d() && crj.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(crj $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         crj $$2 = this.i.get($$1);
         if (!this.i.get($$1).d() && crj.c($$0, this.i.get($$1)) && !this.i.get($$1).l() && !$$2.A() && !$$2.b(jp.d)) {
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

   public int a(Predicate<crj> $$0, int $$1, bnt $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bnu.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bnu.a($$2, $$0, $$1 - $$3, $$4);
      crj $$5 = this.m.bY.g();
      $$3 += bnu.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.d()) {
         this.m.bY.b(crj.i);
      }

      return $$3;
   }

   private int i(crj $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.G() : this.d($$1, $$0);
   }

   private int d(int $$0, crj $$1) {
      int $$2 = $$1.G();
      crj $$3 = this.a($$0);
      if ($$3.d()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = $$2;
      if ($$2 > $$3.i() - $$3.G()) {
         $$4 = $$3.i() - $$3.G();
      }

      if ($$4 > this.aj_() - $$3.G()) {
         $$4 = this.aj_() - $$3.G();
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

   public int d(crj $$0) {
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
      for (iu<crj> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).d()) {
               $$0.get($$1).a(this.m.dM(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(crj $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, crj $$1) {
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
               } else if (this.m.fM()) {
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

               if ($$1.G() == $$2 && this.m.fM()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.G() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cre.a($$1.f()));
            $$5.a("Item data", $$1.m());
            $$5.a("Item name", () -> $$1.w().getString());
            throw new y($$4);
         }
      }
   }

   public void f(crj $$0) {
      this.a($$0, true);
   }

   public void a(crj $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof apt) {
            ((apt)this.m).d.b(new abv(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public crj a(int $$0, int $$1) {
      List<crj> $$2 = null;

      for (iu<crj> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).d() ? bnu.a($$2, $$0, $$1) : crj.i;
   }

   public void g(crj $$0) {
      for (iu<crj> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, crj.i);
               break;
            }
         }
      }
   }

   @Override
   public crj b(int $$0) {
      iu<crj> $$1 = null;

      for (iu<crj> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).d()) {
         crj $$3 = $$1.get($$0);
         $$1.set($$0, crj.i);
         return $$3;
      } else {
         return crj.i;
      }
   }

   @Override
   public void a(int $$0, crj $$1) {
      iu<crj> $$2 = null;

      for (iu<crj> $$3 : this.o) {
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

   public float a(doz $$0) {
      return this.i.get(this.l).a($$0);
   }

   public ts a(ts $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).d()) {
            tm $$2 = new tm();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.i.get($$1).b(this.m.dO(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).d()) {
            tm $$4 = new tm();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.j.get($$3).b(this.m.dO(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).d()) {
            tm $$6 = new tm();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.k.get($$5).b(this.m.dO(), $$6));
         }
      }

      return $$0;
   }

   public void b(ts $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         tm $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         crj $$4 = crj.a(this.m.dO(), (uj)$$2).orElse(crj.i);
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
   public boolean ah_() {
      for (crj $$0 : this.i) {
         if (!$$0.d()) {
            return false;
         }
      }

      for (crj $$1 : this.j) {
         if (!$$1.d()) {
            return false;
         }
      }

      for (crj $$2 : this.k) {
         if (!$$2.d()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public crj a(int $$0) {
      List<crj> $$1 = null;

      for (iu<crj> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? crj.i : $$1.get($$0);
   }

   @Override
   public wg ad() {
      return wg.c("container.inventory");
   }

   public crj e(int $$0) {
      return this.j.get($$0);
   }

   public void k() {
      for (List<crj> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            crj $$2 = $$0.get($$1);
            if (!$$2.d()) {
               this.m.a($$2, true, false);
               $$0.set($$1, crj.i);
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
   public boolean a(cjt $$0) {
      return $$0.b(this.m, 4.0);
   }

   public boolean h(crj $$0) {
      for (List<crj> $$1 : this.o) {
         for (crj $$2 : $$1) {
            if (!$$2.d() && crj.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(avr<cre> $$0) {
      for (List<crj> $$1 : this.o) {
         for (crj $$2 : $$1) {
            if (!$$2.d() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<crj> $$0) {
      for (List<crj> $$1 : this.o) {
         for (crj $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cjs $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<crj> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(cjx $$0) {
      for (crj $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public crj a(boolean $$0) {
      crj $$1 = this.f();
      return $$1.d() ? crj.i : this.a(this.l, $$0 ? $$1.G() : 1);
   }
}
