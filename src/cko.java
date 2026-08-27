import java.util.List;

public class cko extends cmm {
   public cko(cmm.a $$0) {
      super($$0);
   }

   @Override
   public bjw<cmr> a(cti $$0, cfb $$1, bju $$2) {
      List<blm> $$3 = $$0.a(blm.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bx() && $$0x.s() instanceof cai);
      cmr $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         blm $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arm.cj, arn.g, 1.0F, 1.0F);
         $$0.a($$1, dnk.y, $$1.dk());
         if ($$1 instanceof ana $$6) {
            am.R.a($$6, $$4, $$5);
         }

         return bjw.a(this.a($$4, $$1, new cmr(cmu.vg)), $$0.y_());
      } else {
         eli $$7 = a($$0, $$1, csr.b.b);
         if ($$7.c() == elk.a.a) {
            return bjw.c($$4);
         } else {
            if ($$7.c() == elk.a.b) {
               hx $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bjw.c($$4);
               }

               if ($$0.b_($$8).a(asg.a)) {
                  $$0.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), arm.ci, arn.g, 1.0F, 1.0F);
                  $$0.a($$1, dnk.y, $$8);
                  return bjw.a(this.a($$4, $$1, cor.a(new cmr(cmu.sh), cos.c)), $$0.y_());
               }
            }

            return bjw.c($$4);
         }
      }
   }

   protected cmr a(cmr $$0, cfb $$1, cmr $$2) {
      $$1.b(arw.c.b(this));
      return cmt.a($$0, $$1, $$2);
   }
}
