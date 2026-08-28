import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class eua extends eul {
   private final Long2ObjectMap<eug> a = new Long2ObjectOpenHashMap();
   private static final float m = 1.0F;
   private static final float n = 1.1F;
   private static final int o = 10;

   @Override
   public void a(dhn $$0, bwd $$1) {
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
   public eub a() {
      int $$0;
      if (this.f() && this.c.bj()) {
         $$0 = this.c.dB();
         jh.a $$1 = new jh.a(this.c.dA(), (double)$$0, this.c.dG());

         for (dxn $$2 = this.b.a($$1); $$2.a(dkg.J); $$2 = this.b.a($$1)) {
            $$1.b(this.c.dA(), (double)(++$$0), this.c.dG());
         }
      } else {
         $$0 = bae.a(this.c.dC() + 0.5);
      }

      jh $$4 = jh.a(this.c.dA(), (double)$$0, this.c.dG());
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
      eug $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.c.a($$1) >= 0.0F;
   }

   @Override
   public euk a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eub[] $$0, eub $$1) {
      int $$2 = 0;
      eub $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      eub $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      eub $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      eub $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      eub $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      eub $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      eub $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      eub $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      eub $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      eub $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      eub $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      eub $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      eub $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      eub $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      eub $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      eub $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      eub $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      eub $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      eub $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      eub $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      eub $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      eub $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      eub $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      eub $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      eub $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      eub $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable eub $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable eub $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected eub a(int $$0, int $$1, int $$2) {
      eub $$3 = null;
      eug $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.c.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == eug.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected eug b(int $$0, int $$1, int $$2) {
      return (eug)this.a.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2, this.c));
   }

   @Override
   public eug a(eui $$0, int $$1, int $$2, int $$3) {
      eug $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == eug.b && $$2 >= $$0.a().L_() + 1) {
         jh $$5 = new jh($$1, $$2 - 1, $$3);
         eug $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == eug.o || $$6 == eug.i) {
            $$4 = eug.o;
         } else if ($$6 == eug.q) {
            $$4 = eug.q;
         } else if ($$6 == eug.x) {
            $$4 = eug.x;
         } else if ($$6 == eug.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = eug.h;
            }
         } else {
            $$4 = $$6 != eug.c && $$6 != eug.b && $$6 != eug.j ? eug.c : eug.b;
         }
      }

      if ($$4 == eug.c || $$4 == eug.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<jh> a(bwd $$0) {
      fbn $$1 = $$0.cR();
      boolean $$2 = $$1.a() < 1.0;
      if (!$$2) {
         return List.of(
            jh.a($$1.a, (double)$$0.dB(), $$1.c),
            jh.a($$1.a, (double)$$0.dB(), $$1.f),
            jh.a($$1.d, (double)$$0.dB(), $$1.c),
            jh.a($$1.d, (double)$$0.dB(), $$1.f)
         );
      } else {
         double $$3 = Math.max(0.0, 1.1F - $$1.d());
         double $$4 = Math.max(0.0, 1.1F - $$1.b());
         double $$5 = Math.max(0.0, 1.1F - $$1.c());
         fbn $$6 = $$1.c($$4, $$5, $$3);
         return jh.a($$0.dY(), 10, bae.a($$6.a), bae.a($$6.b), bae.a($$6.c), bae.a($$6.d), bae.a($$6.e), bae.a($$6.f));
      }
   }
}
