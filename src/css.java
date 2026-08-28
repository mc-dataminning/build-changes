import java.util.List;

public class css extends cul {
   public css(cul.a $$0) {
      super($$0);
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      List<bsn> $$3 = $$0.a(bsn.class, $$1.cK().g(2.0), $$0x -> $$0x != null && $$0x.bE() && $$0x.q() instanceof cia);
      cuq $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bsn $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dt(), $$1.dv(), $$1.dz(), avp.cD, avq.g, 1.0F, 1.0F);
         $$0.a($$1, dxz.y, $$1.dm());
         if ($$1 instanceof aqv $$6) {
            an.T.a($$6, $$4, $$5);
         }

         return bqs.a(this.a($$4, $$1, new cuq(cut.vn)), $$0.x_());
      } else {
         ewy $$7 = a($$0, $$1, dcf.b.b);
         if ($$7.c() == exa.a.a) {
            return bqs.c($$4);
         } else {
            if ($$7.c() == exa.a.b) {
               jd $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bqs.c($$4);
               }

               if ($$0.b_($$8).a(awk.a)) {
                  $$0.a($$1, $$1.dt(), $$1.dv(), $$1.dz(), avp.cC, avq.g, 1.0F, 1.0F);
                  $$0.a($$1, dxz.y, $$8);
                  return bqs.a(this.a($$4, $$1, cwu.a(cut.sk, cwv.a)), $$0.x_());
               }
            }

            return bqs.c($$4);
         }
      }
   }

   protected cuq a(cuq $$0, cmx $$1, cuq $$2) {
      $$1.b(avz.c.b(this));
      return cus.a($$0, $$1, $$2);
   }
}
