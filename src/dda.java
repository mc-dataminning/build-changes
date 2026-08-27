import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dda extends dbi {
   public static final MapCodec<dda> a = b(dda::new);
   public static final dlw b = dlv.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final eol f = cyo.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final eol g = cyo.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final eol h = cyo.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final eol i = cyo.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final eol j = cyo.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final eol k = cyo.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final eol l = cyo.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final eol m = cyo.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dda> a() {
      return a;
   }

   protected dda(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ie.c).a(b, Boolean.valueOf(false)).a(K, dlq.b));
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      switch ((dlq)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((ie)$$0.c(aE)) {
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
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      if ($$1.B) {
         dlf $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return blu.a;
      } else {
         dlf $$6 = this.d($$0, $$1, $$2);
         float $$7 = $$6.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, atk.nv, atl.e, 0.3F, $$7);
         $$1.a($$3, $$6.c(b) ? dpp.a : dpp.e, $$2);
         return blu.b;
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, cvf $$3, BiConsumer<coz, hz> $$4) {
      if ($$3.j() == cvf.a.d && !$$1.y_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public dlf d(dlf $$0, cvn $$1, hz $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(dlf $$0, cvo $$1, hz $$2, float $$3) {
      ie $$4 = $$0.c(aE).g();
      ie $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new jt(jt.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dlf $$0, cut $$1, hz $$2, ie $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean f_(dlf $$0) {
      return true;
   }

   private void e(dlf $$0, cvn $$1, hz $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(K, aE, b);
   }
}
