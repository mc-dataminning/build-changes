public class cqs extends crn {
   public cqs(crn.a $$0) {
      super($$0);
   }

   @Override
   public bof a(cuz $$0) {
      czg $$1 = $$0.q();
      id $$2 = $$0.a();
      dpi $$3 = $$1.a_($$2);
      if (!$$3.a(dcj.fy) || $$3.c(dew.c)) {
         return bof.d;
      } else if ($$1.B) {
         return bof.a;
      } else {
         dpi $$4 = $$3.a(dew.c, Boolean.valueOf(true));
         dch.a($$3, $$4, $$1, $$2);
         $$1.a($$2, $$4, 2);
         $$1.c($$2, dcj.fy);
         $$0.n().g(1);
         $$1.c(1503, $$2, 0);
         dpn.b $$5 = dew.b().a($$1, $$2);
         if ($$5 != null) {
            id $$6 = $$5.a().b(-3, 0, -3);

            for (int $$7 = 0; $$7 < 3; $$7++) {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  $$1.a($$6.b($$7, 0, $$8), dcj.fx.n(), 2);
               }
            }

            $$1.b(1038, $$6.b(1, 0, 1), 0);
         }

         return bof.b;
      }
   }

   @Override
   public int b(crs $$0) {
      return 0;
   }

   @Override
   public bog<crs> a(czg $$0, cka $$1, boe $$2) {
      crs $$3 = $$1.b($$2);
      esf $$4 = a($$0, $$1, cyp.b.a);
      if ($$4.c() == esh.a.b && $$0.a_($$4.a()).a(dcj.fy)) {
         return bog.c($$3);
      } else {
         $$1.c($$2);
         if ($$0 instanceof apu $$5) {
            id $$6 = $$5.a(avp.a, $$1.dm(), 100, false);
            if ($$6 != null) {
               ckl $$7 = new ckl($$0, $$1.dr(), $$1.e(0.5), $$1.dx());
               $$7.a($$3);
               $$7.a($$6);
               $$0.a(dub.K, $$7.dk(), dub.a.a($$1));
               $$0.b($$7);
               if ($$1 instanceof apv) {
                  am.n.a((apv)$$1, $$6);
               }

               $$0.a(null, $$1.dr(), $$1.dt(), $$1.dx(), auo.id, aup.g, 0.5F, 0.4F / ($$0.E_().i() * 0.4F + 0.8F));
               $$0.a(null, 1003, $$1.dm(), 0);
               $$3.a(1, $$1);
               $$1.b(auz.c.b(this));
               $$1.a($$2, true);
               return bog.a($$3);
            }
         }

         return bog.b($$3);
      }
   }
}
