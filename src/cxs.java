public class cxs extends csk implements csm {
   protected cxs(dex.d $$0) {
      super($$0);
   }

   private static boolean b(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.c();
      dey $$4 = $$1.a_($$3);
      int $$5 = dzs.a($$1, $$0, $$2, $$4, $$3, hb.b, $$4.b($$1, $$3));
      return $$5 < $$1.M();
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, csl.dW.n());
      }
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      dey $$4 = $$0.a_($$2);
      gv $$5 = $$2.c();
      dgv $$6 = $$0.k().g();
      hs<dmy<?, ?>> $$7 = $$0.B_().d(jd.as);
      if ($$4.a(csl.ow)) {
         this.a($$7, op.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(csl.on)) {
         this.a($$7, op.j, $$0, $$6, $$1, $$5);
         this.a($$7, op.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, op.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(hs<dmy<?, ?>> $$0, aeo<dmy<?, ?>> $$1, aki $$2, dgv $$3, art $$4, gv $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dmy)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
