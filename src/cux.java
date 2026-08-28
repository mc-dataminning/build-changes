import java.util.List;

public class cux extends cwk {
   public cux(cwk.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dgh $$0, cow $$1, bsi $$2) {
      List<bud> $$3 = $$0.a(bud.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bL() && $$0x.n() instanceof cju);
      cwo $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bud $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awa.cD, awb.g, 1.0F, 1.0F);
         $$0.a($$1, ebs.y, $$1.dt());
         if ($$1 instanceof are $$6) {
            ap.T.a($$6, $$4, $$5);
         }

         return bsj.a.a(this.a($$4, $$1, new cwo(cws.wn)));
      } else {
         fav $$7 = a($$0, $$1, dfp.b.b);
         if ($$7.d() == fax.a.a) {
            return bsj.e;
         } else {
            if ($$7.d() == fax.a.b) {
               ji $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bsj.e;
               }

               if ($$0.b_($$8).a(awv.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awa.cC, awb.g, 1.0F, 1.0F);
                  $$0.a($$1, ebs.y, $$8);
                  return bsj.a.a(this.a($$4, $$1, cyn.a(cws.ti, cyo.a)));
               }
            }

            return bsj.e;
         }
      }
   }

   protected cwo a(cwo $$0, cow $$1, cwo $$2) {
      $$1.b(awk.c.b(this));
      return cwr.a($$0, $$1, $$2);
   }
}
