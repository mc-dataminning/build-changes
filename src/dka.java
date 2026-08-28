import com.mojang.serialization.MapCodec;

public class dka extends djn {
   public static final MapCodec<dka> a = b(dka::new);
   public static final int b = 6;
   public static final dxx c = dxo.aB;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fbv[] g = new fbv[]{
      djn.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djn.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djn.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djn.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djn.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djn.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      djn.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dka> a() {
      return a;
   }

   protected dka(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      cwm $$7 = $$0.h();
      if ($$0.a(awy.aN) && $$1.c(c) == 0 && djn.a($$7) instanceof dkd $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awa.dt, awb.e, 1.0F, 1.0F);
         $$2.b($$3, dke.a($$8));
         $$2.a($$4, ebu.c, $$3);
         $$4.b(awk.c.b($$7));
         return bsl.a;
      } else {
         return bsl.f;
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bsl.a;
         }

         if ($$3.b(bsk.a).f()) {
            return bsl.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bsl a(dgk $$0, ji $$1, dwy $$2, coy $$3) {
      if (!$$3.u(false)) {
         return bsl.e;
      } else {
         $$3.a(awk.U);
         $$3.gt().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, ebu.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, ebu.f, $$1);
         }

         return bsl.a;
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.a && !$$0.a($$1, $$3) ? djp.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
