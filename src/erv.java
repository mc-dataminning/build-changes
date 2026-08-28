import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.List;
import javax.annotation.Nullable;

public class erv extends esg {
   private final Long2ObjectMap<esb> l = new Long2ObjectOpenHashMap();
   private static final float m = 1.0F;
   private static final float n = 1.1F;
   private static final int o = 10;

   @Override
   public void a(dfo $$0, bvc $$1) {
      super.a($$0, $$1);
      this.l.clear();
      $$1.G();
   }

   @Override
   public void b() {
      this.b.I();
      this.l.clear();
      super.b();
   }

   @Override
   public erw a() {
      int $$0;
      if (this.f() && this.b.bk()) {
         $$0 = this.b.dD();
         jh.a $$1 = new jh.a(this.b.dC(), (double)$$0, this.b.dI());

         for (dvj $$2 = this.a.a($$1); $$2.a(dig.G); $$2 = this.a.a($$1)) {
            $$1.b(this.b.dC(), (double)(++$$0), this.b.dI());
         }
      } else {
         $$0 = azk.a(this.b.dE() + 0.5);
      }

      jh $$4 = jh.a(this.b.dC(), (double)$$0, this.b.dI());
      if (!this.a($$4)) {
         for (jh $$5 : this.a(this.b)) {
            if (this.a($$5)) {
               return super.c($$5);
            }
         }
      }

      return super.c($$4);
   }

   @Override
   protected boolean a(jh $$0) {
      esb $$1 = this.b($$0.u(), $$0.v(), $$0.w());
      return this.b.a($$1) >= 0.0F;
   }

