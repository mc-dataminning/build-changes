import com.google.common.annotations.VisibleForTesting;

public class dgi extends dfd implements dlu.b<dgi.a> {
   private final dgi.a a;

   public dgi(ht $$0, dhi $$1) {
      super(dff.K, $$0, $$1);
      this.a = new dgi.a($$1, new dlo($$0));
   }

   public static void a(csa $$0, ht $$1, dhi $$2, dgi $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   public void a(rz $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(rz $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public dgi.a c() {
      return this.a;
   }

   public static class a implements dlu {
      public static final int a = 8;
      final dbu b;
      private final dhi c;
      private final dlw d;

      public a(dhi $$0, dlw $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dbu.a();
      }

      @Override
      public dlw a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dlu.a c() {
         return dlu.a.b;
      }

      @Override
      public boolean a(ame $$0, dls $$1, dls.a $$2, eju $$3) {
         if ($$1 == dls.p && $$2.a() instanceof blg $$4) {
            if (!$$4.eE()) {
               int $$5 = $$4.ef();
               if ($$4.ed() && $$5 > 0) {
                  this.b.a(ht.a($$3.a(hx.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eD();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ht.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dbu d() {
         return this.b;
      }

      private void a(ame $$0, ht $$1, dhi $$2, ats $$3) {
         $$0.a($$1, $$2.a(dbr.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(js.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aqr.uI, aqs.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(csa $$0, blg $$1) {
         if ($$1.ei() instanceof amf $$3) {
            bjo $$4 = $$1.ey() == null ? $$0.ah().a((cdu)$$3) : $$1.ey();
            al.W.a($$3, $$1, $$4);
         }
      }
   }
}
