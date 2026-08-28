import java.util.List;

public class cvr extends cxd {
   public cvr(cxd.a $$0) {
      super($$0);
   }

   @Override
   public bsy a(dgz $$0, cpr $$1, bsx $$2) {
      List<bus> $$3 = $$0.a(bus.class, $$1.cQ().g(2.0), $$0x -> $$0x != null && $$0x.bJ() && $$0x.o() instanceof ckp);
      cxh $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bus $$5 = $$3.get(0);
         $$5.a($$5.e() - 0.5F);
         $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awa.cD, awb.g, 1.0F, 1.0F);
         $$0.a($$1, ecp.y, $$1.ds());
         if ($$1 instanceof are $$6) {
            ap.T.a($$6, $$4, $$5);
         }

         return bsy.a.a(this.a($$4, $$1, new cxh(cxl.wp)));
      } else {
         fbt $$7 = a($$0, $$1, dgi.b.b);
         if ($$7.d() == fbv.a.a) {
            return bsy.e;
         } else {
            if ($$7.d() == fbv.a.b) {
               ji $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bsy.e;
               }

               if ($$0.b_($$8).a(awv.a)) {
                  $$0.a($$1, $$1.dz(), $$1.dB(), $$1.dF(), awa.cC, awb.g, 1.0F, 1.0F);
                  $$0.a($$1, ecp.y, $$8);
                  return bsy.a.a(this.a($$4, $$1, cze.a(cxl.tk, czf.a)));
               }
            }

            return bsy.e;
         }
      }
   }

   protected cxh a(cxh $$0, cpr $$1, cxh $$2) {
      $$1.b(awk.c.b(this));
      return cxk.a($$0, $$1, $$2);
   }
}
