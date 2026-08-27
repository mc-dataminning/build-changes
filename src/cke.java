import java.util.List;

public class cke extends cmc {
   public cke(cmc.a $$0) {
      super($$0);
   }

   @Override
   public bjm<cmh> a(csy $$0, cer $$1, bjk $$2) {
      List<blc> $$3 = $$0.a(blc.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bx() && $$0x.s() instanceof bzy);
      cmh $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         blc $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arc.cj, ard.g, 1.0F, 1.0F);
         $$0.a($$1, dmz.y, $$1.dk());
         if ($$1 instanceof amq $$6) {
            am.R.a($$6, $$4, $$5);
         }

         return bjm.a(this.a($$4, $$1, new cmh(cmk.vg)), $$0.y_());
      } else {
         ekx $$7 = a($$0, $$1, csh.b.b);
         if ($$7.c() == ekz.a.a) {
            return bjm.c($$4);
         } else {
            if ($$7.c() == ekz.a.b) {
               hv $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bjm.c($$4);
               }

               if ($$0.b_($$8).a(arw.a)) {
                  $$0.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), arc.ci, ard.g, 1.0F, 1.0F);
                  $$0.a($$1, dmz.y, $$8);
                  return bjm.a(this.a($$4, $$1, cog.a(new cmh(cmk.sh), coh.c)), $$0.y_());
               }
            }

            return bjm.c($$4);
         }
      }
   }

   protected cmh a(cmh $$0, cer $$1, cmh $$2) {
      $$1.b(arm.c.b(this));
      return cmj.a($$0, $$1, $$2);
   }
}
