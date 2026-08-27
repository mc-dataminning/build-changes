public class dar extends csq {
   public static final dge a = dfu.aw;
   protected static final float b = 6.0F;
   protected static final eib c = csq.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   protected dar(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return c;
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$1.t($$2.c())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(a);
            if ($$5 == 15) {
               $$1.b($$2.c(), this.n());
               $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(a, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
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
      dfe $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(apo.af) || $$3.a(apo.H)) {
            gw $$4 = $$2.d();

            for (hc $$5 : hc.c.a) {
               dfe $$6 = $$1.a_($$4.a($$5));
               eah $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(apt.a) || $$6.a(csr.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }
}
