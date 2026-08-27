import com.mojang.serialization.Codec;

public class dmu extends dnq<dqe> {
   private static final dfd a = cte.mZ.o().a(csg.h, Integer.valueOf(1)).a(csg.i, dfp.a).a(csg.j, Integer.valueOf(0));
   private static final dfd b = a.a(csg.i, dfp.c).a(csg.j, Integer.valueOf(1));
   private static final dfd c = a.a(csg.i, dfp.c);
   private static final dfd d = a.a(csg.i, dfp.b);

   public dmu(Codec<dqe> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dns<dqe> $$0) {
      int $$1 = 0;
      gw $$2 = $$0.e();
      cqv $$3 = $$0.b();
      ash $$4 = $$0.d();
      dqe $$5 = $$0.f();
      gw.a $$6 = $$2.j();
      gw.a $$7 = $$2.j();
      if ($$3.t($$6)) {
         if (cte.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dkm.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cte.l.o(), 2);
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
