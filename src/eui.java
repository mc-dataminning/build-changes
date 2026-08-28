import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class eui extends eut {
   private final Long2ObjectMap<euo> a = new Long2ObjectOpenHashMap();
   private static final float m = 1.0F;
   private static final float n = 1.1F;
   private static final int o = 10;

   @Override
   public void a(dhv $$0, bwi $$1) {
      super.a($$0, $$1);
      this.a.clear();
      $$1.E();
   }

   @Override
   public void b() {
      this.c.F();
      this.a.clear();
      super.b();
   }

   @Override
   public euj a() {
      int $$0;
      if (this.f() && this.c.bj()) {
         $$0 = this.c.dC();
         jh.a $$1 = new jh.a(this.c.dB(), (double)$$0, this.c.dH());

         for (dxv $$2 = this.b.a($$1); $$2.a(dko.J); $$2 = this.b.a($$1)) {
            $$1.b(this.c.dB(), (double)(++$$0), this.c.dH());
         }
      } else {
         $$0 = bae.a(this.c.dD() + 0.5);
      }

      jh $$4 = jh.a(this.c.dB(), (double)$$0, this.c.dH());
      if (!this.a($$4)) {
         for (jh $$5 : this.a(this.c)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(jh $$0) {
      euo $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.c.a($$1) >= 0.0F;
   }

   @Override
   public eus a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(euj[] $$0, euj $$1) {
      int $$2 = 0;
      euj $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      euj $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      euj $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      euj $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      euj $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      euj $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      euj $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      euj $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      euj $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      euj $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      euj $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      euj $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      euj $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      euj $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      euj $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      euj $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      euj $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      euj $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      euj $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      euj $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      euj $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      euj $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      euj $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      euj $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      euj $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      euj $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable euj $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable euj $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected euj a(int $$0, int $$1, int $$2) {
      euj $$3 = null;
      euo $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.c.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == euo.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected euo b(int $$0, int $$1, int $$2) {
      return (euo)this.a.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public euo a(euq $$0, int $$1, int $$2, int $$3) {
      euo $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == euo.b && $$2 >= $$0.a().L_() + 1) {
         jh $$5 = new jh($$1, $$2 - 1, $$3);
         euo $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == euo.o || $$6 == euo.i) {
            $$4 = euo.o;
         } else if ($$6 == euo.q) {
            $$4 = euo.q;
         } else if ($$6 == euo.x) {
            $$4 = euo.x;
         } else if ($$6 == euo.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = euo.h;
            }
         } else {
            $$4 = $$6 != euo.c && $$6 != euo.b && $$6 != euo.j ? euo.c : euo.b;
         }
      }

      if ($$4 == euo.c || $$4 == euo.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<jh> a(bwi $$0) {
      fbt $$1 = $$0.cR();
      boolean $$2 = $$1.a() < 1.0;
      if (!$$2) {
         return List.of(
            jh.a($$1.a, (double)$$0.dC(), $$1.c),
            jh.a($$1.a, (double)$$0.dC(), $$1.f),
            jh.a($$1.d, (double)$$0.dC(), $$1.c),
            jh.a($$1.d, (double)$$0.dC(), $$1.f)
         );
      } else {
         double $$3 = Math.max(0.0, 1.1F - $$1.d());
         double $$4 = Math.max(0.0, 1.1F - $$1.b());
         double $$5 = Math.max(0.0, 1.1F - $$1.c());
         fbt $$6 = $$1.c($$4, $$5, $$3);
         return jh.a($$0.dZ(), 10, bae.a($$6.a), bae.a($$6.b), bae.a($$6.c), bae.a($$6.d), bae.a($$6.e), bae.a($$6.f));
      }
   }
}
