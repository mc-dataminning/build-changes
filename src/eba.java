import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class eba extends ebi {
   private final Long2ObjectMap<eaz> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cqk $$0, bjk $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.C();
   }

   @Override
   public void b() {
      this.b.E();
      this.l.clear();
      super.b();
   }

   @Override
   public ebb a() {
      int $$0;
      if (this.f() && this.b.aX()) {
         $$0 = this.b.dr();
         gw.a $$1 = new gw.a(this.b.dq(), (double)$$0, this.b.dw());

         for (dfl $$2 = this.a.a_($$1); $$2.a(csy.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dq(), (double)(++$$0), this.b.dw());
         }
      } else {
         $$0 = ary.a(this.b.ds() + 0.5);
      }

      gw $$4 = gw.a(this.b.dq(), (double)$$0, this.b.dw());
      if (!this.a($$4)) {
         for (gw $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(gw $$0) {
      eaz $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public ebh a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ary.a($$0), ary.a($$1), ary.a($$2)));
   }

   @Override
   public int a(ebb[] $$0, ebb $$1) {
      int $$2 = 0;
      ebb $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      ebb $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      ebb $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      ebb $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      ebb $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      ebb $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      ebb $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      ebb $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      ebb $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      ebb $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      ebb $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      ebb $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      ebb $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      ebb $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      ebb $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      ebb $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      ebb $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      ebb $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      ebb $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      ebb $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      ebb $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      ebb $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      ebb $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      ebb $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      ebb $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      ebb $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable ebb $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable ebb $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected ebb a(int $$0, int $$1, int $$2) {
      ebb $$3 = null;
      eaz $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == eaz.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private eaz c(int $$0, int $$1, int $$2) {
      return (eaz)this.l.computeIfAbsent(gw.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eaz a(cpd $$0, int $$1, int $$2, int $$3, bjk $$4) {
      EnumSet<eaz> $$5 = EnumSet.noneOf(eaz.class);
      eaz $$6 = eaz.a;
      gw $$7 = $$4.dl();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(eaz.h)) {
         return eaz.h;
      } else {
         eaz $$8 = eaz.a;

         for (eaz $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == eaz.b && $$4.a($$8) == 0.0F ? eaz.b : $$8;
      }
   }

   @Override
   public eaz a(cpd $$0, int $$1, int $$2, int $$3) {
      gw.a $$4 = new gw.a();
      eaz $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eaz.b && $$2 >= $$0.H_() + 1) {
         eaz $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == eaz.o || $$6 == eaz.i) {
            $$5 = eaz.o;
         } else if ($$6 == eaz.q) {
            $$5 = eaz.q;
         } else if ($$6 == eaz.x) {
            $$5 = eaz.x;
         } else if ($$6 == eaz.h) {
            if (!$$4.equals(this.b.dl())) {
               $$5 = eaz.h;
            }
         } else {
            $$5 = $$6 != eaz.c && $$6 != eaz.b && $$6 != eaz.j ? eaz.c : eaz.b;
         }
      }

      if ($$5 == eaz.c || $$5 == eaz.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<gw> a(bjk $$0) {
      float $$1 = 1.0F;
      ehk $$2 = $$0.cG();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            gw.a($$2.a, (double)$$0.dr(), $$2.c),
            gw.a($$2.a, (double)$$0.dr(), $$2.f),
            gw.a($$2.d, (double)$$0.dr(), $$2.c),
            gw.a($$2.d, (double)$$0.dr(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         ehk $$7 = $$2.c($$5, $$6, $$4);
         return gw.a($$0.ef(), 10, ary.a($$7.a), ary.a($$7.b), ary.a($$7.c), ary.a($$7.d), ary.a($$7.e), ary.a($$7.f));
      }
   }
}
