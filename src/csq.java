import java.util.List;

public class csq extends cuj {
   public csq(cuj.a $$0) {
      super($$0);
   }

   @Override
   public bqr<cuo> a(dcu $$0, cmv $$1, bqp $$2) {
      List<bsm> $$3 = $$0.a(bsm.class, $$1.cL().g(2.0), $$0x -> $$0x != null && $$0x.bE() && $$0x.q() instanceof chy);
      cuo $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bsm $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dv(), $$1.dx(), $$1.dB(), avo.cD, avp.g, 1.0F, 1.0F);
         $$0.a($$1, dxw.y, $$1.do());
         if ($$1 instanceof aqu $$6) {
            an.T.a($$6, $$4, $$5);
         }

         return bqr.a(this.a($$4, $$1, new cuo(cur.vn)), $$0.x_());
      } else {
         ews $$7 = a($$0, $$1, dcd.b.b);
         if ($$7.c() == ewu.a.a) {
            return bqr.c($$4);
         } else {
            if ($$7.c() == ewu.a.b) {
               jd $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqr.c($$4);
               }

               if ($$0.b_($$8).a(awj.a)) {
                  $$0.a($$1, $$1.dv(), $$1.dx(), $$1.dB(), avo.cC, avp.g, 1.0F, 1.0F);
                  $$0.a($$1, dxw.y, $$8);
                  return bqr.a(this.a($$4, $$1, cws.a(cur.sk, cwt.a)), $$0.x_());
               }
            }

            return bqr.c($$4);
         }
      }
   }

   protected cuo a(cuo $$0, cmv $$1, cuo $$2) {
      $$1.b(avy.c.b(this));
      return cuq.a($$0, $$1, $$2);
   }
}
