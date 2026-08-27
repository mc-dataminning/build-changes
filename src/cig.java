import java.util.List;

public class cig extends cke {
   public cig(cke.a $$0) {
      super($$0);
   }

   @Override
   public bic<ckj> a(cqz $$0, ccx $$1, bia $$2) {
      List<bjq> $$3 = $$0.a(bjq.class, $$1.cG().g(2.0), $$0x -> $$0x != null && $$0x.bv() && $$0x.s() instanceof byk);
      ckj $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bjq $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), aqd.cj, aqe.g, 1.0F, 1.0F);
         $$0.a($$1, dkl.y, $$1.dj());
         if ($$1 instanceof alr $$6) {
            al.Q.a($$6, $$4, $$5);
         }

         return bic.a(this.a($$4, $$1, new ckj(ckm.ut)), $$0.x_());
      } else {
         eib $$7 = a($$0, $$1, cqi.b.b);
         if ($$7.c() == eid.a.a) {
            return bic.c($$4);
         } else {
            if ($$7.c() == eid.a.b) {
               ht $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bic.c($$4);
               }

               if ($$0.b_($$8).a(aqx.a)) {
                  $$0.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), aqd.ci, aqe.g, 1.0F, 1.0F);
                  $$0.a($$1, dkl.y, $$8);
                  return bic.a(this.a($$4, $$1, cmi.a(new ckj(ckm.rv), cmj.c)), $$0.x_());
               }
            }

            return bic.c($$4);
         }
      }
   }

   protected ckj a(ckj $$0, ccx $$1, ckj $$2) {
      $$1.b(aqn.c.b(this));
      return ckl.a($$0, $$1, $$2);
   }
}
