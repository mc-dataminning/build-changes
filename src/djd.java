import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends deu {
   public static final MapCodec<djd> a = b(djd::new);
   public static final dtf b = dtb.Q;
   public static final dtc c = dtb.f;
   private static final exa d = dfi.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final exa e = dfi.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final exa f = ewx.a(e, d);
   private static final exa g = a(2.0, 11.0, 2.0, 14.0, 16.0, 14.0);
   private static final exa h = ewx.a(f, g, ewl.e);
   private static final exa i = ewx.a(h, dfi.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final exa j = ewx.a(h, dfi.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final exa k = ewx.a(h, dfi.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final exa l = ewx.a(h, dfi.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final exa m = ewx.a(h, dfi.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final exa n = g;
   private static final exa o = ewx.a(g, dfi.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final exa F = ewx.a(g, dfi.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final exa G = ewx.a(g, dfi.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final exa H = ewx.a(g, dfi.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
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
   protected exa a(dsl $$0, dbm $$1, ja $$2) {
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
   public dsl a(cxn $$0) {
      jf $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == jf.a.b ? jf.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return $$0.B ? null : a($$2, dps.r, dqq::a);
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         dpq $$5 = $$1.c_($$2);
         if ($$5 instanceof dqq) {
            $$3.a((dqq)$$5);
            $$3.a(avr.ad);
         }

         return bqh.c;
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(dcg $$0, ja $$1, dsl $$2) {
      boolean $$3 = !$$0.C($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      bqd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.c;
   }

   @Override
   protected boolean c_(dsl $$0) {
      return true;
   }

   @Override
   protected int a(dsl $$0, dcg $$1, ja $$2) {
      return cpi.a($$1.c_($$2));
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      dpq $$4 = $$1.c_($$2);
      if ($$4 instanceof dqq) {
         dqq.a($$1, $$2, $$0, $$3, (dqq)$$4);
      }
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
