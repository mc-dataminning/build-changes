import com.mojang.serialization.Codec;

public class dmq extends dnm<dqa> {
   private static final dez a = csm.mZ.n().a(crq.g, Integer.valueOf(1)).a(crq.h, dfl.a).a(crq.i, Integer.valueOf(0));
   private static final dez b = a.a(crq.h, dfl.c).a(crq.i, Integer.valueOf(1));
   private static final dez c = a.a(crq.h, dfl.c);
   private static final dez d = a.a(crq.h, dfl.b);

   public dmq(Codec<dqa> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dqa> $$0) {
      int $$1 = 0;
      gu $$2 = $$0.e();
      cqf $$3 = $$0.b();
      aru $$4 = $$0.d();
      dqa $$5 = $$0.f();
      gu.a $$6 = $$2.j();
      gu.a $$7 = $$2.j();
      if ($$3.t($$6)) {
         if (csm.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dki.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, csm.l.n(), 2);
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
