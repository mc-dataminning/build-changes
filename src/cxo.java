import java.util.List;

public class cxo extends cyz {
   public cxo(cyz.a $$0) {
      super($$0);
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      List<bvx> $$3 = $$0.a(bvx.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bK() && $$0x.o() instanceof cma);
      czd $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bvx $$5 = $$3.get(0);
         $$5.a($$5.e() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awn.cD, awo.g, 1.0F, 1.0F);
         $$0.a($$1, efh.y, $$1.dt());
         if ($$1 instanceof arr $$6) {
            ap.T.a($$6, $$4, $$5);
         }

         return bud.a.a(this.a($$4, $$1, new czd(czh.wy)));
      } else {
         fem $$7 = a($$0, $$1, dij.b.b);
         if ($$7.d() == feo.a.a) {
            return bud.e;
         } else {
            if ($$7.d() == feo.a.b) {
               iu $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bud.e;
               }

               if ($$0.b_($$8).a(axh.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awn.cC, awo.g, 1.0F, 1.0F);
                  $$0.a($$1, efh.y, $$8);
                  return bud.a.a(this.a($$4, $$1, daz.a(czh.tt, dba.a)));
               }
            }

            return bud.e;
         }
      }
   }

   protected czd a(czd $$0, crc $$1, czd $$2) {
      $$1.b(awx.c.b(this));
      return czg.a($$0, $$1, $$2);
   }
}
