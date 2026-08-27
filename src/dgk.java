import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dgk extends des {
   public static final MapCodec<dgk> a = b(dgk::new);
   public static final dpq b = dpp.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final est f = dby.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final est g = dby.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final est h = dby.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final est i = dby.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final est j = dby.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final est k = dby.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final est l = dby.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final est m = dby.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   protected dgk(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(b, Boolean.valueOf(false)).a(K, dpk.b));
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      switch ((dpk)$$0.c(K)) {
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
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         doz $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return boa.a;
      } else {
         doz $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, aum.nF, aun.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? dts.a : dts.e, $$2);
         return boa.b;
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, cyp $$3, BiConsumer<crj, ib> $$4) {
      if ($$3.j() == cyp.a.d && !$$1.x_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public doz d(doz $$0, cyx $$1, ib $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(doz $$0, cyy $$1, ib $$2, float $$3) {
      ih $$4 = $$0.c(aE).g();
      ih $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new kf(kf.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   private void e(doz $$0, cyx $$1, ib $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(K, aE, b);
   }
}
