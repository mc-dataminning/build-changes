import com.mojang.serialization.MapCodec;

public class dmn extends dff {
   public static final MapCodec<dmn> a = b(dmn::new);
   public static final int b = 2;
   public static final dth c = dsx.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ews g = dff.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   public dmn(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }

   @Override
   public ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return g;
   }

   public int m(dsh $$0) {
      return $$0.c(c);
   }

   private boolean n(dsh $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avf.yy, avg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avf.yz, avg.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         chf $$4 = bsj.aR.a((dcd)$$1);
         if ($$4 != null) {
            evz $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), aye.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dsh $$0, dcd $$1, ja $$2, dsh $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dxa.i, $$2, dxa.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dsh $$0, eoq $$1) {
      return false;
   }

   public static boolean a(dbj $$0, ja $$1) {
      return $$0.a_($$1.d()).a(avu.cs);
   }
}
