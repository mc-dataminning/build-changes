import java.util.List;

public class cku extends cms {
   public cku(cms.a $$0) {
      super($$0);
   }

   @Override
   public bkb<cmx> a(cto $$0, cfh $$1, bjz $$2) {
      List<blr> $$3 = $$0.a(blr.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bx() && $$0x.s() instanceof can);
      cmx $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         blr $$5 = $$3.get(0);
         $$5.a($$5.h() - 0.5F);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), arr.cj, ars.g, 1.0F, 1.0F);
         $$0.a($$1, dnq.y, $$1.dk());
         if ($$1 instanceof ane $$6) {
            am.R.a($$6, $$4, $$5);
         }

         return bkb.a(this.a($$4, $$1, new cmx(cna.vg)), $$0.y_());
      } else {
         elo $$7 = a($$0, $$1, csx.b.b);
         if ($$7.c() == elq.a.a) {
            return bkb.c($$4);
         } else {
            if ($$7.c() == elq.a.b) {
               hx $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bkb.c($$4);
               }

               if ($$0.b_($$8).a(asl.a)) {
                  $$0.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), arr.ci, ars.g, 1.0F, 1.0F);
                  $$0.a($$1, dnq.y, $$8);
                  return bkb.a(this.a($$4, $$1, cox.a(new cmx(cna.sh), coy.c)), $$0.y_());
               }
            }

            return bkb.c($$4);
         }
      }
   }

   protected cmx a(cmx $$0, cfh $$1, cmx $$2) {
      $$1.b(asb.c.b(this));
      return cmz.a($$0, $$1, $$2);
   }
}
