public class enq {
   public static class a extends emb {
      public a(jh $$0) {
         super(emo.aa, 0, new elp($$0));
      }

      public a(uk $$0) {
         super(emo.aa, $$0);
      }

      @Override
      protected void a(emn $$0, uk $$1) {
      }

      @Override
      public void a(dfy $$0, dfw $$1, dxg $$2, azs $$3, elp $$4, deh $$5, jh $$6) {
         int $$7 = $$0.a(ebf.a.c, this.f.h(), this.f.j());
         jh.a $$8 = new jh.a(this.f.h(), $$7, this.f.j());

         while ($$8.v() > $$0.I_()) {
            dvj $$9 = $$0.a_($$8);
            dvj $$10 = $$0.a_($$8.e());
            if ($$10 == dig.aV.m() || $$10 == dig.b.m() || $$10 == dig.g.m() || $$10 == dig.c.m() || $$10 == dig.e.m()) {
               dvj $$11 = !$$9.l() && !this.b($$9) ? $$9 : dig.I.m();

               for (jm $$12 : jm.values()) {
                  jh $$13 = $$8.a($$12);
                  dvj $$14 = $$0.a_($$13);
                  if ($$14.l() || this.b($$14)) {
                     jh $$15 = $$13.e();
                     dvj $$16 = $$0.a_($$15);
                     if (($$16.l() || this.b($$16)) && $$12 != jm.b) {
                        $$0.a($$13, $$10, 3);
                     } else {
                        $$0.a($$13, $$11, 3);
                     }
                  }
               }

               this.f = new elp($$8);
               this.a($$0, $$4, $$3, $$8, ety.F, null);
               return;
            }

            $$8.e(0, -1, 0);
         }
      }

      private boolean b(dvj $$0) {
         return $$0 == dig.G.m() || $$0 == dig.H.m();
      }
   }
}
