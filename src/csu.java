public class csu extends csk {
   public static final dfy a = dfo.aw;
   public static final int b = 15;
   protected static final int c = 1;
   protected static final ehy d = csk.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ehy e = csk.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   protected csu(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      gv $$4 = $$2.c();
      if ($$1.t($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(a);
            if ($$6 == 15) {
               $$1.b($$4, this.n());
               dey $$7 = $$0.a(a, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(a, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return d;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return e;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      for (hb $$3 : hb.c.a) {
         dey $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(apo.b)) {
            return false;
         }
      }

      dey $$5 = $$1.a_($$2.d());
      return ($$5.a(csl.dQ) || $$5.a(apj.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      $$3.a($$1.ag().j(), 1.0F);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
