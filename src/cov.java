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

public abstract class cov {
   private static final Logger k = LogUtils.getLogger();
   public static final int a = -999;
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 0;
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = Integer.MAX_VALUE;
   private final jg<ctq> l = jg.a();
   public final jg<cqq> i = jg.a();
   private final List<cpn> m = Lists.newArrayList();
   private ctq n = ctq.i;
   private final jg<ctq> o = jg.a();
   private final IntList p = new IntArrayList();
   private ctq q = ctq.i;
   private int r;
   @Nullable
   private final cqc<?> s;
   public final int j;
   private int t = -1;
   private int u;
   private final Set<cqq> v = Sets.newHashSet();
   private final List<cph> w = Lists.newArrayList();
   @Nullable
   private cpi x;
   private boolean y;

   protected cov(@Nullable cqc<?> $$0, int $$1) {
      this.s = $$0;
      this.j = $$1;
   }

   protected static boolean a(cpg $$0, cly $$1, dea $$2) {
      return $$0.a(($$2x, $$3) -> !$$2x.a_($$3).a($$2) ? false : $$1.a($$3, 4.0), true);
   }

   public cqc<?> a() {
      if (this.s == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.s;
      }
   }

   protected static void a(bpp $$0, int $$1) {
      int $$2 = $$0.b();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container size " + $$2 + " is smaller than expected " + $$1);
      }
   }

   protected static void a(cpf $$0, int $$1) {
      int $$2 = $$0.a();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container data count " + $$2 + " is smaller than expected " + $$1);
      }
   }

   public boolean a(int $$0) {
      return $$0 == -1 || $$0 == -999 || $$0 < this.i.size();
   }

   protected cqq a(cqq $$0) {
      $$0.d = this.i.size();
      this.i.add($$0);
      this.l.add(ctq.i);
      this.o.add(ctq.i);
      return $$0;
   }

   protected cpn a(cpn $$0) {
      this.m.add($$0);
      this.p.add(0);
      return $$0;
   }

   protected void a(cpf $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         this.a(cpn.a($$0, $$1));
      }
   }

   public void a(cph $$0) {
      if (!this.w.contains($$0)) {
         this.w.add($$0);
         this.d();
      }
   }

   public void a(cpi $$0) {
      this.x = $$0;
      this.b();
   }

   public void b() {
      int $$0 = 0;

      for (int $$1 = this.i.size(); $$0 < $$1; $$0++) {
         this.o.set($$0, this.i.get($$0).g().s());
      }

      this.q = this.g().s();
      $$0 = 0;

      for (int $$3 = this.m.size(); $$0 < $$3; $$0++) {
         this.p.set($$0, this.m.get($$0).b());
      }

      if (this.x != null) {
         this.x.a(this, this.o, this.q, this.p.toIntArray());
      }
   }

   public void b(cph $$0) {
      this.w.remove($$0);
   }

   public jg<ctq> c() {
      jg<ctq> $$0 = jg.a();

      for (cqq $$1 : this.i) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void d() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         ctq $$1 = this.i.get($$0).g();
         Supplier<ctq> $$2 = Suppliers.memoize($$1::s);
         this.a($$0, $$1, $$2);
         this.b($$0, $$1, $$2);
      }

      this.l();

      for (int $$3 = 0; $$3 < this.m.size(); $$3++) {
         cpn $$4 = this.m.get($$3);
         int $$5 = $$4.b();
         if ($$4.c()) {
            this.c($$3, $$5);
         }

         this.d($$3, $$5);
      }
   }

   public void e() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         ctq $$1 = this.i.get($$0).g();
         this.a($$0, $$1, $$1::s);
      }

      for (int $$2 = 0; $$2 < this.m.size(); $$2++) {
         cpn $$3 = this.m.get($$2);
         if ($$3.c()) {
            this.c($$2, $$3.b());
         }
      }

      this.b();
   }

   private void c(int $$0, int $$1) {
      for (cph $$2 : this.w) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void a(int $$0, ctq $$1, Supplier<ctq> $$2) {
      ctq $$3 = this.l.get($$0);
      if (!ctq.a($$3, $$1)) {
         ctq $$4 = $$2.get();
         this.l.set($$0, $$4);

         for (cph $$5 : this.w) {
            $$5.a(this, $$0, $$4);
         }
      }
   }

   private void b(int $$0, ctq $$1, Supplier<ctq> $$2) {
      if (!this.y) {
         ctq $$3 = this.o.get($$0);
         if (!ctq.a($$3, $$1)) {
            ctq $$4 = $$2.get();
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
         if (!ctq.a(this.g(), this.q)) {
            this.q = this.g().s();
            if (this.x != null) {
               this.x.a(this, this.q);
            }
         }
      }
   }

   public void a(int $$0, ctq $$1) {
      this.o.set($$0, $$1.s());
   }

   public void b(int $$0, ctq $$1) {
      if ($$0 >= 0 && $$0 < this.o.size()) {
         this.o.set($$0, $$1);
      } else {
         k.debug("Incorrect slot index: {} available slots: {}", $$0, this.o.size());
      }
   }

   public void a(ctq $$0) {
      this.q = $$0.s();
   }

   public boolean b(cly $$0, int $$1) {
      return false;
   }

   public cqq b(int $$0) {
      return this.i.get($$0);
   }

   public abstract ctq a(cly var1, int var2);

   public void a(int $$0, int $$1, cpe $$2, cly $$3) {
      try {
         this.b($$0, $$1, $$2, $$3);
      } catch (Exception var8) {
         o $$5 = o.a(var8, "Container click");
         p $$6 = $$5.a("Click info");
         $$6.a("Menu Type", () -> this.s != null ? le.r.b(this.s).toString() : "<no type>");
         $$6.a("Menu Class", () -> this.getClass().getCanonicalName());
         $$6.a("Slot Count", this.i.size());
         $$6.a("Slot", $$0);
         $$6.a("Button", $$1);
         $$6.a("Type", $$2);
         throw new y($$5);
      }
   }

   private void b(int $$0, int $$1, cpe $$2, cly $$3) {
      clx $$4 = $$3.gc();
      if ($$2 == cpe.f) {
         int $$5 = this.u;
         this.u = d($$1);
         if (($$5 != 1 || this.u != 2) && $$5 != this.u) {
            this.f();
         } else if (this.g().e()) {
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
            cqq $$6 = this.i.get($$0);
            ctq $$7 = this.g();
            if (a($$6, $$7, true) && $$6.a($$7) && (this.t == 2 || $$7.I() > this.v.size()) && this.b($$6)) {
               this.v.add($$6);
            }
         } else if (this.u == 2) {
            if (!this.v.isEmpty()) {
               if (this.v.size() == 1) {
                  int $$8 = this.v.iterator().next().d;
                  this.f();
                  this.b($$8, this.t, cpe.a, $$3);
                  return;
               }

               ctq $$9 = this.g().s();
               if ($$9.e()) {
                  this.f();
                  return;
               }

               int $$10 = this.g().I();

               for (cqq $$11 : this.v) {
                  ctq $$12 = this.g();
                  if ($$11 != null && a($$11, $$12, true) && $$11.a($$12) && (this.t == 2 || $$12.I() >= this.v.size()) && this.b($$11)) {
                     int $$13 = $$11.h() ? $$11.g().I() : 0;
                     int $$14 = Math.min($$9.j(), $$11.a_($$9));
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
      } else if (($$2 == cpe.a || $$2 == cpe.b) && ($$1 == 0 || $$1 == 1)) {
         cpd $$16 = $$1 == 0 ? cpd.a : cpd.b;
         if ($$0 == -999) {
            if (!this.g().e()) {
               if ($$16 == cpd.a) {
                  $$3.a(this.g(), true);
                  this.b(ctq.i);
               } else {
                  $$3.a(this.g().a(1), true);
               }
            }
         } else if ($$2 == cpe.b) {
            if ($$0 < 0) {
               return;
            }

            cqq $$17 = this.i.get($$0);
            if (!$$17.a($$3)) {
               return;
            }

            ctq $$18 = this.a($$3, $$0);

            while (!$$18.e() && ctq.b($$17.g(), $$18)) {
               $$18 = this.a($$3, $$0);
            }
         } else {
            if ($$0 < 0) {
               return;
            }

            cqq $$19 = this.i.get($$0);
            ctq $$20 = $$19.g();
            ctq $$21 = this.g();
            $$3.a($$21, $$19.g(), $$16);
            if (!this.a($$3, $$16, $$19, $$20, $$21)) {
               if ($$20.e()) {
                  if (!$$21.e()) {
                     int $$22 = $$16 == cpd.a ? $$21.I() : 1;
                     this.b($$19.b($$21, $$22));
                  }
               } else if ($$19.a($$3)) {
                  if ($$21.e()) {
                     int $$23 = $$16 == cpd.a ? $$20.I() : ($$20.I() + 1) / 2;
                     Optional<ctq> $$24 = $$19.a($$23, Integer.MAX_VALUE, $$3);
                     $$24.ifPresent($$2x -> {
                        this.b($$2x);
                        $$19.a($$3, $$2x);
                     });
                  } else if ($$19.a($$21)) {
                     if (ctq.c($$20, $$21)) {
                        int $$25 = $$16 == cpd.a ? $$21.I() : 1;
                        this.b($$19.b($$21, $$25));
                     } else if ($$21.I() <= $$19.a_($$21)) {
                        this.b($$20);
                        $$19.e($$21);
                     }
                  } else if (ctq.c($$20, $$21)) {
                     Optional<ctq> $$26 = $$19.a($$20.I(), $$21.j() - $$21.I(), $$3);
                     $$26.ifPresent($$3x -> {
                        $$21.g($$3x.I());
                        $$19.a($$3, $$3x);
                     });
                  }
               }
            }

            $$19.b();
         }
      } else if ($$2 == cpe.c && ($$1 >= 0 && $$1 < 9 || $$1 == 40)) {
         ctq $$27 = $$4.a($$1);
         cqq $$28 = this.i.get($$0);
         ctq $$29 = $$28.g();
         if (!$$27.e() || !$$29.e()) {
            if ($$27.e()) {
               if ($$28.a($$3)) {
                  $$4.a($$1, $$29);
                  $$28.b($$29.I());
                  $$28.e(ctq.i);
                  $$28.a($$3, $$29);
               }
            } else if ($$29.e()) {
               if ($$28.a($$27)) {
                  int $$30 = $$28.a_($$27);
                  if ($$27.I() > $$30) {
                     $$28.e($$27.a($$30));
                  } else {
                     $$4.a($$1, ctq.i);
                     $$28.e($$27);
                  }
               }
            } else if ($$28.a($$3) && $$28.a($$27)) {
               int $$31 = $$28.a_($$27);
               if ($$27.I() > $$31) {
                  $$28.e($$27.a($$31));
                  $$28.a($$3, $$29);
                  if (!$$4.f($$29)) {
                     $$3.a($$29, true);
                  }
               } else {
                  $$4.a($$1, $$29);
                  $$28.e($$27);
                  $$28.a($$3, $$29);
               }
            }
         }
      } else if ($$2 == cpe.d && $$3.fP() && this.g().e() && $$0 >= 0) {
         cqq $$32 = this.i.get($$0);
         if ($$32.h()) {
            ctq $$33 = $$32.g();
            this.b($$33.c($$33.j()));
         }
      } else if ($$2 == cpe.e && this.g().e() && $$0 >= 0) {
         cqq $$34 = this.i.get($$0);
         int $$35 = $$1 == 0 ? 1 : $$34.g().I();
         ctq $$36 = $$34.b($$35, Integer.MAX_VALUE, $$3);
         $$3.a($$36, true);
      } else if ($$2 == cpe.g && $$0 >= 0) {
         cqq $$37 = this.i.get($$0);
         ctq $$38 = this.g();
         if (!$$38.e() && (!$$37.h() || !$$37.a($$3))) {
            int $$39 = $$1 == 0 ? 0 : this.i.size() - 1;
            int $$40 = $$1 == 0 ? 1 : -1;

            for (int $$41 = 0; $$41 < 2; $$41++) {
               for (int $$42 = $$39; $$42 >= 0 && $$42 < this.i.size() && $$38.I() < $$38.j(); $$42 += $$40) {
                  cqq $$43 = this.i.get($$42);
                  if ($$43.h() && a($$43, $$38, true) && $$43.a($$3) && this.a($$38, $$43)) {
                     ctq $$44 = $$43.g();
                     if ($$41 != 0 || $$44.I() != $$44.j()) {
                        ctq $$45 = $$43.b($$44.I(), $$38.j() - $$38.I(), $$3);
                        $$38.g($$45.I());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cly $$0, cpd $$1, cqq $$2, ctq $$3, ctq $$4) {
      col $$5 = $$0.dP().J();
      return $$4.a($$5) && $$4.a($$2, $$1, $$0) ? true : $$3.a($$5) && $$3.a($$4, $$2, $$1, $$0, this.m());
   }

   private bti m() {
      return new bti() {
         @Override
         public ctq a() {
            return cov.this.g();
         }

         @Override
         public boolean a(ctq $$0) {
            cov.this.b($$0);
            return true;
         }
      };
   }

   public boolean a(ctq $$0, cqq $$1) {
      return true;
   }

   public void b(cly $$0) {
      if ($$0 instanceof aqo) {
         ctq $$1 = this.g();
         if (!$$1.e()) {
            if ($$0.bD() && !((aqo)$$0).v()) {
               $$0.gc().g($$1);
            } else {
               $$0.a($$1, false);
            }

            this.b(ctq.i);
         }
      }
   }

   protected void a(cly $$0, bpp $$1) {
      if (!$$0.bD() || $$0 instanceof aqo && ((aqo)$$0).v()) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            $$0.a($$1.b($$2), false);
         }
      } else {
         for (int $$3 = 0; $$3 < $$1.b(); $$3++) {
            clx $$4 = $$0.gc();
            if ($$4.l instanceof aqo) {
               $$4.g($$1.b($$3));
            }
         }
      }
   }

   public void a(bpp $$0) {
      this.d();
   }

   public void a(int $$0, int $$1, ctq $$2) {
      this.b($$0).f($$2);
      this.r = $$1;
   }

   public void a(int $$0, List<ctq> $$1, ctq $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         this.b($$3).f($$1.get($$3));
      }

      this.n = $$2;
      this.r = $$0;
   }

   public void a(int $$0, int $$1) {
      this.m.get($$0).a($$1);
   }

   public abstract boolean a(cly var1);

   protected boolean a(ctq $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = false;
      int $$5 = $$1;
      if ($$3) {
         $$5 = $$2 - 1;
      }

      if ($$0.k()) {
         while (!$$0.e() && ($$3 ? $$5 >= $$1 : $$5 < $$2)) {
            cqq $$6 = this.i.get($$5);
            ctq $$7 = $$6.g();
            if (!$$7.e() && ctq.c($$0, $$7)) {
               int $$8 = $$7.I() + $$0.I();
               if ($$8 <= $$0.j()) {
                  $$0.e(0);
                  $$7.e($$8);
                  $$6.b();
                  $$4 = true;
               } else if ($$7.I() < $$0.j()) {
                  $$0.h($$0.j() - $$7.I());
                  $$7.e($$0.j());
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

      if (!$$0.e()) {
         if ($$3) {
            $$5 = $$2 - 1;
         } else {
            $$5 = $$1;
         }

         while ($$3 ? $$5 >= $$1 : $$5 < $$2) {
            cqq $$9 = this.i.get($$5);
            ctq $$10 = $$9.g();
            if ($$10.e() && $$9.a($$0)) {
               int $$11 = $$9.a_($$0);
               $$9.e($$0.a(Math.min($$0.I(), $$11)));
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

   public static boolean a(int $$0, cly $$1) {
      if ($$0 == 0) {
         return true;
      } else {
         return $$0 == 1 ? true : $$0 == 2 && $$1.fP();
      }
   }

   protected void f() {
      this.u = 0;
      this.v.clear();
   }

   public static boolean a(@Nullable cqq $$0, ctq $$1, boolean $$2) {
      boolean $$3 = $$0 == null || !$$0.h();
      return !$$3 && ctq.c($$1, $$0.g()) ? $$0.g().I() + ($$2 ? 0 : $$1.I()) <= $$1.j() : $$3;
   }

   public static int a(Set<cqq> $$0, int $$1, ctq $$2) {
      return switch ($$1) {
         case 0 -> ayf.d((float)$$2.I() / (float)$$0.size());
         case 1 -> 1;
         case 2 -> $$2.j();
         default -> $$2.I();
      };
   }

   public boolean b(cqq $$0) {
      return true;
   }

   public static int a(@Nullable doi $$0) {
      return $$0 instanceof bpp ? b((bpp)$$0) : 0;
   }

   public static int b(@Nullable bpp $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         float $$1 = 0.0F;

         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            ctq $$3 = $$0.a($$2);
            if (!$$3.e()) {
               $$1 += (float)$$3.I() / (float)$$0.e_($$3);
            }
         }

         $$1 /= (float)$$0.b();
         return ayf.b($$1, 0, 15);
      }
   }

   public void b(ctq $$0) {
      this.n = $$0;
   }

   public ctq g() {
      return this.n;
   }

   public void h() {
      this.y = true;
   }

   public void i() {
      this.y = false;
   }

   public void a(cov $$0) {
      Table<bpp, Integer, Integer> $$1 = HashBasedTable.create();

      for (int $$2 = 0; $$2 < $$0.i.size(); $$2++) {
         cqq $$3 = $$0.i.get($$2);
         $$1.put($$3.c, $$3.i(), $$2);
      }

      for (int $$4 = 0; $$4 < this.i.size(); $$4++) {
         cqq $$5 = this.i.get($$4);
         Integer $$6 = (Integer)$$1.get($$5.c, $$5.i());
         if ($$6 != null) {
            this.l.set($$4, $$0.l.get($$6));
            this.o.set($$4, $$0.o.get($$6));
         }
      }
   }

   public OptionalInt b(bpp $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         cqq $$3 = this.i.get($$2);
         if ($$3.c == $$0 && $$1 == $$3.i()) {
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
