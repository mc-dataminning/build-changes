import com.mojang.serialization.MapCodec;

public class dgi extends dfw {
   public static final MapCodec<dgi> a = b(dgi::new);
   public static final int b = 6;
   public static final dua c = dtq.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final exp[] g = new exp[]{
      dfw.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfw.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfw.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfw.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfw.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfw.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfw.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   protected dgi(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      cuj $$7 = $$0.g();
      if ($$0.a(awm.aJ) && $$1.c(c) == 0 && dfw.a($$7) instanceof dgl $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, avo.dr, avp.e, 1.0F, 1.0F);
         $$2.b($$3, dgm.a($$8));
         $$2.a($$4, dxw.c, $$3);
         $$4.b(avy.c.b($$7));
         return bqs.a;
      } else {
         return bqs.d;
      }
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqq.a;
         }

         if ($$3.b(bqp.a).e()) {
            return bqq.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqq a(dcv $$0, jd $$1, dta $$2, cmv $$3) {
      if (!$$3.u(false)) {
         return bqq.e;
      } else {
         $$3.a(avy.U);
         $$3.gj().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dxw.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dxw.f, $$1);
         }

         return bqq.a;
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dta $$0, dcu $$1, jd $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dta $$0) {
      return true;
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
