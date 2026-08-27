import com.mojang.serialization.MapCodec;

public class dhj extends dac {
   public static final MapCodec<dhj> a = b(dhj::new);
   public static final int b = 2;
   public static final dob c = dnr.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final eqm g = dac.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }

   @Override
   public eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return g;
   }

   public int m(dnb $$0) {
      return $$0.c(c);
   }

   private boolean n(dnb $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, aty.xZ, atz.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, aty.ya, atz.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cdt $$4 = bpd.aR.a((cxb)$$1);
         if ($$4 != null) {
            ept $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), aww.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(drp.i, $$2, drp.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }

   public static boolean a(cwh $$0, ib $$1) {
      return $$0.a_($$1.d()).a(aun.cm);
   }
}
