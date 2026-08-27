public class crz extends csu {
   public crz(csu.a $$0) {
      super($$0);
   }

   @Override
   public bpm a(cwk $$0) {
      dad $$1 = $$0.q();
      in $$2 = $$0.a();
      dqh $$3 = $$1.a_($$2);
      if (!$$3.a(ddg.fy) || $$3.c(dft.c)) {
         return bpm.d;
      } else if ($$1.B) {
         return bpm.a;
      } else {
         dqh $$4 = $$3.a(dft.c, Boolean.valueOf(true));
         dde.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, ddg.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dqm.b $$5 = dft.b().a($$1, $$2);
         if ($$5 != null) {
            in $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), ddg.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bpm.b;
      }
   }

   @Override
   public int b(csz $$0) {
      return 0;
   }

   @Override
   public bpn<csz> a(dad $$0, clh $$1, bpl $$2) {
      csz $$3 = $$1.b($$2);
      etl $$4 = a($$0, $$1, czm.b.a);
      if ($$4.c() == etn.a.b && $$0.a_($$4.a()).a(ddg.fy)) {
         return bpn.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aqh $$5) {
            in $$6 = $$5.a(awc.a, $$1.dn(), 100, false);
            if ($$6 != null) {
               cls $$7 = new cls($$0, $$1.ds(), $$1.e(0.5), $$1.dy());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dva.K, $$7.dl(), dva.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aqi) {
                  am.n.a((aqi)$$1, $$6);
               }

               $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), avc.id, avd.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dn(), 0);
               $$3.a(1, $$1);
               $$1.b(avm.c.b(this));
               $$1.a($$2, true);
               return bpn.a($$3);
            }
         }

         return bpn.b($$3);
      }
   }
}
