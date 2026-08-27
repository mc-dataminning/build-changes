import java.util.List;

public class cjg extends cle {
   public cjg(cle.a $$0) {
      super($$0);
   }

   @Override
   public biy<clj> a(csa $$0, cdu $$1, biw $$2) {
      List<bkn> $$3 = $$0.a(bkn.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bx() && $$0x.s() instanceof bzh);
      clj $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bkn $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqr.cj, aqs.g, 1.0F, 1.0F);
         $$0.a($$1, dls.y, $$1.dl());
         if ($$1 instanceof amf $$6) {
            al.Q.a($$6, $$4, $$5);
         }

         return biy.a(this.a($$4, $$1, new clj(clm.vf)), $$0.x_());
      } else {
         ejq $$7 = a($$0, $$1, crj.b.b);
         if ($$7.c() == ejs.a.a) {
            return biy.c($$4);
         } else {
            if ($$7.c() == ejs.a.b) {
               ht $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return biy.c($$4);
               }

               if ($$0.b_($$8).a(arl.a)) {
                  $$0.a($$1, $$1.ds(), $$1.du(), $$1.dy(), aqr.ci, aqs.g, 1.0F, 1.0F);
                  $$0.a($$1, dls.y, $$8);
                  return biy.a(this.a($$4, $$1, cni.a(new clj(clm.sh), cnj.c)), $$0.x_());
               }
            }

            return biy.c($$4);
         }
      }
   }

   protected clj a(clj $$0, cdu $$1, clj $$2) {
      $$1.b(arb.c.b(this));
      return cll.a($$0, $$1, $$2);
   }
}
