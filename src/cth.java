public class cth extends csx {
   public static final dgl a = dgb.aw;
   public static final int b = 15;
   protected static final int c = 1;
   protected static final eii d = csx.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final eii e = csx.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   protected cth(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
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
               dfl $$7 = $$0.a(a, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(a, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return d;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return e;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      for (hc $$3 : hc.c.a) {
         dfl $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(apz.b)) {
            return false;
         }
      }

      dfl $$5 = $$1.a_($$2.d());
      return ($$5.a(csy.dQ) || $$5.a(apu.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      $$3.a($$1.ag().j(), 1.0F);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
