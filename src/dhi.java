import com.google.common.annotations.VisibleForTesting;

public class dhi extends dgd implements dnb.b<dhi.a> {
   private final dhi.a a;

   public dhi(hv $$0, dip $$1) {
      super(dgf.K, $$0, $$1);
      this.a = new dhi.a($$1, new dmv($$0));
   }

   public static void a(csy $$0, hv $$1, dip $$2, dhi $$3) {
      $$3.a.d().a($$0, $$1, $$0.F_(), true);
   }

   @Override
   public void a(sj $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(sj $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public dhi.a c() {
      return this.a;
   }

   public static class a implements dnb {
      public static final int a = 8;
      final dct b;
      private final dip c;
      private final dnd d;

      public a(dip $$0, dnd $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dct.a();
      }

      @Override
      public dnd a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dnb.a c() {
         return dnb.a.b;
      }

      @Override
      public boolean a(amp $$0, dmz $$1, dmz.a $$2, elb $$3) {
         if ($$1 == dmz.p && $$2.a() instanceof blv $$4) {
            if (!$$4.eD()) {
               int $$5 = $$4.ee();
               if ($$4.ec() && $$5 > 0) {
                  this.b.a(hv.a($$3.a(ia.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eC();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, hv.a($$1x), this.c, $$0.F_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dct d() {
         return this.b;
      }

      private void a(amp $$0, hv $$1, dip $$2, auf $$3) {
         $$0.a($$1, $$2.a(dcq.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(jv.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, arc.vd, ard.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(csy $$0, blv $$1) {
         if ($$1.eh() instanceof amq $$3) {
            bkd $$4 = $$1.ex() == null ? $$0.ah().a((cer)$$3) : $$1.ex();
            am.X.a($$3, $$1, $$4);
         }
      }
   }
}
