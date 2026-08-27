public class csq extends ctl {
   public csq(ctl.a $$0) {
      super($$0);
   }

   @Override
   public bpw a(cxd $$0) {
      daz $$1 = $$0.q();
      io $$2 = $$0.a();
      drd $$3 = $$1.a_($$2);
      if (!$$3.a(dec.fy) || $$3.c(dgp.c)) {
         return bpw.d;
      } else if ($$1.B) {
         return bpw.a;
      } else {
         drd $$4 = $$3.a(dgp.c, Boolean.valueOf(true));
         dea.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dec.fy);
         $$0.n().h(1);
         $$1.c(1503, $$2, 0);
         dri.b $$5 = dgp.b().a($$1, $$2);
         if ($$5 != null) {
            io $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dec.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bpw.b;
      }
   }

   @Override
   public int b(ctq $$0) {
      return 0;
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      eui $$4 = a($$0, $$1, dai.b.a);
      if ($$4.c() == euk.a.b && $$0.a_($$4.a()).a(dec.fy)) {
         return bpx.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof aqn $$5) {
            io $$6 = $$5.a(awi.a, $$1.dp(), 100, false);
            if ($$6 != null) {
               cmj $$7 = new cmj($$0, $$1.du(), $$1.e(0.5), $$1.dA());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dvw.K, $$7.dn(), dvw.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof aqo) {
                  am.n.a((aqo)$$1, $$6);
               }

               $$0.a(null, $$1.du(), $$1.dw(), $$1.dA(), avi.ii, avj.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dp(), 0);
               $$3.a(1, $$1);
               $$1.b(avs.c.b(this));
               $$1.a($$2, true);
               return bpx.a($$3);
            }
         }

         return bpx.b($$3);
      }
   }
}
