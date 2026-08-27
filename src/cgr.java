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

public abstract class cgr {
   private static final Logger k = LogUtils.getLogger();
   public static final int a = -999;
   public static final int b = 0;
   public static final int c = 1;
   public static final int d = 2;
   public static final int e = 0;
   public static final int f = 1;
   public static final int g = 2;
   public static final int h = Integer.MAX_VALUE;
   private final ip<clo> l = ip.a();
   public final ip<cim> i = ip.a();
   private final List<chj> m = Lists.newArrayList();
   private clo n = clo.b;
   private final ip<clo> o = ip.a();
   private final IntList p = new IntArrayList();
   private clo q = clo.b;
   private int r;
   @Nullable
   private final chy<?> s;
   public final int j;
   private int t = -1;
   private int u;
   private final Set<cim> v = Sets.newHashSet();
   private final List<chd> w = Lists.newArrayList();
   @Nullable
   private che x;
   private boolean y;

   protected cgr(@Nullable chy<?> $$0, int $$1) {
      this.s = $$0;
      this.j = $$1;
   }

   protected static boolean a(chc $$0, cdz $$1, cvf $$2) {
      return $$0.a(($$2x, $$3) -> !$$2x.a_($$3).a($$2) ? false : $$1.i((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5) <= 64.0, true);
   }

   public chy<?> a() {
      if (this.s == null) {
         throw new UnsupportedOperationException("Unable to construct this menu by type");
      } else {
         return this.s;
      }
   }

   protected static void a(biu $$0, int $$1) {
      int $$2 = $$0.b();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container size " + $$2 + " is smaller than expected " + $$1);
      }
   }

   protected static void a(chb $$0, int $$1) {
      int $$2 = $$0.a();
      if ($$2 < $$1) {
         throw new IllegalArgumentException("Container data count " + $$2 + " is smaller than expected " + $$1);
      }
   }

   public boolean a(int $$0) {
      return $$0 == -1 || $$0 == -999 || $$0 < this.i.size();
   }

   protected cim a(cim $$0) {
      $$0.e = this.i.size();
      this.i.add($$0);
      this.l.add(clo.b);
      this.o.add(clo.b);
      return $$0;
   }

   protected chj a(chj $$0) {
      this.m.add($$0);
      this.p.add(0);
      return $$0;
   }

   protected void a(chb $$0) {
      for (int $$1 = 0; $$1 < $$0.a(); $$1++) {
         this.a(chj.a($$0, $$1));
      }
   }

   public void a(chd $$0) {
      if (!this.w.contains($$0)) {
         this.w.add($$0);
         this.d();
      }
   }

   public void a(che $$0) {
      this.x = $$0;
      this.b();
   }

   public void b() {
      int $$0 = 0;

      for (int $$1 = this.i.size(); $$0 < $$1; $$0++) {
         this.o.set($$0, this.i.get($$0).f().p());
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

   public void b(chd $$0) {
      this.w.remove($$0);
   }

   public ip<clo> c() {
      ip<clo> $$0 = ip.a();

      for (cim $$1 : this.i) {
         $$0.add($$1.f());
      }

      return $$0;
   }

   public void d() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         clo $$1 = this.i.get($$0).f();
         Supplier<clo> $$2 = Suppliers.memoize($$1::p);
         this.a($$0, $$1, $$2);
         this.b($$0, $$1, $$2);
      }

      this.l();

      for (int $$3 = 0; $$3 < this.m.size(); $$3++) {
         chj $$4 = this.m.get($$3);
         int $$5 = $$4.b();
         if ($$4.c()) {
            this.c($$3, $$5);
         }

         this.d($$3, $$5);
      }
   }

   public void e() {
      for (int $$0 = 0; $$0 < this.i.size(); $$0++) {
         clo $$1 = this.i.get($$0).f();
         this.a($$0, $$1, $$1::p);
      }

      for (int $$2 = 0; $$2 < this.m.size(); $$2++) {
         chj $$3 = this.m.get($$2);
         if ($$3.c()) {
            this.c($$2, $$3.b());
         }
      }

      this.b();
   }

   private void c(int $$0, int $$1) {
      for (chd $$2 : this.w) {
         $$2.a(this, $$0, $$1);
      }
   }

   private void a(int $$0, clo $$1, Supplier<clo> $$2) {
      clo $$3 = this.l.get($$0);
      if (!clo.a($$3, $$1)) {
         clo $$4 = $$2.get();
         this.l.set($$0, $$4);

         for (chd $$5 : this.w) {
            $$5.a(this, $$0, $$4);
         }
      }
   }

