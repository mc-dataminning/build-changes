import java.util.List;

public class cna extends coy {
   public cna(coy.a $$0) {
      super($$0);
   }

   @Override
   public blx<cpd> a(cvr $$0, chl $$1, blv $$2) {
      List<bnn> $$3 = $$0.a(bnn.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bx() && $$0x.s() instanceof ccq);
      cpd $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bnn $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), atl.cw, atm.g, 1.0F, 1.0F);
         $$0.a($$1, dpw.y, $$1.dk());
         if ($$1 instanceof aox $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return blx.a(this.a($$4, $$1, new cpd(cpg.vj)), $$0.y_());
      } else {
         env $$7 = a($$0, $$1, cva.b.b);
         if ($$7.c() == enx.a.a) {
            return blx.c($$4);
         } else {
            if ($$7.c() == enx.a.b) {
               hz $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return blx.c($$4);
               }

               if ($$0.b_($$8).a(auf.a)) {
                  $$0.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), atl.cv, atm.g, 1.0F, 1.0F);
                  $$0.a($$1, dpw.y, $$8);
                  return blx.a(this.a($$4, $$1, crb.a(new cpd(cpg.sj), crc.c)), $$0.y_());
               }
            }

            return blx.c($$4);
         }
      }
   }

   protected cpd a(cpd $$0, chl $$1, cpd $$2) {
      $$1.b(atv.c.b(this));
      return cpf.a($$0, $$1, $$2);
   }
}