   @Override
   public esf a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(erw[] $$0, erw $$1) {
      int $$2 = 0;
      erw $$3 = this.a($$1.a, $$1.b, $$1.c + 1);
      if (this.c($$3)) {
         $$0[$$2++] = $$3;
      }

      erw $$4 = this.a($$1.a - 1, $$1.b, $$1.c);
      if (this.c($$4)) {
         $$0[$$2++] = $$4;
      }

      erw $$5 = this.a($$1.a + 1, $$1.b, $$1.c);
      if (this.c($$5)) {
         $$0[$$2++] = $$5;
      }

      erw $$6 = this.a($$1.a, $$1.b, $$1.c - 1);
      if (this.c($$6)) {
         $$0[$$2++] = $$6;
      }

      erw $$7 = this.a($$1.a, $$1.b + 1, $$1.c);
      if (this.c($$7)) {
         $$0[$$2++] = $$7;
      }

      erw $$8 = this.a($$1.a, $$1.b - 1, $$1.c);
      if (this.c($$8)) {
         $$0[$$2++] = $$8;
      }

      erw $$9 = this.a($$1.a, $$1.b + 1, $$1.c + 1);
      if (this.c($$9) && this.b($$3) && this.b($$7)) {
         $$0[$$2++] = $$9;
      }

      erw $$10 = this.a($$1.a - 1, $$1.b + 1, $$1.c);
      if (this.c($$10) && this.b($$4) && this.b($$7)) {
         $$0[$$2++] = $$10;
      }

      erw $$11 = this.a($$1.a + 1, $$1.b + 1, $$1.c);
      if (this.c($$11) && this.b($$5) && this.b($$7)) {
         $$0[$$2++] = $$11;
      }

      erw $$12 = this.a($$1.a, $$1.b + 1, $$1.c - 1);
      if (this.c($$12) && this.b($$6) && this.b($$7)) {
         $$0[$$2++] = $$12;
      }

      erw $$13 = this.a($$1.a, $$1.b - 1, $$1.c + 1);
      if (this.c($$13) && this.b($$3) && this.b($$8)) {
         $$0[$$2++] = $$13;
      }

      erw $$14 = this.a($$1.a - 1, $$1.b - 1, $$1.c);
      if (this.c($$14) && this.b($$4) && this.b($$8)) {
         $$0[$$2++] = $$14;
      }

      erw $$15 = this.a($$1.a + 1, $$1.b - 1, $$1.c);
      if (this.c($$15) && this.b($$5) && this.b($$8)) {
         $$0[$$2++] = $$15;
      }

      erw $$16 = this.a($$1.a, $$1.b - 1, $$1.c - 1);
      if (this.c($$16) && this.b($$6) && this.b($$8)) {
         $$0[$$2++] = $$16;
      }

      erw $$17 = this.a($$1.a + 1, $$1.b, $$1.c - 1);
      if (this.c($$17) && this.b($$6) && this.b($$5)) {
         $$0[$$2++] = $$17;
      }

      erw $$18 = this.a($$1.a + 1, $$1.b, $$1.c + 1);
      if (this.c($$18) && this.b($$3) && this.b($$5)) {
         $$0[$$2++] = $$18;
      }

      erw $$19 = this.a($$1.a - 1, $$1.b, $$1.c - 1);
      if (this.c($$19) && this.b($$6) && this.b($$4)) {
         $$0[$$2++] = $$19;
      }

      erw $$20 = this.a($$1.a - 1, $$1.b, $$1.c + 1);
      if (this.c($$20) && this.b($$3) && this.b($$4)) {
         $$0[$$2++] = $$20;
      }

      erw $$21 = this.a($$1.a + 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$21) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$7) && this.b($$12) && this.b($$11)) {
         $$0[$$2++] = $$21;
      }

      erw $$22 = this.a($$1.a + 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$22) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$7) && this.b($$9) && this.b($$11)) {
         $$0[$$2++] = $$22;
      }

      erw $$23 = this.a($$1.a - 1, $$1.b + 1, $$1.c - 1);
      if (this.c($$23) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$7) && this.b($$12) && this.b($$10)) {
         $$0[$$2++] = $$23;
      }

      erw $$24 = this.a($$1.a - 1, $$1.b + 1, $$1.c + 1);
      if (this.c($$24) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$7) && this.b($$9) && this.b($$10)) {
         $$0[$$2++] = $$24;
      }

      erw $$25 = this.a($$1.a + 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$25) && this.b($$17) && this.b($$6) && this.b($$5) && this.b($$8) && this.b($$16) && this.b($$15)) {
         $$0[$$2++] = $$25;
      }

      erw $$26 = this.a($$1.a + 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$26) && this.b($$18) && this.b($$3) && this.b($$5) && this.b($$8) && this.b($$13) && this.b($$15)) {
         $$0[$$2++] = $$26;
      }

      erw $$27 = this.a($$1.a - 1, $$1.b - 1, $$1.c - 1);
      if (this.c($$27) && this.b($$19) && this.b($$6) && this.b($$4) && this.b($$8) && this.b($$16) && this.b($$14)) {
         $$0[$$2++] = $$27;
      }

      erw $$28 = this.a($$1.a - 1, $$1.b - 1, $$1.c + 1);
      if (this.c($$28) && this.b($$20) && this.b($$3) && this.b($$4) && this.b($$8) && this.b($$13) && this.b($$14)) {
         $$0[$$2++] = $$28;
      }

      return $$2;
   }

   private boolean b(@Nullable erw $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   private boolean c(@Nullable erw $$0) {
      return $$0 != null && !$$0.i;
   }

   @Nullable
   @Override
   protected erw a(int $$0, int $$1, int $$2) {
      erw $$3 = null;
      esb $$4 = this.b($$0, $$1, $$2);
      float $$5 = this.b.a($$4);
      if ($$5 >= 0.0F) {
         $$3 = this.c($$0, $$1, $$2);
         $$3.l = $$4;
         $$3.k = Math.max($$3.k, $$5);
         if ($$4 == esb.c) {
            $$3.k++;
         }
      }

      return $$3;
   }

   @Override
   protected esb b(int $$0, int $$1, int $$2) {
      return (esb)this.l.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2, this.b));
   }

   @Override
   public esb a(esd $$0, int $$1, int $$2, int $$3) {
      esb $$4 = $$0.a($$1, $$2, $$3);
      if ($$4 == esb.b && $$2 >= $$0.a().I_() + 1) {
         jh $$5 = new jh($$1, $$2 - 1, $$3);
         esb $$6 = $$0.a($$5.u(), $$5.v(), $$5.w());
         if ($$6 == esb.o || $$6 == esb.i) {
            $$4 = esb.o;
         } else if ($$6 == esb.q) {
            $$4 = esb.q;
         } else if ($$6 == esb.x) {
            $$4 = esb.x;
         } else if ($$6 == esb.h) {
            if (!$$5.equals($$0.b())) {
               $$4 = esb.h;
            }
         } else {
            $$4 = $$6 != esb.c && $$6 != esb.b && $$6 != esb.j ? esb.c : esb.b;
         }
      }

      if ($$4 == esb.c || $$4 == esb.b) {
         $$4 = a($$0, $$1, $$2, $$3, $$4);
      }

      return $$4;
   }

   private Iterable<jh> a(bvc $$0) {
      ezi $$1 = $$0.cS();
      boolean $$2 = $$1.a() < 1.0;
      if (!$$2) {
         return List.of(
            jh.a($$1.a, (double)$$0.dD(), $$1.c),
            jh.a($$1.a, (double)$$0.dD(), $$1.f),
            jh.a($$1.d, (double)$$0.dD(), $$1.c),
            jh.a($$1.d, (double)$$0.dD(), $$1.f)
         );
      } else {
         double $$3 = Math.max(0.0, 1.1F - $$1.d());
         double $$4 = Math.max(0.0, 1.1F - $$1.b());
         double $$5 = Math.max(0.0, 1.1F - $$1.c());
         ezi $$6 = $$1.c($$4, $$5, $$3);
         return jh.a($$0.ea(), 10, azk.a($$6.a), azk.a($$6.b), azk.a($$6.c), azk.a($$6.d), azk.a($$6.e), azk.a($$6.f));
      }
   }
}
