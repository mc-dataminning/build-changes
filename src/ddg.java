import com.mojang.serialization.MapCodec;

public class ddg extends cvz {
   public static final MapCodec<ddg> a = b(ddg::new);
   public static final int b = 2;
   public static final djp c = djf.aE;
   private static final int d = 24000;
   private static final int e = 12000;
   private static final int f = 300;
   private static final elu g = cvz.a(1.0, 0.0, 2.0, 15.0, 16.0, 14.0);

   @Override
   public MapCodec<ddg> a() {
      return a;
   }

   public ddg(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(c);
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return g;
   }

   public int h(dip $$0) {
      return $$0.c(c);
   }

   private boolean n(dip $$0) {
      return this.h($$0) == 2;
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!this.n($$0)) {
         $$1.a(null, $$2, arc.xB, ard.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.a($$2, $$0.a(c, Integer.valueOf(this.h($$0) + 1)), 2);
      } else {
         $$1.a(null, $$2, arc.xC, ard.e, 0.7F, 0.9F + $$3.i() * 0.2F);
         $$1.b($$2, false);
         bzu $$4 = blj.aO.a((csy)$$1);
         if ($$4 != null) {
            elb $$5 = $$2.b();
            $$4.a(true);
            $$4.b($$5.a(), $$5.b(), $$5.c(), aty.g($$1.z.i() * 360.0F), 0.0F);
            $$1.b($$4);
         }
      }
   }

   @Override
   public void b(dip $$0, csy $$1, hv $$2, dip $$3, boolean $$4) {
      boolean $$5 = a($$1, $$2);
      if (!$$1.y_() && $$5) {
         $$1.c(3009, $$2, 0);
      }

      int $$6 = $$5 ? 12000 : 24000;
      int $$7 = $$6 / 3;
      $$1.a(dmz.i, $$2, dmz.a.a($$0));
      $$1.a($$2, this, $$7 + $$1.z.a(300));
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   public static boolean a(cse $$0, hv $$1) {
      return $$0.a_($$1.d()).a(arr.ck);
   }
}
