import java.util.List;

public class cjl extends clj {
   public cjl(clj.a $$0) {
      super($$0);
   }

   @Override
   public bjc<clo> a(csf $$0, cdz $$1, bja $$2) {
      List<bks> $$3 = $$0.a(bks.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bx() && $$0x.s() instanceof bzm);
      clo $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bks $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.ds(), $$1.du(), $$1.dy(), aqv.cj, aqw.g, 1.0F, 1.0F);
         $$0.a($$1, dlx.y, $$1.dl());
         if ($$1 instanceof amj $$6) {
            al.Q.a($$6, $$4, $$5);
         }

         return bjc.a(this.a($$4, $$1, new clo(clr.vf)), $$0.y_());
      } else {
         ejv $$7 = a($$0, $$1, cro.b.b);
         if ($$7.c() == ejx.a.a) {
            return bjc.c($$4);
         } else {
            if ($$7.c() == ejx.a.b) {
               hx $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bjc.c($$4);
               }

               if ($$0.b_($$8).a(arp.a)) {
                  $$0.a($$1, $$1.ds(), $$1.du(), $$1.dy(), aqv.ci, aqw.g, 1.0F, 1.0F);
                  $$0.a($$1, dlx.y, $$8);
                  return bjc.a(this.a($$4, $$1, cnn.a(new clo(clr.sh), cno.c)), $$0.y_());
               }
            }

            return bjc.c($$4);
         }
      }
   }

   protected clo a(clo $$0, cdz $$1, clo $$2) {
      $$1.b(arf.c.b(this));
      return clq.a($$0, $$1, $$2);
   }
}
