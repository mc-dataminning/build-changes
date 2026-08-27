import com.google.common.annotations.VisibleForTesting;

public class dgn extends dfi implements dlz.b<dgn.a> {
   private final dgn.a a;

   public dgn(hx $$0, dhn $$1) {
      super(dfk.K, $$0, $$1);
      this.a = new dgn.a($$1, new dlt($$0));
   }

   public static void a(csf $$0, hx $$1, dhn $$2, dgn $$3) {
      $$3.a.d().a($$0, $$1, $$0.F_(), true);
   }

   @Override
   public void a(sd $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(sd $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public dgn.a c() {
      return this.a;
   }

   public static class a implements dlz {
      public static final int a = 8;
      final dbz b;
      private final dhn c;
      private final dmb d;

      public a(dhn $$0, dmb $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dbz.a();
      }

      @Override
      public dmb a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dlz.a c() {
         return dlz.a.b;
      }

      @Override
      public boolean a(ami $$0, dlx $$1, dlx.a $$2, ejz $$3) {
         if ($$1 == dlx.p && $$2.a() instanceof bll $$4) {
            if (!$$4.eE()) {
               int $$5 = $$4.ef();
               if ($$4.ed() && $$5 > 0) {
                  this.b.a(hx.a($$3.a(ib.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eD();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, hx.a($$1x), this.c, $$0.F_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dbz d() {
         return this.b;
      }

      private void a(ami $$0, hx $$1, dhn $$2, atw $$3) {
         $$0.a($$1, $$2.a(dbw.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(jw.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aqv.uI, aqw.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(csf $$0, bll $$1) {
         if ($$1.ei() instanceof amj $$3) {
            bjt $$4 = $$1.ey() == null ? $$0.ah().a((cdz)$$3) : $$1.ey();
            al.W.a($$3, $$1, $$4);
         }
      }
   }
}
