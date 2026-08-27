import java.util.Optional;

public class cso extends cwj implements css, czr {
   private static final dfv e = dfu.C;
   private static final int f = 6;
   protected static final eib a = csq.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final eib b = csq.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final eib c = csq.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final eib d = csq.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   protected cso(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(e, Boolean.valueOf(false)).a(aC, hc.c));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
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
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(e, aC);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(e) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfe $$4 = $$1.a_($$3);
      dfe $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(apo.bx)) && ($$5.a(this) || $$5.a(csr.rC));
   }

   protected static boolean a(cpr $$0, gw $$1, eah $$2, hc $$3) {
      dfe $$4 = csr.rD.n().a(e, Boolean.valueOf($$2.a(eai.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if (($$1 == hc.a || $$1 == hc.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(e)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      Optional<gw> $$3 = l.a($$0, $$1, $$2.b(), hc.b, csr.rC);
      if ($$3.isEmpty()) {
         return false;
      } else {
         gw $$4 = $$3.get().c();
         dfe $$5 = $$0.a_($$4);
         return csn.a((cps)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      Optional<gw> $$4 = l.a($$0, $$2, $$3.b(), hc.b, csr.rC);
      if (!$$4.isEmpty()) {
         gw $$5 = $$4.get();
         gw $$6 = $$5.c();
         hc $$7 = $$3.c(aC);
         a($$0, $$5, $$0.b_($$5), $$7);
         csn.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(csr.rC);
   }
}
