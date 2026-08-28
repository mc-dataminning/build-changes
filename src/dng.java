import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dng extends dfw {
   public static final MapCodec<dng> a = b(dng::new);
   public static final int b = 8;
   public static final dua c = dtq.aF;
   protected static final exp[] d = new exp[]{
      exm.a(),
      dfw.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dfw.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   protected dng(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected exp b(dta $$0, dca $$1, jd $$2, exb $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected exp b_(dta $$0, dca $$1, jd $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected exp c(dta $$0, dca $$1, jd $$2, exb $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean f_(dta $$0) {
      return true;
   }

   @Override
   protected float d(dta $$0, dca $$1, jd $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      dta $$3 = $$1.a_($$2.d());
      if ($$3.a(awd.co)) {
         return false;
      } else {
         return $$3.a(awd.cp) ? true : dfw.a($$3.k($$1, $$2.d()), ji.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$1.a(ddd.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dta $$0, cyb $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.r()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ji.b : true;
      }
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }
}
