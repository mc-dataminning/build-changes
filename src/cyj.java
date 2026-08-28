import java.util.List;

public class cyj extends czu {
   public cyj(czu.a $$0) {
      super($$0);
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      List<bwl> $$3 = $$0.a(bwl.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bJ() && $$0x.o() instanceof cmv);
      czy $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bwl $$5 = $$3.get(0);
         $$5.a($$5.e() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awp.cD, awq.g, 1.0F, 1.0F);
         $$0.a($$1, ege.y, $$1.dt());
         if ($$1 instanceof art $$6) {
            aq.T.a($$6, $$4, $$5);
         }

         return bur.a.a(this.a($$4, $$1, new czy(dac.wy)));
      } else {
         ffm $$7 = a($$0, $$1, dje.b.b);
         if ($$7.d() == ffo.a.a) {
            return bur.e;
         } else {
            if ($$7.d() == ffo.a.b) {
               iv $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bur.e;
               }

               if ($$0.b_($$8).a(axj.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awp.cC, awq.g, 1.0F, 1.0F);
                  $$0.a($$1, ege.y, $$8);
                  return bur.a.a(this.a($$4, $$1, dbu.a(dac.tt, dbv.a)));
               }
            }

            return bur.e;
         }
      }
   }

   protected czy a(czy $$0, crx $$1, czy $$2) {
      $$1.b(awz.c.b(this));
      return dab.a($$0, $$1, $$2);
   }
}
