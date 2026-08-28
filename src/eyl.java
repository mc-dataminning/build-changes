import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class eyl extends eyw {
   private final Long2ObjectMap<eyr> a = new Long2ObjectOpenHashMap();
   private static final float m = 1.0F;
   private static final float n = 1.1F;
   private static final int o = 10;

   @Override
   public void a(dkw $$0, byh $$1) {
      super.a($$0, $$1);
      this.a.clear();
      $$1.G();
   }

   @Override
   public void b() {
      this.c.H();
      this.a.clear();
      super.b();
   }

   @Override
   public eym a() {
      int $$0;
      if (this.f() && this.c.bi()) {
         $$0 = this.c.dB();
         iw.a $$1 = new iw.a(this.c.dA(), (double)$$0, this.c.dG());

         for (ebq $$2 = this.b.a($$1); $$2.a(dnq.J); $$2 = this.b.a($$1)) {
            $$1.b(this.c.dA(), (double)(++$$0), this.c.dG());
         }
      } else {
         $$0 = azz.a(this.c.dC() + 0.5);
      }

      iw $$4 = iw.a(this.c.dA(), (double)$$0, this.c.dG());
      if (!this.a($$4)) {
         for (iw $$5 : this.a(this.c)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(iw $$0) {
      eyr $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.c.a($$1) >= 0.0F;
   }

   @Override
   public eyv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eym[] $$0, eym $$1) {
      int $$2 = 0;
      eym $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      eym $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      eym $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      eym $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      eym $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      eym $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      eym $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      eym $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      eym $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      eym $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      eym $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      eym $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      eym $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      eym $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      eym $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      eym $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      eym $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      eym $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      eym $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      eym $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      eym $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      eym $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      eym $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      eym $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      eym $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      eym $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable eym $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable eym $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected eym a(int $$0, int $$1, int $$2) {
      eym $$3 = null;
      eyr $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.c.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == eyr.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected eyr b(int $$0, int $$1, int $$2) {
      return (eyr)this.a.computeIfAbsent(iw.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public eyr a(eyt $$0, int $$1, int $$2, int $$3) {
      eyr $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eyr.b && $$2 >= $$0.a().K_() + 1) {
         iw $$5 = new iw($$1, $$2 - 1, $$3);
         eyr $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == eyr.o || $$6 == eyr.i) {
            $$4 = eyr.o;
         } else if ($$6 == eyr.q) {
            $$4 = eyr.q;
         } else if ($$6 == eyr.x) {
            $$4 = eyr.x;
         } else if ($$6 == eyr.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = eyr.h;
            }
         } else {
            $$4 = $$6 != eyr.c && $$6 != eyr.b && $$6 != eyr.j ? eyr.c : eyr.b;
         }
      }

      if ($$4 == eyr.c || $$4 == eyr.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<iw> a(byh $$0) {
      ffx $$1 = $$0.cR();
      boolean $$2 = $$1.a() < 1.0;
      if (!$$2) {
         return List.of(
            iw.a($$1.a, (double)$$0.dB(), $$1.c),
            iw.a($$1.a, (double)$$0.dB(), $$1.f),
            iw.a($$1.d, (double)$$0.dB(), $$1.c),
            iw.a($$1.d, (double)$$0.dB(), $$1.f)
         );
      } else {
         double $$3 = Math.max(0.0, 1.1F - $$1.d());
         double $$4 = Math.max(0.0, 1.1F - $$1.b());
         double $$5 = Math.max(0.0, 1.1F - $$1.c());
         ffx $$6 = $$1.c($$4, $$5, $$3);
         return iw.a($$0.dY(), 10, azz.a($$6.a), azz.a($$6.b), azz.a($$6.c), azz.a($$6.d), azz.a($$6.e), azz.a($$6.f));
      }
   }
}
