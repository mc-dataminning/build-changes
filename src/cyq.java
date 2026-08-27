public class cyq extends csq {
   public static final dfv a = cyt.a;

   public cyq(dfd.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, cbp $$3) {
      d($$0, $$1, $$2);
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bil $$3) {
      if (!$$3.bS()) {
         d($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         a($$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }

      cja $$6 = $$3.b($$4);
      return $$6.d() instanceof cgt && new cli($$3, $$4, $$6, $$5).b() ? bgt.d : bgt.a;
   }

   private static void d(dfe $$0, cpq $$1, gw $$2) {
      a($$1, $$2);
      if (!$$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   public boolean e_(dfe $$0) {
      return $$0.c(a);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, cja $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4 && cnl.a(cnn.v, $$3) == 0) {
         int $$5 = 1 + $$1.z.a(5);
         this.a($$1, $$2, $$5);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$0.c(a)) {
         a($$1, $$2);
      }
   }

   private static void a(cpq $$0, gw $$1) {
      double $$2 = 0.5625;
      arx $$3 = $$0.z;

      for (hc $$4 : hc.values()) {
         gw $$5 = $$1.a($$4);
         if (!$$0.a_($$5).i($$0, $$5)) {
            hc.a $$6 = $$4.o();
            double $$7 = $$6 == hc.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == hc.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == hc.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ir.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }
}
