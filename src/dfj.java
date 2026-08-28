import com.mojang.serialization.MapCodec;

public class dfj extends dex {
   public static final MapCodec<dfj> a = b(dfj::new);
   public static final int b = 6;
   public static final dta c = dsq.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ewi[] g = new ewi[]{
      dex.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dex.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dex.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dex.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dex.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dex.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dex.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dfj> a() {
      return a;
   }

   protected dfj(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqu a(cun $$0, dsa $$1, dbw $$2, iz $$3, cmv $$4, bqr $$5, evl $$6) {
      cui $$7 = $$0.g();
      if ($$0.a(awx.aJ) && $$1.c(c) == 0 && dex.a($$7) instanceof dfm $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, avz.dr, awa.e, 1.0F, 1.0F);
         $$2.b($$3, dfn.a($$8));
         $$2.a($$4, dwt.c, $$3);
         $$4.b(awj.c.b($$7));
         return bqu.a;
      } else {
         return bqu.d;
      }
   }

   @Override
   protected bqs a(dsa $$0, dbw $$1, iz $$2, cmv $$3, evl $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqs.a;
         }

         if ($$3.b(bqr.a).e()) {
            return bqs.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqs a(dbx $$0, iz $$1, dsa $$2, cmv $$3) {
      if (!$$3.t(false)) {
         return bqs.e;
      } else {
         $$3.a(awj.U);
         $$3.gm().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dwt.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dwt.f, $$1);
         }

         return bqs.a;
      }
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dsa $$0, dbw $$1, iz $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dsa $$0) {
      return true;
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
