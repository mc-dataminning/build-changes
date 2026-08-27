import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgp extends dcs<dpb> implements dkz {
   public static final MapCodec<dgp> b = b(dgp::new);
   public static final drv c = dhu.aE;
   public static final drs d = drr.C;
   protected static final evd e = ddy.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wx f = wx.c("container.enderchest");

   @Override
   public MapCodec<dgp> a() {
      return b;
   }

   protected dgp(dra.d $$0) {
      super($$0, () -> doi.d);
      this.k(this.E.b().a(c, it.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dgf.c<? extends don> a(drb $$0, dax $$1, io $$2, boolean $$3) {
      return dgf.b::b;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return e;
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.b;
   }

   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == emv.c));
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      cqf $$5 = $$3.gp();
      dog $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dpb) {
         io $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bpu.a($$1.B);
         } else if ($$1.B) {
            return bpu.a;
         } else {
            dpb $$8 = (dpb)$$6;
            $$5.a($$8);
            $$3.a(new bqe(($$1x, $$2x, $$3x) -> cpa.a($$1x, $$2x, $$5), f));
            $$3.a(avr.aj);
            ckn.a($$3, true);
            return bpu.b;
         }
      } else {
         return bpu.a($$1.B);
      }
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new dpb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dog> doh<T> a(dax $$0, drb $$1, doi<T> $$2) {
      return $$0.B ? a($$2, doi.d, dpb::a) : null;
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ky.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected drb a(drb $$0, div $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected emu b_(drb $$0) {
      return $$0.c(d) ? emv.c.a(false) : super.b_($$0);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emv.c, emv.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   @Override
   protected void a(drb $$0, aqm $$1, io $$2, ayk $$3) {
      dog $$4 = $$1.c_($$2);
      if ($$4 instanceof dpb) {
         ((dpb)$$4).b();
      }
   }
}
