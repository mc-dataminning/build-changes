import com.mojang.serialization.MapCodec;

public class dgh extends dfw {
   public static final MapCodec<dgh> a = b(dgh::new);
   public static final dua b = dtq.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final exp e = dfw.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final exp f = dfw.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dgh> a() {
      return a;
   }

   protected dgh(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      jd $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dta $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return e;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return f;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      for (ji $$3 : ji.c.a) {
         dta $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(awj.b)) {
            return false;
         }
      }

      dta $$5 = $$1.a_($$2.d());
      return ($$5.a(dfy.dQ) || $$5.a(awd.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      $$3.a($$1.aj().k(), 1.0F);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
