import java.util.List;

public class cle extends cnb {
   public cle(cnb.a $$0) {
      super($$0);
   }

   @Override
   public bkd<cng> a(ctx $$0, cfq $$1, bkb $$2) {
      List<blt> $$3 = $$0.a(blt.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bx() && $$0x.s() instanceof cav);
      cng $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         blt $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), art.cv, aru.g, 1.0F, 1.0F);
         $$0.a($$1, dnz.y, $$1.dj());
         if ($$1 instanceof anf $$6) {
            am.R.a($$6, $$4, $$5);
         }

         return bkd.a(this.a($$4, $$1, new cng(cnj.vj)), $$0.y_());
      } else {
         ely $$7 = a($$0, $$1, ctg.b.b);
         if ($$7.c() == ema.a.a) {
            return bkd.c($$4);
         } else {
            if ($$7.c() == ema.a.b) {
               hx $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bkd.c($$4);
               }

               if ($$0.b_($$8).a(asn.a)) {
                  $$0.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), art.cu, aru.g, 1.0F, 1.0F);
                  $$0.a($$1, dnz.y, $$8);
                  return bkd.a(this.a($$4, $$1, cpg.a(new cng(cnj.sj), cph.c)), $$0.y_());
               }
            }

            return bkd.c($$4);
         }
      }
   }

   protected cng a(cng $$0, cfq $$1, cng $$2) {
      $$1.b(asd.c.b(this));
      return cni.a($$0, $$1, $$2);
   }
}
