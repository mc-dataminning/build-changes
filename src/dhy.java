import com.mojang.serialization.MapCodec;

public class dhy extends dhm {
   public static final MapCodec<dhy> a = b(dhy::new);
   public static final int b = 6;
   public static final dvs c = dvi.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final ezq[] g = new ezq[]{
      dhm.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhm.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhm.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhm.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhm.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhm.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      dhm.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<dhy> a() {
      return a;
   }

   protected dhy(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      cvn $$7 = $$0.h();
      if ($$0.a(axe.aJ) && $$1.c(c) == 0 && dhm.a($$7) instanceof dib $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awg.ds, awh.e, 1.0F, 1.0F);
         $$2.b($$3, dic.a($$8));
         $$2.a($$4, dzp.c, $$3);
         $$4.b(awq.c.b($$7));
         return brs.a;
      } else {
         return brs.f;
      }
   }

   @Override
   protected brs a(dus $$0, dej $$1, jf $$2, cnx $$3, eys $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return brs.a;
         }

         if ($$3.b(brr.a).f()) {
            return brs.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static brs a(dek $$0, jf $$1, dus $$2, cnx $$3) {
      if (!$$3.u(false)) {
         return brs.e;
      } else {
         $$3.a(awq.U);
         $$3.gn().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dzp.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dzp.f, $$1);
         }

         return brs.a;
      }
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return $$1 == jk.a && !$$0.a($$3, $$4) ? dho.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
