import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;

public class dbc extends czk {
   public static final MapCodec<dbc> a = b(dbc::new);
   public static final djy b = djx.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final emm f = cwq.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final emm g = cwq.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final emm h = cwq.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final emm i = cwq.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final emm j = cwq.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final emm k = cwq.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final emm l = cwq.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final emm m = cwq.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   protected dbc(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ic.c).a(b, Boolean.valueOf(false)).a(K, djs.b));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      switch ((djs)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((ic)$$0.c(aE)) {
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
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         djh $$6 = $$0.a(b);
         if ($$6.c(b)) {
            a($$6, $$1, $$2, 1.0F);
         }

         return bkb.a;
      } else {
         djh $$7 = this.d($$0, $$1, $$2);
         float $$8 = $$7.c(b) ? 0.6F : 0.5F;
         $$1.a(null, $$2, ars.ng, art.e, 0.3F, $$8);
         $$1.a($$3, $$7.c(b) ? dnr.a : dnr.e, $$2);
         return bkb.b;
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cth $$3, BiConsumer<cmy, hx> $$4) {
      if ($$3.j() == cth.a.d && !$$1.y_()) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public djh d(djh $$0, ctp $$1, hx $$2) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.e($$0, $$1, $$2);
      return $$0;
   }

   private static void a(djh $$0, ctq $$1, hx $$2, float $$3) {
      ic $$4 = $$0.c(aE).g();
      ic $$5 = h($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new jr(jr.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, djh $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public int a(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   public int b(djh $$0, csv $$1, hx $$2, ic $$3) {
      return $$0.c(b) && h($$0) == $$3 ? 15 : 0;
   }

   @Override
   public boolean f_(djh $$0) {
      return true;
   }

   private void e(djh $$0, ctp $$1, hx $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(h($$0).g()), this);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(K, aE, b);
   }
}
