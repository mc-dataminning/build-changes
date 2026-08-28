import com.google.common.annotations.VisibleForTesting;

public class dyp extends dxf implements efj.b<dyp.a> {
   private final dyp.a a;

   public dyp(iu $$0, eah $$1) {
      super(dxh.L, $$0, $$1);
      this.a = new dyp.a($$1, new efd($$0));
   }

   public static void a(dja $$0, iu $$1, eah $$2, dyp $$3) {
      $$3.a.d().a($$0, $$1, $$0.C_(), true);
   }

   @Override
   protected void a(tz $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(tz $$0, jg.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dyp.a a() {
      return this.a;
   }

   public static class a implements efj {
      public static final int a = 8;
      final dti b;
      private final eah c;
      private final efl d;

      public a(eah $$0, efl $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dti.a();
      }

      @Override
      public efl a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public efj.a c() {
         return efj.a.b;
      }

      @Override
      public boolean a(arq $$0, je<efh> $$1, efh.a $$2, feq $$3) {
         if ($$1.a(efh.p) && $$2.a() instanceof bxe $$4) {
            if (!$$4.eL()) {
               buu $$5 = $$4.eI();
               int $$6 = $$4.a($$0, x.a($$5, buu::d));
               if ($$4.eo() && $$6 > 0) {
                  this.b.a(iu.a((jo)$$3.a(ja.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eK();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, iu.a((jo)$$1x), this.c, $$0.C_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dti d() {
         return this.b;
      }

      private void a(arq $$0, iu $$1, eah $$2, azv $$3) {
         $$0.a($$1, $$2.b(dtf.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lx.K, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awn.wQ, awo.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dja $$0, bxe $$1) {
         if ($$1.er() instanceof arr $$3) {
            buu $$4 = $$1.eI() == null ? $$0.al().a((crc)$$3) : $$1.eI();
            ap.Z.a($$3, $$1, $$4);
         }
      }
   }
}
