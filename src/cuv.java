public class cuv extends cpn implements cpp {
   protected cuv(dca.d $$0) {
      super($$0);
   }

   private static boolean b(dcb $$0, cmp $$1, gu $$2) {
      gu $$3 = $$2.c();
      dcb $$4 = $$1.a_($$3);
      int $$5 = dwv.a($$1, $$0, $$2, $$4, $$3, ha.b, $$4.b($$1, $$3));
      return $$5 < $$1.M();
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, cpo.dW.n());
      }
   }

   @Override
   public boolean a(cmp $$0, gu $$1, dcb $$2, boolean $$3) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cmm $$0, apf $$1, gu $$2, dcb $$3) {
      return true;
   }

   @Override
   public void a(aif $$0, apf $$1, gu $$2, dcb $$3) {
      dcb $$4 = $$0.a_($$2);
      gu $$5 = $$2.c();
      ddy $$6 = $$0.k().g();
      hr<dkb<?, ?>> $$7 = $$0.B_().d(jc.as);
      if ($$4.a(cpo.ow)) {
         this.a($$7, oo.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(cpo.on)) {
         this.a($$7, oo.j, $$0, $$6, $$1, $$5);
         this.a($$7, oo.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, oo.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(hr<dkb<?, ?>> $$0, acp<dkb<?, ?>> $$1, aif $$2, ddy $$3, apf $$4, gu $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dkb)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
