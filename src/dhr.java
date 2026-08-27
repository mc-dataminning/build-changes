import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dhr extends dfy {
   public static final MapCodec<dhr> a = b(dhr::new);
   public static final dqy b = dqx.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final eui f = dde.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final eui g = dde.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final eui h = dde.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final eui i = dde.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final eui j = dde.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final eui k = dde.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final eui l = dde.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final eui m = dde.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   protected dhr(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, is.c).a(b, Boolean.valueOf(false)).a(K, dqs.b));
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      switch ((dqs)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((is)$$0.c(aE)) {
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
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         dqh $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bpm.a;
      } else {
         dqh $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, avc.nK, avd.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? dva.a : dva.e, $$2);
         return bpm.b;
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, czv $$3, BiConsumer<csz, in> $$4) {
      if ($$3.j() == czv.a.d && !$$1.x_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public dqh d(dqh $$0, dad $$1, in $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dqh $$0, dae $$1, in $$2, float $$3) {
      is $$4 = $$0.c(aE).g();
      is $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new kr(kr.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dqh $$0, dad $$1, in $$2, ayg $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dqh $$0, czj $$1, in $$2, is $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dqh $$0) {
      return true;
   }

   private void e(dqh $$0, dad $$1, in $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(K, aE, b);
   }
}
