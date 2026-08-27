import com.mojang.serialization.MapCodec;

public class dhh extends czo implements czi {
   public static final MapCodec<dhh> a = b(dhh::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dne c = dmu.as;
   private static final epo e = czf.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final epo f = czf.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public dhh(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq(cpt.wl);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean e_(dme $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dme $$5 = $$0.a(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(dqr.c, $$2, dqr.a.a($$5));
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if ($$3 instanceof box && $$3.ai() != bol.P && $$3.ai() != bol.i) {
         $$3.a($$0, new eov(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(c) > 0 && ($$3.ab != $$3.do() || $$3.ad != $$3.du())) {
            double $$4 = Math.abs($$3.do() - $$3.ab);
            double $$5 = Math.abs($$3.du() - $$3.ad);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ah().s(), 1.0F);
            }
         }
      }
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return !$$8 && $$0.a(cpt.rx) ? bmn.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.z.a(2);
         a($$1, $$2, new cpq(cpt.wl, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, atp.yL, atq.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dme $$8 = $$0.a(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(dqr.c, $$2, dqr.a.a($$3, $$8));
         return bml.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.a(c, Integer.valueOf($$4)), 2);
   }
}
