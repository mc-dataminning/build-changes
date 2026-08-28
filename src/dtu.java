import com.google.common.annotations.VisibleForTesting;

public class dtu extends dsm implements eai.b<dtu.a> {
   private final dtu.a a;

   public dtu(jh $$0, dvj $$1) {
      super(dso.K, $$0, $$1);
      this.a = new dtu.a($$1, new eac($$0));
   }

   public static void a(dfb $$0, jh $$1, dvj $$2, dtu $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dtu.a b() {
      return this.a;
   }

   public static class a implements eai {
      public static final int a = 8;
      final doz b;
      private final dvj c;
      private final eak d;

      public a(dvj $$0, eak $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = doz.a();
      }

      @Override
      public eak a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public eai.a c() {
         return eai.a.b;
      }

      @Override
      public boolean a(arn $$0, jq<eag> $$1, eag.a $$2, ezn $$3) {
         if ($$1.a(eag.p) && $$2.a() instanceof bva $$4) {
            if (!$$4.eM()) {
               bsu $$5 = $$4.eI();
               int $$6 = $$4.a($$0, x.a($$5, bsu::d));
               if ($$4.eo() && $$6 > 0) {
                  this.b.a(jh.a((ka)$$3.a(jm.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eL();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jh.a((ka)$$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public doz d() {
         return this.b;
      }

      private void a(arn $$0, jh $$1, dvj $$2, azs $$3) {
         $$0.a($$1, $$2.b(dow.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lr.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awl.vZ, awm.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dfb $$0, bva $$1) {
         if ($$1.es() instanceof aro $$3) {
            bsu $$4 = $$1.eI() == null ? $$0.ai().a((com)$$3) : $$1.eI();
            ao.Z.a($$3, $$1, $$4);
         }
      }
   }
}
