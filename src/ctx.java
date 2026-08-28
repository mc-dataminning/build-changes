import java.util.List;

public class ctx extends cvn {
   public ctx(cvn.a $$0) {
      super($$0);
   }

   @Override
   public brs a(dej $$0, cnx $$1, brr $$2) {
      List<btm> $$3 = $$0.a(btm.class, $$1.cO().g(2.0), $$0x -> $$0x != null && $$0x.bI() && $$0x.q() instanceof cja);
      cvs $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         btm $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dx(), $$1.dz(), $$1.dD(), awg.cD, awh.g, 1.0F, 1.0F);
         $$0.a($$1, dzp.y, $$1.dq());
         if ($$1 instanceof ark $$6) {
            an.T.a($$6, $$4, $$5);
         }

         return brs.a.a(this.a($$4, $$1, new cvs(cvw.vp)));
      } else {
         eys $$7 = a($$0, $$1, ddr.b.b);
         if ($$7.d() == eyu.a.a) {
            return brs.e;
         } else {
            if ($$7.d() == eyu.a.b) {
               jf $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return brs.e;
               }

               if ($$0.b_($$8).a(axb.a)) {
                  $$0.a($$1, $$1.dx(), $$1.dz(), $$1.dD(), awg.cC, awh.g, 1.0F, 1.0F);
                  $$0.a($$1, dzp.y, $$8);
                  return brs.a.a(this.a($$4, $$1, cxr.a(cvw.sm, cxs.a)));
               }
            }

            return brs.e;
         }
      }
   }

   protected cvs a(cvs $$0, cnx $$1, cvs $$2) {
      $$1.b(awq.c.b(this));
      return cvv.a($$0, $$1, $$2);
   }
}
