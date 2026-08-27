import com.mojang.serialization.Codec;

public class dna extends dnw<dqk> {
   private static final dfj a = csw.mZ.n().a(csa.g, Integer.valueOf(1)).a(csa.h, dfv.a).a(csa.i, Integer.valueOf(0));
   private static final dfj b = a.a(csa.h, dfv.c).a(csa.i, Integer.valueOf(1));
   private static final dfj c = a.a(csa.h, dfv.c);
   private static final dfj d = a.a(csa.h, dfv.b);

   public dna(Codec<dqk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dqk> $$0) {
      int $$1 = 0;
      gw $$2 = $$0.e();
      cqp $$3 = $$0.b();
      asc $$4 = $$0.d();
      dqk $$5 = $$0.f();
      gw.a $$6 = $$2.j();
      gw.a $$7 = $$2.j();
      if ($$3.t($$6)) {
         if (csw.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dks.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, csw.l.n(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.t($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ha.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ha.a, 1), c, 2);
               $$3.a($$6.c(ha.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
