import java.util.List;

public class cyv extends dag {
   public cyv(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      List<bww> $$3 = $$0.a(bww.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bJ() && $$0x.n() instanceof cng);
      dak $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bww $$5 = $$3.get(0);
         $$5.a($$5.c() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awy.cD, awz.g, 1.0F, 1.0F);
         $$0.a($$1, egq.y, $$1.dt());
         if ($$1 instanceof asc $$6) {
            aq.T.a($$6, $$4, $$5);
         }

         return bvc.a.a(this.a($$4, $$1, new dak(dao.wy)));
      } else {
         ffy $$7 = a($$0, $$1, djq.b.b);
         if ($$7.d() == fga.a.a) {
            return bvc.e;
         } else {
            if ($$7.d() == fga.a.b) {
               iw $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bvc.e;
               }

               if ($$0.b_($$8).a(axs.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awy.cC, awz.g, 1.0F, 1.0F);
                  $$0.a($$1, egq.y, $$8);
                  return bvc.a.a(this.a($$4, $$1, dcg.a(dao.tt, dch.a)));
               }
            }

            return bvc.e;
         }
      }
   }

   protected dak a(dak $$0, csi $$1, dak $$2) {
      $$1.b(axi.c.b(this));
      return dan.a($$0, $$1, $$2);
   }
}
