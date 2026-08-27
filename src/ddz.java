import com.google.common.annotations.VisibleForTesting;

public class ddz extends dcv implements djv.b<ddz.a> {
   private final ddz.a a;

   public ddz(gw $$0, dfj $$1) {
      super(dcx.K, $$0, $$1);
      this.a = new ddz.a($$1, new djp($$0));
   }

   public static void a(cpv $$0, gw $$1, dfj $$2, ddz $$3) {
      $$3.a.d().a($$0, $$1, $$0.D_(), true);
   }

   @Override
   public void a(qy $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(qy $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public ddz.a c() {
      return this.a;
   }

   public static class a implements djv {
      public static final int a = 8;
      final czq b;
      private final dfj c;
      private final djx d;

      public a(dfj $$0, djx $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = czq.a();
      }

      @Override
      public djx a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public djv.a c() {
         return djv.a.b;
      }

      @Override
      public boolean a(akr $$0, djt $$1, djt.a $$2, ehn $$3) {
         if ($$1 == djt.p && $$2.a() instanceof bjg $$4) {
            if (!$$4.eC()) {
               int $$5 = $$4.ed();
               if ($$4.eb() && $$5 > 0) {
                  this.b.a(gw.a($$3.a(hc.b, 0.5)), $$5);
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
      public czq d() {
         return this.b;
      }

      private void a(akr $$0, gw $$1, dfj $$2, asc $$3) {
         $$0.a($$1, $$2.a(czn.a, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ix.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, ape.un, apf.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cpv $$0, bjg $$1) {
         if ($$1.eg() instanceof aks $$3) {
            bho $$4 = $$1.ew() == null ? $$0.ag().a((cbu)$$3) : $$1.ew();
            al.W.a($$3, $$1, $$4);
         }
      }
   }
}
