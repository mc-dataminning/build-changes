import com.mojang.serialization.MapCodec;

public class czr extends czf {
   public static final MapCodec<czr> a = b(czr::new);
   public static final int b = 6;
   public static final dne c = dmu.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final epo[] g = new epo[]{
      czf.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      czf.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      czf.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      czf.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      czf.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      czf.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      czf.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<czr> a() {
      return a;
   }

   protected czr(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      cpl $$7 = $$0.d();
      if ($$0.a(aum.ai) && $$1.c(c) == 0 && czf.a($$7) instanceof czu $$8) {
         if (!$$4.f()) {
            $$0.h(1);
         }

         $$2.a(null, $$3, atp.dj, atq.e, 1.0F, 1.0F);
         $$2.b($$3, czv.a($$8));
         $$2.a($$4, dqr.c, $$3);
         $$4.b(atz.c.b($$7));
         return bmn.a;
      } else {
         return bmn.d;
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bml.a;
         }

         if ($$3.b(bmk.a).b()) {
            return bml.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bml a(cwf $$0, ib $$1, dme $$2, cia $$3) {
      if (!$$3.s(false)) {
         return bml.d;
      } else {
         $$3.a(atz.U);
         $$3.gf().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, dqr.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, dqr.f, $$1);
         }

         return bml.a;
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return $$1 == ih.a && !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
