import com.google.common.base.Suppliers;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cnh {
   private static final Logger k = LogUtils.getLogger();
   public static final int a = -999;
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 0;
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = Integer.MAX_VALUE;
   private final je<csd> l = je.a();
   public final je<cpd> i = je.a();
   private final List<cnz> m = Lists.newArrayList();
   private csd n = csd.i;
   private final je<csd> o = je.a();
   private final IntList p = new IntArrayList();
   private csd q = csd.i;
   private int r;
   @Nullable
   private final cop<?> s;
   public final int j;
   private int t = -1;
   private int u;
   private final Set<cpd> v = Sets.newHashSet();
   private final List<cnt> w = Lists.newArrayList();
   @Nullable
   private cnu x;
   private boolean y;

   protected cnh(@Nullable cop<?> $$0, int $$1) {
      this.s = $$0;
      this.j = $$1;
   }

   protected static boolean a(cns $$0, ckl $$1, dcv $$2) {
      return $$0.a(($$2x, $$3) -> !$$2x.a_($$3).a($$2) ? false : $$1.i((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5) <= 64.0, true);
   }

   public cop<?> a() {
      if (this.s == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.s;
      }
   }

   protected static void a(boj $$0, int $$1) {
      int $$2 = $$0.b();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container size " + $$2 + " is smaller than expected " + $$1);
      }
   }

   protected static void a(cnr $$0, int $$1) {
      int $$2 = $$0.a();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container data count " + $$2 + " is smaller than expected " + $$1);
      }
   }

   public boolean a(int $$0) {
      return $$0 == -1 || $$0 == -999 || $$0 < this.i.size();
   }

   protected cpd a(cpd $$0) {
      $$0.e = this.i.size();
      this.i.add($$0);
      this.l.add(csd.i);
      this.o.add(csd.i);
      return $$0;
   }

   protected cnz a(cnz $$0) {
      this.m.add($$0);
      this.p.add(0);
      return $$0;
   }

   protected void a(cnr $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         this.a(cnz.a($$0, $$1));
      }
   }

   public void a(cnt $$0) {
      if (!this.w.contains($$0)) {
         this.w.add($$0);
         this.d();
      }
   }

   public void a(cnu $$0) {
      this.x = $$0;
      this.b();
   }

   public void b() {
      int $$0 = 0;

      for (int $$1 = this.i.size(); $$0 < $$1; $$0++) {
         this.o.set($$0, this.i.get($$0).g().r());
      }

      this.q = this.g().r();
      $$0 = 0;

      for (int $$3 = this.m.size(); $$0 < $$3; $$0++) {
         this.p.set($$0, this.m.get($$0).b());
      }

      if (this.x != null) {
         this.x.a(this, this.o, this.q, this.p.toIntArray());
      }
   }

   public void b(cnt $$0) {
      this.w.remove($$0);
   }

   public je<csd> c() {
      je<csd> $$0 = je.a();

      for (cpd $$1 : this.i) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void d() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         csd $$1 = this.i.get($$0).g();
         Supplier<csd> $$2 = Suppliers.memoize($$1::r);
         this.a($$0, $$1, $$2);
         this.b($$0, $$1, $$2);
      }

      this.l();

      for (int $$3 = 0; $$3 < this.m.size(); $$3++) {
         cnz $$4 = this.m.get($$3);
         int $$5 = $$4.b();
         if ($$4.c()) {
            this.c($$3, $$5);
         }

         this.d($$3, $$5);
      }
   }

   public void e() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         csd $$1 = this.i.get($$0).g();
         this.a($$0, $$1, $$1::r);
      }

      for (int $$2 = 0; $$2 < this.m.size(); $$2++) {
         cnz $$3 = this.m.get($$2);
         if ($$3.c()) {
            this.c($$2, $$3.b());
         }
      }

      this.b();
   }

   private void c(int $$0, int $$1) {
      for (cnt $$2 : this.w) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void a(int $$0, csd $$1, Supplier<csd> $$2) {
      csd $$3 = this.l.get($$0);
      if (!csd.a($$3, $$1)) {
         csd $$4 = $$2.get();
         this.l.set($$0, $$4);

         for (cnt $$5 : this.w) {
            $$5.a(this, $$0, $$4);
         }
      }
   }

   private void b(int $$0, csd $$1, Supplier<csd> $$2) {
      if (!this.y) {
         csd $$3 = this.o.get($$0);
         if (!csd.a($$3, $$1)) {
            csd $$4 = $$2.get();
            this.o.set($$0, $$4);
            if (this.x != null) {
               this.x.a(this, $$0, $$4);
            }
         }
      }
   }

   private void d(int $$0, int $$1) {
      if (!this.y) {
         int $$2 = this.p.getInt($$0);
         if ($$2 != $$1) {
            this.p.set($$0, $$1);
            if (this.x != null) {
               this.x.a(this, $$0, $$1);
            }
         }
      }
   }

   private void l() {
      if (!this.y) {
         if (!csd.a(this.g(), this.q)) {
            this.q = this.g().r();
            if (this.x != null) {
               this.x.a(this, this.q);
            }
         }
      }
   }

   public void a(int $$0, csd $$1) {
      this.o.set($$0, $$1.r());
   }

   public void b(int $$0, csd $$1) {
      if ($$0 >= 0 && $$0 < this.o.size()) {
         this.o.set($$0, $$1);
      } else {
         k.debug("Incorrect slot index: {} available slots: {}", $$0, this.o.size());
      }
   }

   public void a(csd $$0) {
      this.q = $$0.r();
   }

   public boolean b(ckl $$0, int $$1) {
      return false;
   }

   public cpd b(int $$0) {
      return this.i.get($$0);
   }

   public abstract csd a(ckl var1, int var2);

   public void a(int $$0, int $$1, cnq $$2, ckl $$3) {
      try {
         this.b($$0, $$1, $$2, $$3);
      } catch (Exception var8) {
         o $$5 = o.a(var8, "Container click");
         p $$6 = $$5.a("Click info");
         $$6.a("Menu Type", () -> this.s != null ? lc.r.b(this.s).toString() : "<no type>");
         $$6.a("Menu Class", () -> this.getClass().getCanonicalName());
         $$6.a("Slot Count", this.i.size());
         $$6.a("Slot", $$0);
         $$6.a("Button", $$1);
         $$6.a("Type", $$2);
         throw new y($$5);
      }
   }

   private void b(int $$0, int $$1, cnq $$2, ckl $$3) {
      ckk $$4 = $$3.ga();
      if ($$2 == cnq.f) {
         int $$5 = this.u;
         this.u = d($$1);
         if (($$5 != 1 || this.u != 2) && $$5 != this.u) {
            this.f();
         } else if (this.g().d()) {
            this.f();
         } else if (this.u == 0) {
            this.t = c($$1);
            if (a(this.t, $$3)) {
               this.u = 1;
               this.v.clear();
            } else {
               this.f();
            }
         } else if (this.u == 1) {
            cpd $$6 = this.i.get($$0);
            csd $$7 = this.g();
            if (a($$6, $$7, true) && $$6.a($$7) && (this.t == 2 || $$7.G() > this.v.size()) && this.b($$6)) {
               this.v.add($$6);
            }
         } else if (this.u == 2) {
            if (!this.v.isEmpty()) {
               if (this.v.size() == 1) {
                  int $$8 = this.v.iterator().next().e;
                  this.f();
                  this.b($$8, this.t, cnq.a, $$3);
                  return;
               }

               csd $$9 = this.g().r();
               if ($$9.d()) {
                  this.f();
                  return;
               }

               int $$10 = this.g().G();

               for (cpd $$11 : this.v) {
                  csd $$12 = this.g();
                  if ($$11 != null && a($$11, $$12, true) && $$11.a($$12) && (this.t == 2 || $$12.G() >= this.v.size()) && this.b($$11)) {
                     int $$13 = $$11.h() ? $$11.g().G() : 0;
                     int $$14 = Math.min($$9.i(), $$11.a_($$9));
                     int $$15 = Math.min(a(this.v, this.t, $$9) + $$13, $$14);
                     $$10 -= $$15 - $$13;
                     $$11.e($$9.c($$15));
                  }
               }

               $$9.e($$10);
               this.b($$9);
            }

            this.f();
         } else {
            this.f();
         }
      } else if (this.u != 0) {
         this.f();
      } else if (($$2 == cnq.a || $$2 == cnq.b) && ($$1 == 0 || $$1 == 1)) {
         cnp $$16 = $$1 == 0 ? cnp.a : cnp.b;
         if ($$0 == -999) {
            if (!this.g().d()) {
               if ($$16 == cnp.a) {
                  $$3.a(this.g(), true);
                  this.b(csd.i);
               } else {
                  $$3.a(this.g().a(1), true);
               }
            }
         } else if ($$2 == cnq.b) {
            if ($$0 < 0) {
               return;
            }

            cpd $$17 = this.i.get($$0);
            if (!$$17.a($$3)) {
               return;
            }

            csd $$18 = this.a($$3, $$0);

            while (!$$18.d() && csd.b($$17.g(), $$18)) {
               $$18 = this.a($$3, $$0);
            }
         } else {
            if ($$0 < 0) {
               return;
            }

            cpd $$19 = this.i.get($$0);
            csd $$20 = $$19.g();
            csd $$21 = this.g();
            $$3.a($$21, $$19.g(), $$16);
            if (!this.a($$3, $$16, $$19, $$20, $$21)) {
               if ($$20.d()) {
                  if (!$$21.d()) {
                     int $$22 = $$16 == cnp.a ? $$21.G() : 1;
                     this.b($$19.b($$21, $$22));
                  }
               } else if ($$19.a($$3)) {
                  if ($$21.d()) {
                     int $$23 = $$16 == cnp.a ? $$20.G() : ($$20.G() + 1) / 2;
                     Optional<csd> $$24 = $$19.a($$23, Integer.MAX_VALUE, $$3);
                     $$24.ifPresent($$2x -> {
                        this.b($$2x);
                        $$19.a($$3, $$2x);
                     });
                  } else if ($$19.a($$21)) {
                     if (csd.c($$20, $$21)) {
                        int $$25 = $$16 == cnp.a ? $$21.G() : 1;
                        this.b($$19.b($$21, $$25));
                     } else if ($$21.G() <= $$19.a_($$21)) {
                        this.b($$20);
                        $$19.e($$21);
                     }
                  } else if (csd.c($$20, $$21)) {
                     Optional<csd> $$26 = $$19.a($$20.G(), $$21.i() - $$21.G(), $$3);
                     $$26.ifPresent($$3x -> {
                        $$21.f($$3x.G());
                        $$19.a($$3, $$3x);
                     });
                  }
               }
            }

            $$19.b();
         }
      } else if ($$2 == cnq.c && ($$1 >= 0 && $$1 < 9 || $$1 == 40)) {
         csd $$27 = $$4.a($$1);
         cpd $$28 = this.i.get($$0);
         csd $$29 = $$28.g();
         if (!$$27.d() || !$$29.d()) {
            if ($$27.d()) {
               if ($$28.a($$3)) {
                  $$4.a($$1, $$29);
                  $$28.b($$29.G());
                  $$28.e(csd.i);
                  $$28.a($$3, $$29);
               }
            } else if ($$29.d()) {
               if ($$28.a($$27)) {
                  int $$30 = $$28.a_($$27);
                  if ($$27.G() > $$30) {
                     $$28.e($$27.a($$30));
                  } else {
                     $$4.a($$1, csd.i);
                     $$28.e($$27);
                  }
               }
            } else if ($$28.a($$3) && $$28.a($$27)) {
               int $$31 = $$28.a_($$27);
               if ($$27.G() > $$31) {
                  $$28.e($$27.a($$31));
                  $$28.a($$3, $$29);
                  if (!$$4.e($$29)) {
                     $$3.a($$29, true);
                  }
               } else {
                  $$4.a($$1, $$29);
                  $$28.e($$27);
                  $$28.a($$3, $$29);
               }
            }
         }
      } else if ($$2 == cnq.d && $$3.fN() && this.g().d() && $$0 >= 0) {
         cpd $$32 = this.i.get($$0);
         if ($$32.h()) {
            csd $$33 = $$32.g();
            this.b($$33.c($$33.i()));
         }
      } else if ($$2 == cnq.e && this.g().d() && $$0 >= 0) {
         cpd $$34 = this.i.get($$0);
         int $$35 = $$1 == 0 ? 1 : $$34.g().G();
         csd $$36 = $$34.b($$35, Integer.MAX_VALUE, $$3);
         $$3.a($$36, true);
      } else if ($$2 == cnq.g && $$0 >= 0) {
         cpd $$37 = this.i.get($$0);
         csd $$38 = this.g();
         if (!$$38.d() && (!$$37.h() || !$$37.a($$3))) {
            int $$39 = $$1 == 0 ? 0 : this.i.size() - 1;
            int $$40 = $$1 == 0 ? 1 : -1;

            for (int $$41 = 0; $$41 < 2; $$41++) {
               for (int $$42 = $$39; $$42 >= 0 && $$42 < this.i.size() && $$38.G() < $$38.i(); $$42 += $$40) {
                  cpd $$43 = this.i.get($$42);
                  if ($$43.h() && a($$43, $$38, true) && $$43.a($$3) && this.a($$38, $$43)) {
                     csd $$44 = $$43.g();
                     if ($$41 != 0 || $$44.G() != $$44.i()) {
                        csd $$45 = $$43.b($$44.G(), $$38.i() - $$38.G(), $$3);
                        $$38.f($$45.G());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(ckl $$0, cnp $$1, cpd $$2, csd $$3, csd $$4) {
      cmy $$5 = $$0.dN().J();
      return $$4.a($$5) && $$4.a($$2, $$1, $$0) ? true : $$3.a($$5) && $$3.a($$4, $$2, $$1, $$0, this.m());
   }

   private brv m() {
      return new brv() {
         @Override
         public csd a() {
            return cnh.this.g();
         }

         @Override
         public boolean a(csd $$0) {
            cnh.this.b($$0);
            return true;
         }
      };
   }

   public boolean a(csd $$0, cpd $$1) {
      return true;
   }

   public void b(ckl $$0) {
      if ($$0 instanceof aqf) {
         csd $$1 = this.g();
         if (!$$1.d()) {
            if ($$0.bB() && !((aqf)$$0).v()) {
               $$0.ga().f($$1);
            } else {
               $$0.a($$1, false);
            }

            this.b(csd.i);
         }
      }
   }

   protected void a(ckl $$0, boj $$1) {
      if (!$$0.bB() || $$0 instanceof aqf && ((aqf)$$0).v()) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            $$0.a($$1.b($$2), false);
         }
      } else {
         for (int $$3 = 0; $$3 < $$1.b(); $$3++) {
            ckk $$4 = $$0.ga();
            if ($$4.m instanceof aqf) {
               $$4.f($$1.b($$3));
            }
         }
      }
   }

   public void a(boj $$0) {
      this.d();
   }

   public void a(int $$0, int $$1, csd $$2) {
      this.b($$0).f($$2);
      this.r = $$1;
   }

   public void a(int $$0, List<csd> $$1, csd $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         this.b($$3).f($$1.get($$3));
      }

      this.n = $$2;
      this.r = $$0;
   }

   public void a(int $$0, int $$1) {
      this.m.get($$0).a($$1);
   }

   public abstract boolean a(ckl var1);

   protected boolean a(csd $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = false;
      int $$5 = $$1;
      if ($$3) {
         $$5 = $$2 - 1;
      }

      if ($$0.j()) {
         while (!$$0.d() && ($$3 ? $$5 >= $$1 : $$5 < $$2)) {
            cpd $$6 = this.i.get($$5);
            csd $$7 = $$6.g();
            if (!$$7.d() && csd.c($$0, $$7)) {
               int $$8 = $$7.G() + $$0.G();
               if ($$8 <= $$0.i()) {
                  $$0.e(0);
                  $$7.e($$8);
                  $$6.b();
                  $$4 = true;
               } else if ($$7.G() < $$0.i()) {
                  $$0.g($$0.i() - $$7.G());
                  $$7.e($$0.i());
                  $$6.b();
                  $$4 = true;
               }
            }

            if ($$3) {
               $$5--;
            } else {
               $$5++;
            }
         }
      }

      if (!$$0.d()) {
         if ($$3) {
            $$5 = $$2 - 1;
         } else {
            $$5 = $$1;
         }

         while ($$3 ? $$5 >= $$1 : $$5 < $$2) {
            cpd $$9 = this.i.get($$5);
            csd $$10 = $$9.g();
            if ($$10.d() && $$9.a($$0)) {
               if ($$0.G() > $$9.a()) {
                  $$9.e($$0.a($$9.a()));
               } else {
                  $$9.e($$0.a($$0.G()));
               }

               $$9.b();
               $$4 = true;
               break;
            }

            if ($$3) {
               $$5--;
            } else {
               $$5++;
            }
         }
      }

      return $$4;
   }

   public static int c(int $$0) {
      return $$0 >> 2 & 3;
   }

   public static int d(int $$0) {
      return $$0 & 3;
   }

   public static int b(int $$0, int $$1) {
      return $$0 & 3 | ($$1 & 3) << 2;
   }

   public static boolean a(int $$0, ckl $$1) {
      if ($$0 == 0) {
         return true;
      } else {
         return $$0 == 1 ? true : $$0 == 2 && $$1.fN();
      }
   }

   protected void f() {
      this.u = 0;
      this.v.clear();
   }

   public static boolean a(@Nullable cpd $$0, csd $$1, boolean $$2) {
      boolean $$3 = $$0 == null || !$$0.h();
      return !$$3 && csd.c($$1, $$0.g()) ? $$0.g().G() + ($$2 ? 0 : $$1.G()) <= $$1.i() : $$3;
   }

   public static int a(Set<cpd> $$0, int $$1, csd $$2) {
      return switch ($$1) {
         case 0 -> axw.d((float)$$2.G() / (float)$$0.size());
         case 1 -> 1;
         case 2 -> $$2.i();
         default -> $$2.G();
      };
   }

   public boolean b(cpd $$0) {
      return true;
   }

   public static int a(@Nullable dnd $$0) {
      return $$0 instanceof boj ? b((boj)$$0) : 0;
   }

   public static int b(@Nullable boj $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         float $$1 = 0.0F;

         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            csd $$3 = $$0.a($$2);
            if (!$$3.d()) {
               $$1 += (float)$$3.G() / (float)Math.min($$0.ah_(), $$3.i());
            }
         }

         $$1 /= (float)$$0.b();
         return axw.b($$1, 0, 15);
      }
   }

   public void b(csd $$0) {
      this.n = $$0;
   }

   public csd g() {
      return this.n;
   }

   public void h() {
      this.y = true;
   }

   public void i() {
      this.y = false;
   }

   public void a(cnh $$0) {
      Table<boj, Integer, Integer> $$1 = HashBasedTable.create();

      for (int $$2 = 0; $$2 < $$0.i.size(); $$2++) {
         cpd $$3 = $$0.i.get($$2);
         $$1.put($$3.d, $$3.i(), $$2);
      }

      for (int $$4 = 0; $$4 < this.i.size(); $$4++) {
         cpd $$5 = this.i.get($$4);
         Integer $$6 = (Integer)$$1.get($$5.d, $$5.i());
         if ($$6 != null) {
            this.l.set($$4, $$0.l.get($$6));
            this.o.set($$4, $$0.o.get($$6));
         }
      }
   }

   public OptionalInt b(boj $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         cpd $$3 = this.i.get($$2);
         if ($$3.d == $$0 && $$1 == $$3.i()) {
            return OptionalInt.of($$2);
         }
      }

      return OptionalInt.empty();
   }

   public int j() {
      return this.r;
   }

   public int k() {
      this.r = this.r + 1 & 32767;
      return this.r;
   }
}
