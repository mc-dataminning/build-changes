import com.google.common.annotations.VisibleForTesting;

public class deb extends dcx implements djx.b<deb.a> {
   private final deb.a a;

   public deb(gw $$0, dfl $$1) {
      super(dcz.K, $$0, $$1);
      this.a = new deb.a($$1, new djr($$0));
   }

   public static void a(cpx $$0, gw $$1, dfl $$2, deb $$3) {
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

   public deb.a c() {
      return this.a;
   }

   public static class a implements djx {
      public static final int a = 8;
      final czs b;
      private final dfl c;
      private final djz d;

      public a(dfl $$0, djz $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = czs.a();
      }

      @Override
      public djz a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public djx.a c() {
         return djx.a.b;
      }

      @Override
      public boolean a(aks $$0, djv $$1, djv.a $$2, ehp $$3) {
         if ($$1 == djv.p && $$2.a() instanceof bji $$4) {
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
      public czs d() {
         return this.b;
      }

      private void a(aks $$0, gw $$1, dfl $$2, ase $$3) {
         $$0.a($$1, $$2.a(czp.a, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ix.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, apf.un, apg.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cpx $$0, bji $$1) {
         if ($$1.eg() instanceof akt $$3) {
            bhq $$4 = $$1.ew() == null ? $$0.ag().a((cbw)$$3) : $$1.ew();
            al.W.a($$3, $$1, $$4);
         }
      }
   }
}
