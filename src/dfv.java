import com.mojang.serialization.MapCodec;

public class dfv extends cyo {
   public static final MapCodec<dfv> a = b(dfv::new);
   public static final int b = 2;
   public static final dmf c = dlv.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final eol g = cyo.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dfv> a() {
      return a;
   }

   public dfv(dle.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c);
   }

   @Override
   public eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return g;
   }

   public int m(dlf $$0) {
      return $$0.c(c);
   }

   private boolean n(dlf $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, atk.xQ, atl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, atk.xR, atl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cci $$4 = bnu.aP.a((cvn)$$1);
         if ($$4 != null) {
            ens $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), awh.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dlf $$0, cvn $$1, hz $$2, dlf $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dpp.i, $$2, dpp.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   public static boolean a(cut $$0, hz $$1) {
      return $$0.a_($$1.d()).a(atz.cl);
   }
}
