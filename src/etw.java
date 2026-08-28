public class etw {
   public static class a extends esh {
      public a(iw $$0) {
         super(esu.aa, 0, new erv($$0));
      }

      public a(ua $$0) {
         super(esu.aa, $$0);
      }

      @Override
      protected void a(est $$0, ua $$1) {
      }

      @Override
      public void a(dky $$0, dkv $$1, ede $$2, azz $$3, erv $$4, dje $$5, iw $$6) {
         int $$7 = $$0.a(ehf.a.c, this.f.h(), this.f.j());
         iw.a $$8 = new iw.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.K_()) {
            ebg $$9 = $$0.a_($$8);
            ebg $$10 = $$0.a_($$8.e());
            if ($$10 == dng.bc.m() || $$10 == dng.b.m() || $$10 == dng.g.m() || $$10 == dng.c.m() || $$10 == dng.e.m()) {
               ebg $$11 = !$$9.l() && !this.b($$9) ? $$9 : dng.L.m();

               for (jc $$12 : jc.values()) {
                  iw $$13 = $$8.a($$12);
                  ebg $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     iw $$15 = $$13.e();
                     ebg $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jc.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new erv($$8);
               this.a($$0, $$4, $$3, $$8, faf.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(ebg $$0) {
         return $$0 == dng.J.m() || $$0 == dng.K.m();
      }
   }
}
