import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class eid extends eil {
   private final Long2ObjectMap<eic> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cwr $$0, boz $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.E();
   }

   @Override
   public void b() {
      this.b.G();
      this.l.clear();
      super.b();
   }

   @Override
   public eie a() {
      int $$0;
      if (this.f() && this.b.aZ()) {
         $$0 = this.b.dp();
         ib.a $$1 = new ib.a(this.b.do(), (double)$$0, this.b.du());

         for (dme $$2 = this.a.a_($$1); $$2.a(czh.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.do(), (double)(++$$0), this.b.du());
         }
      } else {
         $$0 = awm.a(this.b.dq() + 0.5);
      }

      ib $$4 = ib.a(this.b.do(), (double)$$0, this.b.du());
      if (!this.a($$4)) {
         for (ib $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(ib $$0) {
      eic $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public eik a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awm.a($$0), awm.a($$1), awm.a($$2)));
   }

   @Override
   public int a(eie[] $$0, eie $$1) {
      int $$2 = 0;
      eie $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      eie $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      eie $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      eie $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      eie $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      eie $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      eie $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      eie $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      eie $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      eie $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      eie $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      eie $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      eie $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      eie $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      eie $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      eie $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      eie $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      eie $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      eie $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      eie $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      eie $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      eie $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      eie $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      eie $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      eie $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      eie $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable eie $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable eie $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected eie a(int $$0, int $$1, int $$2) {
      eie $$3 = null;
      eic $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == eic.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private eic c(int $$0, int $$1, int $$2) {
      return (eic)this.l.computeIfAbsent(ib.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eic a(cvk $$0, int $$1, int $$2, int $$3, boz $$4) {
      EnumSet<eic> $$5 = EnumSet.noneOf(eic.class);
      eic $$6 = eic.a;
      ib $$7 = $$4.dj();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(eic.h)) {
         return eic.h;
      } else {
         eic $$8 = eic.a;

         for (eic $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == eic.b && $$4.a($$8) == 0.0F ? eic.b : $$8;
      }
   }

   @Override
   public eic a(cvk $$0, int $$1, int $$2, int $$3) {
      ib.a $$4 = new ib.a();
      eic $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eic.b && $$2 >= $$0.J_() + 1) {
         eic $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == eic.o || $$6 == eic.i) {
            $$5 = eic.o;
         } else if ($$6 == eic.q) {
            $$5 = eic.q;
         } else if ($$6 == eic.x) {
            $$5 = eic.x;
         } else if ($$6 == eic.h) {
            if (!$$4.equals(this.b.dj())) {
               $$5 = eic.h;
            }
         } else {
            $$5 = $$6 != eic.c && $$6 != eic.b && $$6 != eic.j ? eic.c : eic.b;
         }
      }

      if ($$5 == eic.c || $$5 == eic.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<ib> a(boz $$0) {
      float $$1 = 1.0F;
      eoq $$2 = $$0.cE();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            ib.a($$2.a, (double)$$0.dp(), $$2.c),
            ib.a($$2.a, (double)$$0.dp(), $$2.f),
            ib.a($$2.d, (double)$$0.dp(), $$2.c),
            ib.a($$2.d, (double)$$0.dp(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         eoq $$7 = $$2.c($$5, $$6, $$4);
         return ib.a($$0.ef(), 10, awm.a($$7.a), awm.a($$7.b), awm.a($$7.c), awm.a($$7.d), awm.a($$7.e), awm.a($$7.f));
      }
   }
}
