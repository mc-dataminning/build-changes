import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class ean extends eav {
   private final Long2ObjectMap<eam> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.5F;
   private static final int n = 10;

   @Override
   public void a(cpx $$0, biy $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.z();
   }

   @Override
   public void b() {
      this.b.A();
      this.l.clear();
      super.b();
   }

   @Override
   public eao a() {
      int $$0;
      if (this.f() && this.b.aX()) {
         $$0 = this.b.dq();
         gv.a $$1 = new gv.a(this.b.dp(), (double)$$0, this.b.dv());

         for (dey $$2 = this.a.a_($$1); $$2.a(csl.G); $$2 = this.a.a_($$1)) {
            $$1.b(this.b.dp(), (double)(++$$0), this.b.dv());
         }
      } else {
         $$0 = aro.a(this.b.dr() + 0.5);
      }

      gv $$4 = gv.a(this.b.dp(), (double)$$0, this.b.dv());
      if (!this.a($$4)) {
         for (gv $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(gv $$0) {
      eam $$1 = this.a(this.b, $$0);
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public eau a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aro.a($$0), aro.a($$1), aro.a($$2)));
   }

   @Override
   public int a(eao[] $$0, eao $$1) {
      int $$2 = 0;
      eao $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      eao $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      eao $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      eao $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      eao $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      eao $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      eao $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      eao $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      eao $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      eao $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      eao $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      eao $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      eao $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      eao $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      eao $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      eao $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      eao $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      eao $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      eao $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      eao $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      eao $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      eao $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      eao $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      eao $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      eao $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      eao $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable eao $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable eao $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected eao a(int $$0, int $$1, int $$2) {
      eao $$3 = null;
      eam $$4 = this.c($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.b($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == eam.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   private eam c(int $$0, int $$1, int $$2) {
      return (eam)this.l.computeIfAbsent(gv.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public eam a(coq $$0, int $$1, int $$2, int $$3, biy $$4) {
      EnumSet<eam> $$5 = EnumSet.noneOf(eam.class);
      eam $$6 = eam.a;
      gv $$7 = $$4.dk();
      $$6 = super.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      if ($$5.contains(eam.h)) {
         return eam.h;
      } else {
         eam $$8 = eam.a;

         for (eam $$9 : $$5) {
            if ($$4.a($$9) < 0.0F) {
               return $$9;
            }

            if ($$4.a($$9) >= $$4.a($$8)) {
               $$8 = $$9;
            }
         }

         return $$6 == eam.b && $$4.a($$8) == 0.0F ? eam.b : $$8;
      }
   }

   @Override
   public eam a(coq $$0, int $$1, int $$2, int $$3) {
      gv.a $$4 = new gv.a();
      eam $$5 = b($$0, $$4.d($$1, $$2, $$3));
      if ($$5 == eam.b && $$2 >= $$0.C_() + 1) {
         eam $$6 = b($$0, $$4.d($$1, $$2 - 1, $$3));
         if ($$6 == eam.o || $$6 == eam.i) {
            $$5 = eam.o;
         } else if ($$6 == eam.q) {
            $$5 = eam.q;
         } else if ($$6 == eam.x) {
            $$5 = eam.x;
         } else if ($$6 == eam.h) {
            if (!$$4.equals(this.b.dk())) {
               $$5 = eam.h;
            }
         } else {
            $$5 = $$6 != eam.c && $$6 != eam.b && $$6 != eam.j ? eam.c : eam.b;
         }
      }

      if ($$5 == eam.c || $$5 == eam.b) {
         $$5 = a($$0, $$4.d($$1, $$2, $$3), $$5);
      }

      return $$5;
   }

   private Iterable<gv> a(biy $$0) {
      float $$1 = 1.0F;
      eha $$2 = $$0.cG();
      boolean $$3 = $$2.a() < 1.0;
      if (!$$3) {
         return List.of(
            gv.a($$2.a, (double)$$0.dq(), $$2.c),
            gv.a($$2.a, (double)$$0.dq(), $$2.f),
            gv.a($$2.d, (double)$$0.dq(), $$2.c),
            gv.a($$2.d, (double)$$0.dq(), $$2.f)
         );
      } else {
         double $$4 = Math.max(0.0, (1.5 - $$2.d()) / 2.0);
         double $$5 = Math.max(0.0, (1.5 - $$2.b()) / 2.0);
         double $$6 = Math.max(0.0, (1.5 - $$2.c()) / 2.0);
         eha $$7 = $$2.c($$5, $$6, $$4);
         return gv.a($$0.ee(), 10, aro.a($$7.a), aro.a($$7.b), aro.a($$7.c), aro.a($$7.d), aro.a($$7.e), aro.a($$7.f));
      }
   }
}
