public class ctf extends cuc {
   public ctf(cuc.a $$0) {
      super($$0);
   }

   @Override
   public bqa a(cyf $$0) {
      dca $$1 = $$0.q();
      ir $$2 = $$0.a();
      dtc $$3 = $$1.a_($$2);
      if (!$$3.a(dfe.gq) || $$3.c(dht.c)) {
         return bqa.d;
      } else if ($$1.C) {
         return bqa.a;
      } else {
         dtc $$4 = $$3.a(dht.c, Boolean.valueOf(true));
         dfc.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dfe.gq);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dth.b $$5 = dht.b().a($$1, $$2);
         if ($$5 != null) {
            ir $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dfe.gp.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bqa.b;
      }
   }

   @Override
   public int b(cuh $$0) {
      return 0;
   }

   @Override
   public bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      cuh $$3 = $$1.b($$2);
      ewq $$4 = a($$0, $$1, dbj.b.a);
      if ($$4.c() == ews.a.b && $$0.a_($$4.a()).a(dfe.gq)) {
         return bqb.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aqt $$5) {
            ir $$6 = $$5.a(awp.a, $$1.du(), 100, false);
            if ($$6 != null) {
               cmj $$7 = new cmj($$0, $$1.dz(), $$1.e(0.5), $$1.dF());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dxv.K, $$7.ds(), dxv.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aqu) {
                  an.n.a((aqu)$$1, $$6);
               }

               $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), avo.iv, avq.g, 0.5F, 0.4F / ($$0.F_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.du(), 0);
               $$3.a(1, $$1);
               $$1.b(avz.c.b(this));
               $$1.a($$2, true);
               return bqb.a($$3);
            }
         }

         return bqb.b($$3);
      }
   }
}
