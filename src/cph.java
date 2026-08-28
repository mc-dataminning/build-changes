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

public abstract class cph {
   private static final Logger k = LogUtils.getLogger();
   public static final int a = -999;
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 0;
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = Integer.MAX_VALUE;
   private final js<cuc> l = js.a();
   public final js<crd> i = js.a();
   private final List<cqa> m = Lists.newArrayList();
   private cuc n = cuc.l;
   private final js<cuc> o = js.a();
   private final IntList p = new IntArrayList();
   private cuc q = cuc.l;
   private int r;
   @Nullable
   private final cqp<?> s;
   public final int j;
   private int t = -1;
   private int u;
   private final Set<crd> v = Sets.newHashSet();
   private final List<cpu> w = Lists.newArrayList();
   @Nullable
   private cpv x;
   private boolean y;

   protected cph(@Nullable cqp<?> $$0, int $$1) {
      this.s = $$0;
      this.j = $$1;
   }

   protected static boolean a(cpt $$0, cmk $$1, dfh $$2) {
      return $$0.a(($$2x, $$3) -> !$$2x.a_($$3).a($$2) ? false : $$1.a($$3, 4.0), true);
   }

   public cqp<?> a() {
      if (this.s == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.s;
      }
   }

   protected static void a(bpz $$0, int $$1) {
      int $$2 = $$0.b();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container size " + $$2 + " is smaller than expected " + $$1);
      }
   }

   protected static void a(cps $$0, int $$1) {
      int $$2 = $$0.a();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container data count " + $$2 + " is smaller than expected " + $$1);
      }
   }

   public boolean a(int $$0) {
      return $$0 == -1 || $$0 == -999 || $$0 < this.i.size();
   }

   protected crd a(crd $$0) {
      $$0.d = this.i.size();
      this.i.add($$0);
      this.l.add(cuc.l);
      this.o.add(cuc.l);
      return $$0;
   }

   protected cqa a(cqa $$0) {
      this.m.add($$0);
      this.p.add(0);
      return $$0;
   }

   protected void a(cps $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         this.a(cqa.a($$0, $$1));
      }
   }

   public void a(cpu $$0) {
      if (!this.w.contains($$0)) {
         this.w.add($$0);
         this.d();
      }
   }

   public void a(cpv $$0) {
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

   public void b(cpu $$0) {
      this.w.remove($$0);
   }

   public js<cuc> c() {
      js<cuc> $$0 = js.a();

      for (crd $$1 : this.i) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void d() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         cuc $$1 = this.i.get($$0).g();
         Supplier<cuc> $$2 = Suppliers.memoize($$1::s);
         this.a($$0, $$1, $$2);
         this.b($$0, $$1, $$2);
      }

      this.l();

      for (int $$3 = 0; $$3 < this.m.size(); $$3++) {
         cqa $$4 = this.m.get($$3);
         int $$5 = $$4.b();
         if ($$4.c()) {
            this.c($$3, $$5);
         }

         this.d($$3, $$5);
      }
   }

   public void e() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         cuc $$1 = this.i.get($$0).g();
         this.a($$0, $$1, $$1::s);
      }

      for (int $$2 = 0; $$2 < this.m.size(); $$2++) {
         cqa $$3 = this.m.get($$2);
         if ($$3.c()) {
            this.c($$2, $$3.b());
         }
      }

      this.b();
   }

   private void c(int $$0, int $$1) {
      for (cpu $$2 : this.w) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void a(int $$0, cuc $$1, Supplier<cuc> $$2) {
      cuc $$3 = this.l.get($$0);
      if (!cuc.a($$3, $$1)) {
         cuc $$4 = $$2.get();
         this.l.set($$0, $$4);

         for (cpu $$5 : this.w) {
            $$5.a(this, $$0, $$4);
         }
      }
   }

   private void b(int $$0, cuc $$1, Supplier<cuc> $$2) {
      if (!this.y) {
         cuc $$3 = this.o.get($$0);
         if (!cuc.a($$3, $$1)) {
            cuc $$4 = $$2.get();
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
         if (!cuc.a(this.g(), this.q)) {
            this.q = this.g().s();
            if (this.x != null) {
               this.x.a(this, this.q);
            }
         }
      }
   }

   public void a(int $$0, cuc $$1) {
      this.o.set($$0, $$1.s());
   }

   public void b(int $$0, cuc $$1) {
      if ($$0 >= 0 && $$0 < this.o.size()) {
         this.o.set($$0, $$1);
      } else {
         k.debug("Incorrect slot index: {} available slots: {}", $$0, this.o.size());
      }
   }

   public void a(cuc $$0) {
      this.q = $$0.s();
   }

   public boolean a(cmk $$0, int $$1) {
      return false;
   }

   public crd b(int $$0) {
      return this.i.get($$0);
   }

   public abstract cuc b(cmk var1, int var2);

   public void a(int $$0, int $$1, cpr $$2, cmk $$3) {
      try {
         this.b($$0, $$1, $$2, $$3);
      } catch (Exception var8) {
         o $$5 = o.a(var8, "Container click");
         p $$6 = $$5.a("Click info");
         $$6.a("Menu Type", () -> this.s != null ? lq.p.b(this.s).toString() : "<no type>");
         $$6.a("Menu Class", () -> this.getClass().getCanonicalName());
         $$6.a("Slot Count", this.i.size());
         $$6.a("Slot", $$0);
         $$6.a("Button", $$1);
         $$6.a("Type", $$2);
         throw new y($$5);
      }
   }

   private void b(int $$0, int $$1, cpr $$2, cmk $$3) {
      cmj $$4 = $$3.fZ();
      if ($$2 == cpr.f) {
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
            crd $$6 = this.i.get($$0);
            cuc $$7 = this.g();
            if (a($$6, $$7, true) && $$6.a($$7) && (this.t == 2 || $$7.H() > this.v.size()) && this.b($$6)) {
               this.v.add($$6);
            }
         } else if (this.u == 2) {
            if (!this.v.isEmpty()) {
               if (this.v.size() == 1) {
                  int $$8 = this.v.iterator().next().d;
                  this.f();
                  this.b($$8, this.t, cpr.a, $$3);
                  return;
               }

               cuc $$9 = this.g().s();
               if ($$9.e()) {
                  this.f();
                  return;
               }

               int $$10 = this.g().H();

               for (crd $$11 : this.v) {
                  cuc $$12 = this.g();
                  if ($$11 != null && a($$11, $$12, true) && $$11.a($$12) && (this.t == 2 || $$12.H() >= this.v.size()) && this.b($$11)) {
                     int $$13 = $$11.h() ? $$11.g().H() : 0;
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
      } else if (($$2 == cpr.a || $$2 == cpr.b) && ($$1 == 0 || $$1 == 1)) {
         cpq $$16 = $$1 == 0 ? cpq.a : cpq.b;
         if ($$0 == -999) {
            if (!this.g().e()) {
               if ($$16 == cpq.a) {
                  $$3.a(this.g(), true);
                  this.b(cuc.l);
               } else {
                  $$3.a(this.g().a(1), true);
               }
            }
         } else if ($$2 == cpr.b) {
            if ($$0 < 0) {
               return;
            }

            crd $$17 = this.i.get($$0);
            if (!$$17.a($$3)) {
               return;
            }

            cuc $$18 = this.b($$3, $$0);

            while (!$$18.e() && cuc.b($$17.g(), $$18)) {
               $$18 = this.b($$3, $$0);
            }
         } else {
            if ($$0 < 0) {
               return;
            }

            crd $$19 = this.i.get($$0);
            cuc $$20 = $$19.g();
            cuc $$21 = this.g();
            $$3.a($$21, $$19.g(), $$16);
            if (!this.a($$3, $$16, $$19, $$20, $$21)) {
               if ($$20.e()) {
                  if (!$$21.e()) {
                     int $$22 = $$16 == cpq.a ? $$21.H() : 1;
                     this.b($$19.b($$21, $$22));
                  }
               } else if ($$19.a($$3)) {
                  if ($$21.e()) {
                     int $$23 = $$16 == cpq.a ? $$20.H() : ($$20.H() + 1) / 2;
                     Optional<cuc> $$24 = $$19.a($$23, Integer.MAX_VALUE, $$3);
                     $$24.ifPresent($$2x -> {
                        this.b($$2x);
                        $$19.a($$3, $$2x);
                     });
                  } else if ($$19.a($$21)) {
                     if (cuc.c($$20, $$21)) {
                        int $$25 = $$16 == cpq.a ? $$21.H() : 1;
                        this.b($$19.b($$21, $$25));
                     } else if ($$21.H() <= $$19.a_($$21)) {
                        this.b($$20);
                        $$19.e($$21);
                     }
                  } else if (cuc.c($$20, $$21)) {
                     Optional<cuc> $$26 = $$19.a($$20.H(), $$21.j() - $$21.H(), $$3);
                     $$26.ifPresent($$3x -> {
                        $$21.g($$3x.H());
                        $$19.a($$3, $$3x);
                     });
                  }
               }
            }

            $$19.c();
         }
      } else if ($$2 == cpr.c && ($$1 >= 0 && $$1 < 9 || $$1 == 40)) {
         cuc $$27 = $$4.a($$1);
         crd $$28 = this.i.get($$0);
         cuc $$29 = $$28.g();
         if (!$$27.e() || !$$29.e()) {
            if ($$27.e()) {
               if ($$28.a($$3)) {
                  $$4.a($$1, $$29);
                  $$28.b($$29.H());
                  $$28.e(cuc.l);
                  $$28.a($$3, $$29);
               }
            } else if ($$29.e()) {
               if ($$28.a($$27)) {
                  int $$30 = $$28.a_($$27);
                  if ($$27.H() > $$30) {
                     $$28.e($$27.a($$30));
                  } else {
                     $$4.a($$1, cuc.l);
                     $$28.e($$27);
                  }
               }
            } else if ($$28.a($$3) && $$28.a($$27)) {
               int $$31 = $$28.a_($$27);
               if ($$27.H() > $$31) {
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
      } else if ($$2 == cpr.d && $$3.fM() && this.g().e() && $$0 >= 0) {
         crd $$32 = this.i.get($$0);
         if ($$32.h()) {
            cuc $$33 = $$32.g();
            this.b($$33.c($$33.j()));
         }
      } else if ($$2 == cpr.e && this.g().e() && $$0 >= 0) {
         crd $$34 = this.i.get($$0);
         int $$35 = $$1 == 0 ? 1 : $$34.g().H();
         cuc $$36 = $$34.b($$35, Integer.MAX_VALUE, $$3);
         $$3.a($$36, true);
      } else if ($$2 == cpr.g && $$0 >= 0) {
         crd $$37 = this.i.get($$0);
         cuc $$38 = this.g();
         if (!$$38.e() && (!$$37.h() || !$$37.a($$3))) {
            int $$39 = $$1 == 0 ? 0 : this.i.size() - 1;
            int $$40 = $$1 == 0 ? 1 : -1;

            for (int $$41 = 0; $$41 < 2; $$41++) {
               for (int $$42 = $$39; $$42 >= 0 && $$42 < this.i.size() && $$38.H() < $$38.j(); $$42 += $$40) {
                  crd $$43 = this.i.get($$42);
                  if ($$43.h() && a($$43, $$38, true) && $$43.a($$3) && this.a($$38, $$43)) {
                     cuc $$44 = $$43.g();
                     if ($$41 != 0 || $$44.H() != $$44.j()) {
                        cuc $$45 = $$43.b($$44.H(), $$38.j() - $$38.H(), $$3);
                        $$38.g($$45.H());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cmk $$0, cpq $$1, crd $$2, cuc $$3, cuc $$4) {
      coy $$5 = $$0.dQ().J();
      return $$4.a($$5) && $$4.a($$2, $$1, $$0) ? true : $$3.a($$5) && $$3.a($$4, $$2, $$1, $$0, this.m());
   }

   private btt m() {
      return new btt() {
         @Override
         public cuc a() {
            return cph.this.g();
         }

         @Override
         public boolean a(cuc $$0) {
            cph.this.b($$0);
            return true;
         }
      };
   }

   public boolean a(cuc $$0, crd $$1) {
      return true;
   }

   public void a(cmk $$0) {
      if ($$0 instanceof aqn) {
         cuc $$1 = this.g();
         if (!$$1.e()) {
            if ($$0.bE() && !((aqn)$$0).v()) {
               $$0.fZ().g($$1);
            } else {
               $$0.a($$1, false);
            }

            this.b(cuc.l);
         }
      }
   }

   protected void a(cmk $$0, bpz $$1) {
      if (!$$0.bE() || $$0 instanceof aqn && ((aqn)$$0).v()) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            $$0.a($$1.b($$2), false);
         }
      } else {
         for (int $$3 = 0; $$3 < $$1.b(); $$3++) {
            cmj $$4 = $$0.fZ();
            if ($$4.l instanceof aqn) {
               $$4.g($$1.b($$3));
            }
         }
      }
   }

   public void a(bpz $$0) {
      this.d();
   }

   public void a(int $$0, int $$1, cuc $$2) {
      this.b($$0).f($$2);
      this.r = $$1;
   }

   public void a(int $$0, List<cuc> $$1, cuc $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         this.b($$3).f($$1.get($$3));
      }

      this.n = $$2;
      this.r = $$0;
   }

   public void a(int $$0, int $$1) {
      this.m.get($$0).a($$1);
   }

   public abstract boolean b(cmk var1);

   protected boolean a(cuc $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = false;
      int $$5 = $$1;
      if ($$3) {
         $$5 = $$2 - 1;
      }

      if ($$0.k()) {
         while (!$$0.e() && ($$3 ? $$5 >= $$1 : $$5 < $$2)) {
            crd $$6 = this.i.get($$5);
            cuc $$7 = $$6.g();
            if (!$$7.e() && cuc.c($$0, $$7)) {
               int $$8 = $$7.H() + $$0.H();
               int $$9 = $$6.a_($$7);
               if ($$8 <= $$9) {
                  $$0.e(0);
                  $$7.e($$8);
                  $$6.c();
                  $$4 = true;
               } else if ($$7.H() < $$9) {
                  $$0.h($$9 - $$7.H());
                  $$7.e($$9);
                  $$6.c();
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
            crd $$10 = this.i.get($$5);
            cuc $$11 = $$10.g();
            if ($$11.e() && $$10.a($$0)) {
               int $$12 = $$10.a_($$0);
               $$10.e($$0.a(Math.min($$0.H(), $$12)));
               $$10.c();
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

   public static boolean a(int $$0, cmk $$1) {
      if ($$0 == 0) {
         return true;
      } else {
         return $$0 == 1 ? true : $$0 == 2 && $$1.fM();
      }
   }

   protected void f() {
      this.u = 0;
      this.v.clear();
   }

   public static boolean a(@Nullable crd $$0, cuc $$1, boolean $$2) {
      boolean $$3 = $$0 == null || !$$0.h();
      return !$$3 && cuc.c($$1, $$0.g()) ? $$0.g().H() + ($$2 ? 0 : $$1.H()) <= $$1.j() : $$3;
   }

   public static int a(Set<crd> $$0, int $$1, cuc $$2) {
      return switch ($$1) {
         case 0 -> ayg.d((float)$$2.H() / (float)$$0.size());
         case 1 -> 1;
         case 2 -> $$2.j();
         default -> $$2.H();
      };
   }

   public boolean b(crd $$0) {
      return true;
   }

   public static int a(@Nullable dpp $$0) {
      return $$0 instanceof bpz ? b((bpz)$$0) : 0;
   }

   public static int b(@Nullable bpz $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         float $$1 = 0.0F;

         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cuc $$3 = $$0.a($$2);
            if (!$$3.e()) {
               $$1 += (float)$$3.H() / (float)$$0.e_($$3);
            }
         }

         $$1 /= (float)$$0.b();
         return ayg.b($$1, 0, 15);
      }
   }

   public void b(cuc $$0) {
      this.n = $$0;
   }

   public cuc g() {
      return this.n;
   }

   public void h() {
      this.y = true;
   }

   public void i() {
      this.y = false;
   }

   public void a(cph $$0) {
      Table<bpz, Integer, Integer> $$1 = HashBasedTable.create();

      for (int $$2 = 0; $$2 < $$0.i.size(); $$2++) {
         crd $$3 = $$0.i.get($$2);
         $$1.put($$3.c, $$3.i(), $$2);
      }

      for (int $$4 = 0; $$4 < this.i.size(); $$4++) {
         crd $$5 = this.i.get($$4);
         Integer $$6 = (Integer)$$1.get($$5.c, $$5.i());
         if ($$6 != null) {
            this.l.set($$4, $$0.l.get($$6));
            this.o.set($$4, $$0.o.get($$6));
         }
      }
   }

   public OptionalInt b(bpz $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         crd $$3 = this.i.get($$2);
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
