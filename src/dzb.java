import com.google.common.annotations.VisibleForTesting;

public class dzb extends dxr implements efv.b<dzb.a> {
   private final dzb.a a;

   public dzb(iv $$0, eat $$1) {
      super(dxt.L, $$0, $$1);
      this.a = new dzb.a($$1, new efp($$0));
   }

   public static void a(djm $$0, iv $$1, eat $$2, dzb $$3) {
      $$3.a.d().a($$0, $$1, $$0.C_(), true);
   }

   @Override
   protected void a(tz $$0, jh.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(tz $$0, jh.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dzb.a a() {
      return this.a;
   }

   public static class a implements efv {
      public static final int a = 8;
      final dtu b;
      private final eat c;
      private final efx d;

      public a(eat $$0, efx $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dtu.a();
      }

      @Override
      public efx a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public efv.a c() {
         return efv.a.b;
      }

      @Override
      public boolean a(arq $$0, jf<eft> $$1, eft.a $$2, ffc $$3) {
         if ($$1.a(eft.p) && $$2.a() instanceof bxj $$4) {
            if (!$$4.eK()) {
               bux $$5 = $$4.eH();
               int $$6 = $$4.a($$0, y.a($$5, bux::d));
               if ($$4.en() && $$6 > 0) {
                  this.b.a(iv.a((jp)$$3.a(jb.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eJ();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, iv.a((jp)$$1x), this.c, $$0.C_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dtu d() {
         return this.b;
      }

      private void a(arq $$0, iv $$1, eat $$2, azv $$3) {
         $$0.a($$1, $$2.b(dtr.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ly.K, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awn.wQ, awo.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(djm $$0, bxj $$1) {
         if ($$1.eq() instanceof arr $$3) {
            bux $$4 = $$1.eH() == null ? $$0.al().a((crm)$$3) : $$1.eH();
            aq.Z.a($$3, $$1, $$4);
         }
      }
   }
}
