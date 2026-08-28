import java.util.List;

public class cxy extends czj {
   public cxy(czj.a $$0) {
      super($$0);
   }

   @Override
   public bug a(djm $$0, crm $$1, buf $$2) {
      List<bwa> $$3 = $$0.a(bwa.class, $$1.cQ().g(2.0), $$0x -> $$0x != null && $$0x.bI() && $$0x.o() instanceof cmk);
      czn $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bwa $$5 = $$3.get(0);
         $$5.a($$5.e() - 0.5F);
         $$0.a(null, $$1.dz(), $$1.dB(), $$1.dF(), awn.cD, awo.g, 1.0F, 1.0F);
         $$0.a($$1, eft.y, $$1.ds());
         if ($$1 instanceof arr $$6) {
            aq.T.a($$6, $$4, $$5);
         }

         return bug.a.a(this.a($$4, $$1, new czn(czr.wy)));
      } else {
         fey $$7 = a($$0, $$1, dit.b.b);
         if ($$7.d() == ffa.a.a) {
            return bug.e;
         } else {
            if ($$7.d() == ffa.a.b) {
               iv $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bug.e;
               }

               if ($$0.b_($$8).a(axh.a)) {
                  $$0.a($$1, $$1.dz(), $$1.dB(), $$1.dF(), awn.cC, awo.g, 1.0F, 1.0F);
                  $$0.a($$1, eft.y, $$8);
                  return bug.a.a(this.a($$4, $$1, dbj.a(czr.tt, dbk.a)));
               }
            }

            return bug.e;
         }
      }
   }

   protected czn a(czn $$0, crm $$1, czn $$2) {
      $$1.b(awx.c.b(this));
      return czq.a($$0, $$1, $$2);
   }
}
