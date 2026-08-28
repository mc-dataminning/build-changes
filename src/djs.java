import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djs extends det {
   public static final MapCodec<djs> a = b(djs::new);
   public static final dte b = djd.aE;
   public static final dtb c = dta.w;
   public static final dtb d = dta.o;
   public static final ewy e = dfh.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final ewy f = dfh.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final ewy g = ewv.a(e, f);
   public static final ewy h = dfh.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final ewy i = ewv.a(g, h);
   public static final ewy j = ewv.a(
      dfh.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dfh.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dfh.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final ewy k = ewv.a(
      dfh.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dfh.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dfh.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final ewy l = ewv.a(
      dfh.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dfh.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dfh.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final ewy m = ewv.a(
      dfh.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dfh.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dfh.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   protected djs(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   protected ewy f(dsk $$0, dbl $$1, ja $$2) {
      return g;
   }

   @Override
   protected boolean f_(dsk $$0) {
      return true;
   }

   @Override
   public dsk a(cxm $$0) {
      dcf $$1 = $$0.q();
      cuc $$2 = $$0.n();
      cmk $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.B && $$3 != null && $$3.gw()) {
         cwq $$5 = $$2.a(kn.O, cwq.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.o().a(b, $$0.g().g()).a(d, Boolean.valueOf($$4));
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return i;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      switch ((jf)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
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
      $$0.a(b, c, d);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dqs($$0, $$1);
   }

   public static boolean a(@Nullable btb $$0, dcf $$1, ja $$2, dsk $$3, cuc $$4) {
      if (!$$3.c(d)) {
         if (!$$1.B) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable btb $$0, dcf $$1, ja $$2, dsk $$3, cuc $$4) {
      if ($$1.c_($$2) instanceof dqs $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, avh.cz, avi.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bsg $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      dsk $$5 = $$3.a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(dxg.c, $$2, dxg.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dcf $$0, ja $$1, dsk $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dcf $$0, ja $$1, dsk $$2, boolean $$3) {
      $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dcf $$0, ja $$1, dsk $$2) {
      $$0.a($$1.d(), $$2.b());
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.d($$0, $$1, $$2);
         }

         if ($$0.c(c)) {
            $$1.a($$2.d(), this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private void d(dsk $$0, dcf $$1, ja $$2) {
      if ($$1.c_($$2) instanceof dqs $$4) {
         jf $$5 = $$0.c(b);
         cuc $$6 = $$4.b().s();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         ciu $$9 = new ciu($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.v();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$3 == jf.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      if ($$0.c(d)) {
         dpp $$3 = $$1.c_($$2);
         if ($$3 instanceof dqs) {
            return ((dqs)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      if ($$1.c(d)) {
         return bqi.d;
      } else if ($$0.a(awf.aV)) {
         return a($$4, $$2, $$3, $$1, $$0) ? bqi.a($$2.B) : bqi.e;
      } else {
         return $$0.e() && $$5 == bqf.a ? bqi.e : bqi.d;
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$0.c(d)) {
         if (!$$1.B) {
            this.a($$1, $$2, $$3);
         }

         return bqg.a($$1.B);
      } else {
         return bqg.c;
      }
   }

   @Nullable
   @Override
   protected bqk b(dsk $$0, dcf $$1, ja $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dcf $$0, ja $$1, cmk $$2) {
      dpp $$3 = $$0.c_($$1);
      if ($$3 instanceof dqs) {
         $$2.a((dqs)$$3);
         $$2.a(avr.au);
      }
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
