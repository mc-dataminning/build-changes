import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map;
import java.util.function.Predicate;

public class crw implements buk, buu {
   public static final int b = 5;
   public static final int c = 36;
   public static final int d = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final Int2ObjectMap<bxd> g = new Int2ObjectArrayMap(
      Map.of(bxd.c.a(36), bxd.c, bxd.d.a(36), bxd.d, bxd.e.a(36), bxd.e, bxd.f.a(36), bxd.f, 40, bxd.b)
   );
   private final jo<czy> i = jo.a(36, czy.k);
   private int j;
   public final crx h;
   private final bwx k;
   private int l;

   public crw(crx $$0, bwx $$1) {
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

   public czy g() {
      return this.i.get(this.j);
   }

   public czy b(czy $$0) {
      return this.i.set(this.j, $$0);
   }

   public static int h() {
      return 9;
   }

   public jo<czy> i() {
      return this.i;
   }

   private boolean a(czy $$0, czy $$1) {
      return !$$0.f() && czy.c($$0, $$1) && $$0.l() && $$0.M() < this.f_($$0);
   }

   public int j() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).f()) {
            return $$0;
         }
      }

      return -1;
   }

   public void c(czy $$0) {
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
      czy $$1 = this.i.get(this.j);
      this.i.set(this.j, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean e(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int d(czy $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).f() && czy.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public static boolean e(czy $$0) {
      return !$$0.n() && !$$0.F() && !$$0.c(kk.g);
   }

   public int a(jf<czu> $$0, czy $$1) {
      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         czy $$3 = this.i.get($$2);
         if (!$$3.f() && $$3.a($$0) && e($$3) && ($$1.f() || czy.c($$1, $$3))) {
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

   public int a(Predicate<czy> $$0, int $$1, buk $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += bul.a(this, $$0, $$1 - $$3, $$4);
      $$3 += bul.a($$2, $$0, $$1 - $$3, $$4);
      czy $$5 = this.h.bR.g();
      $$3 += bul.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.f()) {
         this.h.bR.b(czy.k);
      }

      return $$3;
   }

   private int k(czy $$0) {
      int $$1 = this.f($$0);
      if ($$1 == -1) {
         $$1 = this.j();
      }

      return $$1 == -1 ? $$0.M() : this.d($$1, $$0);
   }

   private int d(int $$0, czy $$1) {
      int $$2 = $$1.M();
      czy $$3 = this.a($$0);
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

   public int f(czy $$0) {
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
         czy $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.a(this.h.dV(), this.h, $$0 == this.j ? bxd.a : null);
         }
      }
   }

   public boolean g(czy $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, czy $$1) {
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
            $$5.a("Item ID", czu.a($$1.h()));
            $$5.a("Item data", $$1.o());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new aa($$4);
         }
      }
   }

   public void h(czy $$0) {
      this.a($$0, true);
   }

   public void a(czy $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.h instanceof art $$4) {
            $$4.f.b(this.f($$2));
         }
      }
   }

   public afo f(int $$0) {
      return new afo($$0, this.a($$0).v());
   }

   @Override
   public czy a(int $$0, int $$1) {
      if ($$0 < this.i.size()) {
         return bul.a(this.i, $$0, $$1);
      } else {
         bxd $$2 = (bxd)g.get($$0);
         if ($$2 != null) {
            czy $$3 = this.k.a($$2);
            if (!$$3.f()) {
               return $$3.a($$1);
            }
         }

         return czy.k;
      }
   }

   public void i(czy $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (this.i.get($$1) == $$0) {
            this.i.set($$1, czy.k);
            return;
         }
      }

      ObjectIterator var5 = g.values().iterator();

      while (var5.hasNext()) {
         bxd $$2 = (bxd)var5.next();
         czy $$3 = this.k.a($$2);
         if ($$3 == $$0) {
            this.k.a($$2, czy.k);
            return;
         }
      }
   }

   @Override
   public czy b(int $$0) {
      if ($$0 < this.i.size()) {
         czy $$1 = this.i.get($$0);
         this.i.set($$0, czy.k);
         return $$1;
      } else {
         bxd $$2 = (bxd)g.get($$0);
         return $$2 != null ? this.k.a($$2, czy.k) : czy.k;
      }
   }

   @Override
   public void a(int $$0, czy $$1) {
      if ($$0 < this.i.size()) {
         this.i.set($$0, $$1);
      }

      bxd $$2 = (bxd)g.get($$0);
      if ($$2 != null) {
         this.k.a($$2, $$1);
      }
   }

   public uf a(uf $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).f()) {
            tz $$2 = new tz();
            $$2.a("Slot", (byte)$$1);
            $$0.add(this.i.get($$1).b(this.h.dX(), $$2));
         }
      }

      return $$0;
   }

   public void b(uf $$0) {
      this.i.clear();

      for (int $$1 = 0; $$1 < $$0.size(); $$1++) {
         tz $$2 = $$0.b($$1);
         int $$3 = $$2.b("Slot", (byte)0) & 255;
         czy $$4 = czy.a(this.h.dX(), $$2).orElse(czy.k);
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
      for (czy $$0 : this.i) {
         if (!$$0.f()) {
            return false;
         }
      }

      ObjectIterator var3 = g.values().iterator();

      while (var3.hasNext()) {
         bxd $$1 = (bxd)var3.next();
         if (!this.k.a($$1).f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czy a(int $$0) {
      if ($$0 < this.i.size()) {
         return this.i.get($$0);
      } else {
         bxd $$1 = (bxd)g.get($$0);
         return $$1 != null ? this.k.a($$1) : czy.k;
      }
   }

   @Override
   public xa ai() {
      return xa.c("container.inventory");
   }

   public void m() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         czy $$1 = this.i.get($$0);
         if (!$$1.f()) {
            this.h.a($$1, true, false);
            this.i.set($$0, czy.k);
         }
      }

      this.k.a((bxu)this.h);
   }

   @Override
   public void e() {
      this.l++;
   }

   public int n() {
      return this.l;
   }

   @Override
   public boolean a(crx $$0) {
      return true;
   }

   public boolean j(czy $$0) {
      for (czy $$1 : this) {
         if (!$$1.f() && czy.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(axt<czu> $$0) {
      for (czy $$1 : this) {
         if (!$$1.f() && $$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(Predicate<czy> $$0) {
      for (czy $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   public void a(crw $$0) {
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

   public void a(csd $$0) {
      for (czy $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public czy a(boolean $$0) {
      czy $$1 = this.g();
      return $$1.f() ? czy.k : this.a(this.j, $$0 ? $$1.M() : 1);
   }
}
