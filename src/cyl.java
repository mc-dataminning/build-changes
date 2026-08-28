import java.util.List;

public class cyl extends czw {
   public cyl(czw.a $$0) {
      super($$0);
   }

   @Override
   public but a(djz $$0, crz $$1, bus $$2) {
      List<bwn> $$3 = $$0.a(bwn.class, $$1.cR().g(2.0), $$0x -> $$0x != null && $$0x.bJ() && $$0x.o() instanceof cmx);
      daa $$4 = $$1.b($$2);
      if (!$$3.isEmpty()) {
         bwn $$5 = $$3.get(0);
         $$5.a($$5.e() - 0.5F);
         $$0.a(null, $$1.dA(), $$1.dC(), $$1.dG(), awr.cD, aws.g, 1.0F, 1.0F);
         $$0.a($$1, egg.y, $$1.dt());
         if ($$1 instanceof arv $$6) {
            aq.T.a($$6, $$4, $$5);
         }

         return but.a.a(this.a($$4, $$1, new daa(dae.wy)));
      } else {
         ffo $$7 = a($$0, $$1, djg.b.b);
         if ($$7.d() == ffq.a.a) {
            return but.e;
         } else {
            if ($$7.d() == ffq.a.b) {
               iw $$8 = $$7.b();
               if (!$$0.a($$1, $$8)) {
                  return but.e;
               }

               if ($$0.b_($$8).a(axl.a)) {
                  $$0.a($$1, $$1.dA(), $$1.dC(), $$1.dG(), awr.cC, aws.g, 1.0F, 1.0F);
                  $$0.a($$1, egg.y, $$8);
                  return but.a.a(this.a($$4, $$1, dbw.a(dae.tt, dbx.a)));
               }
            }

            return but.e;
         }
      }
   }

   protected daa a(daa $$0, crz $$1, daa $$2) {
      $$1.b(axb.c.b(this));
      return dad.a($$0, $$1, $$2);
   }
}
