import java.util.List;

public class chc extends cja {
   public chc(cja.a $$0) {
      super($$0);
   }

   @Override
   public bgz<cjf> a(cpv $$0, cbu $$1, bgx $$2) {
      List<bin> $$3 = $$0.a(bin.class, $$1.cG().g(2.0), $$0x -> $$0x != null && $$0x.bv() && $$0x.s() instanceof bxh);
      cjf $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bin $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apd.cj, ape.g, 1.0F, 1.0F);
         $$0.a($$1, djt.y, $$1.dj());
         if ($$1 instanceof akr $$6) {
            al.Q.a($$6, $$4, $$5);
         }

         return bgz.a(this.a($$4, $$1, new cjf(cji.ut)), $$0.w_());
      } else {
         ehj $$7 = a($$0, $$1, cpe.b.b);
         if ($$7.c() == ehl.a.a) {
            return bgz.c($$4);
         } else {
            if ($$7.c() == ehl.a.b) {
               gw $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bgz.c($$4);
               }

               if ($$0.b_($$8).a(apx.a)) {
                  $$0.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), apd.ci, ape.g, 1.0F, 1.0F);
                  $$0.a($$1, djt.y, $$8);
                  return bgz.a(this.a($$4, $$1, cle.a(new cjf(cji.rv), clf.c)), $$0.w_());
               }
            }

            return bgz.c($$4);
         }
      }
   }

   protected cjf a(cjf $$0, cbu $$1, cjf $$2) {
      $$1.b(apn.c.b(this));
      return cjh.a($$0, $$1, $$2);
   }
}
