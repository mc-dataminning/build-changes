import com.google.common.annotations.VisibleForTesting;

public class dfb extends ddx implements dkn.b<dfb.a> {
   private final dfb.a a;

   public dfb(ht $$0, dgb $$1) {
      super(ddz.K, $$0, $$1);
      this.a = new dfb.a($$1, new dkh($$0));
   }

   public static void a(cqz $$0, ht $$1, dgb $$2, dfb $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   public void a(rt $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(rt $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public dfb.a c() {
      return this.a;
   }

   public static class a implements dkn {
      public static final int a = 8;
      final dat b;
      private final dgb c;
      private final dkp d;

      public a(dgb $$0, dkp $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dat.a();
      }

      @Override
      public dkp a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dkn.a c() {
         return dkn.a.b;
      }

      @Override
      public boolean a(alq $$0, dkl $$1, dkl.a $$2, eif $$3) {
         if ($$1 == dkl.p && $$2.a() instanceof bkj $$4) {
            if (!$$4.eC()) {
               int $$5 = $$4.ed();
               if ($$4.eb() && $$5 > 0) {
                  this.b.a(ht.a($$3.a(hx.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eB();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ht.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dat d() {
         return this.b;
      }

      private void a(alq $$0, ht $$1, dgb $$2, ate $$3) {
         $$0.a($$1, $$2.a(daq.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(js.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aqd.up, aqe.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cqz $$0, bkj $$1) {
         if ($$1.eg() instanceof alr $$3) {
            bir $$4 = $$1.ew() == null ? $$0.ag().a((ccx)$$3) : $$1.ew();
            al.W.a($$3, $$1, $$4);
         }
      }
   }
}
