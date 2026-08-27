import java.util.List;

public class ciy extends ckw {
   public ciy(ckw.a $$0) {
      super($$0);
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      List<bkf> $$3 = $$0.a(bkf.class, $$1.cG().g(2.0), $$0x -> $$0x != null && $$0x.bv() && $$0x.s() instanceof byz);
      clb $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bkf $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), aqn.cj, aqo.g, 1.0F, 1.0F);
         $$0.a($$1, dlg.y, $$1.dj());
         if ($$1 instanceof amb $$6) {
            al.Q.a($$6, $$4, $$5);
         }

         return bir.a(this.a($$4, $$1, new clb(cle.uu)), $$0.x_());
      } else {
         eje $$7 = a($$0, $$1, crb.b.b);
         if ($$7.c() == ejg.a.a) {
            return bir.c($$4);
         } else {
            if ($$7.c() == ejg.a.b) {
               ht $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bir.c($$4);
               }

               if ($$0.b_($$8).a(arh.a)) {
                  $$0.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), aqn.ci, aqo.g, 1.0F, 1.0F);
                  $$0.a($$1, dlg.y, $$8);
                  return bir.a(this.a($$4, $$1, cna.a(new clb(cle.rw), cnb.c)), $$0.x_());
               }
            }

            return bir.c($$4);
         }
      }
   }

   protected clb a(clb $$0, cdm $$1, clb $$2) {
      $$1.b(aqx.c.b(this));
      return cld.a($$0, $$1, $$2);
   }
}
