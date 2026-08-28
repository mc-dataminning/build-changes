public class dat extends czw {
   public dat(czw.a $$0) {
      super($$0);
   }

   @Override
   public daa m() {
      daa $$0 = super.m();
      $$0.b(kl.R, new dbw(dbx.a));
      return $$0;
   }

   @Override
   public but a(ddv $$0) {
      djz $$1 = $$0.q();
      iw $$2 = $$0.a();
      crz $$3 = $$0.o();
      daa $$4 = $$0.n();
      dbw $$5 = $$4.a(kl.R, dbw.a);
      ebg $$6 = $$1.a_($$2);
      if ($$0.k() != jc.a && $$6.a(axg.co) && $$5.a(dbx.a)) {
         $$1.a(null, $$2, awr.kM, aws.e, 1.0F, 1.0F);
         $$3.a($$0.p(), dad.a($$4, $$3, new daa(dae.ts)));
         $$3.b(axb.c.b($$4.h()));
         if (!$$1.C) {
            aru $$7 = (aru)$$1;

            for (int $$8 = 0; $$8 < 5; $$8++) {
               $$7.a(lz.ap, (double)$$2.u() + $$1.A.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.A.j(), 1, 0.0, 0.0, 0.0, 1.0);
            }
         }

         $$1.a(null, $$2, awr.cB, aws.e, 1.0F, 1.0F);
         $$1.a(null, egg.z, $$2);
         $$1.b($$2, dng.ts.m());
         return but.a;
      } else {
         return but.e;
      }
   }

   @Override
   public xc a(daa $$0) {
      dbw $$1 = $$0.a(kl.R);
      return $$1 != null ? $$1.a(this.n + ".effect.") : super.a($$0);
   }
}
