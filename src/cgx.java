import java.util.List;

public class cgx extends civ {
   public cgx(civ.a $$0) {
      super($$0);
   }

   @Override
   public bgu<cja> a(cpq $$0, cbp $$1, bgs $$2) {
      List<bii> $$3 = $$0.a(bii.class, $$1.cG().g(2.0), $$0x -> $$0x != null && $$0x.bv() && $$0x.s() instanceof bxc);
      cja $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bii $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dp(), $$1.dr(), $$1.dv(), aoz.cj, apa.g, 1.0F, 1.0F);
         $$0.a($$1, djo.y, $$1.di());
         if ($$1 instanceof ako $$6) {
            al.Q.a($$6, $$4, $$5);
         }

         return bgu.a(this.a($$4, $$1, new cja(cjd.ut)), $$0.r_());
      } else {
         ehe $$7 = a($$0, $$1, coz.b.b);
         if ($$7.c() == ehg.a.a) {
            return bgu.c($$4);
         } else {
            if ($$7.c() == ehg.a.b) {
               gw $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bgu.c($$4);
               }

               if ($$0.b_($$8).a(apt.a)) {
                  $$0.a($$1, $$1.dp(), $$1.dr(), $$1.dv(), aoz.ci, apa.g, 1.0F, 1.0F);
                  $$0.a($$1, djo.y, $$8);
                  return bgu.a(this.a($$4, $$1, ckz.a(new cja(cjd.rv), cla.c)), $$0.r_());
               }
            }

            return bgu.c($$4);
         }
      }
   }

   protected cja a(cja $$0, cbp $$1, cja $$2) {
      $$1.b(apj.c.b(this));
      return cjc.a($$0, $$1, $$2);
   }
}
