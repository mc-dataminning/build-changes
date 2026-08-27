public class ctf extends csv {
   public static final dgj a = dfz.aw;
   public static final int b = 15;
   protected static final int c = 1;
   protected static final eig d = csv.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final eig e = csv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   protected ctf(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
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
               dfj $$7 = $$0.a(a, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(a, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return d;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return e;
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
      for (ha $$3 : ha.c.a) {
         dfj $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(apx.b)) {
            return false;
         }
      }

      dfj $$5 = $$1.a_($$2.d());
      return ($$5.a(csw.dQ) || $$5.a(aps.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      $$3.a($$1.ag().j(), 1.0F);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
