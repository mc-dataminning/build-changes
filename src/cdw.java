import java.util.List;

public class cdw extends cfu {
   public cdw(cfu.a $$0) {
      super($$0);
   }

   @Override
   public bdy<cfz> a(cmm $$0, byo $$1, bdw $$2) {
      List<bfg> $$3 = $$0.a(bfg.class, $$1.cE().g(2.0), $$0x -> $$0x != null && $$0x.bs() && $$0x.s() instanceof bub);
      cfz $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bfg $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dn(), $$1.dp(), $$1.dt(), amh.cj, ami.g, 1.0F, 1.0F);
         $$0.a($$1, dgl.z, $$1.dg());
         if ($$1 instanceof aig $$6) {
            ai.Q.a($$6, $$4, $$5);
         }

         return bdy.a(this.a($$4, $$1, new cfz(cgc.ut)), $$0.r_());
      } else {
         eee $$7 = a($$0, $$1, clv.b.b);
         if ($$7.c() == eeg.a.a) {
            return bdy.c($$4);
         } else {
            if ($$7.c() == eeg.a.b) {
               gu $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bdy.c($$4);
               }

               if ($$0.b_($$8).a(anb.a)) {
                  $$0.a($$1, $$1.dn(), $$1.dp(), $$1.dt(), amh.ci, ami.g, 1.0F, 1.0F);
                  $$0.a($$1, dgl.z, $$8);
                  return bdy.a(this.a($$4, $$1, chy.a(new cfz(cgc.rv), chz.c)), $$0.r_());
               }
            }

            return bdy.c($$4);
         }
      }
   }

   protected cfz a(cfz $$0, byo $$1, cfz $$2) {
      $$1.b(amr.c.b(this));
      return cgb.a($$0, $$1, $$2);
   }
}
