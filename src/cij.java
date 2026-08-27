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

public abstract class cij {
   private static final Logger k = LogUtils.getLogger();
   public static final int a = -999;
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 0;
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = Integer.MAX_VALUE;
   private final iq<cng> l = iq.a();
   public final iq<cke> i = iq.a();
   private final List<cjb> m = Lists.newArrayList();
   private cng n = cng.f;
   private final iq<cng> o = iq.a();
   private final IntList p = new IntArrayList();
   private cng q = cng.f;
   private int r;
   @Nullable
   private final cjq<?> s;
   public final int j;
   private int t = -1;
   private int u;
   private final Set<cke> v = Sets.newHashSet();
   private final List<civ> w = Lists.newArrayList();
   @Nullable
   private ciw x;
   private boolean y;

   protected cij(@Nullable cjq<?> $$0, int $$1) {
      this.s = $$0;
      this.j = $$1;
   }

   protected static boolean a(ciu $$0, cfq $$1, cwy $$2) {
      return $$0.a(($$2x, $$3) -> !$$2x.a_($$3).a($$2) ? false : $$1.i((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5) <= 64.0, true);
   }

   public cjq<?> a() {
      if (this.s == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.s;
      }
   }

   protected static void a(bjv $$0, int $$1) {
      int $$2 = $$0.b();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container size " + $$2 + " is smaller than expected " + $$1);
      }
   }

