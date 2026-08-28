import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djc extends det {
   public static final MapCodec<djc> a = b(djc::new);
   public static final dte b = dta.Q;
   public static final dtb c = dta.f;
   private static final ewy d = dfh.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final ewy e = dfh.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final ewy f = ewv.a(e, d);
   private static final ewy g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final ewy h = ewv.a(f, g, ewj.e);
   private static final ewy i = ewv.a(h, dfh.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final ewy j = ewv.a(h, dfh.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final ewy k = ewv.a(h, dfh.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final ewy l = ewv.a(h, dfh.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final ewy m = ewv.a(h, dfh.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final ewy n = g;
   private static final ewy o = ewv.a(g, dfh.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final ewy F = ewv.a(g, dfh.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final ewy G = ewv.a(g, dfh.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final ewy H = ewv.a(g, dfh.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   public djc(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      switch ((jf)$$0.c(b)) {
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
   protected ewy a(dsk $$0, dbl $$1, ja $$2) {
      switch ((jf)$$0.c(b)) {
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
   public dsk a(cxm $$0) {
      jf $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == jf.a.b ? jf.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$0.B ? null : a($$2, dpr.r, dqp::a);
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         dpp $$5 = $$1.c_($$2);
         if ($$5 instanceof dqp) {
            $$3.a((dqp)$$5);
            $$3.a(avr.ad);
         }

         return bqg.c;
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dcf $$0, ja $$1, dsk $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      bqc.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return cph.a($$1.c_($$2));
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      dpp $$4 = $$1.c_($$2);
      if ($$4 instanceof dqp) {
         dqp.a($$1, $$2, $$0, $$3, (dqp)$$4);
      }
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
