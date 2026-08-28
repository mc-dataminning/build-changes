import java.util.List;

public class cwi extends cxu {
   public cwi(cxu.a $$0) {
      super($$0);
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      List<bvk> $$3 = $$0.a(bvk.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bK() && $$0x.o() instanceof clg);
      cxy $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bvk $$5 = $$3.get(0);
         $$5.a($$5.e() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awk.cD, awl.g, 1.0F, 1.0F);
         $$0.a($$1, edm.y, $$1.dt());
         if ($$1 instanceof aro $$6) {
            ap.T.a($$6, $$4, $$5);
         }

         return btq.a.a(this.a($$4, $$1, new cxy(cyc.wr)));
      } else {
         fcq $$7 = a($$0, $$1, dgy.b.b);
         if ($$7.d() == fcs.a.a) {
            return btq.e;
         } else {
            if ($$7.d() == fcs.a.b) {
               jj $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return btq.e;
               }

               if ($$0.b_($$8).a(axf.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awk.cC, awl.g, 1.0F, 1.0F);
                  $$0.a($$1, edm.y, $$8);
                  return btq.a.a(this.a($$4, $$1, czu.a(cyc.tm, czv.a)));
               }
            }

            return btq.e;
         }
      }
   }

   protected cxy a(cxy $$0, cqi $$1, cxy $$2) {
      $$1.b(awu.c.b(this));
      return cyb.a($$0, $$1, $$2);
   }
}