   protected static void a(cit $$0, int $$1) {
      int $$2 = $$0.a();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container data count " + $$2 + " is smaller than expected " + $$1);
      }
   }

   public boolean a(int $$0) {
      return $$0 == -1 || $$0 == -999 || $$0 < this.i.size();
   }

   protected cke a(cke $$0) {
      $$0.e = this.i.size();
      this.i.add($$0);
      this.l.add(cng.f);
      this.o.add(cng.f);
      return $$0;
   }

   protected cjb a(cjb $$0) {
      this.m.add($$0);
      this.p.add(0);
      return $$0;
   }

   protected void a(cit $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         this.a(cjb.a($$0, $$1));
      }
   }

   public void a(civ $$0) {
      if (!this.w.contains($$0)) {
         this.w.add($$0);
         this.d();
      }
   }

   public void a(ciw $$0) {
      this.x = $$0;
      this.b();
   }

   public void b() {
      int $$0 = 0;

      for (int $$1 = this.i.size(); $$0 < $$1; $$0++) {
         this.o.set($$0, this.i.get($$0).g().p());
      }

      this.q = this.g().p();
      $$0 = 0;

      for (int $$3 = this.m.size(); $$0 < $$3; $$0++) {
         this.p.set($$0, this.m.get($$0).b());
      }

      if (this.x != null) {
         this.x.a(this, this.o, this.q, this.p.toIntArray());
      }
   }

   public void b(civ $$0) {
      this.w.remove($$0);
   }

   public iq<cng> c() {
      iq<cng> $$0 = iq.a();

      for (cke $$1 : this.i) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void d() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         cng $$1 = this.i.get($$0).g();
         Supplier<cng> $$2 = Suppliers.memoize($$1::p);
         this.a($$0, $$1, $$2);
         this.b($$0, $$1, $$2);
      }

      this.l();

      for (int $$3 = 0; $$3 < this.m.size(); $$3++) {
         cjb $$4 = this.m.get($$3);
         int $$5 = $$4.b();
         if ($$4.c()) {
            this.c($$3, $$5);
         }

         this.d($$3, $$5);
      }
   }

   public void e() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         cng $$1 = this.i.get($$0).g();
         this.a($$0, $$1, $$1::p);
      }

      for (int $$2 = 0; $$2 < this.m.size(); $$2++) {
         cjb $$3 = this.m.get($$2);
         if ($$3.c()) {
            this.c($$2, $$3.b());
         }
      }

      this.b();
   }

   private void c(int $$0, int $$1) {
      for (civ $$2 : this.w) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void a(int $$0, cng $$1, Supplier<cng> $$2) {
      cng $$3 = this.l.get($$0);
      if (!cng.a($$3, $$1)) {
         cng $$4 = $$2.get();
         this.l.set($$0, $$4);

         for (civ $$5 : this.w) {
            $$5.a(this, $$0, $$4);
         }
      }
   }

   private void b(int $$0, cng $$1, Supplier<cng> $$2) {
      if (!this.y) {
         cng $$3 = this.o.get($$0);
         if (!cng.a($$3, $$1)) {
            cng $$4 = $$2.get();
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
         if (!cng.a(this.g(), this.q)) {
            this.q = this.g().p();
            if (this.x != null) {
               this.x.a(this, this.q);
            }
         }
      }
   }

   public void a(int $$0, cng $$1) {
      this.o.set($$0, $$1.p());
   }

   public void b(int $$0, cng $$1) {
      if ($$0 >= 0 && $$0 < this.o.size()) {
         this.o.set($$0, $$1);
      } else {
         k.debug("Incorrect slot index: {} available slots: {}", $$0, this.o.size());
      }
   }

   public void a(cng $$0) {
      this.q = $$0.p();
   }

   public boolean b(cfq $$0, int $$1) {
      return false;
   }

   public cke b(int $$0) {
      return this.i.get($$0);
   }

   public abstract cng a(cfq var1, int var2);

   public void a(int $$0, int $$1, cis $$2, cfq $$3) {
      try {
         this.b($$0, $$1, $$2, $$3);
      } catch (Exception var8) {
         o $$5 = o.a(var8, "Container click");
         p $$6 = $$5.a("Click info");
         $$6.a("Menu Type", () -> this.s != null ? kd.r.b(this.s).toString() : "<no type>");
         $$6.a("Menu Class", () -> this.getClass().getCanonicalName());
         $$6.a("Slot Count", this.i.size());
         $$6.a("Slot", $$0);
         $$6.a("Button", $$1);
         $$6.a("Type", $$2);
         throw new y($$5);
      }
   }

   private void b(int $$0, int $$1, cis $$2, cfq $$3) {
      cfp $$4 = $$3.fS();
      if ($$2 == cis.f) {
         int $$5 = this.u;
         this.u = d($$1);
         if (($$5 != 1 || this.u != 2) && $$5 != this.u) {
            this.f();
         } else if (this.g().b()) {
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
            cke $$6 = this.i.get($$0);
            cng $$7 = this.g();
            if (a($$6, $$7, true) && $$6.a($$7) && (this.t == 2 || $$7.L() > this.v.size()) && this.b($$6)) {
               this.v.add($$6);
            }
         } else if (this.u == 2) {
            if (!this.v.isEmpty()) {
               if (this.v.size() == 1) {
                  int $$8 = this.v.iterator().next().e;
                  this.f();
                  this.b($$8, this.t, cis.a, $$3);
                  return;
               }

               cng $$9 = this.g().p();
               if ($$9.b()) {
                  this.f();
                  return;
               }

               int $$10 = this.g().L();

               for (cke $$11 : this.v) {
                  cng $$12 = this.g();
                  if ($$11 != null && a($$11, $$12, true) && $$11.a($$12) && (this.t == 2 || $$12.L() >= this.v.size()) && this.b($$11)) {
                     int $$13 = $$11.h() ? $$11.g().L() : 0;
                     int $$14 = Math.min($$9.g(), $$11.a_($$9));
                     int $$15 = Math.min(a(this.v, this.t, $$9) + $$13, $$14);
                     $$10 -= $$15 - $$13;
                     $$11.e($$9.c($$15));
                  }
               }

               $$9.f($$10);
               this.b($$9);
            }

            this.f();
         } else {
            this.f();
         }
      } else if (this.u != 0) {
         this.f();
      } else if (($$2 == cis.a || $$2 == cis.b) && ($$1 == 0 || $$1 == 1)) {
         cir $$16 = $$1 == 0 ? cir.a : cir.b;
         if ($$0 == -999) {
            if (!this.g().b()) {
               if ($$16 == cir.a) {
                  $$3.a(this.g(), true);
                  this.b(cng.f);
               } else {
                  $$3.a(this.g().a(1), true);
               }
            }
         } else if ($$2 == cis.b) {
            if ($$0 < 0) {
               return;
            }

            cke $$17 = this.i.get($$0);
            if (!$$17.a($$3)) {
               return;
            }

            cng $$18 = this.a($$3, $$0);

            while (!$$18.b() && cng.b($$17.g(), $$18)) {
               $$18 = this.a($$3, $$0);
            }
         } else {
            if ($$0 < 0) {
               return;
            }

            cke $$19 = this.i.get($$0);
            cng $$20 = $$19.g();
            cng $$21 = this.g();
            $$3.a($$21, $$19.g(), $$16);
            if (!this.a($$3, $$16, $$19, $$20, $$21)) {
               if ($$20.b()) {
                  if (!$$21.b()) {
                     int $$22 = $$16 == cir.a ? $$21.L() : 1;
                     this.b($$19.b($$21, $$22));
                  }
               } else if ($$19.a($$3)) {
                  if ($$21.b()) {
                     int $$23 = $$16 == cir.a ? $$20.L() : ($$20.L() + 1) / 2;
                     Optional<cng> $$24 = $$19.a($$23, Integer.MAX_VALUE, $$3);
                     $$24.ifPresent($$2x -> {
                        this.b($$2x);
                        $$19.a($$3, $$2x);
                     });
                  } else if ($$19.a($$21)) {
                     if (cng.c($$20, $$21)) {
                        int $$25 = $$16 == cir.a ? $$21.L() : 1;
                        this.b($$19.b($$21, $$25));
                     } else if ($$21.L() <= $$19.a_($$21)) {
                        this.b($$20);
                        $$19.e($$21);
                     }
                  } else if (cng.c($$20, $$21)) {
                     Optional<cng> $$26 = $$19.a($$20.L(), $$21.g() - $$21.L(), $$3);
                     $$26.ifPresent($$3x -> {
                        $$21.g($$3x.L());
                        $$19.a($$3, $$3x);
                     });
                  }
               }
            }

            $$19.b();
         }
      } else if ($$2 == cis.c && ($$1 >= 0 && $$1 < 9 || $$1 == 40)) {
         cng $$27 = $$4.a($$1);
         cke $$28 = this.i.get($$0);
         cng $$29 = $$28.g();
         if (!$$27.b() || !$$29.b()) {
            if ($$27.b()) {
               if ($$28.a($$3)) {
                  $$4.a($$1, $$29);
                  $$28.b($$29.L());
                  $$28.e(cng.f);
                  $$28.a($$3, $$29);
               }
            } else if ($$29.b()) {
               if ($$28.a($$27)) {
                  int $$30 = $$28.a_($$27);
                  if ($$27.L() > $$30) {
                     $$28.e($$27.a($$30));
                  } else {
                     $$4.a($$1, cng.f);
                     $$28.e($$27);
                  }
               }
            } else if ($$28.a($$3) && $$28.a($$27)) {
               int $$31 = $$28.a_($$27);
               if ($$27.L() > $$31) {
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
      } else if ($$2 == cis.d && $$3.fT().d && this.g().b() && $$0 >= 0) {
         cke $$32 = this.i.get($$0);
         if ($$32.h()) {
            cng $$33 = $$32.g();
            this.b($$33.c($$33.g()));
         }
      } else if ($$2 == cis.e && this.g().b() && $$0 >= 0) {
         cke $$34 = this.i.get($$0);
         int $$35 = $$1 == 0 ? 1 : $$34.g().L();
         cng $$36 = $$34.b($$35, Integer.MAX_VALUE, $$3);
         $$3.a($$36, true);
      } else if ($$2 == cis.g && $$0 >= 0) {
         cke $$37 = this.i.get($$0);
         cng $$38 = this.g();
         if (!$$38.b() && (!$$37.h() || !$$37.a($$3))) {
            int $$39 = $$1 == 0 ? 0 : this.i.size() - 1;
            int $$40 = $$1 == 0 ? 1 : -1;

            for (int $$41 = 0; $$41 < 2; $$41++) {
               for (int $$42 = $$39; $$42 >= 0 && $$42 < this.i.size() && $$38.L() < $$38.g(); $$42 += $$40) {
                  cke $$43 = this.i.get($$42);
                  if ($$43.h() && a($$43, $$38, true) && $$43.a($$3) && this.a($$38, $$43)) {
                     cng $$44 = $$43.g();
                     if ($$41 != 0 || $$44.L() != $$44.g()) {
                        cng $$45 = $$43.b($$44.L(), $$38.g() - $$38.L(), $$3);
                        $$38.g($$45.L());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cfq $$0, cir $$1, cke $$2, cng $$3, cng $$4) {
      cia $$5 = $$0.dL().I();
      return $$4.a($$5) && $$4.a($$2, $$1, $$0) ? true : $$3.a($$5) && $$3.a($$4, $$2, $$1, $$0, this.m());
   }

   private bng m() {
      return new bng() {
         @Override
         public cng a() {
            return cij.this.g();
         }

         @Override
         public boolean a(cng $$0) {
            cij.this.b($$0);
            return true;
         }
      };
   }

   public boolean a(cng $$0, cke $$1) {
      return true;
   }

   public void b(cfq $$0) {
      if ($$0 instanceof anf) {
         cng $$1 = this.g();
         if (!$$1.b()) {
            if ($$0.bx() && !((anf)$$0).v()) {
               $$0.fS().f($$1);
            } else {
               $$0.a($$1, false);
            }

            this.b(cng.f);
         }
      }
   }

   protected void a(cfq $$0, bjv $$1) {
      if (!$$0.bx() || $$0 instanceof anf && ((anf)$$0).v()) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            $$0.a($$1.b($$2), false);
         }
      } else {
         for (int $$3 = 0; $$3 < $$1.b(); $$3++) {
            cfp $$4 = $$0.fS();
            if ($$4.m instanceof anf) {
               $$4.f($$1.b($$3));
            }
         }
      }
   }

   public void a(bjv $$0) {
      this.d();
   }

   public void a(int $$0, int $$1, cng $$2) {
      this.b($$0).f($$2);
      this.r = $$1;
   }

   public void a(int $$0, List<cng> $$1, cng $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         this.b($$3).f($$1.get($$3));
      }

      this.n = $$2;
      this.r = $$0;
   }

   public void a(int $$0, int $$1) {
      this.m.get($$0).a($$1);
   }

   public abstract boolean a(cfq var1);

   protected boolean a(cng $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = false;
      int $$5 = $$1;
      if ($$3) {
         $$5 = $$2 - 1;
      }

      if ($$0.h()) {
         while (!$$0.b() && ($$3 ? $$5 >= $$1 : $$5 < $$2)) {
            cke $$6 = this.i.get($$5);
            cng $$7 = $$6.g();
            if (!$$7.b() && cng.c($$0, $$7)) {
               int $$8 = $$7.L() + $$0.L();
               if ($$8 <= $$0.g()) {
                  $$0.f(0);
                  $$7.f($$8);
                  $$6.b();
                  $$4 = true;
               } else if ($$7.L() < $$0.g()) {
                  $$0.h($$0.g() - $$7.L());
                  $$7.f($$0.g());
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

      if (!$$0.b()) {
         if ($$3) {
            $$5 = $$2 - 1;
         } else {
            $$5 = $$1;
         }

         while ($$3 ? $$5 >= $$1 : $$5 < $$2) {
            cke $$9 = this.i.get($$5);
            cng $$10 = $$9.g();
            if ($$10.b() && $$9.a($$0)) {
               if ($$0.L() > $$9.a()) {
                  $$9.e($$0.a($$9.a()));
               } else {
                  $$9.e($$0.a($$0.L()));
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

   public static boolean a(int $$0, cfq $$1) {
      if ($$0 == 0) {
         return true;
      } else {
         return $$0 == 1 ? true : $$0 == 2 && $$1.fT().d;
      }
   }

   protected void f() {
      this.u = 0;
      this.v.clear();
   }

   public static boolean a(@Nullable cke $$0, cng $$1, boolean $$2) {
      boolean $$3 = $$0 == null || !$$0.h();
      return !$$3 && cng.c($$1, $$0.g()) ? $$0.g().L() + ($$2 ? 0 : $$1.L()) <= $$1.g() : $$3;
   }

   public static int a(Set<cke> $$0, int $$1, cng $$2) {
      return switch ($$1) {
         case 0 -> aup.d((float)$$2.L() / (float)$$0.size());
         case 1 -> 1;
         case 2 -> $$2.d().k();
         default -> $$2.L();
      };
   }

   public boolean b(cke $$0) {
      return true;
   }

   public static int a(@Nullable dhd $$0) {
      return $$0 instanceof bjv ? b((bjv)$$0) : 0;
   }

   public static int b(@Nullable bjv $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         float $$1 = 0.0F;

         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cng $$3 = $$0.a($$2);
            if (!$$3.b()) {
               $$1 += (float)$$3.L() / (float)Math.min($$0.al_(), $$3.g());
            }
         }

         $$1 /= (float)$$0.b();
         return aup.b($$1, 0, 15);
      }
   }

   public void b(cng $$0) {
      this.n = $$0;
   }

   public cng g() {
      return this.n;
   }

   public void h() {
      this.y = true;
   }

   public void i() {
      this.y = false;
   }

   public void a(cij $$0) {
      Table<bjv, Integer, Integer> $$1 = HashBasedTable.create();

      for (int $$2 = 0; $$2 < $$0.i.size(); $$2++) {
         cke $$3 = $$0.i.get($$2);
         $$1.put($$3.d, $$3.i(), $$2);
      }

      for (int $$4 = 0; $$4 < this.i.size(); $$4++) {
         cke $$5 = this.i.get($$4);
         Integer $$6 = (Integer)$$1.get($$5.d, $$5.i());
         if ($$6 != null) {
            this.l.set($$4, $$0.l.get($$6));
            this.o.set($$4, $$0.o.get($$6));
         }
      }
   }

   public OptionalInt b(bjv $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         cke $$3 = this.i.get($$2);
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
