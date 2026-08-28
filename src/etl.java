import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class etl extends etw {
   private final Long2ObjectMap<etr> a = new Long2ObjectOpenHashMap();
   private static final float m = 1.0F;
   private static final float n = 1.1F;
   private static final int o = 10;

   @Override
   public void a(dgw $$0, bvk $$1) {
      super.a($$0, $$1);
      this.a.clear();
      $$1.H();
   }

   @Override
   public void b() {
      this.c.I();
      this.a.clear();
      super.b();
   }

   @Override
   public etm a() {
      int $$0;
      if (this.f() && this.c.bj()) {
         $$0 = this.c.dB();
         ji.a $$1 = new ji.a(this.c.dA(), (double)$$0, this.c.dG());

         for (dwy $$2 = this.b.a($$1); $$2.a(djp.J); $$2 = this.b.a($$1)) {
            $$1.b(this.c.dA(), (double)(++$$0), this.c.dG());
         }
      } else {
         $$0 = ayz.a(this.c.dC() + 0.5);
      }

      ji $$4 = ji.a(this.c.dA(), (double)$$0, this.c.dG());
      if (!this.a($$4)) {
         for (ji $$5 : this.a(this.c)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(ji $$0) {
      etr $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.c.a($$1) >= 0.0F;
   }

   @Override
   public etv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(etm[] $$0, etm $$1) {
      int $$2 = 0;
      etm $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      etm $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      etm $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      etm $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      etm $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      etm $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      etm $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      etm $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      etm $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      etm $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      etm $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      etm $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      etm $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      etm $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      etm $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      etm $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      etm $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      etm $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      etm $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      etm $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      etm $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      etm $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      etm $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      etm $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      etm $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      etm $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable etm $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable etm $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected etm a(int $$0, int $$1, int $$2) {
      etm $$3 = null;
      etr $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.c.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == etr.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected etr b(int $$0, int $$1, int $$2) {
      return (etr)this.a.computeIfAbsent(ji.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public etr a(ett $$0, int $$1, int $$2, int $$3) {
      etr $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == etr.b && $$2 >= $$0.a().L_() + 1) {
         ji $$5 = new ji($$1, $$2 - 1, $$3);
         etr $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == etr.o || $$6 == etr.i) {
            $$4 = etr.o;
         } else if ($$6 == etr.q) {
            $$4 = etr.q;
         } else if ($$6 == etr.x) {
            $$4 = etr.x;
         } else if ($$6 == etr.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = etr.h;
            }
         } else {
            $$4 = $$6 != etr.c && $$6 != etr.b && $$6 != etr.j ? etr.c : etr.b;
         }
      }

      if ($$4 == etr.c || $$4 == etr.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<ji> a(bvk $$0) {
      faw $$1 = $$0.cR();
      boolean $$2 = $$1.a() < 1.0;
      if (!$$2) {
         return List.of(
            ji.a($$1.a, (double)$$0.dB(), $$1.c),
            ji.a($$1.a, (double)$$0.dB(), $$1.f),
            ji.a($$1.d, (double)$$0.dB(), $$1.c),
            ji.a($$1.d, (double)$$0.dB(), $$1.f)
         );
      } else {
         double $$3 = Math.max(0.0, 1.1F - $$1.d());
         double $$4 = Math.max(0.0, 1.1F - $$1.b());
         double $$5 = Math.max(0.0, 1.1F - $$1.c());
         faw $$6 = $$1.c($$4, $$5, $$3);
         return ji.a($$0.dY(), 10, ayz.a($$6.a), ayz.a($$6.b), ayz.a($$6.c), ayz.a($$6.d), ayz.a($$6.e), ayz.a($$6.f));
      }
   }
}
