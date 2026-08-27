public class cxt extends csl implements csn {
   protected cxt(dey.d $$0) {
      super($$0);
   }

   private static boolean b(dez $$0, cpo $$1, gu $$2) {
      gu $$3 = $$2.c();
      dez $$4 = $$1.a_($$3);
      int $$5 = dzt.a($$1, $$0, $$2, $$4, $$3, ha.b, $$4.b($$1, $$3));
      return $$5 < $$1.M();
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, csm.dW.n());
      }
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      dez $$4 = $$0.a_($$2);
      gu $$5 = $$2.c();
      dgw $$6 = $$0.k().g();
      hr<dmz<?, ?>> $$7 = $$0.B_().d(jc.as);
      if ($$4.a(csm.ow)) {
         this.a($$7, oo.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(csm.on)) {
         this.a($$7, oo.j, $$0, $$6, $$1, $$5);
         this.a($$7, oo.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, oo.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(hr<dmz<?, ?>> $$0, aeq<dmz<?, ?>> $$1, akk $$2, dgw $$3, aru $$4, gu $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dmz)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
