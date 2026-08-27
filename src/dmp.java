import com.mojang.serialization.Codec;

public class dmp extends dnl<dpz> {
   private static final dey a = csl.mZ.n().a(crp.g, Integer.valueOf(1)).a(crp.h, dfk.a).a(crp.i, Integer.valueOf(0));
   private static final dey b = a.a(crp.h, dfk.c).a(crp.i, Integer.valueOf(1));
   private static final dey c = a.a(crp.h, dfk.c);
   private static final dey d = a.a(crp.h, dfk.b);

   public dmp(Codec<dpz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpz> $$0) {
      int $$1 = 0;
      gv $$2 = $$0.e();
      cqe $$3 = $$0.b();
      art $$4 = $$0.d();
      dpz $$5 = $$0.f();
      gv.a $$6 = $$2.j();
      gv.a $$7 = $$2.j();
      if ($$3.t($$6)) {
         if (csl.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dkh.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, csl.l.n(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.t($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(hb.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(hb.a, 1), c, 2);
               $$3.a($$6.c(hb.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
