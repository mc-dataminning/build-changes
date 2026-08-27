import java.util.List;

public class chi extends cjg {
   public chi(cjg.a $$0) {
      super($$0);
   }

   @Override
   public bhf<cjl> a(cqb $$0, cca $$1, bhd $$2) {
      List<bit> $$3 = $$0.a(bit.class, $$1.cG().g(2.0), $$0x -> $$0x != null && $$0x.bv() && $$0x.s() instanceof bxn);
      cjl $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bit $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dq(), $$1.ds(), $$1.dw(), apg.cj, aph.g, 1.0F, 1.0F);
         $$0.a($$1, djn.y, $$1.dj());
         if ($$1 instanceof aku $$6) {
            al.Q.a($$6, $$4, $$5);
         }

         return bhf.a(this.a($$4, $$1, new cjl(cjo.ut)), $$0.w_());
      } else {
         ehd $$7 = a($$0, $$1, cpk.b.b);
         if ($$7.c() == ehf.a.a) {
            return bhf.c($$4);
         } else {
            if ($$7.c() == ehf.a.b) {
               gw $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bhf.c($$4);
               }

               if ($$0.b_($$8).a(aqa.a)) {
                  $$0.a($$1, $$1.dq(), $$1.ds(), $$1.dw(), apg.ci, aph.g, 1.0F, 1.0F);
                  $$0.a($$1, djn.y, $$8);
                  return bhf.a(this.a($$4, $$1, clk.a(new cjl(cjo.rv), cll.c)), $$0.w_());
               }
            }

            return bhf.c($$4);
         }
      }
   }

   protected cjl a(cjl $$0, cca $$1, cjl $$2) {
      $$1.b(apq.c.b(this));
      return cjn.a($$0, $$1, $$2);
   }
}
