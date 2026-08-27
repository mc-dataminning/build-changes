import com.mojang.serialization.Codec;

public class djs extends dko<dnc> {
   private static final dcb a = cpo.mZ.n().a(cos.g, Integer.valueOf(1)).a(cos.h, dcn.a).a(cos.i, Integer.valueOf(0));
   private static final dcb b = a.a(cos.h, dcn.c).a(cos.i, Integer.valueOf(1));
   private static final dcb c = a.a(cos.h, dcn.c);
   private static final dcb d = a.a(cos.h, dcn.b);

   public djs(Codec<dnc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dnc> $$0) {
      int $$1 = 0;
      gu $$2 = $$0.e();
      cng $$3 = $$0.b();
      apf $$4 = $$0.d();
      dnc $$5 = $$0.f();
      gu.a $$6 = $$2.j();
      gu.a $$7 = $$2.j();
      if ($$3.t($$6)) {
         if (cpo.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dhk.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cpo.l.n(), 2);
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
