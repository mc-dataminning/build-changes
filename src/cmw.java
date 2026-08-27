import java.util.List;

public class cmw extends cou {
   public cmw(cou.a $$0) {
      super($$0);
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      List<bnl> $$3 = $$0.a(bnl.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bx() && $$0x.s() instanceof ccm);
      coz $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bnl $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atk.cv, atl.g, 1.0F, 1.0F);
         $$0.a($$1, dpp.y, $$1.dk());
         if ($$1 instanceof aow $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return blv.a(this.a($$4, $$1, new coz(cpc.vj)), $$0.y_());
      } else {
         eno $$7 = a($$0, $$1, cuw.b.b);
         if ($$7.c() == enq.a.a) {
            return blv.c($$4);
         } else {
            if ($$7.c() == enq.a.b) {
               hz $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return blv.c($$4);
               }

               if ($$0.b_($$8).a(aue.a)) {
                  $$0.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), atk.cu, atl.g, 1.0F, 1.0F);
                  $$0.a($$1, dpp.y, $$8);
                  return blv.a(this.a($$4, $$1, cqx.a(new coz(cpc.sj), cqy.c)), $$0.y_());
               }
            }

            return blv.c($$4);
         }
      }
   }

   protected coz a(coz $$0, chh $$1, coz $$2) {
      $$1.b(atu.c.b(this));
      return cpb.a($$0, $$1, $$2);
   }
}
