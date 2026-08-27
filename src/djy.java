import com.google.common.annotations.VisibleForTesting;

public class djy extends dit implements dpr.b<djy.a> {
   private final djy.a a;

   public djy(hz $$0, dlf $$1) {
      super(div.K, $$0, $$1);
      this.a = new djy.a($$1, new dpl($$0));
   }

   public static void a(cvn $$0, hz $$1, dlf $$2, djy $$3) {
      $$3.a.d().a($$0, $$1, $$0.F_(), true);
   }

   @Override
   public void a(sw $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(sw $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public djy.a c() {
      return this.a;
   }

   public static class a implements dpr {
      public static final int a = 8;
      final dfi b;
      private final dlf c;
      private final dpt d;

      public a(dlf $$0, dpt $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dfi.a();
      }

      @Override
      public dpt a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dpr.a c() {
         return dpr.a.b;
      }

      @Override
      public boolean a(aov $$0, ij<dpp> $$1, dpp.a $$2, ens $$3) {
         if ($$1.a(dpp.p) && $$2.a() instanceof bog $$4) {
            if (!$$4.eE()) {
               int $$5 = $$4.ef();
               if ($$4.ed() && $$5 > 0) {
                  this.b.a(hz.a($$3.a(ie.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eD();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, hz.a($$1x), this.c, $$0.F_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dfi d() {
         return this.b;
      }

      private void a(aov $$0, hz $$1, dlf $$2, awo $$3) {
         $$0.a($$1, $$2.a(dff.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(jz.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, atk.vs, atl.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cvn $$0, bog $$1) {
         if ($$1.ei() instanceof aow $$3) {
            bmn $$4 = $$1.ey() == null ? $$0.ai().a((chh)$$3) : $$1.ey();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
