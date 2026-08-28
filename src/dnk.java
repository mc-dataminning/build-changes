import com.mojang.serialization.MapCodec;

public class dnk extends dfq implements dfk {
   public static final MapCodec<dnk> a = b(dnk::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dtk c = dta.as;
   private static final ewy e = dfh.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ewy f = dfh.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   public dnk(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cuc a(dci $$0, ja $$1, dsk $$2) {
      return new cuc(cuf.wu);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dsk $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dsk $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dxg.c, $$2, dxg.a.a($$5));
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      if ($$3 instanceof btb && $$3.al() != bsm.Q && $$3.al() != bsm.h) {
         $$3.a($$0, new ewf(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.dv() || $$3.af != $$3.dB())) {
            double $$4 = Math.abs($$3.dv() - $$3.ad);
            double $$5 = Math.abs($$3.dB() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().t(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cuf.ry) ? bqi.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cuc(cuf.wu, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, avh.zs, avi.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dsk $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dxg.c, $$2, dxg.a.a($$3, $$8));
         return bqg.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
