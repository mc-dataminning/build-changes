public class cxo extends cpn {
   public static final ddb a = dcr.aw;
   protected static final float b = 6.0F;
   protected static final efb c = cpn.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   protected cxo(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return c;
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
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
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      dcb $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(amw.af) || $$3.a(amw.H)) {
            gu $$4 = $$2.d();

            for (ha $$5 : ha.c.a) {
               dcb $$6 = $$1.a_($$4.a($$5));
               dxe $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(anb.a) || $$6.a(cpo.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a);
   }
}
