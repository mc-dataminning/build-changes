import com.mojang.serialization.MapCodec;

public class dkr extends dke {
   public static final MapCodec<dkr> a = b(dkr::new);
   public static final int b = 6;
   public static final dyq c = dyg.aB;
   public static final int d = b(0);
   private static final fcr[] e = dke.a(6, $$0 -> dke.a((double)(1 + $$0 * 2), 0.0, 1.0, 15.0, 8.0, 15.0));

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   protected dkr(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return e[$$0.c(c)];
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      cxd $$7 = $$0.h();
      if ($$0.a(awy.aN) && $$1.c(c) == 0 && dke.a($$7) instanceof dku $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awa.dt, awb.e, 1.0F, 1.0F);
         $$2.b($$3, dkv.a($$8));
         $$2.a($$4, ecp.c, $$3);
         $$4.b(awk.c.b($$7));
         return bsy.a;
      } else {
         return bsy.f;
      }
   }

   @Override
   protected bsy a(dxq $$0, dgz $$1, ji $$2, cpr $$3, fbt $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bsy.a;
         }

         if ($$3.b(bsx.a).f()) {
            return bsy.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bsy a(dha $$0, ji $$1, dxq $$2, cpr $$3) {
      if (!$$3.t(false)) {
         return bsy.e;
      } else {
         $$3.a(awk.U);
         $$3.gw().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ecp.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ecp.f, $$1);
         }

         return bsy.a;
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dxq $$0, dgz $$1, ji $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dxq $$0) {
      return true;
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
