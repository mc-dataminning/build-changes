public class cta extends csq {
   public static final dge a = dfu.aw;
   public static final int b = 15;
   protected static final int c = 1;
   protected static final eib d = csq.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final eib e = csq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   protected cta(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      gw $$4 = $$2.c();
      if ($$1.t($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(a);
            if ($$6 == 15) {
               $$1.b($$4, this.n());
               dfe $$7 = $$0.a(a, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(a, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return d;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return e;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      for (hc $$3 : hc.c.a) {
         dfe $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(apt.b)) {
            return false;
         }
      }

      dfe $$5 = $$1.a_($$2.d());
      return ($$5.a(csr.dQ) || $$5.a(apo.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      $$3.a($$1.ag().j(), 1.0F);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
