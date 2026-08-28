import com.google.common.annotations.VisibleForTesting;

public class dvz extends duq implements ecm.b<dvz.a> {
   private final dvz.a a;

   public dvz(jh $$0, dxo $$1) {
      super(dus.L, $$0, $$1);
      this.a = new dvz.a($$1, new ecg($$0));
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, dvz $$3) {
      $$3.a.d().a($$0, $$1, $$0.H_(), true);
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dvz.a b() {
      return this.a;
   }

   public static class a implements ecm {
      public static final int a = 8;
      final drd b;
      private final dxo c;
      private final eco d;

      public a(dxo $$0, eco $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = drd.a();
      }

      @Override
      public eco a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public ecm.a c() {
         return ecm.a.b;
      }

      @Override
      public boolean a(arx $$0, jq<eck> $$1, eck.a $$2, fbr $$3) {
         if ($$1.a(eck.p) && $$2.a() instanceof bvx $$4) {
            if (!$$4.eJ()) {
               btr $$5 = $$4.eG();
               int $$6 = $$4.a($$0, x.a($$5, btr::d));
               if ($$4.en() && $$6 > 0) {
                  this.b.a(jh.a((ka)$$3.a(jm.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eI();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jh.a((ka)$$1x), this.c, $$0.H_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public drd d() {
         return this.b;
      }

      private void a(arx $$0, jh $$1, dxo $$2, bac $$3) {
         $$0.a($$1, $$2.b(dra.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ls.J, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awv.wA, aww.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dgz $$0, bvx $$1) {
         if ($$1.eq() instanceof ary $$3) {
            btr $$4 = $$1.eG() == null ? $$0.ak().a((cpo)$$3) : $$1.eG();
            ao.Z.a($$3, $$1, $$4);
         }
      }
   }
}
