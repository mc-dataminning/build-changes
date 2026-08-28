public class epd {
   public static class a extends eno {
      public a(ji $$0) {
         super(eob.aa, 0, new enc($$0));
      }

      public a(tq $$0) {
         super(eob.aa, $$0);
      }

      @Override
      protected void a(eoa $$0, tq $$1) {
      }

      @Override
      public void a(dhe $$0, dhc $$1, dyr $$2, azg $$3, enc $$4, dfm $$5, ji $$6) {
         int $$7 = $$0.a(ecq.a.c, this.f.h(), this.f.j());
         ji.a $$8 = new ji.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.L_()) {
            dwv $$9 = $$0.a_($$8);
            dwv $$10 = $$0.a_($$8.e());
            if ($$10 == djm.bc.m() || $$10 == djm.b.m() || $$10 == djm.g.m() || $$10 == djm.c.m() || $$10 == djm.e.m()) {
               dwv $$11 = !$$9.l() && !this.b($$9) ? $$9 : djm.L.m();

               for (jn $$12 : jn.values()) {
                  ji $$13 = $$8.a($$12);
                  dwv $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     ji $$15 = $$13.e();
                     dwv $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jn.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new enc($$8);
               this.a($$0, $$4, $$3, $$8, evl.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dwv $$0) {
         return $$0 == djm.J.m() || $$0 == djm.K.m();
      }
   }
}
