import java.util.List;

public class cpu extends crn {
   public cpu(crn.a $$0) {
      super($$0);
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      List<bpw> $$3 = $$0.a(bpw.class, $$1.cH().g(2.0), $$0x -> $$0x != null && $$0x.bA() && $$0x.r() instanceof cfe);
      crs $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bpw $$5 = $$3.get(0);
         $$5.a($$5.g() - 0.5F);
         $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), auo.cD, aup.g, 1.0F, 1.0F);
         $$0.a($$1, dub.y, $$1.dk());
         if ($$1 instanceof apv $$6) {
            am.T.a($$6, $$4, $$5);
         }

         return bog.a(this.a($$4, $$1, new crs(crv.vl)), $$0.x_());
      } else {
         esf $$7 = a($$0, $$1, cyp.b.b);
         if ($$7.c() == esh.a.a) {
            return bog.c($$4);
         } else {
            if ($$7.c() == esh.a.b) {
               id $$8 = $$7.a();
               if (!$$0.a($$1, $$8)) {
                  return bog.c($$4);
               }

               if ($$0.b_($$8).a(avj.a)) {
                  $$0.a($$1, $$1.dr(), $$1.dt(), $$1.dx(), auo.cC, aup.g, 1.0F, 1.0F);
                  $$0.a($$1, dub.y, $$8);
                  return bog.a(this.a($$4, $$1, ctq.a(crv.sj, ctr.a)), $$0.x_());
               }
            }

            return bog.c($$4);
         }
      }
   }

   protected crs a(crs $$0, cka $$1, crs $$2) {
      $$1.b(auz.c.b(this));
      return cru.a($$0, $$1, $$2);
   }
}
