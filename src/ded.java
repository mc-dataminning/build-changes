import com.google.common.annotations.VisibleForTesting;

public class ded extends dcz implements djp.b<ded.a> {
   private final ded.a a;

   public ded(gw $$0, dfd $$1) {
      super(ddb.K, $$0, $$1);
      this.a = new ded.a($$1, new djj($$0));
   }

   public static void a(cqb $$0, gw $$1, dfd $$2, ded $$3) {
      $$3.a.d().a($$0, $$1, $$0.D_(), true);
   }

   @Override
   public void a(qw $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(qw $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public ded.a c() {
      return this.a;
   }

   public static class a implements djp {
      public static final int a = 8;
      final czv b;
      private final dfd c;
      private final djr d;

      public a(dfd $$0, djr $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = czv.a();
      }

      @Override
      public djr a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public djp.a c() {
         return djp.a.b;
      }

      @Override
      public boolean a(akt $$0, djn $$1, djn.a $$2, ehh $$3) {
         if ($$1 == djn.p && $$2.a() instanceof bjm $$4) {
            if (!$$4.eC()) {
               int $$5 = $$4.ed();
               if ($$4.eb() && $$5 > 0) {
                  this.b.a(gw.a($$3.a(ha.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eB();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, gw.a($$1x), this.c, $$0.D_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public czv d() {
         return this.b;
      }

      private void a(akt $$0, gw $$1, dfd $$2, ash $$3) {
         $$0.a($$1, $$2.a(czs.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(iv.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, apg.un, aph.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cqb $$0, bjm $$1) {
         if ($$1.eg() instanceof aku $$3) {
            bhu $$4 = $$1.ew() == null ? $$0.ag().a((cca)$$3) : $$1.ew();
            al.W.a($$3, $$1, $$4);
         }
      }
   }
}
