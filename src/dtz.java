import com.google.common.annotations.VisibleForTesting;

public class dtz extends dsr implements eam.b<dtz.a> {
   private final dtz.a a;

   public dtz(jh $$0, dvo $$1) {
      super(dst.K, $$0, $$1);
      this.a = new dtz.a($$1, new eag($$0));
   }

   public static void a(dff $$0, jh $$1, dvo $$2, dtz $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dtz.a b() {
      return this.a;
   }

   public static class a implements eam {
      public static final int a = 8;
      final dpe b;
      private final dvo c;
      private final eao d;

      public a(dvo $$0, eao $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dpe.a();
      }

      @Override
      public eao a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public eam.a c() {
         return eam.a.b;
      }

      @Override
      public boolean a(arq $$0, jq<eak> $$1, eak.a $$2, ezr $$3) {
         if ($$1.a(eak.p) && $$2.a() instanceof bve $$4) {
            if (!$$4.eN()) {
               bsy $$5 = $$4.eJ();
               int $$6 = $$4.a($$0, x.a($$5, bsy::d));
               if ($$4.ep() && $$6 > 0) {
                  this.b.a(jh.a((ka)$$3.a(jm.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eM();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jh.a((ka)$$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dpe d() {
         return this.b;
      }

      private void a(arq $$0, jh $$1, dvo $$2, azv $$3) {
         $$0.a($$1, $$2.b(dpb.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ls.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awo.vZ, awp.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dff $$0, bve $$1) {
         if ($$1.et() instanceof arr $$3) {
            bsy $$4 = $$1.eJ() == null ? $$0.ai().a((cor)$$3) : $$1.eJ();
            ao.Z.a($$3, $$1, $$4);
         }
      }
   }
}
