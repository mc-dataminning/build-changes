import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dil extends dgs {
   public static final MapCodec<dil> a = b(dil::new);
   public static final drs b = drr.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final evd f = ddy.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final evd g = ddy.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final evd h = ddy.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final evd i = ddy.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final evd j = ddy.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final evd k = ddy.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final evd l = ddy.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final evd m = ddy.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   protected dil(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, it.c).a(b, Boolean.valueOf(false)).a(K, drm.b));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      switch ((drm)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((it)$$0.c(aE)) {
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
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         drb $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bpu.a;
      } else {
         drb $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, avh.nU, avi.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? dvu.a : dvu.e, $$2);
         return bpu.b;
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, dap $$3, BiConsumer<cto, io> $$4) {
      if ($$3.j() == dap.a.d && !$$1.x_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public drb d(drb $$0, dax $$1, io $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(drb $$0, day $$1, io $$2, float $$3) {
      it $$4 = $$0.c(aE).g();
      it $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new ks(ks.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, drb $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(drb $$0, dad $$1, io $$2, it $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(drb $$0) {
      return true;
   }

   private void e(drb $$0, dax $$1, io $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(K, aE, b);
   }
}
