import com.google.common.annotations.VisibleForTesting;

public class dqx extends dpq implements dxj.b<dqx.a> {
   private final dqx.a a;

   public dqx(ja $$0, dsl $$1) {
      super(dps.K, $$0, $$1);
      this.a = new dqx.a($$1, new dxd($$0));
   }

   public static void a(dcg $$0, ja $$1, dsl $$2, dqx $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dqx.a b() {
      return this.a;
   }

   public static class a implements dxj {
      public static final int a = 8;
      final dmd b;
      private final dsl c;
      private final dxl d;

      public a(dsl $$0, dxl $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dmd.a();
      }

      @Override
      public dxl a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dxj.a c() {
         return dxj.a.b;
      }

      @Override
      public boolean a(aqm $$0, jj<dxh> $$1, dxh.a $$2, ewh $$3) {
         if ($$1.a(dxh.p) && $$2.a() instanceof btc $$4) {
            if (!$$4.eF()) {
               bra $$5 = $$4.eA();
               int $$6 = $$4.a($$0, x.a($$5, bra::d));
               if ($$4.eg() && $$6 > 0) {
                  this.b.a(ja.a($$3.a(jf.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eE();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ja.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dmd d() {
         return this.b;
      }

      private void a(aqm $$0, ja $$1, dsl $$2, ayo $$3) {
         $$0.a($$1, $$2.a(dma.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lj.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avh.wa, avi.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dcg $$0, btc $$1) {
         if ($$1.ek() instanceof aqn $$3) {
            bra $$4 = $$1.eA() == null ? $$0.aj().a((cml)$$3) : $$1.eA();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
