import com.mojang.serialization.MapCodec;

public class djx extends djk {
   public static final MapCodec<djx> a = b(djx::new);
   public static final int b = 6;
   public static final dxu c = dxl.aB;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fbs[] g = new fbs[]{
      djk.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djk.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djk.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djk.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djk.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djk.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djk.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   protected djx(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      cwj $$7 = $$0.h();
      if ($$0.a(awx.aN) && $$1.c(c) == 0 && djk.a($$7) instanceof dka $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, avz.dt, awa.e, 1.0F, 1.0F);
         $$2.b($$3, dkb.a($$8));
         $$2.a($$4, ebr.c, $$3);
         $$4.b(awj.c.b($$7));
         return bsi.a;
      } else {
         return bsi.f;
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bsi.a;
         }

         if ($$3.b(bsh.a).f()) {
            return bsi.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bsi a(dgh $$0, ji $$1, dwv $$2, cov $$3) {
      if (!$$3.u(false)) {
         return bsi.e;
      } else {
         $$3.a(awj.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ebr.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ebr.f, $$1);
         }

         return bsi.a;
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
