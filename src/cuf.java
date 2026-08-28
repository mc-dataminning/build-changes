import java.util.List;

public class cuf extends cvt {
   public cuf(cvt.a $$0) {
      super($$0);
   }

   @Override
   public bry a(dev $$0, coh $$1, brx $$2) {
      List<bts> $$3 = $$0.a(bts.class, $$1.cS().g(2.0), $$0x -> $$0x != null && $$0x.bM() && $$0x.q() instanceof cjj);
      cvx $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bts $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dC(), $$1.dE(), $$1.dI(), awk.cD, awl.g, 1.0F, 1.0F);
         $$0.a($$1, eaa.y, $$1.dv());
         if ($$1 instanceof arn $$6) {
            an.T.a($$6, $$4, $$5);
         }

         return bry.a.a(this.a($$4, $$1, new cvx(cwb.vp)));
      } else {
         ezd $$7 = a($$0, $$1, ded.b.b);
         if ($$7.d() == ezf.a.a) {
            return bry.e;
         } else {
            if ($$7.d() == ezf.a.b) {
               jg $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return bry.e;
               }

               if ($$0.b_($$8).a(axf.a)) {
                  $$0.a($$1, $$1.dC(), $$1.dE(), $$1.dI(), awk.cC, awl.g, 1.0F, 1.0F);
                  $$0.a($$1, eaa.y, $$8);
                  return bry.a.a(this.a($$4, $$1, cxw.a(cwb.sm, cxx.a)));
               }
            }

            return bry.e;
         }
      }
   }

   protected cvx a(cvx $$0, coh $$1, cvx $$2) {
      $$1.b(awu.c.b(this));
      return cwa.a($$0, $$1, $$2);
   }
}
