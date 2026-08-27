import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class eiz extends ejh {
   private final Long2ObjectMap<eiy> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cxm $$0, bpq $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.C();
   }

   @Override
   public void b() {
      this.b.D();
      this.l.clear();
      super.b();
   }

   @Override
   public eja a() {
      int $$0;
      if (this.f() && this.b.bc()) {
         $$0 = this.b.ds();
         ib.a $$1 = new ib.a(this.b.dr(), (double)$$0, this.b.dx());

         for (dmz $$2 = this.a.a_($$1); $$2.a(dac.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dr(), (double)(++$$0), this.b.dx());
         }
      } else {
         $$0 = aww.a(this.b.dt() + 0.5);
      }

      ib $$4 = ib.a(this.b.dr(), (double)$$0, this.b.dx());
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
      eiy $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public ejg a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aww.a($$0), aww.a($$1), aww.a($$2)));
   }

   @Override
   public int a(eja[] $$0, eja $$1) {
      int $$2 = 0;
      eja $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      eja $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      eja $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      eja $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      eja $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      eja $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      eja $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      eja $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      eja $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      eja $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      eja $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      eja $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      eja $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      eja $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      eja $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      eja $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      eja $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      eja $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      eja $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      eja $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      eja $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      eja $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      eja $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      eja $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      eja $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      eja $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable eja $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable eja $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected eja a(int $$0, int $$1, int $$2) {
      eja $$3 = null;
      eiy $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == eiy.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private eiy c(int $$0, int $$1, int $$2) {
      return (eiy)this.l.computeIfAbsent(ib.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eiy a(cwf $$0, int $$1, int $$2, int $$3, bpq $$4) {
      EnumSet<eiy> $$5 = EnumSet.noneOf(eiy.class);
      eiy $$6 = eiy.a;
      ib $$7 = $$4.dm();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(eiy.h)) {
         return eiy.h;
      } else {
         eiy $$8 = eiy.a;

         for (eiy $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == eiy.b && $$4.a($$8) == 0.0F ? eiy.b : $$8;
      }
   }

   @Override
   public eiy a(cwf $$0, int $$1, int $$2, int $$3) {
      ib.a $$4 = new ib.a();
      eiy $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eiy.b && $$2 >= $$0.I_() + 1) {
         eiy $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == eiy.o || $$6 == eiy.i) {
            $$5 = eiy.o;
         } else if ($$6 == eiy.q) {
            $$5 = eiy.q;
         } else if ($$6 == eiy.x) {
            $$5 = eiy.x;
         } else if ($$6 == eiy.h) {
            if (!$$4.equals(this.b.dm())) {
               $$5 = eiy.h;
            }
         } else {
            $$5 = $$6 != eiy.c && $$6 != eiy.b && $$6 != eiy.j ? eiy.c : eiy.b;
         }
      }

      if ($$5 == eiy.c || $$5 == eiy.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<ib> a(bpq $$0) {
      float $$1 = 1.0F;
      epm $$2 = $$0.cH();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            ib.a($$2.a, (double)$$0.ds(), $$2.c),
            ib.a($$2.a, (double)$$0.ds(), $$2.f),
            ib.a($$2.d, (double)$$0.ds(), $$2.c),
            ib.a($$2.d, (double)$$0.ds(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         epm $$7 = $$2.c($$5, $$6, $$4);
         return ib.a($$0.ei(), 10, aww.a($$7.a), aww.a($$7.b), aww.a($$7.c), aww.a($$7.d), aww.a($$7.e), aww.a($$7.f));
      }
   }
}
