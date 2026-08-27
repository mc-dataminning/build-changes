import com.mojang.serialization.MapCodec;

public class dch extends cva {
   public static final MapCodec<dch> a = b(dch::new);
   public static final int b = 2;
   public static final dii c = dhy.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final ekn g = cva.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<dch> a() {
      return a;
   }

   public dch(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(c);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return g;
   }

   public int h(dhi $$0) {
      return $$0.c(c);
   }

   private boolean n(dhi $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, aqr.xg, aqs.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, aqr.xh, aqs.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         bzd $$4 = bku.aN.a((csa)$$1);
         if ($$4 != null) {
            eju $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), atm.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.x_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dls.i, $$2, dls.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }

   public static boolean a(crg $$0, ht $$1) {
      return $$0.a_($$1.d()).a(arg.ck);
   }
}
