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

public abstract class cro {
   private static final Logger m = LogUtils.getLogger();
   public static final int a = -999;
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 0;
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = Integer.MAX_VALUE;
   public static final int i = 9;
   public static final int j = 18;
   private final jz<cwb> n = jz.a();
   public final jz<ctl> k = jz.a();
   private final List<csi> o = Lists.newArrayList();
   private cwb p = cwb.k;
   private final jz<cwb> q = jz.a();
   private final IntList r = new IntArrayList();
   private cwb s = cwb.k;
   private int t;
   @Nullable
   private final csx<?> u;
   public final int l;
   private int v = -1;
   private int w;
   private final Set<ctl> x = Sets.newHashSet();
   private final List<csc> y = Lists.newArrayList();
   @Nullable
   private csd z;
   private boolean A;

   protected cro(@Nullable csx<?> $$0, int $$1) {
      this.u = $$0;
      this.l = $$1;
   }

   protected void a(brw $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 9; $$3++) {
         this.a(new ctl($$0, $$3, $$1 + $$3 * 18, $$2));
      }
   }

   protected void b(brw $$0, int $$1, int $$2) {
      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new ctl($$0, $$4 + ($$3 + 1) * 9, $$1 + $$4 * 18, $$2 + $$3 * 18));
         }
      }
   }

   protected void c(brw $$0, int $$1, int $$2) {
      this.b($$0, $$1, $$2);
      int $$3 = 4;
      int $$4 = 58;
      this.a($$0, $$1, $$2 + 58);
   }

   protected static boolean a(csb $$0, com $$1, die $$2) {
      return $$0.a(($$2x, $$3) -> !$$2x.a_($$3).a($$2) ? false : $$1.a($$3, 4.0), true);
   }

   public csx<?> a() {
      if (this.u == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.u;
      }
   }

   protected static void a(brw $$0, int $$1) {
      int $$2 = $$0.b();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container size " + $$2 + " is smaller than expected " + $$1);
      }
   }

   protected static void a(csa $$0, int $$1) {
      int $$2 = $$0.a();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container data count " + $$2 + " is smaller than expected " + $$1);
      }
   }

   public boolean a(int $$0) {
      return $$0 == -1 || $$0 == -999 || $$0 < this.k.size();
   }

   protected ctl a(ctl $$0) {
      $$0.d = this.k.size();
      this.k.add($$0);
      this.n.add(cwb.k);
      this.q.add(cwb.k);
      return $$0;
   }

   protected csi a(csi $$0) {
      this.o.add($$0);
      this.r.add(0);
      return $$0;
   }

   protected void a(csa $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         this.a(csi.a($$0, $$1));
      }
   }

   public void a(csc $$0) {
      if (!this.y.contains($$0)) {
         this.y.add($$0);
         this.d();
      }
   }

   public void a(csd $$0) {
      this.z = $$0;
      this.b();
   }

   public void b() {
      int $$0 = 0;

      for (int $$1 = this.k.size(); $$0 < $$1; $$0++) {
         this.q.set($$0, this.k.get($$0).g().v());
      }

      this.s = this.g().v();
      $$0 = 0;

      for (int $$3 = this.o.size(); $$0 < $$3; $$0++) {
         this.r.set($$0, this.o.get($$0).b());
      }

      if (this.z != null) {
         this.z.a(this, this.q, this.s, this.r.toIntArray());
      }
   }

   public void b(csc $$0) {
      this.y.remove($$0);
   }

   public jz<cwb> c() {
      jz<cwb> $$0 = jz.a();

      for (ctl $$1 : this.k) {
         $$0.add($$1.g());
      }

      return $$0;
   }

   public void d() {
      for (int $$0 = 0; $$0 < this.k.size(); $$0++) {
         cwb $$1 = this.k.get($$0).g();
         Supplier<cwb> $$2 = Suppliers.memoize($$1::v);
         this.a($$0, $$1, $$2);
         this.b($$0, $$1, $$2);
      }

      this.l();

      for (int $$3 = 0; $$3 < this.o.size(); $$3++) {
         csi $$4 = this.o.get($$3);
         int $$5 = $$4.b();
         if ($$4.c()) {
            this.d($$3, $$5);
         }

         this.e($$3, $$5);
      }
   }

   public void e() {
      for (int $$0 = 0; $$0 < this.k.size(); $$0++) {
         cwb $$1 = this.k.get($$0).g();
         this.a($$0, $$1, $$1::v);
      }

      for (int $$2 = 0; $$2 < this.o.size(); $$2++) {
         csi $$3 = this.o.get($$2);
         if ($$3.c()) {
            this.d($$2, $$3.b());
         }
      }

      this.b();
   }

   private void d(int $$0, int $$1) {
      for (csc $$2 : this.y) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void a(int $$0, cwb $$1, Supplier<cwb> $$2) {
      cwb $$3 = this.n.get($$0);
      if (!cwb.a($$3, $$1)) {
         cwb $$4 = $$2.get();
         this.n.set($$0, $$4);

         for (csc $$5 : this.y) {
            $$5.a(this, $$0, $$4);
         }
      }
   }

   private void b(int $$0, cwb $$1, Supplier<cwb> $$2) {
      if (!this.A) {
         cwb $$3 = this.q.get($$0);
         if (!cwb.a($$3, $$1)) {
            cwb $$4 = $$2.get();
            this.q.set($$0, $$4);
            if (this.z != null) {
               this.z.a(this, $$0, $$4);
            }
         }
      }
   }

   private void e(int $$0, int $$1) {
      if (!this.A) {
         int $$2 = this.r.getInt($$0);
         if ($$2 != $$1) {
            this.r.set($$0, $$1);
            if (this.z != null) {
               this.z.a(this, $$0, $$1);
            }
         }
      }
   }

   private void l() {
      if (!this.A) {
         if (!cwb.a(this.g(), this.s)) {
            this.s = this.g().v();
            if (this.z != null) {
               this.z.a(this, this.s);
            }
         }
      }
   }

   public void a(int $$0, cwb $$1) {
      this.q.set($$0, $$1.v());
   }

   public void b(int $$0, cwb $$1) {
      if ($$0 >= 0 && $$0 < this.q.size()) {
         this.q.set($$0, $$1);
      } else {
         m.debug("Incorrect slot index: {} available slots: {}", $$0, this.q.size());
      }
   }

   public void a(cwb $$0) {
      this.s = $$0.v();
   }

   public boolean a(com $$0, int $$1) {
      return false;
   }

   public ctl b(int $$0) {
      return this.k.get($$0);
   }

   public abstract cwb b(com var1, int var2);

   public void a(int $$0, int $$1) {
      if ($$0 >= 0 && $$0 < this.k.size()) {
         cwb $$2 = this.k.get($$0).g();
         cuo.a($$2, $$1);
      }
   }

   public void a(int $$0, int $$1, crz $$2, com $$3) {
      try {
         this.b($$0, $$1, $$2, $$3);
      } catch (Exception var8) {
         o $$5 = o.a(var8, "Container click");
         p $$6 = $$5.a("Click info");
         $$6.a("Menu Type", () -> this.u != null ? ly.p.b(this.u).toString() : "<no type>");
         $$6.a("Menu Class", () -> this.getClass().getCanonicalName());
         $$6.a("Slot Count", this.k.size());
         $$6.a("Slot", $$0);
         $$6.a("Button", $$1);
         $$6.a("Type", $$2);
         throw new z($$5);
      }
   }

   private void b(int $$0, int $$1, crz $$2, com $$3) {
      col $$4 = $$3.gk();
      if ($$2 == crz.f) {
         int $$5 = this.w;
         this.w = d($$1);
         if (($$5 != 1 || this.w != 2) && $$5 != this.w) {
            this.f();
         } else if (this.g().f()) {
            this.f();
         } else if (this.w == 0) {
            this.v = c($$1);
            if (a(this.v, $$3)) {
               this.w = 1;
               this.x.clear();
            } else {
               this.f();
            }
         } else if (this.w == 1) {
            ctl $$6 = this.k.get($$0);
            cwb $$7 = this.g();
            if (a($$6, $$7, true) && $$6.a($$7) && (this.v == 2 || $$7.L() > this.x.size()) && this.b($$6)) {
               this.x.add($$6);
            }
         } else if (this.w == 2) {
            if (!this.x.isEmpty()) {
               if (this.x.size() == 1) {
                  int $$8 = this.x.iterator().next().d;
                  this.f();
                  this.b($$8, this.v, crz.a, $$3);
                  return;
               }

               cwb $$9 = this.g().v();
               if ($$9.f()) {
                  this.f();
                  return;
               }

               int $$10 = this.g().L();

               for (ctl $$11 : this.x) {
                  cwb $$12 = this.g();
                  if ($$11 != null && a($$11, $$12, true) && $$11.a($$12) && (this.v == 2 || $$12.L() >= this.x.size()) && this.b($$11)) {
                     int $$13 = $$11.h() ? $$11.g().L() : 0;
                     int $$14 = Math.min($$9.k(), $$11.a_($$9));
                     int $$15 = Math.min(a(this.x, this.v, $$9) + $$13, $$14);
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
      } else if (this.w != 0) {
         this.f();
      } else if (($$2 == crz.a || $$2 == crz.b) && ($$1 == 0 || $$1 == 1)) {
         cry $$16 = $$1 == 0 ? cry.a : cry.b;
         if ($$0 == -999) {
            if (!this.g().f()) {
               if ($$16 == cry.a) {
                  $$3.a(this.g(), true);
                  this.b(cwb.k);
               } else {
                  $$3.a(this.g().a(1), true);
               }
            }
         } else if ($$2 == crz.b) {
            if ($$0 < 0) {
               return;
            }

            ctl $$17 = this.k.get($$0);
            if (!$$17.a($$3)) {
               return;
            }

            cwb $$18 = this.b($$3, $$0);

            while (!$$18.f() && cwb.b($$17.g(), $$18)) {
               $$18 = this.b($$3, $$0);
            }
         } else {
            if ($$0 < 0) {
               return;
            }

            ctl $$19 = this.k.get($$0);
            cwb $$20 = $$19.g();
            cwb $$21 = this.g();
            $$3.a($$21, $$19.g(), $$16);
            if (!this.a($$3, $$16, $$19, $$20, $$21)) {
               if ($$20.f()) {
                  if (!$$21.f()) {
                     int $$22 = $$16 == cry.a ? $$21.L() : 1;
                     this.b($$19.b($$21, $$22));
                  }
               } else if ($$19.a($$3)) {
                  if ($$21.f()) {
                     int $$23 = $$16 == cry.a ? $$20.L() : ($$20.L() + 1) / 2;
                     Optional<cwb> $$24 = $$19.a($$23, Integer.MAX_VALUE, $$3);
                     $$24.ifPresent($$2x -> {
                        this.b($$2x);
                        $$19.a($$3, $$2x);
                     });
                  } else if ($$19.a($$21)) {
                     if (cwb.c($$20, $$21)) {
                        int $$25 = $$16 == cry.a ? $$21.L() : 1;
                        this.b($$19.b($$21, $$25));
                     } else if ($$21.L() <= $$19.a_($$21)) {
                        this.b($$20);
                        $$19.e($$21);
                     }
                  } else if (cwb.c($$20, $$21)) {
                     Optional<cwb> $$26 = $$19.a($$20.L(), $$21.k() - $$21.L(), $$3);
                     $$26.ifPresent($$3x -> {
                        $$21.g($$3x.L());
                        $$19.a($$3, $$3x);
                     });
                  }
               }
            }

            $$19.c();
         }
      } else if ($$2 == crz.c && ($$1 >= 0 && $$1 < 9 || $$1 == 40)) {
         cwb $$27 = $$4.a($$1);
         ctl $$28 = this.k.get($$0);
         cwb $$29 = $$28.g();
         if (!$$27.f() || !$$29.f()) {
            if ($$27.f()) {
               if ($$28.a($$3)) {
                  $$4.a($$1, $$29);
                  $$28.b($$29.L());
                  $$28.e(cwb.k);
                  $$28.a($$3, $$29);
               }
            } else if ($$29.f()) {
               if ($$28.a($$27)) {
                  int $$30 = $$28.a_($$27);
                  if ($$27.L() > $$30) {
                     $$28.e($$27.a($$30));
                  } else {
                     $$4.a($$1, cwb.k);
                     $$28.e($$27);
                  }
               }
            } else if ($$28.a($$3) && $$28.a($$27)) {
               int $$31 = $$28.a_($$27);
               if ($$27.L() > $$31) {
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
      } else if ($$2 == crz.d && $$3.fX() && this.g().f() && $$0 >= 0) {
         ctl $$32 = this.k.get($$0);
         if ($$32.h()) {
            cwb $$33 = $$32.g();
            this.b($$33.c($$33.k()));
         }
      } else if ($$2 == crz.e && this.g().f() && $$0 >= 0) {
         ctl $$34 = this.k.get($$0);
         int $$35 = $$1 == 0 ? 1 : $$34.g().L();
         cwb $$36 = $$34.b($$35, Integer.MAX_VALUE, $$3);
         $$3.a($$36, true);
         if ($$1 == 1) {
            while (!$$36.f() && cwb.b($$34.g(), $$36)) {
               $$36 = $$34.b($$35, Integer.MAX_VALUE, $$3);
               $$3.a($$36, true);
            }
         }

         $$3.g($$36);
      } else if ($$2 == crz.g && $$0 >= 0) {
         ctl $$37 = this.k.get($$0);
         cwb $$38 = this.g();
         if (!$$38.f() && (!$$37.h() || !$$37.a($$3))) {
            int $$39 = $$1 == 0 ? 0 : this.k.size() - 1;
            int $$40 = $$1 == 0 ? 1 : -1;

            for (int $$41 = 0; $$41 < 2; $$41++) {
               for (int $$42 = $$39; $$42 >= 0 && $$42 < this.k.size() && $$38.L() < $$38.k(); $$42 += $$40) {
                  ctl $$43 = this.k.get($$42);
                  if ($$43.h() && a($$43, $$38, true) && $$43.a($$3) && this.a($$38, $$43)) {
                     cwb $$44 = $$43.g();
                     if ($$41 != 0 || $$44.L() != $$44.k()) {
                        cwb $$45 = $$43.b($$44.L(), $$38.k() - $$38.L(), $$3);
                        $$38.g($$45.L());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(com $$0, cry $$1, ctl $$2, cwb $$3, cwb $$4) {
      crf $$5 = $$0.dX().J();
      return $$4.a($$5) && $$4.a($$2, $$1, $$0) ? true : $$3.a($$5) && $$3.a($$4, $$2, $$1, $$0, this.m());
   }

   private bvs m() {
      return new bvs() {
         @Override
         public cwb a() {
            return cro.this.g();
         }

         @Override
         public boolean a(cwb $$0) {
            cro.this.b($$0);
            return true;
         }
      };
   }

   public boolean a(cwb $$0, ctl $$1) {
      return true;
   }

   public void a(com $$0) {
      if ($$0 instanceof aro) {
         cwb $$1 = this.g();
         if (!$$1.f()) {
            a($$0, $$1);
            this.b(cwb.k);
         }
      }
   }

   private static void a(com $$0, cwb $$1) {
      boolean $$2;
      boolean var10000;
      label27: {
         $$2 = $$0.dS() && $$0.dT() != bue.c.e;
         if ($$0 instanceof aro $$3 && $$3.x()) {
            var10000 = true;
            break label27;
         }

         var10000 = false;
      }

      boolean $$4 = var10000;
      if ($$2 || $$4) {
         $$0.a($$1, false);
      } else if ($$0 instanceof aro) {
         $$0.gk().g($$1);
      }
   }

   protected void a(com $$0, brw $$1) {
      for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
         a($$0, $$1.b($$2));
      }
   }

   public void a(brw $$0) {
      this.d();
   }

   public void a(int $$0, int $$1, cwb $$2) {
      this.b($$0).f($$2);
      this.t = $$1;
   }

   public void a(int $$0, List<cwb> $$1, cwb $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         this.b($$3).f($$1.get($$3));
      }

      this.p = $$2;
      this.t = $$0;
   }

   public void b(int $$0, int $$1) {
      this.o.get($$0).a($$1);
   }

   public abstract boolean b(com var1);

   protected boolean a(cwb $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = false;
      int $$5 = $$1;
      if ($$3) {
         $$5 = $$2 - 1;
      }

      if ($$0.l()) {
         while (!$$0.f() && ($$3 ? $$5 >= $$1 : $$5 < $$2)) {
            ctl $$6 = this.k.get($$5);
            cwb $$7 = $$6.g();
            if (!$$7.f() && cwb.c($$0, $$7)) {
               int $$8 = $$7.L() + $$0.L();
               int $$9 = $$6.a_($$7);
               if ($$8 <= $$9) {
                  $$0.e(0);
                  $$7.e($$8);
                  $$6.c();
                  $$4 = true;
               } else if ($$7.L() < $$9) {
                  $$0.h($$9 - $$7.L());
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

      if (!$$0.f()) {
         if ($$3) {
            $$5 = $$2 - 1;
         } else {
            $$5 = $$1;
         }

         while ($$3 ? $$5 >= $$1 : $$5 < $$2) {
            ctl $$10 = this.k.get($$5);
            cwb $$11 = $$10.g();
            if ($$11.f() && $$10.a($$0)) {
               int $$12 = $$10.a_($$0);
               $$10.e($$0.a(Math.min($$0.L(), $$12)));
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

   public static int c(int $$0, int $$1) {
      return $$0 & 3 | ($$1 & 3) << 2;
   }

   public static boolean a(int $$0, com $$1) {
      if ($$0 == 0) {
         return true;
      } else {
         return $$0 == 1 ? true : $$0 == 2 && $$1.fX();
      }
   }

   protected void f() {
      this.w = 0;
      this.x.clear();
   }

   public static boolean a(@Nullable ctl $$0, cwb $$1, boolean $$2) {
      boolean $$3 = $$0 == null || !$$0.h();
      return !$$3 && cwb.c($$1, $$0.g()) ? $$0.g().L() + ($$2 ? 0 : $$1.L()) <= $$1.k() : $$3;
   }

   public static int a(Set<ctl> $$0, int $$1, cwb $$2) {
      return switch ($$1) {
         case 0 -> azk.d((float)$$2.L() / (float)$$0.size());
         case 1 -> 1;
         case 2 -> $$2.k();
         default -> $$2.L();
      };
   }

   public boolean b(ctl $$0) {
      return true;
   }

   public static int a(@Nullable dsm $$0) {
      return $$0 instanceof brw ? b((brw)$$0) : 0;
   }

   public static int b(@Nullable brw $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         float $$1 = 0.0F;

         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            cwb $$3 = $$0.a($$2);
            if (!$$3.f()) {
               $$1 += (float)$$3.L() / (float)$$0.e_($$3);
            }
         }

         $$1 /= (float)$$0.b();
         return azk.b($$1, 0, 15);
      }
   }

   public void b(cwb $$0) {
      this.p = $$0;
   }

   public cwb g() {
      return this.p;
   }

   public void h() {
      this.A = true;
   }

   public void i() {
      this.A = false;
   }

   public void a(cro $$0) {
      Table<brw, Integer, Integer> $$1 = HashBasedTable.create();

      for (int $$2 = 0; $$2 < $$0.k.size(); $$2++) {
         ctl $$3 = $$0.k.get($$2);
         $$1.put($$3.c, $$3.i(), $$2);
      }

      for (int $$4 = 0; $$4 < this.k.size(); $$4++) {
         ctl $$5 = this.k.get($$4);
         Integer $$6 = (Integer)$$1.get($$5.c, $$5.i());
         if ($$6 != null) {
            this.n.set($$4, $$0.n.get($$6));
            this.q.set($$4, $$0.q.get($$6));
         }
      }
   }

   public OptionalInt b(brw $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.k.size(); $$2++) {
         ctl $$3 = this.k.get($$2);
         if ($$3.c == $$0 && $$1 == $$3.i()) {
            return OptionalInt.of($$2);
         }
      }

      return OptionalInt.empty();
   }

   public int j() {
      return this.t;
   }

   public int k() {
      this.t = this.t + 1 & 32767;
      return this.t;
   }
}
