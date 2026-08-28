import com.mojang.serialization.MapCodec;

public class dfn extends dfb {
   public static final MapCodec<dfn> a = b(dfn::new);
   public static final int b = 6;
   public static final dte c = dsu.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ewm[] g = new ewm[]{
      dfb.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfb.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfb.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfb.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfb.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfb.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfb.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   protected dfn(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      cum $$7 = $$0.g();
      if ($$0.a(awy.aJ) && $$1.c(c) == 0 && dfb.a($$7) instanceof dfq $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, awa.dr, awb.e, 1.0F, 1.0F);
         $$2.b($$3, dfr.a($$8));
         $$2.a($$4, dwx.c, $$3);
         $$4.b(awk.c.b($$7));
         return bqy.a;
      } else {
         return bqy.d;
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqw.a;
         }

         if ($$3.b(bqv.a).e()) {
            return bqw.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqw a(dcb $$0, iz $$1, dse $$2, cmz $$3) {
      if (!$$3.t(false)) {
         return bqw.e;
      } else {
         $$3.a(awk.U);
         $$3.gm().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dwx.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dwx.f, $$1);
         }

         return bqw.a;
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
