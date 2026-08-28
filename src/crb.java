import it.unimi.dsi.fastutil.ints.Int2ObjectArrayMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map;
import java.util.function.Predicate;

public class crb implements btw, bug {
   public static final int b = 5;
   public static final int c = 36;
   public static final int d = 9;
   public static final int e = 40;
   public static final int f = -1;
   public static final Int2ObjectMap<bwp> g = new Int2ObjectArrayMap(
      Map.of(bwp.c.a(36), bwp.c, bwp.d.a(36), bwp.d, bwp.e.a(36), bwp.e, bwp.f.a(36), bwp.f, 40, bwp.b)
   );
   private final jn<czd> i = jn.a(36, czd.k);
   private int j;
   public final crc h;
   private final bwj k;
   private int l;

   public crb(crc $$0, bwj $$1) {
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

   public czd g() {
      return this.i.get(this.j);
   }

   public czd b(czd $$0) {
      return this.i.set(this.j, $$0);
   }

   public static int h() {
      return 9;
   }

   public jn<czd> i() {
      return this.i;
   }

   private boolean a(czd $$0, czd $$1) {
      return !$$0.f() && czd.c($$0, $$1) && $$0.l() && $$0.M() < this.f_($$0);
   }

   public int j() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         if (this.i.get($$0).f()) {
            return $$0;
         }
      }

      return -1;
   }

   public void c(czd $$0) {
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
      czd $$1 = this.i.get(this.j);
      this.i.set(this.j, this.i.get($$0));
      this.i.set($$0, $$1);
   }

   public static boolean e(int $$0) {
      return $$0 >= 0 && $$0 < 9;
   }

   public int d(czd $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (!this.i.get($$1).f() && czd.c($$0, this.i.get($$1))) {
            return $$1;
         }
      }

      return -1;
   }

   public static boolean e(czd $$0) {
      return !$$0.n() && !$$0.F() && !$$0.c(kj.g);
   }

   public int a(je<cyz> $$0, czd $$1) {
      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         czd $$3 = this.i.get($$2);
         if (!$$3.f() && $$3.a($$0) && e($$3) && ($$1.f() || czd.c($$1, $$3))) {
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

   public int a(Predicate<czd> $$0, int $$1, btw $$2) {
      int $$3 = 0;
      boolean $$4 = $$1 == 0;
      $$3 += btx.a(this, $$0, $$1 - $$3, $$4);
      $$3 += btx.a($$2, $$0, $$1 - $$3, $$4);
      czd $$5 = this.h.bR.g();
      $$3 += btx.a($$5, $$0, $$1 - $$3, $$4);
      if ($$5.f()) {
         this.h.bR.b(czd.k);
      }

      return $$3;
   }

   private int k(czd $$0) {
      int $$1 = this.f($$0);
      if ($$1 == -1) {
         $$1 = this.j();
      }

      return $$1 == -1 ? $$0.M() : this.d($$1, $$0);
   }

   private int d(int $$0, czd $$1) {
      int $$2 = $$1.M();
      czd $$3 = this.a($$0);
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

   public int f(czd $$0) {
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
         czd $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.a(this.h.dV(), this.h, $$0 == this.j ? bwp.a : null);
         }
      }
   }

   public boolean g(czd $$0) {
      return this.c(-1, $$0);
   }

   public boolean c(int $$0, czd $$1) {
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
            o $$4 = o.a(var6, "Adding item to inventory");
            p $$5 = $$4.a("Item being added");
            $$5.a("Item ID", cyz.a($$1.h()));
            $$5.a("Item data", $$1.o());
            $$5.a("Item name", () -> $$1.y().getString());
            throw new z($$4);
         }
      }
   }

   public void h(czd $$0) {
      this.a($$0, true);
   }

   public void a(czd $$0, boolean $$1) {
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
         if (this.c($$2, $$0.a($$3)) && $$1 && this.h instanceof arr $$4) {
            $$4.f.b(this.f($$2));
         }
      }
   }

   public afm f(int $$0) {
      return new afm($$0, this.a($$0).v());
   }

   @Override
   public czd a(int $$0, int $$1) {
      if ($$0 < this.i.size()) {
         return btx.a(this.i, $$0, $$1);
      } else {
         bwp $$2 = (bwp)g.get($$0);
         if ($$2 != null) {
            czd $$3 = this.k.a($$2);
            if (!$$3.f()) {
               return $$3.a($$1);
            }
         }

         return czd.k;
      }
   }

   public void i(czd $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         if (this.i.get($$1) == $$0) {
            this.i.set($$1, czd.k);
            return;
         }
      }

      ObjectIterator var5 = g.values().iterator();

      while (var5.hasNext()) {
         bwp $$2 = (bwp)var5.next();
         czd $$3 = this.k.a($$2);
         if ($$3 == $$0) {
            this.k.a($$2, czd.k);
            return;
         }
      }
   }

   @Override
   public czd b(int $$0) {
      if ($$0 < this.i.size()) {
         czd $$1 = this.i.get($$0);
         this.i.set($$0, czd.k);
         return $$1;
      } else {
         bwp $$2 = (bwp)g.get($$0);
         return $$2 != null ? this.k.a($$2, czd.k) : czd.k;
      }
   }

   @Override
   public void a(int $$0, czd $$1) {
      if ($$0 < this.i.size()) {
         this.i.set($$0, $$1);
      }

      bwp $$2 = (bwp)g.get($$0);
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
         tz $$2 = $$0.a($$1);
         int $$3 = $$2.f("Slot") & 255;
         czd $$4 = czd.a(this.h.dX(), (uw)$$2).orElse(czd.k);
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
      for (czd $$0 : this.i) {
         if (!$$0.f()) {
            return false;
         }
      }

      ObjectIterator var3 = g.values().iterator();

      while (var3.hasNext()) {
         bwp $$1 = (bwp)var3.next();
         if (!this.k.a($$1).f()) {
            return false;
         }
      }

      return true;
   }

   @Override
   public czd a(int $$0) {
      if ($$0 < this.i.size()) {
         return this.i.get($$0);
      } else {
         bwp $$1 = (bwp)g.get($$0);
         return $$1 != null ? this.k.a($$1) : czd.k;
      }
   }

   @Override
   public wy al() {
      return wy.c("container.inventory");
   }

   public void m() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         czd $$1 = this.i.get($$0);
         if (!$$1.f()) {
            this.h.a($$1, true, false);
            this.i.set($$0, czd.k);
         }
      }

      this.k.a((bxe)this.h);
   }

   @Override
   public void e() {
      this.l++;
   }

   public int n() {
      return this.l;
   }

   @Override
   public boolean a(crc $$0) {
      return true;
   }

   public boolean j(czd $$0) {
      for (czd $$1 : this) {
         if (!$$1.f() && czd.c($$1, $$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean a(axr<cyz> $$0) {
      for (czd $$1 : this) {
         if (!$$1.f() && $$1.a($$0)) {
            return true;
         }
      }

      return false;
   }

   public boolean b(Predicate<czd> $$0) {
      for (czd $$1 : this) {
         if ($$0.test($$1)) {
            return true;
         }
      }

      return false;
   }

   public void a(crb $$0) {
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

   public void a(cri $$0) {
      for (czd $$1 : this.i) {
         $$0.a($$1);
      }
   }

   public czd a(boolean $$0) {
      czd $$1 = this.g();
      return $$1.f() ? czd.k : this.a(this.j, $$0 ? $$1.M() : 1);
   }
}
