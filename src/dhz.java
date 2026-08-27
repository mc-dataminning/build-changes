import com.google.common.annotations.VisibleForTesting;

public class dhz extends dgu implements dns.b<dhz.a> {
   private final dhz.a a;

   public dhz(hx $$0, djg $$1) {
      super(dgw.K, $$0, $$1);
      this.a = new dhz.a($$1, new dnm($$0));
   }

   public static void a(cto $$0, hx $$1, djg $$2, dhz $$3) {
      $$3.a.d().a($$0, $$1, $$0.F_(), true);
   }

   @Override
   public void a(sn $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(sn $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public dhz.a c() {
      return this.a;
   }

   public static class a implements dns {
      public static final int a = 8;
      final ddj b;
      private final djg c;
      private final dnu d;

      public a(djg $$0, dnu $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = ddj.a();
      }

      @Override
      public dnu a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dns.a c() {
         return dns.a.b;
      }

      @Override
      public boolean a(and $$0, dnq $$1, dnq.a $$2, els $$3) {
         if ($$1 == dnq.p && $$2.a() instanceof bmk $$4) {
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
      public ddj d() {
         return this.b;
      }

      private void a(and $$0, hx $$1, djg $$2, auu $$3) {
         $$0.a($$1, $$2.a(ddg.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(jx.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, arr.vd, ars.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cto $$0, bmk $$1) {
         if ($$1.eh() instanceof ane $$3) {
            bks $$4 = $$1.ex() == null ? $$0.ai().a((cfh)$$3) : $$1.ex();
            am.X.a($$3, $$1, $$4);
         }
      }
   }
}
