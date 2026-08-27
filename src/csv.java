import java.util.Optional;

public class csv extends cwq implements csz, czy {
   private static final dgc e = dgb.C;
   private static final int f = 6;
   protected static final eii a = csx.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eii b = csx.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eii c = csx.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eii d = csx.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   protected csv(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(aC, hc.c));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      switch ((hc)$$0.c(aC)) {
         case d:
            return b;
         case c:
         default:
            return a;
         case e:
            return d;
         case f:
            return c;
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(e, aC);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(e) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfl $$4 = $$1.a_($$3);
      dfl $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(apu.bx)) && ($$5.a(this) || $$5.a(csy.rC));
   }

   protected static boolean a(cpy $$0, gw $$1, eao $$2, hc $$3) {
      dfl $$4 = csy.rD.n().a(e, Boolean.valueOf($$2.a(eap.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if (($$1 == hc.a || $$1 == hc.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(e)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      Optional<gw> $$3 = l.a($$0, $$1, $$2.b(), hc.b, csy.rC);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gw $$4 = $$3.get().c();
         dfl $$5 = $$0.a_($$4);
         return csu.a((cpz)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      Optional<gw> $$4 = l.a($$0, $$2, $$3.b(), hc.b, csy.rC);
      if (!$$4.isEmpty()) {
         gw $$5 = $$4.get();
         gw $$6 = $$5.c();
         hc $$7 = $$3.c(aC);
         a($$0, $$5, $$0.b_($$5), $$7);
         csu.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(csy.rC);
   }
}
