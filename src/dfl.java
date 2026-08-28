import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfl extends det {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final dtb[] b = new dtb[]{dta.k, dta.l, dta.m};
   protected static final ewy c = ewv.a(dfh.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dfh.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   public dfl(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dps($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return $$0.B ? null : a($$2, dpr.l, dps::a);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.a;
      } else {
         dpp $$5 = $$1.c_($$2);
         if ($$5 instanceof dps) {
            $$3.a((dps)$$5);
            $$3.a(avr.aa);
         }

         return bqg.c;
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lj.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      bqc.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
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
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
