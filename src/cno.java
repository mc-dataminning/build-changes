import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cno implements brd, brn {
   public static final int b = 5;
   public static final int c = 36;
   public static final int d = 9;
   public static final int e = 40;
   public static final int f = -1;
   public final jw<cvl> g = jw.a(36, cvl.k);
   public final jw<cvl> h = jw.a(4, cvl.k);
   public final jw<cvl> i = jw.a(1, cvl.k);
   private final List<jw<cvl>> l = ImmutableList.of(this.g, this.h, this.i);
   public int j;
   public final cnp k;
   private int m;

   public cno(cnp $$0) {
      this.k = $$0;
   }

   public cvl f() {
      return d(this.j) ? this.g.get(this.j) : cvl.k;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cvl $$0, cvl $$1) {
      return !$$0.f() && cvl.c($$0, $$1) && $$0.l() && $$0.J() < this.f_($$0);
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.g.size(); $$0++) {
         if (this.g.get($$0).f()) {
            return $$0;
         }
      }

      return -1;
   }

   public void b(cvl $$0) {
      int $$1 = this.c($$0);
      if (d($$1)) {
         this.j = $$1;
      } else {
         if ($$1 == -1) {
            this.j = this.i();
            if (!this.g.get(this.j).f()) {
               int $$2 = this.h();
               if ($$2 != -1) {
                  this.g.set($$2, this.g.get(this.j));
               }
            }

            this.g.set(this.j, $$0);
         } else {
            this.c($$1);
         }
      }
   }

   public void c(int $$0) {
      this.j = this.i();
      cvl $$1 = this.g.get(this.j);
      this.g.set(this.j, this.g.get($$0));
      this.g.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int c(cvl $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         if (!this.g.get($$1).f() && cvl.c($$0, this.g.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public static boolean d(cvl $$0) {
      return !$$0.n() && !$$0.C() && !$$0.b(kr.g);
   }

   public int a(jn<cvg> $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         cvl $$2 = this.g.get($$1);
         if (!$$2.f() && $$2.a($$0) && d($$2)) {
            return $$1;
         }
      }

      return -1;
   }

   public int i() {
      for (int $$0 = 0; $$0 < 9; $$0++) {
         int $$1 = (this.j + $$0) % 9;
         if (this.g.get($$1).f()) {
            return $$1;
         }
      }

      for (int $$2 = 0; $$2 < 9; $$2++) {
         int $$3 = (this.j + $$2) % 9;
         if (!this.g.get($$3).C()) {
            return $$3;
         }
      }

      return this.j;
   }

   public void e(int $$0) {
      this.j = $$0;
   }

   public int a(Predicate<cvl> $$0, int $$1, brd $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bre.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bre.a($$2, $$0, $$1 - $$3, $$4);
      cvl $$5 = this.k.ca.g();
      $$3 += bre.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.f()) {
         this.k.ca.b(cvl.k);
      }

      return $$3;
   }

   private int j(cvl $$0) {
      int $$1 = this.e($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.J() : this.d($$1, $$0);
   }

   private int d(int $$0, cvl $$1) {
      int $$2 = $$1.J();
      cvl $$3 = this.a($$0);
      if ($$3.f()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = this.f_($$3) - $$3.J();
      int $$5 = Math.min($$2, $$4);
      if ($$5 == 0) {
         return $$2;
      } else {
         $$2 -= $$5;
         $$3.g($$5);
         $$3.d(5);
         return $$2;
      }
   }

   public int e(cvl $$0) {
      if (this.a(this.a(this.j), $$0)) {
         return this.j;
      } else if (this.a(this.a(40), $$0)) {
         return 40;
      } else {
         for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
            if (this.a(this.g.get($$1), $$0)) {
               return $$1;
            }
         }

         return -1;
      }
   }

   public void j() {
      for (jw<cvl> $$0 : this.l) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).f()) {
               $$0.get($$1).a(this.k.dS(), this.k, $$1, this.j == $$1);
            }
         }
      }
   }

   public boolean f(cvl $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cvl $$1) {
      if ($$1.f()) {
         return false;
      } else {
         try {
            if ($$1.n()) {
               if ($$0 == -1) {
                  $$0 = this.h();
               }

               if ($$0 >= 0) {
                  this.g.set($$0, $$1.g());
                  this.g.get($$0).d(5);
                  return true;
               } else if (this.k.fP()) {
                  $$1.e(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int $$2;
               do {
                  $$2 = $$1.J();
                  if ($$0 == -1) {
                     $$1.e(this.j($$1));
                  } else {
                     $$1.e(this.d($$0, $$1));
                  }
               } while (!$$1.f() && $$1.J() < $$2);

               if ($$1.J() == $$2 && this.k.fP()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.J() < $$2;
               }
            }
         } catch (Throwable var6) {
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cvg.a($$1.h()));
            $$5.a("Item data", $$1.o());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new z($$4);
         }
      }
   }

   public void g(cvl $$0) {
      this.a($$0, true);
   }

   public void a(cvl $$0, boolean $$1) {
      while (!$$0.f()) {
         int $$2 = this.e($$0);
         if ($$2 == -1) {
            $$2 = this.h();
         }

         if ($$2 == -1) {
            this.k.a($$0, false);
            break;
         }

         int $$3 = $$0.k() - this.a($$2).J();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.k instanceof arh $$4) {
            $$4.c.b(this.f($$2));
         }
      }
   }

   public afo f(int $$0) {
      return new afo($$0, this.a($$0).u());
   }

   @Override
   public cvl a(int $$0, int $$1) {
      List<cvl> $$2 = null;

      for (jw<cvl> $$3 : this.l) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).f() ? bre.a($$2, $$0, $$1) : cvl.k;
   }

   public void h(cvl $$0) {
      for (jw<cvl> $$1 : this.l) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cvl.k);
               break;
            }
         }
      }
   }

   @Override
   public cvl b(int $$0) {
      jw<cvl> $$1 = null;

      for (jw<cvl> $$2 : this.l) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).f()) {
         cvl $$3 = $$1.get($$0);
         $$1.set($$0, cvl.k);
         return $$3;
      } else {
         return cvl.k;
      }
   }

   @Override
   public void a(int $$0, cvl $$1) {
      jw<cvl> $$2 = null;

      for (jw<cvl> $$3 : this.l) {
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

   public float a(dua $$0) {
      return this.g.get(this.j).a($$0);
   }

   public ul a(ul $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         if (!this.g.get($$1).f()) {
            uf $$2 = new uf();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.g.get($$1).b(this.k.dU(), $$2));
         }
      }

      for (int $$3 = 0; $$3 < this.h.size(); $$3++) {
         if (!this.h.get($$3).f()) {
            uf $$4 = new uf();
            $$4.a("Slot", (byte)($$3 + 100));
            $$0.add(this.h.get($$3).b(this.k.dU(), $$4));
         }
      }

      for (int $$5 = 0; $$5 < this.i.size(); $$5++) {
         if (!this.i.get($$5).f()) {
            uf $$6 = new uf();
            $$6.a("Slot", (byte)($$5 + 150));
            $$0.add(this.i.get($$5).b(this.k.dU(), $$6));
         }
      }

      return $$0;
   }

   public void b(ul $$0) {
      this.g.clear();
      this.h.clear();
      this.i.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         uf $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         cvl $$4 = cvl.a(this.k.dU(), (vc)$$2).orElse(cvl.k);
         if ($$3 >= 0 && $$3 < this.g.size()) {
            this.g.set($$3, $$4);
         } else if ($$3 >= 100 && $$3 < this.h.size() + 100) {
            this.h.set($$3 - 100, $$4);
         } else if ($$3 >= 150 && $$3 < this.i.size() + 150) {
            this.i.set($$3 - 150, $$4);
         }
      }
   }

   @Override
   public int b() {
      return this.g.size() + this.h.size() + this.i.size();
   }

   @Override
   public boolean c() {
      for (cvl $$0 : this.g) {
         if (!$$0.f()) {
            return false;
         }
      }

      for (cvl $$1 : this.h) {
         if (!$$1.f()) {
            return false;
         }
      }

      for (cvl $$2 : this.i) {
         if (!$$2.f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cvl a(int $$0) {
      List<cvl> $$1 = null;

      for (jw<cvl> $$2 : this.l) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cvl.k : $$1.get($$0);
   }

   @Override
   public xd aj() {
      return xd.c("container.inventory");
   }

   public cvl g(int $$0) {
      return this.h.get($$0);
   }

   public void k() {
      for (List<cvl> $$0 : this.l) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cvl $$2 = $$0.get($$1);
            if (!$$2.f()) {
               this.k.a($$2, true, false);
               $$0.set($$1, cvl.k);
            }
         }
      }
   }

   @Override
   public void e() {
      this.m++;
   }

   public int l() {
      return this.m;
   }

   @Override
   public boolean a(cnp $$0) {
      return $$0.b(this.k, 4.0);
   }

   public boolean i(cvl $$0) {
      for (List<cvl> $$1 : this.l) {
         for (cvl $$2 : $$1) {
            if (!$$2.f() && cvl.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(axi<cvg> $$0) {
      for (List<cvl> $$1 : this.l) {
         for (cvl $$2 : $$1) {
            if (!$$2.f() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean b(Predicate<cvl> $$0) {
      for (List<cvl> $$1 : this.l) {
         for (cvl $$2 : $$1) {
            if ($$0.test($$2)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cno $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.j = $$0.j;
   }

   @Override
   public void a() {
      for (List<cvl> $$0 : this.l) {
         $$0.clear();
      }
   }

   public void a(cnu $$0) {
      for (cvl $$1 : this.g) {
         $$0.a($$1);
      }
   }

   public cvl a(boolean $$0) {
      cvl $$1 = this.f();
      return $$1.f() ? cvl.k : this.a(this.j, $$0 ? $$1.J() : 1);
   }
}
