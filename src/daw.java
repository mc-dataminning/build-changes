public class daw extends csv {
   public static final dgj a = dfz.aw;
   protected static final float b = 6.0F;
   protected static final eig c = csv.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   protected daw(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return c;
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
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
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      dfj $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(aps.af) || $$3.a(aps.H)) {
            gw $$4 = $$2.d();

            for (ha $$5 : ha.c.a) {
               dfj $$6 = $$1.a_($$4.a($$5));
               eam $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(apx.a) || $$6.a(csw.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }
}
