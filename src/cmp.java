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

public abstract class cmp {
   private static final Logger k = LogUtils.getLogger();
   public static final int a = -999;
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 0;
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = Integer.MAX_VALUE;
   private final iu<crj> l = iu.a();
   public final iu<cok> i = iu.a();
   private final List<cnh> m = Lists.newArrayList();
   private crj n = crj.i;
   private final iu<crj> o = iu.a();
   private final IntList p = new IntArrayList();
   private crj q = crj.i;
   private int r;
   @Nullable
   private final cnw<?> s;
   public final int j;
   private int t = -1;
   private int u;
   private final Set<cok> v = Sets.newHashSet();
   private final List<cnb> w = Lists.newArrayList();
   @Nullable
   private cnc x;
   private boolean y;

   protected cmp(@Nullable cnw<?> $$0, int $$1) {
      this.s = $$0;
      this.j = $$1;
   }

   protected static boolean a(cna $$0, cjt $$1, dby $$2) {
      return $$0.a(($$2x, $$3) -> !$$2x.a_($$3).a($$2) ? false : $$1.i((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5) <= 64.0, true);
   }

   public cnw<?> a() {
      if (this.s == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.s;
      }
   }

   protected static void a(bnt $$0, int $$1) {
      int $$2 = $$0.b();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container size " + $$2 + " is smaller than expected " + $$1);
      }
   }

