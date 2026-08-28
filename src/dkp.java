import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkp extends dgs<dtc> implements doz {
   public static final MapCodec<dkp> b = b(dkp::new);
   public static final dvx c = dlt.aF;
   public static final dvu d = dvt.C;
   protected static final fab e = dhy.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xh f = xh.c("container.enderchest");

   @Override
   public MapCodec<dkp> a() {
      return b;
   }

   protected dkp(dvc.d $$0) {
      super($$0, () -> dsi.d);
      this.l(this.F.b().b(c, jl.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dkf.c<? extends dsn> a(dvd $$0, dev $$1, jg $$2, boolean $$3) {
      return dkf.b::b;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return e;
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.b;
   }

   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == erf.c));
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      csx $$5 = $$3.gx();
      if ($$5 != null && $$1.c_($$2) instanceof dtc $$7) {
         jg $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bry.a;
         } else {
            if (!$$1.C) {
               $$5.a($$7);
               $$3.a(new bsg(($$1x, $$2x, $$3x) -> crs.a($$1x, $$2x, $$5), f));
               $$3.a(awu.aj);
               cmx.a($$3, true);
            }

            return bry.a;
         }
      } else {
         return bry.a;
      }
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dtc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsg> dsh<T> a(dev $$0, dvd $$1, dsi<T> $$2) {
      return $$0.C ? a($$2, dsi.d, dtc::a) : null;
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lq.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dvd a(dvd $$0, dol $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvd a(dvd $$0, dmu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected ere b_(dvd $$0) {
      return $$0.c(d) ? erf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erf.c, erf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      dsg $$4 = $$1.c_($$2);
      if ($$4 instanceof dtc) {
         ((dtc)$$4).b();
      }
   }
}
