import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Predicate;

public class cfg implements bjt, bke {
   public static final int c = 5;
   public static final int d = 36;
   private static final int n = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final int[] g = new int[]{0, 1, 2, 3};
   public static final int[] h = new int[]{3};
   public final iq<cmx> i = iq.a(36, cmx.f);
   public final iq<cmx> j = iq.a(4, cmx.f);
   public final iq<cmx> k = iq.a(1, cmx.f);
   private final List<iq<cmx>> o = ImmutableList.of(this.i, this.j, this.k);
   public int l;
   public final cfh m;
   private int p;

   public cfg(cfh $$0) {
      this.m = $$0;
   }

   public cmx f() {
      return d(this.l) ? this.i.get(this.l) : cmx.f;
   }

   public static int g() {
      return 9;
   }

   private boolean a(cmx $$0, cmx $$1) {
      return !$$0.b() && cmx.c($$0, $$1) && $$0.h() && $$0.L() < $$0.g() && $$0.L() < this.ak_();
   }

   public int h() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).b()) {
            return $$0;
         }
      }

      return -1;
   }

   public void a(cmx $$0) {
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
      cmx $$1 = this.i.get(this.l);
      this.i.set(this.l, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean d(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int b(cmx $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).b() && cmx.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public int c(cmx $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         cmx $$2 = this.i.get($$1);
         if (!this.i.get($$1).b() && cmx.c($$0, this.i.get($$1)) && !this.i.get($$1).j() && !$$2.E() && !$$2.A()) {
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

   public int a(Predicate<cmx> $$0, int $$1, bjt $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bju.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bju.a($$2, $$0, $$1 - $$3, $$4);
      cmx $$5 = this.m.bS.g();
      $$3 += bju.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.b()) {
         this.m.bS.b(cmx.f);
      }

      return $$3;
   }

   private int i(cmx $$0) {
      int $$1 = this.d($$0);
      if ($$1 == -1) {
         $$1 = this.h();
      }

      return $$1 == -1 ? $$0.L() : this.d($$1, $$0);
   }

   private int d(int $$0, cmx $$1) {
      cms $$2 = $$1.d();
      int $$3 = $$1.L();
      cmx $$4 = this.a($$0);
      if ($$4.b()) {
         $$4 = new cmx($$2, 0);
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

   public int d(cmx $$0) {
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
      for (iq<cmx> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            if (!$$0.get($$1).b()) {
               $$0.get($$1).a(this.m.dM(), this.m, $$1, this.l == $$1);
            }
         }
      }
   }

   public boolean e(cmx $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, cmx $$1) {
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
            $$5.a("Item ID", cms.a($$1.d()));
            $$5.a("Item data", $$1.k());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new y($$4);
         }
      }
   }

   public void f(cmx $$0) {
      this.a($$0, true);
   }

   public void a(cmx $$0, boolean $$1) {
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
   public cmx a(int $$0, int $$1) {
      List<cmx> $$2 = null;

      for (iq<cmx> $$3 : this.o) {
         if ($$0 < $$3.size()) {
            $$2 = $$3;
            break;
         }

         $$0 -= $$3.size();
      }

      return $$2 != null && !$$2.get($$0).b() ? bju.a($$2, $$0, $$1) : cmx.f;
   }

   public void g(cmx $$0) {
      for (iq<cmx> $$1 : this.o) {
         for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
            if ($$1.get($$2) == $$0) {
               $$1.set($$2, cmx.f);
               break;
            }
         }
      }
   }

   @Override
   public cmx b(int $$0) {
      iq<cmx> $$1 = null;

      for (iq<cmx> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      if ($$1 != null && !$$1.get($$0).b()) {
         cmx $$3 = $$1.get($$0);
         $$1.set($$0, cmx.f);
         return $$3;
      } else {
         return cmx.f;
      }
   }

   @Override
   public void a(int $$0, cmx $$1) {
      iq<cmx> $$2 = null;

      for (iq<cmx> $$3 : this.o) {
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

   public float a(djg $$0) {
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
         cmx $$4 = cmx.a($$2);
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
      for (cmx $$0 : this.i) {
         if (!$$0.b()) {
            return false;
         }
      }

      for (cmx $$1 : this.j) {
         if (!$$1.b()) {
            return false;
         }
      }

      for (cmx $$2 : this.k) {
         if (!$$2.b()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public cmx a(int $$0) {
      List<cmx> $$1 = null;

      for (iq<cmx> $$2 : this.o) {
         if ($$0 < $$2.size()) {
            $$1 = $$2;
            break;
         }

         $$0 -= $$2.size();
      }

      return $$1 == null ? cmx.f : $$1.get($$0);
   }

   @Override
   public vf ad() {
      return vf.c("container.inventory");
   }

   public cmx e(int $$0) {
      return this.j.get($$0);
   }

   public void a(bks $$0, float $$1, int[] $$2) {
      if (!($$1 <= 0.0F)) {
         $$1 /= 4.0F;
         if ($$1 < 1.0F) {
            $$1 = 1.0F;
         }

         for (int $$3 : $$2) {
            cmx $$4 = this.j.get($$3);
            if ((!$$0.a(asi.j) || !$$4.d().w()) && $$4.d() instanceof ckh) {
               $$4.a((int)$$1, this.m, $$1x -> $$1x.d(blz.a(blz.a.b, $$3)));
            }
         }
      }
   }

   public void k() {
      for (List<cmx> $$0 : this.o) {
         for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
            cmx $$2 = $$0.get($$1);
            if (!$$2.b()) {
               this.m.a($$2, true, false);
               $$0.set($$1, cmx.f);
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
   public boolean a(cfh $$0) {
      return this.m.dH() ? false : !($$0.f(this.m) > 64.0);
   }

   public boolean h(cmx $$0) {
      for (List<cmx> $$1 : this.o) {
         for (cmx $$2 : $$1) {
            if (!$$2.b() && cmx.c($$2, $$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean a(asv<cms> $$0) {
      for (List<cmx> $$1 : this.o) {
         for (cmx $$2 : $$1) {
            if (!$$2.b() && $$2.a($$0)) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(cfg $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.l = $$0.l;
   }

   @Override
   public void a() {
      for (List<cmx> $$0 : this.o) {
         $$0.clear();
      }
   }

   public void a(cfl $$0) {
      for (cmx $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public cmx a(boolean $$0) {
      cmx $$1 = this.f();
      return $$1.b() ? cmx.f : this.a(this.l, $$0 ? $$1.L() : 1);
   }
}
