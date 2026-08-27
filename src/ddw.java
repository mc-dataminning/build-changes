import com.mojang.serialization.MapCodec;

public class ddw extends cwp {
   public static final MapCodec<ddw> a = b(ddw::new);
   public static final int b = 2;
   public static final dkg c = djw.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final eml g = cwp.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<ddw> a() {
      return a;
   }

   public ddw(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return g;
   }

   public int h(djg $$0) {
      return $$0.c(c);
   }

   private boolean n(djg $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, arr.xB, ars.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, arr.xC, ars.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         caj $$4 = bly.aO.a((cto)$$1);
         if ($$4 != null) {
            els $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), aun.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dnq.i, $$2, dnq.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   public static boolean a(csu $$0, hx $$1) {
      return $$0.a_($$1.d()).a(asg.ck);
   }
}
