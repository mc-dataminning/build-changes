import java.util.List;

public class cxj extends cyu {
   public cxj(cyu.a $$0) {
      super($$0);
   }

   @Override
   public bub a(div $$0, cqy $$1, bua $$2) {
      List<bvv> $$3 = $$0.a(bvv.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bK() && $$0x.o() instanceof clw);
      cyy $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bvv $$5 = $$3.get(0);
         $$5.a($$5.e() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.cD, awo.g, 1.0F, 1.0F);
         $$0.a($$1, eez.y, $$1.dt());
         if ($$1 instanceof arr $$6) {
            ap.T.a($$6, $$4, $$5);
         }

         return bub.a.a(this.a($$4, $$1, new cyy(czc.wt)));
      } else {
         fee $$7 = a($$0, $$1, die.b.b);
         if ($$7.d() == feg.a.a) {
            return bub.e;
         } else {
            if ($$7.d() == feg.a.b) {
               iu $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bub.e;
               }

               if ($$0.b_($$8).a(axh.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awn.cC, awo.g, 1.0F, 1.0F);
                  $$0.a($$1, eez.y, $$8);
                  return bub.a.a(this.a($$4, $$1, dau.a(czc.to, dav.a)));
               }
            }

            return bub.e;
         }
      }
   }

   protected cyy a(cyy $$0, cqy $$1, cyy $$2) {
      $$1.b(awx.c.b(this));
      return czb.a($$0, $$1, $$2);
   }
}
