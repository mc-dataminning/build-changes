import com.google.common.annotations.VisibleForTesting;

public class dyh extends dwx implements efb.b<dyh.a> {
   private final dyh.a a;

   public dyh(iu $$0, dzz $$1) {
      super(dwz.L, $$0, $$1);
      this.a = new dyh.a($$1, new eev($$0));
   }

   public static void a(div $$0, iu $$1, dzz $$2, dyh $$3) {
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

   public dyh.a a() {
      return this.a;
   }

   public static class a implements efb {
      public static final int a = 8;
      final dtc b;
      private final dzz c;
      private final efd d;

      public a(dzz $$0, efd $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dtc.a();
      }

      @Override
      public efd a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public efb.a c() {
         return efb.a.b;
      }

      @Override
      public boolean a(arq $$0, je<eez> $$1, eez.a $$2, fei $$3) {
         if ($$1.a(eez.p) && $$2.a() instanceof bxc $$4) {
            if (!$$4.eK()) {
               bus $$5 = $$4.eH();
               int $$6 = $$4.a($$0, x.a($$5, bus::d));
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
      public dtc d() {
         return this.b;
      }

      private void a(arq $$0, iu $$1, dzz $$2, azv $$3) {
         $$0.a($$1, $$2.b(dsz.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lx.K, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awn.wN, awo.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(div $$0, bxc $$1) {
         if ($$1.eq() instanceof arr $$3) {
            bus $$4 = $$1.eH() == null ? $$0.al().a((cqy)$$3) : $$1.eH();
            ap.Z.a($$3, $$1, $$4);
         }
      }
   }
}
