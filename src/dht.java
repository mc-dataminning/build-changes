import com.google.common.annotations.VisibleForTesting;

public class dht extends dgo implements dnm.b<dht.a> {
   private final dht.a a;

   public dht(hx $$0, dja $$1) {
      super(dgq.K, $$0, $$1);
      this.a = new dht.a($$1, new dng($$0));
   }

   public static void a(cti $$0, hx $$1, dja $$2, dht $$3) {
      $$3.a.d().a($$0, $$1, $$0.F_(), true);
   }

   @Override
   public void a(sl $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(sl $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public dht.a c() {
      return this.a;
   }

   public static class a implements dnm {
      public static final int a = 8;
      final ddd b;
      private final dja c;
      private final dno d;

      public a(dja $$0, dno $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = ddd.a();
      }

      @Override
      public dno a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dnm.a c() {
         return dnm.a.b;
      }

      @Override
      public boolean a(amz $$0, dnk $$1, dnk.a $$2, elm $$3) {
         if ($$1 == dnk.p && $$2.a() instanceof bmf $$4) {
            if (!$$4.eD()) {
               int $$5 = $$4.ee();
               if ($$4.ec() && $$5 > 0) {
                  this.b.a(hx.a($$3.a(ic.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eC();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, hx.a($$1x), this.c, $$0.F_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public ddd d() {
         return this.b;
      }

      private void a(amz $$0, hx $$1, dja $$2, aup $$3) {
         $$0.a($$1, $$2.a(dda.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(jx.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, arm.vd, arn.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cti $$0, bmf $$1) {
         if ($$1.eh() instanceof ana $$3) {
            bkn $$4 = $$1.ex() == null ? $$0.ai().a((cfb)$$3) : $$1.ex();
            am.X.a($$3, $$1, $$4);
         }
      }
   }
}
