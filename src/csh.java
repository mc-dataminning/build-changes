import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map;
import java.util.function.Predicate;

public class csh implements buv, bvf {
   public static final int b = 5;
   public static final int c = 36;
   public static final int d = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final Int2ObjectMap<bxo> g = new Int2ObjectArrayMap(
      Map.of(bxo.c.a(36), bxo.c, bxo.d.a(36), bxo.d, bxo.e.a(36), bxo.e, bxo.f.a(36), bxo.f, 40, bxo.b)
   );
   private final jp<dak> i = jp.a(36, dak.l);
   private int j;
   public final csi h;
   private final bxi k;
   private int l;

   public csh(csi $$0, bxi $$1) {
      this.h = $$0;
      this.k = $$1;
   }

   public int f() {
      return this.j;
   }

   public void c(int $$0) {
      if (!e($$0)) {
         throw new IllegalArgumentException("Invalid selected slot");
      } else {
         this.j = $$0;
      }
   }

   public dak g() {
      return this.i.get(this.j);
   }

   public dak b(dak $$0) {
      return this.i.set(this.j, $$0);
   }

   public static int h() {
      return 9;
   }

   public jp<dak> i() {
      return this.i;
   }

   private boolean a(dak $$0, dak $$1) {
      return !$$0.f() && dak.c($$0, $$1) && $$0.l() && $$0.M() < this.f_($$0);
   }

