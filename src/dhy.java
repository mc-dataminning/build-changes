import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhy extends deb<dql> implements dmi {
   public static final MapCodec<dhy> b = b(dhy::new);
   public static final dte c = djd.aE;
   public static final dtb d = dta.C;
   protected static final ewy e = dfh.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wu f = wu.c("container.enderchest");

   @Override
   public MapCodec<dhy> a() {
      return b;
   }

   protected dhy(dsj.d $$0) {
      super($$0, () -> dpr.d);
      this.k(this.E.b().a(c, jf.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dho.c<? extends dpw> a(dsk $$0, dcf $$1, ja $$2, boolean $$3) {
      return dho.b::b;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return e;
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.b;
   }

   @Override
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eoi.c));
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      cqu $$5 = $$3.gm();
      dpp $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dql) {
         ja $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqg.a($$1.B);
         } else if ($$1.B) {
            return bqg.a;
         } else {
            dql $$8 = (dql)$$6;
            $$5.a($$8);
            $$3.a(new bqq(($$1x, $$2x, $$3x) -> cpp.a($$1x, $$2x, $$5), f));
            $$3.a(avr.aj);
            clb.a($$3, true);
            return bqg.c;
         }
      } else {
         return bqg.a($$1.B);
      }
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dql($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$0.B ? a($$2, dpr.d, dql::a) : null;
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lj.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dsk a(dsk $$0, dlu $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(d) ? eoi.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      dpp $$4 = $$1.c_($$2);
      if ($$4 instanceof dql) {
         ((dql)$$4).b();
      }
   }
}
