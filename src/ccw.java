import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class ccw implements bhu, bif {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final il<ckj> i = il.a(36, ckj.b);
   public final il<ckj> j = il.a(4, ckj.b);
   public final il<ckj> k = il.a(1, ckj.b);
   private final List<il<ckj>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final ccx m;
   private int p;

   public ccw(ccx $$0) {
      this.m = $$0;
   }

   public ckj f() {
      return d(this.l) ? this.i.get(this.l) : ckj.b;
   }

   public static int g() {
      return 9;
   }

   private boolean a(ckj $$0, ckj $$1) {
      return !$$0.b() && ckj.c($$0, $$1) && $$0.h() && $$0.L() < $$0.g() && $$0.L() < this.aj_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(ckj $$0) {
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
      ckj $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(ckj $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b() && ckj.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(ckj $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         ckj $$2 = this.i.get($$1);
         if (!this.i.get($$1).b() && ckj.c($$0, this.i.get($$1)) && !this.i.get($$1).j() && !$$2.E() && !$$2.A()) {
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

   public int a(Predicate<ckj> $$0, int $$1, bhu $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bhv.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bhv.a($$2, $$0, $$1 - $$3, $$4);
      ckj $$5 = this.m.bS.g();
      $$3 += bhv.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.m.bS.b(ckj.b);
      }

      return $$3;
   }

   private int i(ckj $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.L() : this.d($$1, $$0);
   }

   private int d(int $$0, ckj $$1) {
      cke $$2 = $$1.d();
      int $$3 = $$1.L();
      ckj $$4 = this.a($$0);
      if ($$4.b()) {
         $$4 = new ckj($$2, 0);
         if ($$1.u()) {
            $$4.c($$1.v().h());
         }

         this.a($$0, $$4);
      }

      int $$5 = $$3;
      if ($$3 > $$4.g() - $$4.L()) {
         $$5 = $$4.g() - $$4.L();
      }

      if ($$5 > this.aj_() - $$4.L()) {
         $$5 = this.aj_() - $$4.L();
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

   public int d(ckj $$0) {
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
      for (il<ckj> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.m.dL(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(ckj $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, ckj $$1) {
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
            $$5.a("Item ID", cke.a($$1.d()));
            $$5.a("Item data", $$1.k());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new y($$4);
         }
      }
   }

   public void f(ckj $$0) {
      this.a($$0, true);
   }

   public void a(ckj $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.m instanceof alr) {
            ((alr)this.m).c.b(new yq(-2, 0, $$2, this.a($$2)));
         }
      }
   }

   @Override
   public ckj a(int $$0, int $$1) {
      List<ckj> $$2 = null;

      for (il<ckj> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).b() ? bhv.a($$2, $$0, $$1) : ckj.b;
   }

   public void g(ckj $$0) {
      for (il<ckj> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, ckj.b);
               break;
            }
         }
      }
   }

   @Override
   public ckj b(int $$0) {
      il<ckj> $$1 = null;

      for (il<ckj> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         ckj $$3 = $$1.get($$0);
         $$1.set($$0, ckj.b);
         return $$3;
      } else {
         return ckj.b;
      }
   }

   @Override
   public void a(int $$0, ckj $$1) {
      il<ckj> $$2 = null;

      for (il<ckj> $$3 : this.o) {
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

   public float a(dgb $$0) {
      return this.i.get(this.l).a($$0);
   }

   public rz a(rz $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b()) {
            rt $$2 = new rt();
            $$2.a("Slot", (byte)$$1);
            this.i.get($$1).b($$2);
            $$0.add($$2);
         }
      }

      for (int $$3 = 0; $$3 < this.j.size(); $$3++) {
         if (!this.j.get($$3).b()) {
            rt $$4 = new rt();
            $$4.a("Slot", (byte)($$3 + 100));
            this.j.get($$3).b($$4);
            $$0.add($$4);
         }
      }

      for (int $$5 = 0; $$5 < this.k.size(); $$5++) {
         if (!this.k.get($$5).b()) {
            rt $$6 = new rt();
            $$6.a("Slot", (byte)($$5 + 150));
            this.k.get($$5).b($$6);
            $$0.add($$6);
         }
      }

      return $$0;
   }

   public void b(rz $$0) {
      this.i.clear();
      this.j.clear();
      this.k.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         rt $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         ckj $$4 = ckj.a($$2);
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
      for (ckj $$0 : this.i) {
         if (!$$0.b()) {
            return false;
         }
      }

      for (ckj $$1 : this.j) {
         if (!$$1.b()) {
            return false;
         }
      }

      for (ckj $$2 : this.k) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public ckj a(int $$0) {
      List<ckj> $$1 = null;

      for (il<ckj> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? ckj.b : $$1.get($$0);
   }

   @Override
   public ui ab() {
      return ui.c("container.inventory");
   }

   public ckj e(int $$0) {
      return this.j.get($$0);
   }

   public void a(bir $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for (int $$3 : $$2) {
            ckj $$4 = this.j.get($$3);
            if ((!$$0.a(aqu.i) || !$$4.d().w()) && $$4.d() instanceof cht) {
               $$4.a((int)$$1, this.m, $$1x -> $$1x.d(bjy.a(bjy.a.b, $$3)));
            }
         }
      }
   }

   public void k() {
      for (List<ckj> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            ckj $$2 = $$0.get($$1);
            if (!$$2.b()) {
               this.m.a($$2, true, false);
               $$0.set($$1, ckj.b);
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
   public boolean a(ccx $$0) {
      return this.m.dG() ? false : !($$0.f(this.m) > 64.0);
   }

   public boolean h(ckj $$0) {
      for (List<ckj> $$1 : this.o) {
         for (ckj $$2 : $$1) {
            if (!$$2.b() && ckj.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(arh<cke> $$0) {
      for (List<ckj> $$1 : this.o) {
         for (ckj $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(ccw $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<ckj> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(cdb $$0) {
      for (ckj $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public ckj a(boolean $$0) {
      ckj $$1 = this.f();
      return $$1.b() ? ckj.b : this.a(this.l, $$0 ? $$1.L() : 1);
   }
}
