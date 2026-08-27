import java.util.List;

public class cgu extends cis {
   public cgu(cis.a $$0) {
      super($$0);
   }

   @Override
   public bgr<cix> a(cpl $$0, cbm $$1, bgp $$2) {
      List<bif> $$3 = $$0.a(bif.class, $$1.cG().g(2.0), $$0x -> $$0x != null && $$0x.bv() && $$0x.s() instanceof bwz);
      cix $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bif $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aow.cj, aox.g, 1.0F, 1.0F);
         $$0.a($$1, djj.y, $$1.di());
         if ($$1 instanceof akl $$6) {
            ai.Q.a($$6, $$4, $$5);
         }

         return bgr.a(this.a($$4, $$1, new cix(cja.ut)), $$0.r_());
      } else {
         egz $$7 = a($$0, $$1, cou.b.b);
         if ($$7.c() == ehb.a.a) {
            return bgr.c($$4);
         } else {
            if ($$7.c() == ehb.a.b) {
               gu $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bgr.c($$4);
               }

               if ($$0.b_($$8).a(apq.a)) {
                  $$0.a($$1, $$1.dp(), $$1.dr(), $$1.dv(), aow.ci, aox.g, 1.0F, 1.0F);
                  $$0.a($$1, djj.y, $$8);
                  return bgr.a(this.a($$4, $$1, ckw.a(new cix(cja.rv), ckx.c)), $$0.r_());
               }
            }

            return bgr.c($$4);
         }
      }
   }

   protected cix a(cix $$0, cbm $$1, cix $$2) {
      $$1.b(apg.c.b(this));
      return ciz.a($$0, $$1, $$2);
   }
}
