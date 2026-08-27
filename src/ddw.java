import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddw extends czo {
   public static final MapCodec<ddw> a = b(ddw::new);
   public static final dnv b = dnr.Q;
   public static final dns c = dnr.f;
   private static final eqm d = dac.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eqm e = dac.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eqm f = eqj.a(e, d);
   private static final eqm g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final eqm h = eqj.a(f, g, epx.e);
   private static final eqm i = eqj.a(h, dac.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eqm j = eqj.a(h, dac.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eqm k = eqj.a(h, dac.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eqm l = eqj.a(h, dac.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eqm m = eqj.a(h, dac.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eqm n = g;
   private static final eqm o = eqj.a(g, dac.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eqm F = eqj.a(g, dac.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eqm G = eqj.a(g, dac.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eqm H = eqj.a(g, dac.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddw(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ih.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      switch ((ih)$$0.c(b)) {
         case a:
            return i;
         case c:
            return k;
         case d:
            return l;
         case e:
            return m;
         case f:
            return j;
         default:
            return h;
      }
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2) {
      switch ((ih)$$0.c(b)) {
         case a:
            return n;
         case c:
            return F;
         case d:
            return G;
         case e:
            return H;
         case f:
            return o;
         default:
            return g;
      }
   }

   @Override
   public dnb a(csu $$0) {
      ih $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ih.a.b ? ih.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dki a(ib $$0, dnb $$1) {
      return new dlh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dki> dkj<T> a(cxb $$0, dnb $$1, dkk<T> $$2) {
      return $$0.B ? null : a($$2, dkk.r, dlh::a);
   }

   @Override
   public void a(cxb $$0, ib $$1, dnb $$2, bpp $$3, cqm $$4) {
      if ($$4.B()) {
         dki $$5 = $$0.c_($$1);
         if ($$5 instanceof dlh) {
            ((dlh)$$5).a($$4.z());
         }
      }
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         dki $$5 = $$1.c_($$2);
         if ($$5 instanceof dlh) {
            $$3.a((dlh)$$5);
            $$3.a(aui.ad);
         }

         return bnd.b;
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dac $$3, ib $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(cxb $$0, ib $$1, dnb $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      bmz.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.c;
   }

   @Override
   protected boolean d_(dnb $$0) {
      return true;
   }

   @Override
   protected int a(dnb $$0, cxb $$1, ib $$2) {
      return clq.a($$1.c_($$2));
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      dki $$4 = $$1.c_($$2);
      if ($$4 instanceof dlh) {
         dlh.a($$1, $$2, $$0, $$3, (dlh)$$4);
      }
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
