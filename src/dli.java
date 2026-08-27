import com.mojang.serialization.MapCodec;

public class dli extends dea {
   public static final MapCodec<dli> a = b(dli::new);
   public static final int b = 2;
   public static final dsd c = drt.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final evf g = dea.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dli> a() {
      return a;
   }

   public dli(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }

   @Override
   public evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return g;
   }

   public int m(drd $$0) {
      return $$0.c(c);
   }

   private boolean n(drd $$0) {
      return this.m($$0) == 2;
   }

   @Override
   public void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, avi.yv, avj.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.m($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, avi.yw, avj.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         cgx $$4 = bsc.aR.a((daz)$$1);
         if ($$4 != null) {
            eum $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), ayf.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dvw.i, $$2, dvw.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(drd $$0, enl $$1) {
      return false;
   }

   public static boolean a(daf $$0, io $$1) {
      return $$0.a_($$1.d()).a(avx.cs);
   }
}
