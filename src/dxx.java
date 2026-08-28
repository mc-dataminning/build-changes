import com.google.common.annotations.VisibleForTesting;

public class dxx extends dwn implements eeq.b<dxx.a> {
   private final dxx.a a;

   public dxx(iu $$0, dzo $$1) {
      super(dwp.L, $$0, $$1);
      this.a = new dxx.a($$1, new eek($$0));
   }

   public static void a(dip $$0, iu $$1, dzo $$2, dxx $$3) {
      $$3.a.d().a($$0, $$1, $$0.C_(), true);
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dxx.a a() {
      return this.a;
   }

   public static class a implements eeq {
      public static final int a = 8;
      final dsu b;
      private final dzo c;
      private final ees d;

      public a(dzo $$0, ees $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dsu.a();
      }

      @Override
      public ees a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public eeq.a c() {
         return eeq.a.b;
      }

      @Override
      public boolean a(aro $$0, je<eeo> $$1, eeo.a $$2, fdw $$3) {
         if ($$1.a(eeo.p) && $$2.a() instanceof bwz $$4) {
            if (!$$4.eK()) {
               bup $$5 = $$4.eH();
               int $$6 = $$4.a($$0, x.a($$5, bup::d));
               if ($$4.en() && $$6 > 0) {
                  this.b.a(iu.a((jo)$$3.a(ja.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eJ();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, iu.a((jo)$$1x), this.c, $$0.C_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dsu d() {
         return this.b;
      }

      private void a(aro $$0, iu $$1, dzo $$2, azt $$3) {
         $$0.a($$1, $$2.b(dsr.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lx.K, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awl.wK, awm.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dip $$0, bwz $$1) {
         if ($$1.eq() instanceof arp $$3) {
            bup $$4 = $$1.eH() == null ? $$0.al().a((cqs)$$3) : $$1.eH();
            ap.Z.a($$3, $$1, $$4);
         }
      }
   }
}
