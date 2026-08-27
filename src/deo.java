import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class deo extends dcw {
   public static final MapCodec<deo> a = b(deo::new);
   public static final dns b = dnr.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final eqm f = dac.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final eqm g = dac.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final eqm h = dac.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final eqm i = dac.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final eqm j = dac.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final eqm k = dac.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final eqm l = dac.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final eqm m = dac.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   protected deo(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(b, Boolean.valueOf(false)).a(K, dnm.b));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      switch ((dnm)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((ih)$$0.c(aE)) {
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
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         dnb $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bnd.a;
      } else {
         dnb $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, aty.nD, atz.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? drp.a : drp.e, $$2);
         return bnd.b;
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, cwt $$3, BiConsumer<cqm, ib> $$4) {
      if ($$3.j() == cwt.a.d && !$$1.x_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public dnb d(dnb $$0, cxb $$1, ib $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dnb $$0, cxc $$1, ib $$2, float $$3) {
      ih $$4 = $$0.c(aE).g();
      ih $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new jw(jw.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }

   private void e(dnb $$0, cxb $$1, ib $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(K, aE, b);
   }
}
