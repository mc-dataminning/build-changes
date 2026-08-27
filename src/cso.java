public class cso extends ctj {
   public cso(ctj.a $$0) {
      super($$0);
   }

   @Override
   public bpu a(cxb $$0) {
      dax $$1 = $$0.q();
      io $$2 = $$0.a();
      drb $$3 = $$1.a_($$2);
      if (!$$3.a(dea.fy) || $$3.c(dgn.c)) {
         return bpu.d;
      } else if ($$1.B) {
         return bpu.a;
      } else {
         drb $$4 = $$3.a(dgn.c, Boolean.valueOf(true));
         ddy.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dea.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         drg.b $$5 = dgn.b().a($$1, $$2);
         if ($$5 != null) {
            io $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dea.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bpu.b;
      }
   }

   @Override
   public int b(cto $$0) {
      return 0;
   }

   @Override
   public bpv<cto> a(dax $$0, clw $$1, bpt $$2) {
      cto $$3 = $$1.b($$2);
      eug $$4 = a($$0, $$1, dag.b.a);
      if ($$4.c() == eui.a.b && $$0.a_($$4.a()).a(dea.fy)) {
         return bpv.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aqm $$5) {
            io $$6 = $$5.a(awh.a, $$1.dp(), 100, false);
            if ($$6 != null) {
               cmh $$7 = new cmh($$0, $$1.du(), $$1.e(0.5), $$1.dA());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dvu.K, $$7.dn(), dvu.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aqn) {
                  am.n.a((aqn)$$1, $$6);
               }

               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avh.ii, avi.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dp(), 0);
               $$3.a(1, $$1);
               $$1.b(avr.c.b(this));
               $$1.a($$2, true);
               return bpv.a($$3);
            }
         }

         return bpv.b($$3);
      }
   }
}
