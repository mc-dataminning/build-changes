import com.mojang.serialization.MapCodec;

public class dhh extends daa {
   public static final MapCodec<dhh> a = b(dhh::new);
   public static final int b = 2;
   public static final dnz c = dnp.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final eqk g = daa.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dhh> a() {
      return a;
   }

   public dhh(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }

   @Override
   public eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return g;
   }

   public int m(dmz $$0) {
      return $$0.c(c);
   }

   private boolean n(dmz $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, aty.xU, atz.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, aty.xV, atz.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cds $$4 = bpc.aQ.a((cwz)$$1);
         if ($$4 != null) {
            epr $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), aww.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(drn.i, $$2, drn.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   public static boolean a(cwf $$0, ib $$1) {
      return $$0.a_($$1.d()).a(aun.cm);
   }
}
