import com.google.common.annotations.VisibleForTesting;

public class dwv extends dvl implements edo.b<dwv.a> {
   private final dwv.a a;

   public dwv(jj $$0, dym $$1) {
      super(dvn.L, $$0, $$1);
      this.a = new dwv.a($$1, new edi($$0));
   }

   public static void a(dhp $$0, jj $$1, dym $$2, dwv $$3) {
      $$3.a.d().a($$0, $$1, $$0.C_(), true);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dwv.a a() {
      return this.a;
   }

   public static class a implements edo {
      public static final int a = 8;
      final dru b;
      private final dym c;
      private final edq d;

      public a(dym $$0, edq $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dru.a();
      }

      @Override
      public edq a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public edo.a c() {
         return edo.a.b;
      }

      @Override
      public boolean a(arn $$0, js<edm> $$1, edm.a $$2, fcu $$3) {
         if ($$1.a(edm.p) && $$2.a() instanceof bwr $$4) {
            if (!$$4.eK()) {
               buh $$5 = $$4.eH();
               int $$6 = $$4.a($$0, x.a($$5, buh::d));
               if ($$4.en() && $$6 > 0) {
                  this.b.a(jj.a((kc)$$3.a(jo.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eJ();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jj.a((kc)$$1x), this.c, $$0.C_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dru d() {
         return this.b;
      }

      private void a(arn $$0, jj $$1, dym $$2, azs $$3) {
         $$0.a($$1, $$2.b(drr.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lv.K, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awk.wK, awl.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dhp $$0, bwr $$1) {
         if ($$1.eq() instanceof aro $$3) {
            buh $$4 = $$1.eH() == null ? $$0.al().a((cqi)$$3) : $$1.eH();
            ap.Z.a($$3, $$1, $$4);
         }
      }
   }
}
