import java.util.List;

public class cqf extends cry {
   public cqf(cry.a $$0) {
      super($$0);
   }

   @Override
   public bor<csd> a(czu $$0, ckl $$1, bop $$2) {
      List<bqh> $$3 = $$0.a(bqh.class, $$1.cI().g(2.0), $$0x -> $$0x != null && $$0x.bB() && $$0x.r() instanceof cfp);
      csd $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bqh $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), auz.cD, ava.g, 1.0F, 1.0F);
         $$0.a($$1, dur.y, $$1.dl());
         if ($$1 instanceof aqf $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bor.a(this.a($$4, $$1, new csd(csg.vn)), $$0.x_());
      } else {
         etb $$7 = a($$0, $$1, czd.b.b);
         if ($$7.c() == etd.a.a) {
            return bor.c($$4);
         } else {
            if ($$7.c() == etd.a.b) {
               im $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bor.c($$4);
               }

               if ($$0.b_($$8).a(avt.a)) {
                  $$0.a($$1, $$1.ds(), $$1.du(), $$1.dy(), auz.cC, ava.g, 1.0F, 1.0F);
                  $$0.a($$1, dur.y, $$8);
                  return bor.a(this.a($$4, $$1, cuc.a(csg.sk, cud.a)), $$0.x_());
               }
            }

            return bor.c($$4);
         }
      }
   }

   protected csd a(csd $$0, ckl $$1, csd $$2) {
      $$1.b(avj.c.b(this));
      return csf.a($$0, $$1, $$2);
   }
}
