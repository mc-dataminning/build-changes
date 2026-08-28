import com.mojang.serialization.MapCodec;

public class dne extends dfk implements dfe {
   public static final MapCodec<dne> a = b(dne::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dte c = dsu.as;
   private static final ewm e = dfb.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final ewm f = dfb.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dne> a() {
      return a;
   }

   public dne(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cur a(dcd $$0, iz $$1, dse $$2) {
      return new cur(cuu.wr);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean d_(dse $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dse $$0, arf $$1, iz $$2, azh $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dse $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dwx.c, $$2, dwx.a.a($$5));
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      if ($$3 instanceof btr && $$3.ak() != btc.Q && $$3.ak() != btc.h) {
         $$3.a($$0, new evt(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ad != $$3.du() || $$3.af != $$3.dA())) {
            double $$4 = Math.abs($$3.du() - $$3.ad);
            double $$5 = Math.abs($$3.dA() - $$3.af);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.aj().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cuu.ry) ? bqy.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cur(cuu.wr, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awa.zp, awb.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dse $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dwx.c, $$2, dwx.a.a($$3, $$8));
         return bqw.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return true;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
