import com.mojang.serialization.MapCodec;

public class dft extends dfh {
   public static final MapCodec<dft> a = b(dft::new);
   public static final int b = 6;
   public static final dtk c = dta.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ewy[] g = new ewy[]{
      dfh.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfh.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfh.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfh.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfh.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfh.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfh.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dft> a() {
      return a;
   }

   protected dft(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqi a(cuc $$0, dsk $$1, dcf $$2, ja $$3, cmk $$4, bqf $$5, ewb $$6) {
      ctx $$7 = $$0.g();
      if ($$0.a(awf.aJ) && $$1.c(c) == 0 && dfh.a($$7) instanceof dfw $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, avh.dr, avi.e, 1.0F, 1.0F);
         $$2.b($$3, dfx.a($$8));
         $$2.a($$4, dxg.c, $$3);
         $$4.b(avr.c.b($$7));
         return bqi.a;
      } else {
         return bqi.d;
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqg.a;
         }

         if ($$3.b(bqf.a).e()) {
            return bqg.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqg a(dcg $$0, ja $$1, dsk $$2, cmk $$3) {
      if (!$$3.t(false)) {
         return bqg.e;
      } else {
         $$3.a(avr.U);
         $$3.gj().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dxg.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dxg.f, $$1);
         }

         return bqg.a;
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dsk $$0, dcf $$1, ja $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dsk $$0) {
      return true;
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }
}