   protected static void a(cmz $$0, int $$1) {
      int $$2 = $$0.a();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container data count " + $$2 + " is smaller than expected " + $$1);
      }
   }

   public boolean a(int $$0) {
      return $$0 == -1 || $$0 == -999 || $$0 < this.i.size();
   }

   protected cok a(cok $$0) {
      $$0.e = this.i.size();
      this.i.add($$0);
      this.l.add(crj.i);
      this.o.add(crj.i);
      return $$0;
   }

   protected cnh a(cnh $$0) {
      this.m.add($$0);
      this.p.add(0);
      return $$0;
   }

   protected void a(cmz $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         this.a(cnh.a($$0, $$1));
      }
   }

   public void a(cnb $$0) {
      if (!this.w.contains($$0)) {
         this.w.add($$0);
         this.d();
      }
   }

   public void a(cnc $$0) {
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

   public void b(cnb $$0) {
      this.w.remove($$0);
   }

   public iu<crj> c() {
      iu<crj> $$0 = iu.a();

      for (cok $$1 : this.i) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void d() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         crj $$1 = this.i.get($$0).g();
         Supplier<crj> $$2 = Suppliers.memoize($$1::r);
         this.a($$0, $$1, $$2);
         this.b($$0, $$1, $$2);
      }

      this.l();

      for (int $$3 = 0; $$3 < this.m.size(); $$3++) {
         cnh $$4 = this.m.get($$3);
         int $$5 = $$4.b();
         if ($$4.c()) {
            this.c($$3, $$5);
         }

         this.d($$3, $$5);
      }
   }

   public void e() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         crj $$1 = this.i.get($$0).g();
         this.a($$0, $$1, $$1::r);
      }

      for (int $$2 = 0; $$2 < this.m.size(); $$2++) {
         cnh $$3 = this.m.get($$2);
         if ($$3.c()) {
            this.c($$2, $$3.b());
         }
      }

      this.b();
   }

   private void c(int $$0, int $$1) {
      for (cnb $$2 : this.w) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void a(int $$0, crj $$1, Supplier<crj> $$2) {
      crj $$3 = this.l.get($$0);
      if (!crj.a($$3, $$1)) {
         crj $$4 = $$2.get();
         this.l.set($$0, $$4);

         for (cnb $$5 : this.w) {
            $$5.a(this, $$0, $$4);
         }
      }
   }

   private void b(int $$0, crj $$1, Supplier<crj> $$2) {
      if (!this.y) {
         crj $$3 = this.o.get($$0);
         if (!crj.a($$3, $$1)) {
            crj $$4 = $$2.get();
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
         if (!crj.a(this.g(), this.q)) {
            this.q = this.g().r();
            if (this.x != null) {
               this.x.a(this, this.q);
            }
         }
      }
   }

   public void a(int $$0, crj $$1) {
      this.o.set($$0, $$1.r());
   }

   public void b(int $$0, crj $$1) {
      if ($$0 >= 0 && $$0 < this.o.size()) {
         this.o.set($$0, $$1);
      } else {
         k.debug("Incorrect slot index: {} available slots: {}", $$0, this.o.size());
      }
   }

   public void a(crj $$0) {
      this.q = $$0.r();
   }

   public boolean b(cjt $$0, int $$1) {
      return false;
   }

   public cok b(int $$0) {
      return this.i.get($$0);
   }

   public abstract crj a(cjt var1, int var2);

   public void a(int $$0, int $$1, cmy $$2, cjt $$3) {
      try {
         this.b($$0, $$1, $$2, $$3);
      } catch (Exception var8) {
         o $$5 = o.a(var8, "Container click");
         p $$6 = $$5.a("Click info");
         $$6.a("Menu Type", () -> this.s != null ? kr.r.b(this.s).toString() : "<no type>");
         $$6.a("Menu Class", () -> this.getClass().getCanonicalName());
         $$6.a("Slot Count", this.i.size());
         $$6.a("Slot", $$0);
         $$6.a("Button", $$1);
         $$6.a("Type", $$2);
         throw new y($$5);
      }
   }

   private void b(int $$0, int $$1, cmy $$2, cjt $$3) {
      cjs $$4 = $$3.fZ();
      if ($$2 == cmy.f) {
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
            cok $$6 = this.i.get($$0);
            crj $$7 = this.g();
            if (a($$6, $$7, true) && $$6.a($$7) && (this.t == 2 || $$7.G() > this.v.size()) && this.b($$6)) {
               this.v.add($$6);
            }
         } else if (this.u == 2) {
            if (!this.v.isEmpty()) {
               if (this.v.size() == 1) {
                  int $$8 = this.v.iterator().next().e;
                  this.f();
                  this.b($$8, this.t, cmy.a, $$3);
                  return;
               }

               crj $$9 = this.g().r();
               if ($$9.d()) {
                  this.f();
                  return;
               }

               int $$10 = this.g().G();

               for (cok $$11 : this.v) {
                  crj $$12 = this.g();
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
      } else if (($$2 == cmy.a || $$2 == cmy.b) && ($$1 == 0 || $$1 == 1)) {
         cmx $$16 = $$1 == 0 ? cmx.a : cmx.b;
         if ($$0 == -999) {
            if (!this.g().d()) {
               if ($$16 == cmx.a) {
                  $$3.a(this.g(), true);
                  this.b(crj.i);
               } else {
                  $$3.a(this.g().a(1), true);
               }
            }
         } else if ($$2 == cmy.b) {
            if ($$0 < 0) {
               return;
            }

            cok $$17 = this.i.get($$0);
            if (!$$17.a($$3)) {
               return;
            }

            crj $$18 = this.a($$3, $$0);

            while (!$$18.d() && crj.b($$17.g(), $$18)) {
               $$18 = this.a($$3, $$0);
            }
         } else {
            if ($$0 < 0) {
               return;
            }

            cok $$19 = this.i.get($$0);
            crj $$20 = $$19.g();
            crj $$21 = this.g();
            $$3.a($$21, $$19.g(), $$16);
            if (!this.a($$3, $$16, $$19, $$20, $$21)) {
               if ($$20.d()) {
                  if (!$$21.d()) {
                     int $$22 = $$16 == cmx.a ? $$21.G() : 1;
                     this.b($$19.b($$21, $$22));
                  }
               } else if ($$19.a($$3)) {
                  if ($$21.d()) {
                     int $$23 = $$16 == cmx.a ? $$20.G() : ($$20.G() + 1) / 2;
                     Optional<crj> $$24 = $$19.a($$23, Integer.MAX_VALUE, $$3);
                     $$24.ifPresent($$2x -> {
                        this.b($$2x);
                        $$19.a($$3, $$2x);
                     });
                  } else if ($$19.a($$21)) {
                     if (crj.c($$20, $$21)) {
                        int $$25 = $$16 == cmx.a ? $$21.G() : 1;
                        this.b($$19.b($$21, $$25));
                     } else if ($$21.G() <= $$19.a_($$21)) {
                        this.b($$20);
                        $$19.e($$21);
                     }
                  } else if (crj.c($$20, $$21)) {
                     Optional<crj> $$26 = $$19.a($$20.G(), $$21.i() - $$21.G(), $$3);
                     $$26.ifPresent($$3x -> {
                        $$21.f($$3x.G());
                        $$19.a($$3, $$3x);
                     });
                  }
               }
            }

            $$19.b();
         }
      } else if ($$2 == cmy.c && ($$1 >= 0 && $$1 < 9 || $$1 == 40)) {
         crj $$27 = $$4.a($$1);
         cok $$28 = this.i.get($$0);
         crj $$29 = $$28.g();
         if (!$$27.d() || !$$29.d()) {
            if ($$27.d()) {
               if ($$28.a($$3)) {
                  $$4.a($$1, $$29);
                  $$28.b($$29.G());
                  $$28.e(crj.i);
                  $$28.a($$3, $$29);
               }
            } else if ($$29.d()) {
               if ($$28.a($$27)) {
                  int $$30 = $$28.a_($$27);
                  if ($$27.G() > $$30) {
                     $$28.e($$27.a($$30));
                  } else {
                     $$4.a($$1, crj.i);
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
      } else if ($$2 == cmy.d && $$3.fM() && this.g().d() && $$0 >= 0) {
         cok $$32 = this.i.get($$0);
         if ($$32.h()) {
            crj $$33 = $$32.g();
            this.b($$33.c($$33.i()));
         }
      } else if ($$2 == cmy.e && this.g().d() && $$0 >= 0) {
         cok $$34 = this.i.get($$0);
         int $$35 = $$1 == 0 ? 1 : $$34.g().G();
         crj $$36 = $$34.b($$35, Integer.MAX_VALUE, $$3);
         $$3.a($$36, true);
      } else if ($$2 == cmy.g && $$0 >= 0) {
         cok $$37 = this.i.get($$0);
         crj $$38 = this.g();
         if (!$$38.d() && (!$$37.h() || !$$37.a($$3))) {
            int $$39 = $$1 == 0 ? 0 : this.i.size() - 1;
            int $$40 = $$1 == 0 ? 1 : -1;

            for (int $$41 = 0; $$41 < 2; $$41++) {
               for (int $$42 = $$39; $$42 >= 0 && $$42 < this.i.size() && $$38.G() < $$38.i(); $$42 += $$40) {
                  cok $$43 = this.i.get($$42);
                  if ($$43.h() && a($$43, $$38, true) && $$43.a($$3) && this.a($$38, $$43)) {
                     crj $$44 = $$43.g();
                     if ($$41 != 0 || $$44.G() != $$44.i()) {
                        crj $$45 = $$43.b($$44.G(), $$38.i() - $$38.G(), $$3);
                        $$38.f($$45.G());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cjt $$0, cmx $$1, cok $$2, crj $$3, crj $$4) {
      cmg $$5 = $$0.dM().J();
      return $$4.a($$5) && $$4.a($$2, $$1, $$0) ? true : $$3.a($$5) && $$3.a($$4, $$2, $$1, $$0, this.m());
   }

   private brf m() {
      return new brf() {
         @Override
         public crj a() {
            return cmp.this.g();
         }

         @Override
         public boolean a(crj $$0) {
            cmp.this.b($$0);
            return true;
         }
      };
   }

   public boolean a(crj $$0, cok $$1) {
      return true;
   }

   public void b(cjt $$0) {
      if ($$0 instanceof apt) {
         crj $$1 = this.g();
         if (!$$1.d()) {
            if ($$0.bA() && !((apt)$$0).v()) {
               $$0.fZ().f($$1);
            } else {
               $$0.a($$1, false);
            }

            this.b(crj.i);
         }
      }
   }

   protected void a(cjt $$0, bnt $$1) {
      if (!$$0.bA() || $$0 instanceof apt && ((apt)$$0).v()) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            $$0.a($$1.b($$2), false);
         }
      } else {
         for (int $$3 = 0; $$3 < $$1.b(); $$3++) {
            cjs $$4 = $$0.fZ();
            if ($$4.m instanceof apt) {
               $$4.f($$1.b($$3));
            }
         }
      }
   }

   public void a(bnt $$0) {
      this.d();
   }

   public void a(int $$0, int $$1, crj $$2) {
      this.b($$0).f($$2);
      this.r = $$1;
   }

   public void a(int $$0, List<crj> $$1, crj $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         this.b($$3).f($$1.get($$3));
      }

      this.n = $$2;
      this.r = $$0;
   }

   public void a(int $$0, int $$1) {
      this.m.get($$0).a($$1);
   }

   public abstract boolean a(cjt var1);

   protected boolean a(crj $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = false;
      int $$5 = $$1;
      if ($$3) {
         $$5 = $$2 - 1;
      }

      if ($$0.j()) {
         while (!$$0.d() && ($$3 ? $$5 >= $$1 : $$5 < $$2)) {
            cok $$6 = this.i.get($$5);
            crj $$7 = $$6.g();
            if (!$$7.d() && crj.c($$0, $$7)) {
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
            cok $$9 = this.i.get($$5);
            crj $$10 = $$9.g();
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

   public static boolean a(int $$0, cjt $$1) {
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

   public static boolean a(@Nullable cok $$0, crj $$1, boolean $$2) {
      boolean $$3 = $$0 == null || !$$0.h();
      return !$$3 && crj.c($$1, $$0.g()) ? $$0.g().G() + ($$2 ? 0 : $$1.G()) <= $$1.i() : $$3;
   }

   public static int a(Set<cok> $$0, int $$1, crj $$2) {
      return switch ($$1) {
         case 0 -> axk.d((float)$$2.G() / (float)$$0.size());
         case 1 -> 1;
         case 2 -> $$2.f().q();
         default -> $$2.G();
      };
   }

   public boolean b(cok $$0) {
      return true;
   }

   public static int a(@Nullable dmf $$0) {
      return $$0 instanceof bnt ? b((bnt)$$0) : 0;
   }

   public static int b(@Nullable bnt $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         float $$1 = 0.0F;

         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            crj $$3 = $$0.a($$2);
            if (!$$3.d()) {
               $$1 += (float)$$3.G() / (float)Math.min($$0.aj_(), $$3.i());
            }
         }

         $$1 /= (float)$$0.b();
         return axk.b($$1, 0, 15);
      }
   }

   public void b(crj $$0) {
      this.n = $$0;
   }

   public crj g() {
      return this.n;
   }

   public void h() {
      this.y = true;
   }

   public void i() {
      this.y = false;
   }

   public void a(cmp $$0) {
      Table<bnt, Integer, Integer> $$1 = HashBasedTable.create();

      for (int $$2 = 0; $$2 < $$0.i.size(); $$2++) {
         cok $$3 = $$0.i.get($$2);
         $$1.put($$3.d, $$3.i(), $$2);
      }

      for (int $$4 = 0; $$4 < this.i.size(); $$4++) {
         cok $$5 = this.i.get($$4);
         Integer $$6 = (Integer)$$1.get($$5.d, $$5.i());
         if ($$6 != null) {
            this.l.set($$4, $$0.l.get($$6));
            this.o.set($$4, $$0.o.get($$6));
         }
      }
   }

   public OptionalInt b(bnt $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         cok $$3 = this.i.get($$2);
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
