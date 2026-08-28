import com.mojang.serialization.MapCodec;

public class djy extends djl {
   public static final MapCodec<djy> a = b(djy::new);
   public static final int b = 6;
   public static final dxv c = dxm.aB;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fbt[] g = new fbt[]{
      djl.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djl.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djl.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djl.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djl.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djl.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djl.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<djy> a() {
      return a;
   }

   protected djy(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bsj a(cwo $$0, dww $$1, dgh $$2, ji $$3, cow $$4, bsi $$5, fav $$6) {
      cwk $$7 = $$0.h();
      if ($$0.a(awy.aN) && $$1.c(c) == 0 && djl.a($$7) instanceof dkb $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awa.dt, awb.e, 1.0F, 1.0F);
         $$2.b($$3, dkc.a($$8));
         $$2.a($$4, ebs.c, $$3);
         $$4.b(awk.c.b($$7));
         return bsj.a;
      } else {
         return bsj.f;
      }
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bsj.a;
         }

         if ($$3.b(bsi.a).f()) {
            return bsj.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bsj a(dgi $$0, ji $$1, dww $$2, cow $$3) {
      if (!$$3.u(false)) {
         return bsj.e;
      } else {
         $$3.a(awk.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ebs.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ebs.f, $$1);
         }

         return bsj.a;
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dww $$0, dgh $$1, ji $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dww $$0) {
      return true;
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
