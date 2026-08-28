import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dga extends dfi {
   public static final MapCodec<dga> a = b(dga::new);
   public static final dtr[] b = new dtr[]{dtq.k, dtq.l, dtq.m};
   protected static final exp c = exm.a(dfw.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dfw.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   public dga(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.c;
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqi($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return $$0.B ? null : a($$2, dqh.l, dqi::a);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         dqf $$5 = $$1.c_($$2);
         if ($$5 instanceof dqi) {
            $$3.a((dqi)$$5);
            $$3.a(avy.aa);
         }

         return bqq.c;
      }
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(lm.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      bqm.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return cps.a($$1.c_($$2));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
