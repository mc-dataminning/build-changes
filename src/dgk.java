import com.mojang.serialization.MapCodec;

public class dgk extends dfy {
   public static final MapCodec<dgk> a = b(dgk::new);
   public static final int b = 6;
   public static final duc c = dts.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final exv[] g = new exv[]{
      dfy.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfy.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfy.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfy.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfy.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfy.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dfy.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dgk> a() {
      return a;
   }

   protected dgk(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, ewy $$6) {
      cul $$7 = $$0.g();
      if ($$0.a(awn.aJ) && $$1.c(c) == 0 && dfy.a($$7) instanceof dgn $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, avp.dr, avq.e, 1.0F, 1.0F);
         $$2.b($$3, dgo.a($$8));
         $$2.a($$4, dxz.c, $$3);
         $$4.b(avz.c.b($$7));
         return bqt.a;
      } else {
         return bqt.d;
      }
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bqr.a;
         }

         if ($$3.b(bqq.a).e()) {
            return bqr.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bqr a(dcx $$0, jd $$1, dtc $$2, cmx $$3) {
      if (!$$3.u(false)) {
         return bqr.e;
      } else {
         $$3.a(avz.U);
         $$3.gi().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dxz.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dxz.f, $$1);
         }

         return bqr.a;
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dtc $$0, dcw $$1, jd $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
