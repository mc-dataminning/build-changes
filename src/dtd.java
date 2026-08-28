import com.google.common.annotations.VisibleForTesting;

public class dtd extends drv implements dzr.b<dtd.a> {
   private final dtd.a a;

   public dtd(jf $$0, dus $$1) {
      super(drx.K, $$0, $$1);
      this.a = new dtd.a($$1, new dzl($$0));
   }

   public static void a(dej $$0, jf $$1, dus $$2, dtd $$3) {
      $$3.a.d().a($$0, $$1, $$0.D_(), true);
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dtd.a b() {
      return this.a;
   }

   public static class a implements dzr {
      public static final int a = 8;
      final doi b;
      private final dus c;
      private final dzt d;

      public a(dus $$0, dzt $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = doi.a();
      }

      @Override
      public dzt a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dzr.a c() {
         return dzr.a.b;
      }

      @Override
      public boolean a(arj $$0, jo<dzp> $$1, dzp.a $$2, eyw $$3) {
         if ($$1.a(dzp.p) && $$2.a() instanceof bun $$4) {
            if (!$$4.eH()) {
               bsj $$5 = $$4.eD();
               int $$6 = $$4.a($$0, x.a($$5, bsj::d));
               if ($$4.ej() && $$6 > 0) {
                  this.b.a(jf.a((jy)$$3.a(jk.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eG();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jf.a((jy)$$1x), this.c, $$0.D_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public doi d() {
         return this.b;
      }

      private void a(arj $$0, jf $$1, dus $$2, azn $$3) {
         $$0.a($$1, $$2.b(dof.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lo.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awg.wb, awh.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dej $$0, bun $$1) {
         if ($$1.en() instanceof ark $$3) {
            bsj $$4 = $$1.eD() == null ? $$0.ak().a((cnx)$$3) : $$1.eD();
            an.Z.a($$3, $$1, $$4);
         }
      }
   }
}
