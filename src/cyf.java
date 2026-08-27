public class cyf extends csx implements csz {
   protected cyf(dfk.d $$0) {
      super($$0);
   }

   private static boolean b(dfl $$0, cqa $$1, gw $$2) {
      gw $$3 = $$2.c();
      dfl $$4 = $$1.a_($$3);
      int $$5 = eaf.a($$1, $$0, $$2, $$4, $$3, hc.b, $$4.b($$1, $$3));
      return $$5 < $$1.M();
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, csy.dW.n());
      }
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      dfl $$4 = $$0.a_($$2);
      gw $$5 = $$2.c();
      dhi $$6 = $$0.k().g();
      ht<dnl<?, ?>> $$7 = $$0.G_().d(je.as);
      if ($$4.a(csy.ow)) {
         this.a($$7, ov.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(csy.on)) {
         this.a($$7, ov.j, $$0, $$6, $$1, $$5);
         this.a($$7, ov.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, ov.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ht<dnl<?, ?>> $$0, aex<dnl<?, ?>> $$1, aks $$2, dhi $$3, ase $$4, gw $$5) {
      $$0.b($$1).ifPresent($$4x -> ((dnl)$$4x.a()).a($$2, $$3, $$4, $$5));
   }
}
