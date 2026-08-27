import com.google.common.annotations.VisibleForTesting;

public class ddq extends dcm implements djm.b<ddq.a> {
   private final ddq.a a;

   public ddq(gu $$0, dfa $$1) {
      super(dco.K, $$0, $$1);
      this.a = new ddq.a($$1, new djg($$0));
   }

   public static void a(cpm $$0, gu $$1, dfa $$2, ddq $$3) {
      $$3.a.d().a($$0, $$1, $$0.y_(), true);
   }

   @Override
   public void a(qr $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(qr $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public ddq.a c() {
      return this.a;
   }

   public static class a implements djm {
      public static final int a = 8;
      final czh b;
      private final dfa c;
      private final djo d;

      public a(dfa $$0, djo $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = czh.a();
      }

      @Override
      public djo a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public djm.a c() {
         return djm.a.b;
      }

      @Override
      public boolean a(akk $$0, djk $$1, djk.a $$2, ehe $$3) {
         if ($$1 == djk.p && $$2.a() instanceof biy $$4) {
            if (!$$4.eB()) {
               int $$5 = $$4.ec();
               if ($$4.ea() && $$5 > 0) {
                  this.b.a(gu.a($$3.a(ha.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eA();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, gu.a($$1x), this.c, $$0.y_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public czh d() {
         return this.b;
      }

      private void a(akk $$0, gu $$1, dfa $$2, aru $$3) {
         $$0.a($$1, $$2.a(cze.a, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(iv.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aow.un, aox.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cpm $$0, biy $$1) {
         if ($$1.ef() instanceof akl $$3) {
            bhg $$4 = $$1.ev() == null ? $$0.ag().a((cbn)$$3) : $$1.ev();
            ai.W.a($$3, $$1, $$4);
         }
      }
   }
}
