import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class djo extends dhv {
   public static final MapCodec<djo> a = b(djo::new);
   public static final dsv b = dsu.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final ewm f = dfb.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ewm g = dfb.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ewm h = dfb.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ewm i = dfb.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ewm j = dfb.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ewm k = dfb.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ewm l = dfb.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ewm m = dfb.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<djo> a() {
      return a;
   }

   protected djo(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, je.c).a(b, Boolean.valueOf(false)).a(K, dsp.b));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      switch ((dsp)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((je)$$0.c(aE)) {
               case f:
                  return i;
               case e:
                  return h;
               case d:
                  return g;
               case c:
               default:
                  return f;
            }
         case c:
         default:
            switch ($$0.c(aE).o()) {
               case a:
                  return m;
               case c:
               default:
                  return l;
            }
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         dse $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bqw.a;
      } else {
         dse $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, awa.nU, awb.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? dwx.a : dwx.e, $$2);
         return bqw.c;
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dbs $$3, BiConsumer<cur, iz> $$4) {
      if ($$3.j() == dbs.a.d && !$$1.x_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public dse d(dse $$0, dca $$1, iz $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dse $$0, dcb $$1, iz $$2, float $$3) {
      je $$4 = $$0.c(aE).g();
      je $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ld(ld.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dse $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dse $$0, dbg $$1, iz $$2, je $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dse $$0) {
      return true;
   }

   private void e(dse $$0, dca $$1, iz $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(K, aE, b);
   }
}
