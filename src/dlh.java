import com.mojang.serialization.MapCodec;

public class dlh extends dku {
   public static final MapCodec<dlh> a = b(dlh::new);
   public static final int b = 6;
   public static final dzm c = dzc.aB;
   public static final int d = b(0);
   private static final fdo[] e = dku.a(6, $$0 -> dku.a((double)(1 + $$0 * 2), 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   protected dlh(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      cxu $$7 = $$0.h();
      if ($$0.a(axi.aN) && $$1.c(c) == 0 && dku.a($$7) instanceof dlk $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awk.dt, awl.e, 1.0F, 1.0F);
         $$2.b($$3, dll.a($$8));
         $$2.a($$4, edm.c, $$3);
         $$4.b(awu.c.b($$7));
         return btq.a;
      } else {
         return btq.f;
      }
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return btq.a;
         }

         if ($$3.b(btp.a).f()) {
            return btq.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static btq a(dhq $$0, jj $$1, dym $$2, cqi $$3) {
      if (!$$3.t(false)) {
         return btq.e;
      } else {
         $$3.a(awu.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, edm.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, edm.f, $$1);
         }

         return btq.a;
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.a && !$$0.a($$1, $$3) ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dym $$0, dhp $$1, jj $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dym $$0) {
      return true;
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
