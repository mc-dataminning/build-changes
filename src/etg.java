public class etg {
   public static class a extends err {
      public a(iv $$0) {
         super(ese.aa, 0, new erf($$0));
      }

      public a(tz $$0) {
         super(ese.aa, $$0);
      }

      @Override
      protected void a(esd $$0, tz $$1) {
      }

      @Override
      public void a(dkl $$0, dki $$1, ecr $$2, azv $$3, erf $$4, dir $$5, iv $$6) {
         int $$7 = $$0.a(egs.a.c, this.f.h(), this.f.j());
         iv.a $$8 = new iv.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.G_()) {
            eat $$9 = $$0.a_($$8);
            eat $$10 = $$0.a_($$8.e());
            if ($$10 == dmt.bc.m() || $$10 == dmt.b.m() || $$10 == dmt.g.m() || $$10 == dmt.c.m() || $$10 == dmt.e.m()) {
               eat $$11 = !$$9.l() && !this.b($$9) ? $$9 : dmt.L.m();

               for (jb $$12 : jb.values()) {
                  iv $$13 = $$8.a($$12);
                  eat $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     iv $$15 = $$13.e();
                     eat $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jb.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new erf($$8);
               this.a($$0, $$4, $$3, $$8, ezp.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(eat $$0) {
         return $$0 == dmt.J.m() || $$0 == dmt.K.m();
      }
   }
}
