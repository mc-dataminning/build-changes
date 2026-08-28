import com.mojang.serialization.MapCodec;

public class dkq extends dkd {
   public static final MapCodec<dkq> a = b(dkq::new);
   public static final int b = 6;
   public static final dyn c = dye.aB;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fcl[] g = new fcl[]{
      dkd.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkd.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkd.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkd.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkd.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkd.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dkd.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   protected dkq(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      cxc $$7 = $$0.h();
      if ($$0.a(axt.aP) && $$1.c(c) == 0 && dkd.a($$7) instanceof dkt $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awv.dt, aww.e, 1.0F, 1.0F);
         $$2.b($$3, dku.a($$8));
         $$2.a($$4, eck.c, $$3);
         $$4.b(axf.c.b($$7));
         return bta.a;
      } else {
         return bta.f;
      }
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bta.a;
         }

         if ($$3.b(bsz.a).f()) {
            return bta.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bta a(dha $$0, jh $$1, dxo $$2, cpo $$3) {
      if (!$$3.u(false)) {
         return bta.e;
      } else {
         $$3.a(axf.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, eck.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, eck.f, $$1);
         }

         return bta.a;
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.a && !$$0.a($$1, $$3) ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dxo $$0, dgz $$1, jh $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dxo $$0) {
      return true;
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }
}
