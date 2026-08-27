import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgr extends dcu<dpd> implements dlb {
   public static final MapCodec<dgr> b = b(dgr::new);
   public static final drx c = dhw.aE;
   public static final dru d = drt.C;
   protected static final evf e = dea.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wx f = wx.c("container.enderchest");

   @Override
   public MapCodec<dgr> a() {
      return b;
   }

   protected dgr(drc.d $$0) {
      super($$0, () -> dok.d);
      this.k(this.E.b().a(c, it.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dgh.c<? extends dop> a(drd $$0, daz $$1, io $$2, boolean $$3) {
      return dgh.b::b;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return e;
   }

   @Override
   protected dkg a_(drd $$0) {
      return dkg.b;
   }

   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == emx.c));
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      cqh $$5 = $$3.gp();
      doi $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dpd) {
         io $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bpw.a($$1.B);
         } else if ($$1.B) {
            return bpw.a;
         } else {
            dpd $$8 = (dpd)$$6;
            $$5.a($$8);
            $$3.a(new bqg(($$1x, $$2x, $$3x) -> cpc.a($$1x, $$2x, $$5), f));
            $$3.a(avs.aj);
            ckp.a($$3, true);
            return bpw.b;
         }
      } else {
         return bpw.a($$1.B);
      }
   }

   @Override
   public doi a(io $$0, drd $$1) {
      return new dpd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends doi> doj<T> a(daz $$0, drd $$1, dok<T> $$2) {
      return $$0.B ? a($$2, dok.d, dpd::a) : null;
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
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
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(d) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      doi $$4 = $$1.c_($$2);
      if ($$4 instanceof dpd) {
         ((dpd)$$4).b();
      }
   }
}
