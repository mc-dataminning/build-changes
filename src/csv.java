public class csv extends csl {
   public static final dfz a = dfp.aw;
   public static final int b = 15;
   protected static final int c = 1;
   protected static final ehw d = csl.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ehw e = csl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   protected csv(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      gu $$4 = $$2.c();
      if ($$1.t($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(a);
            if ($$6 == 15) {
               $$1.b($$4, this.n());
               dez $$7 = $$0.a(a, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(a, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return d;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return e;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      for (ha $$3 : ha.c.a) {
         dez $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(apq.b)) {
            return false;
         }
      }

      dez $$5 = $$1.a_($$2.d());
      return ($$5.a(csm.dQ) || $$5.a(apl.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, bii $$3) {
      $$3.a($$1.ag().j(), 1.0F);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
