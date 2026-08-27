import java.util.List;

public class coj extends cqf {
   public coj(cqf.a $$0) {
      super($$0);
   }

   @Override
   public bnd<cqk> a(cwz $$0, cis $$1, bnb $$2) {
      List<bot> $$3 = $$0.a(bot.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bA() && $$0x.r() instanceof cdx);
      cqk $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bot $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), aty.cy, atz.g, 1.0F, 1.0F);
         $$0.a($$1, drn.y, $$1.dk());
         if ($$1 instanceof apg $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bnd.a(this.a($$4, $$1, new cqk(cqn.vk)), $$0.x_());
      } else {
         epn $$7 = a($$0, $$1, cwi.b.b);
         if ($$7.c() == epp.a.a) {
            return bnd.c($$4);
         } else {
            if ($$7.c() == epp.a.b) {
               ib $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bnd.c($$4);
               }

               if ($$0.b_($$8).a(aus.a)) {
                  $$0.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), aty.cx, atz.g, 1.0F, 1.0F);
                  $$0.a($$1, drn.y, $$8);
                  return bnd.a(this.a($$4, $$1, csj.a(new cqk(cqn.sj), csk.c)), $$0.x_());
               }
            }

            return bnd.c($$4);
         }
      }
   }

   protected cqk a(cqk $$0, cis $$1, cqk $$2) {
      $$1.b(aui.c.b(this));
      return cqm.a($$0, $$1, $$2);
   }
}