   private void b(int $$0, clo $$1, Supplier<clo> $$2) {
      if (!this.y) {
         clo $$3 = this.o.get($$0);
         if (!clo.a($$3, $$1)) {
            clo $$4 = $$2.get();
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
         if (!clo.a(this.g(), this.q)) {
            this.q = this.g().p();
            if (this.x != null) {
               this.x.a(this, this.q);
            }
         }
      }
   }

   public void a(int $$0, clo $$1) {
      this.o.set($$0, $$1.p());
   }

   public void b(int $$0, clo $$1) {
      if ($$0 >= 0 && $$0 < this.o.size()) {
         this.o.set($$0, $$1);
      } else {
         k.debug("Incorrect slot index: {} available slots: {}", $$0, this.o.size());
      }
   }

   public void a(clo $$0) {
      this.q = $$0.p();
   }

   public boolean b(cdz $$0, int $$1) {
      return false;
   }

   public cim b(int $$0) {
      return this.i.get($$0);
   }

   public abstract clo a(cdz var1, int var2);

   public void a(int $$0, int $$1, cha $$2, cdz $$3) {
      try {
         this.b($$0, $$1, $$2, $$3);
      } catch (Exception var8) {
         o $$5 = o.a(var8, "Container click");
         p $$6 = $$5.a("Click info");
         $$6.a("Menu Type", () -> this.s != null ? kc.s.b(this.s).toString() : "<no type>");
         $$6.a("Menu Class", () -> this.getClass().getCanonicalName());
         $$6.a("Slot Count", this.i.size());
         $$6.a("Slot", $$0);
         $$6.a("Button", $$1);
         $$6.a("Type", $$2);
         throw new y($$5);
      }
   }

   private void b(int $$0, int $$1, cha $$2, cdz $$3) {
      cdy $$4 = $$3.fT();
      if ($$2 == cha.f) {
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
            cim $$6 = this.i.get($$0);
            clo $$7 = this.g();
            if (a($$6, $$7, true) && $$6.a($$7) && (this.t == 2 || $$7.L() > this.v.size()) && this.b($$6)) {
               this.v.add($$6);
            }
         } else if (this.u == 2) {
            if (!this.v.isEmpty()) {
               if (this.v.size() == 1) {
                  int $$8 = this.v.iterator().next().e;
                  this.f();
                  this.b($$8, this.t, cha.a, $$3);
                  return;
               }

               clo $$9 = this.g().p();
               if ($$9.b()) {
                  this.f();
                  return;
               }

               int $$10 = this.g().L();

               for (cim $$11 : this.v) {
                  clo $$12 = this.g();
                  if ($$11 != null && a($$11, $$12, true) && $$11.a($$12) && (this.t == 2 || $$12.L() >= this.v.size()) && this.b($$11)) {
                     int $$13 = $$11.g() ? $$11.f().L() : 0;
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
      } else if (($$2 == cha.a || $$2 == cha.b) && ($$1 == 0 || $$1 == 1)) {
         cgz $$16 = $$1 == 0 ? cgz.a : cgz.b;
         if ($$0 == -999) {
            if (!this.g().b()) {
               if ($$16 == cgz.a) {
                  $$3.a(this.g(), true);
                  this.b(clo.b);
               } else {
                  $$3.a(this.g().a(1), true);
               }
            }
         } else if ($$2 == cha.b) {
            if ($$0 < 0) {
               return;
            }

            cim $$17 = this.i.get($$0);
            if (!$$17.a($$3)) {
               return;
            }

            clo $$18 = this.a($$3, $$0);

            while (!$$18.b() && clo.b($$17.f(), $$18)) {
               $$18 = this.a($$3, $$0);
            }
         } else {
            if ($$0 < 0) {
               return;
            }

            cim $$19 = this.i.get($$0);
            clo $$20 = $$19.f();
            clo $$21 = this.g();
            $$3.a($$21, $$19.f(), $$16);
            if (!this.a($$3, $$16, $$19, $$20, $$21)) {
               if ($$20.b()) {
                  if (!$$21.b()) {
                     int $$22 = $$16 == cgz.a ? $$21.L() : 1;
                     this.b($$19.b($$21, $$22));
                  }
               } else if ($$19.a($$3)) {
                  if ($$21.b()) {
                     int $$23 = $$16 == cgz.a ? $$20.L() : ($$20.L() + 1) / 2;
                     Optional<clo> $$24 = $$19.a($$23, Integer.MAX_VALUE, $$3);
                     $$24.ifPresent($$2x -> {
                        this.b($$2x);
                        $$19.a($$3, $$2x);
                     });
                  } else if ($$19.a($$21)) {
                     if (clo.c($$20, $$21)) {
                        int $$25 = $$16 == cgz.a ? $$21.L() : 1;
                        this.b($$19.b($$21, $$25));
                     } else if ($$21.L() <= $$19.a_($$21)) {
                        this.b($$20);
                        $$19.e($$21);
                     }
                  } else if (clo.c($$20, $$21)) {
                     Optional<clo> $$26 = $$19.a($$20.L(), $$21.g() - $$21.L(), $$3);
                     $$26.ifPresent($$3x -> {
                        $$21.g($$3x.L());
                        $$19.a($$3, $$3x);
                     });
                  }
               }
            }

            $$19.b();
         }
      } else if ($$2 == cha.c) {
         cim $$27 = this.i.get($$0);
         clo $$28 = $$4.a($$1);
         clo $$29 = $$27.f();
         if (!$$28.b() || !$$29.b()) {
            if ($$28.b()) {
               if ($$27.a($$3)) {
                  $$4.a($$1, $$29);
                  $$27.b($$29.L());
                  $$27.e(clo.b);
                  $$27.a($$3, $$29);
               }
            } else if ($$29.b()) {
               if ($$27.a($$28)) {
                  int $$30 = $$27.a_($$28);
                  if ($$28.L() > $$30) {
                     $$27.e($$28.a($$30));
                  } else {
                     $$4.a($$1, clo.b);
                     $$27.e($$28);
                  }
               }
            } else if ($$27.a($$3) && $$27.a($$28)) {
               int $$31 = $$27.a_($$28);
               if ($$28.L() > $$31) {
                  $$27.e($$28.a($$31));
                  $$27.a($$3, $$29);
                  if (!$$4.e($$29)) {
                     $$3.a($$29, true);
                  }
               } else {
                  $$4.a($$1, $$29);
                  $$27.e($$28);
                  $$27.a($$3, $$29);
               }
            }
         }
      } else if ($$2 == cha.d && $$3.fU().d && this.g().b() && $$0 >= 0) {
         cim $$32 = this.i.get($$0);
         if ($$32.g()) {
            clo $$33 = $$32.f();
            this.b($$33.c($$33.g()));
         }
      } else if ($$2 == cha.e && this.g().b() && $$0 >= 0) {
         cim $$34 = this.i.get($$0);
         int $$35 = $$1 == 0 ? 1 : $$34.f().L();
         clo $$36 = $$34.b($$35, Integer.MAX_VALUE, $$3);
         $$3.a($$36, true);
      } else if ($$2 == cha.g && $$0 >= 0) {
         cim $$37 = this.i.get($$0);
         clo $$38 = this.g();
         if (!$$38.b() && (!$$37.g() || !$$37.a($$3))) {
            int $$39 = $$1 == 0 ? 0 : this.i.size() - 1;
            int $$40 = $$1 == 0 ? 1 : -1;

            for (int $$41 = 0; $$41 < 2; $$41++) {
               for (int $$42 = $$39; $$42 >= 0 && $$42 < this.i.size() && $$38.L() < $$38.g(); $$42 += $$40) {
                  cim $$43 = this.i.get($$42);
                  if ($$43.g() && a($$43, $$38, true) && $$43.a($$3) && this.a($$38, $$43)) {
                     clo $$44 = $$43.f();
                     if ($$41 != 0 || $$44.L() != $$44.g()) {
                        clo $$45 = $$43.b($$44.L(), $$38.g() - $$38.L(), $$3);
                        $$38.g($$45.L());
                     }
                  }
               }
            }
         }
      }
   }

   private boolean a(cdz $$0, cgz $$1, cim $$2, clo $$3, clo $$4) {
      cgi $$5 = $$0.dN().H();
      return $$4.a($$5) && $$4.a($$2, $$1, $$0) ? true : $$3.a($$5) && $$3.a($$4, $$2, $$1, $$0, this.m());
   }

   private bmd m() {
      return new bmd() {
         @Override
         public clo a() {
            return cgr.this.g();
         }

         @Override
         public boolean a(clo $$0) {
            cgr.this.b($$0);
            return true;
         }
      };
   }

   public boolean a(clo $$0, cim $$1) {
      return true;
   }

   public void b(cdz $$0) {
      if ($$0 instanceof amj) {
         clo $$1 = this.g();
         if (!$$1.b()) {
            if ($$0.bx() && !((amj)$$0).v()) {
               $$0.fT().f($$1);
            } else {
               $$0.a($$1, false);
            }

            this.b(clo.b);
         }
      }
   }

   protected void a(cdz $$0, biu $$1) {
      if (!$$0.bx() || $$0 instanceof amj && ((amj)$$0).v()) {
         for (int $$2 = 0; $$2 < $$1.b(); $$2++) {
            $$0.a($$1.b($$2), false);
         }
      } else {
         for (int $$3 = 0; $$3 < $$1.b(); $$3++) {
            cdy $$4 = $$0.fT();
            if ($$4.m instanceof amj) {
               $$4.f($$1.b($$3));
            }
         }
      }
   }

   public void a(biu $$0) {
      this.d();
   }

   public void a(int $$0, int $$1, clo $$2) {
      this.b($$0).f($$2);
      this.r = $$1;
   }

   public void a(int $$0, List<clo> $$1, clo $$2) {
      for (int $$3 = 0; $$3 < $$1.size(); $$3++) {
         this.b($$3).f($$1.get($$3));
      }

      this.n = $$2;
      this.r = $$0;
   }

   public void a(int $$0, int $$1) {
      this.m.get($$0).a($$1);
   }

   public abstract boolean a(cdz var1);

   protected boolean a(clo $$0, int $$1, int $$2, boolean $$3) {
      boolean $$4 = false;
      int $$5 = $$1;
      if ($$3) {
         $$5 = $$2 - 1;
      }

      if ($$0.h()) {
         while (!$$0.b() && ($$3 ? $$5 >= $$1 : $$5 < $$2)) {
            cim $$6 = this.i.get($$5);
            clo $$7 = $$6.f();
            if (!$$7.b() && clo.c($$0, $$7)) {
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
            cim $$9 = this.i.get($$5);
            clo $$10 = $$9.f();
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

   public static boolean a(int $$0, cdz $$1) {
      if ($$0 == 0) {
         return true;
      } else {
         return $$0 == 1 ? true : $$0 == 2 && $$1.fU().d;
      }
   }

   protected void f() {
      this.u = 0;
      this.v.clear();
   }

   public static boolean a(@Nullable cim $$0, clo $$1, boolean $$2) {
      boolean $$3 = $$0 == null || !$$0.g();
      return !$$3 && clo.c($$1, $$0.f()) ? $$0.f().L() + ($$2 ? 0 : $$1.L()) <= $$1.g() : $$3;
   }

   public static int a(Set<cim> $$0, int $$1, clo $$2) {
      return switch ($$1) {
         case 0 -> atq.d((float)$$2.L() / (float)$$0.size());
         case 1 -> 1;
         case 2 -> $$2.d().l();
         default -> $$2.L();
      };
   }

   public boolean b(cim $$0) {
      return true;
   }

   public static int a(@Nullable dfi $$0) {
      return $$0 instanceof biu ? b((biu)$$0) : 0;
   }

   public static int b(@Nullable biu $$0) {
      if ($$0 == null) {
         return 0;
      } else {
         float $$1 = 0.0F;

         for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
            clo $$3 = $$0.a($$2);
            if (!$$3.b()) {
               $$1 += (float)$$3.L() / (float)Math.min($$0.al_(), $$3.g());
            }
         }

         $$1 /= (float)$$0.b();
         return atq.b($$1, 0, 15);
      }
   }

   public void b(clo $$0) {
      this.n = $$0;
   }

   public clo g() {
      return this.n;
   }

   public void h() {
      this.y = true;
   }

   public void i() {
      this.y = false;
   }

   public void a(cgr $$0) {
      Table<biu, Integer, Integer> $$1 = HashBasedTable.create();

      for (int $$2 = 0; $$2 < $$0.i.size(); $$2++) {
         cim $$3 = $$0.i.get($$2);
         $$1.put($$3.d, $$3.h(), $$2);
      }

      for (int $$4 = 0; $$4 < this.i.size(); $$4++) {
         cim $$5 = this.i.get($$4);
         Integer $$6 = (Integer)$$1.get($$5.d, $$5.h());
         if ($$6 != null) {
            this.l.set($$4, $$0.l.get($$6));
            this.o.set($$4, $$0.o.get($$6));
         }
      }
   }

   public OptionalInt b(biu $$0, int $$1) {
      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         cim $$3 = this.i.get($$2);
         if ($$3.d == $$0 && $$1 == $$3.h()) {
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
