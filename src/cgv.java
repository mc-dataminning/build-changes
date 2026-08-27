import java.util.List;

public class cgv extends cit {
   public cgv(cit.a $$0) {
      super($$0);
   }

   @Override
   public bgr<ciy> a(cpm $$0, cbn $$1, bgp $$2) {
      List<bif> $$3 = $$0.a(bif.class, $$1.cG().g(2.0), $$0x -> $$0x != null && $$0x.bv() && $$0x.s() instanceof bxa);
      ciy $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bif $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aow.cj, aox.g, 1.0F, 1.0F);
         $$0.a($$1, djk.y, $$1.di());
         if ($$1 instanceof akl $$6) {
            ai.Q.a($$6, $$4, $$5);
         }

         return bgr.a(this.a($$4, $$1, new ciy(cjb.ut)), $$0.r_());
      } else {
         eha $$7 = a($$0, $$1, cov.b.b);
         if ($$7.c() == ehc.a.a) {
            return bgr.c($$4);
         } else {
            if ($$7.c() == ehc.a.b) {
               gu $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bgr.c($$4);
               }

               if ($$0.b_($$8).a(apq.a)) {
                  $$0.a($$1, $$1.dp(), $$1.dr(), $$1.dv(), aow.ci, aox.g, 1.0F, 1.0F);
                  $$0.a($$1, djk.y, $$8);
                  return bgr.a(this.a($$4, $$1, ckx.a(new ciy(cjb.rv), cky.c)), $$0.r_());
               }
            }

            return bgr.c($$4);
         }
      }
   }

   protected ciy a(ciy $$0, cbn $$1, ciy $$2) {
      $$1.b(apg.c.b(this));
      return cja.a($$0, $$1, $$2);
   }
}
