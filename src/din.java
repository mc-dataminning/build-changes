import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class din extends deq<drb> implements dmy {
   public static final MapCodec<din> b = b(din::new);
   public static final dtu c = djs.aE;
   public static final dtr d = dtq.C;
   protected static final exp e = dfw.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wy f = wy.c("container.enderchest");

   @Override
   public MapCodec<din> a() {
      return b;
   }

   protected din(dsz.d $$0) {
      super($$0, () -> dqh.d);
      this.k(this.E.b().a(c, ji.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public did.c<? extends dqm> a(dta $$0, dcu $$1, jd $$2, boolean $$3) {
      return did.b::b;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return e;
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.b;
   }

   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eoz.c));
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      crf $$5 = $$3.gm();
      dqf $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof drb) {
         jd $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqq.a($$1.B);
         } else if ($$1.B) {
            return bqq.a;
         } else {
            drb $$8 = (drb)$$6;
            $$5.a($$8);
            $$3.a(new bra(($$1x, $$2x, $$3x) -> cqa.a($$1x, $$2x, $$5), f));
            $$3.a(avy.aj);
            clm.a($$3, true);
            return bqq.c;
         }
      } else {
         return bqq.a($$1.B);
      }
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new drb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$0.B ? a($$2, dqh.d, drb::a) : null;
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lm.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(d) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      dqf $$4 = $$1.c_($$2);
      if ($$4 instanceof drb) {
         ((drb)$$4).b();
      }
   }
}
