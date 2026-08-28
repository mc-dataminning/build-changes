import java.util.List;

public class cxv extends czg {
   public cxv(czg.a $$0) {
      super($$0);
   }

   @Override
   public bug a(djh $$0, crj $$1, buf $$2) {
      List<bwa> $$3 = $$0.a(bwa.class, $$1.cQ().g(2.0), $$0x -> $$0x != null && $$0x.bI() && $$0x.o() instanceof cmh);
      czk $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bwa $$5 = $$3.get(0);
         $$5.a($$5.e() - 0.5F);
         $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awn.cD, awo.g, 1.0F, 1.0F);
         $$0.a($$1, efo.y, $$1.ds());
         if ($$1 instanceof arr $$6) {
            aq.T.a($$6, $$4, $$5);
         }

         return bug.a.a(this.a($$4, $$1, new czk(czo.wy)));
      } else {
         fet $$7 = a($$0, $$1, diq.b.b);
         if ($$7.d() == fev.a.a) {
            return bug.e;
         } else {
            if ($$7.d() == fev.a.b) {
               iv $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bug.e;
               }

               if ($$0.b_($$8).a(axh.a)) {
                  $$0.a($$1, $$1.dz(), $$1.dB(), $$1.dF(), awn.cC, awo.g, 1.0F, 1.0F);
                  $$0.a($$1, efo.y, $$8);
                  return bug.a.a(this.a($$4, $$1, dbg.a(czo.tt, dbh.a)));
               }
            }

            return bug.e;
         }
      }
   }

   protected czk a(czk $$0, crj $$1, czk $$2) {
      $$1.b(awx.c.b(this));
      return czn.a($$0, $$1, $$2);
   }
}