   public int j() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).f()) {
            return $$0;
         }
      }

      return -1;
   }

   public void c(dak $$0) {
      this.c(this.k());
      if (!this.i.get(this.j).f()) {
         int $$1 = this.j();
         if ($$1 != -1) {
            this.i.set($$1, this.i.get(this.j));
         }
      }

      this.i.set(this.j, $$0);
   }

   public void d(int $$0) {
      this.c(this.k());
      dak $$1 = this.i.get(this.j);
      this.i.set(this.j, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean e(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int d(dak $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).f() && dak.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public static boolean e(dak $$0) {
      return !$$0.n() && !$$0.F() && !$$0.c(kl.g);
   }

   public int a(jg<dag> $$0, dak $$1) {
      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         dak $$3 = this.i.get($$2);
         if (!$$3.f() && $$3.a($$0) && e($$3) && ($$1.f() || dak.c($$1, $$3))) {
            return $$2;
         }
      }

      return -1;
   }

   public int k() {
      for (int $$0 = 0; $$0 < 9; $$0++) {
         int $$1 = (this.j + $$0) % 9;
         if (this.i.get($$1).f()) {
            return $$1;
         }
      }

      for (int $$2 = 0; $$2 < 9; $$2++) {
         int $$3 = (this.j + $$2) % 9;
         if (!this.i.get($$3).F()) {
            return $$3;
         }
      }

      return this.j;
   }

   public int a(Predicate<dak> $$0, int $$1, buv $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += buw.a(this, $$0, $$1 - $$3, $$4);
      $$3 += buw.a($$2, $$0, $$1 - $$3, $$4);
      dak $$5 = this.h.bR.g();
      $$3 += buw.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.f()) {
         this.h.bR.a(dak.l);
      }

      return $$3;
   }

   private int k(dak $$0) {
      int $$1 = this.f($$0);
      if ($$1 == -1) {
         $$1 = this.j();
      }

      return $$1 == -1 ? $$0.M() : this.d($$1, $$0);
   }

   private int d(int $$0, dak $$1) {
      int $$2 = $$1.M();
      dak $$3 = this.a($$0);
      if ($$3.f()) {
         $$3 = $$1.c(0);
         this.a($$0, $$3);
      }

      int $$4 = this.f_($$3) - $$3.M();
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

   public int f(dak $$0) {
      if (this.a(this.a(this.j), $$0)) {
         return this.j;
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

   public void l() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         dak $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.a(this.h.dV(), this.h, $$0 == this.j ? bxo.a : null);
         }
      }
   }

   public boolean g(dak $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, dak $$1) {
      if ($$1.f()) {
         return false;
      } else {
         try {
            if ($$1.n()) {
               if ($$0 == -1) {
                  $$0 = this.j();
               }

               if ($$0 >= 0) {
                  this.i.set($$0, $$1.g());
                  this.i.get($$0).d(5);
                  return true;
               } else if (this.h.fV()) {
                  $$1.e(0);
                  return true;
               } else {
                  return false;
               }
            } else {
               int $$2;
               do {
                  $$2 = $$1.M();
                  if ($$0 == -1) {
                     $$1.e(this.k($$1));
                  } else {
                     $$1.e(this.d($$0, $$1));
                  }
               } while (!$$1.f() && $$1.M() < $$2);

               if ($$1.M() == $$2 && this.h.fV()) {
                  $$1.e(0);
                  return true;
               } else {
                  return $$1.M() < $$2;
               }
            }
         } catch (Throwable var6) {
            p $$4 = p.a(var6, "Adding item to inventory");
            q $$5 = $$4.a("Item being added");
            $$5.a("Item ID", dag.a($$1.h()));
            $$5.a("Item data", $$1.o());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new aa($$4);
         }
      }
   }

   public void h(dak $$0) {
      this.a($$0, true);
   }

   public void a(dak $$0, boolean $$1) {
      while (!$$0.f()) {
         int $$2 = this.f($$0);
         if ($$2 == -1) {
            $$2 = this.j();
         }

         if ($$2 == -1) {
            this.h.a($$0, false);
            break;
         }

         int $$3 = $$0.k() - this.a($$2).M();
         if (this.c($$2, $$0.a($$3)) && $$1 && this.h instanceof asc $$4) {
            $$4.f.b(this.f($$2));
         }
      }
   }

   public afx f(int $$0) {
      return new afx($$0, this.a($$0).v());
   }

   @Override
   public dak a(int $$0, int $$1) {
      if ($$0 < this.i.size()) {
         return buw.a(this.i, $$0, $$1);
      } else {
         bxo $$2 = (bxo)g.get($$0);
         if ($$2 != null) {
            dak $$3 = this.k.a($$2);
            if (!$$3.f()) {
               return $$3.a($$1);
            }
         }

         return dak.l;
      }
   }

   public void i(dak $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (this.i.get($$1) == $$0) {
            this.i.set($$1, dak.l);
            return;
         }
      }

      ObjectIterator var5 = g.values().iterator();

      while (var5.hasNext()) {
         bxo $$2 = (bxo)var5.next();
         dak $$3 = this.k.a($$2);
         if ($$3 == $$0) {
            this.k.a($$2, dak.l);
            return;
         }
      }
   }

   @Override
   public dak b(int $$0) {
      if ($$0 < this.i.size()) {
         dak $$1 = this.i.get($$0);
         this.i.set($$0, dak.l);
         return $$1;
      } else {
         bxo $$2 = (bxo)g.get($$0);
         return $$2 != null ? this.k.a($$2, dak.l) : dak.l;
      }
   }

   @Override
   public void a(int $$0, dak $$1) {
      if ($$0 < this.i.size()) {
         this.i.set($$0, $$1);
      }

      bxo $$2 = (bxo)g.get($$0);
      if ($$2 != null) {
         this.k.a($$2, $$1);
      }
   }

   public ug a(ug $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).f()) {
            ua $$2 = new ua();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.i.get($$1).b(this.h.dX(), $$2));
         }
      }

      return $$0;
   }

   public void b(ug $$0) {
      this.i.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         ua $$2 = $$0.b($$1);
         int $$3 = $$2.b("Slot", (byte)0) & 255;
         dak $$4 = dak.a(this.h.dX(), $$2).orElse(dak.l);
         if ($$3 < this.i.size()) {
            this.a($$3, $$4);
         }
      }
   }

   @Override
   public int b() {
      return this.i.size() + g.size();
   }

   @Override
   public boolean c() {
      for (dak $$0 : this.i) {
         if (!$$0.f()) {
            return false;
         }
      }

      ObjectIterator var3 = g.values().iterator();

      while (var3.hasNext()) {
         bxo $$1 = (bxo)var3.next();
         if (!this.k.a($$1).f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public dak a(int $$0) {
      if ($$0 < this.i.size()) {
         return this.i.get($$0);
      } else {
         bxo $$1 = (bxo)g.get($$0);
         return $$1 != null ? this.k.a($$1) : dak.l;
      }
   }

   @Override
   public xg ai() {
      return xg.c("container.inventory");
   }

   public void m() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         dak $$1 = this.i.get($$0);
         if (!$$1.f()) {
            this.h.a($$1, true, false);
            this.i.set($$0, dak.l);
         }
      }

      this.k.a((byf)this.h);
   }

   @Override
   public void e() {
      this.l++;
   }

   public int n() {
      return this.l;
   }

   @Override
   public boolean a(csi $$0) {
      return true;
   }

   public boolean j(dak $$0) {
      for (dak $$1 : this) {
         if (!$$1.f() && dak.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(ayc<dag> $$0) {
      for (dak $$1 : this) {
         if (!$$1.f() && $$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(Predicate<dak> $$0) {
      for (dak $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   public void a(csh $$0) {
      for (int $$1 = 0; $$1 < this.b(); $$1++) {
         this.a($$1, $$0.a($$1));
      }

      this.c($$0.f());
   }

   @Override
   public void a() {
      this.i.clear();
      this.k.b();
   }

   public void a(cso $$0) {
      for (dak $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public dak a(boolean $$0) {
      dak $$1 = this.g();
      return $$1.f() ? dak.l : this.a(this.j, $$0 ? $$1.M() : 1);
   }
}
