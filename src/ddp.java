import com.google.common.annotations.VisibleForTesting;

public class ddp extends dcl implements djl.b<ddp.a> {
   private final ddp.a a;

   public ddp(gu $$0, dez $$1) {
      super(dcn.K, $$0, $$1);
      this.a = new ddp.a($$1, new djf($$0));
   }

   public static void a(cpl $$0, gu $$1, dez $$2, ddp $$3) {
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

   public ddp.a c() {
      return this.a;
   }

   public static class a implements djl {
      public static final int a = 8;
      final czg b;
      private final dez c;
      private final djn d;

      public a(dez $$0, djn $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = czg.a();
      }

      @Override
      public djn a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public djl.a c() {
         return djl.a.b;
      }

      @Override
      public boolean a(akk $$0, djj $$1, djj.a $$2, ehd $$3) {
         if ($$1 == djj.p && $$2.a() instanceof biy $$4) {
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
      public czg d() {
         return this.b;
      }

      private void a(akk $$0, gu $$1, dez $$2, aru $$3) {
         $$0.a($$1, $$2.a(czd.a, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(iv.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aow.un, aox.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cpl $$0, biy $$1) {
         if ($$1.ef() instanceof akl $$3) {
            bhg $$4 = $$1.ev() == null ? $$0.ag().a((cbm)$$3) : $$1.ev();
            ai.W.a($$3, $$1, $$4);
         }
      }
   }
}
