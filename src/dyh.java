import com.mojang.serialization.Codec;

public class dyh extends dzd<ebr> {
   private static final dqh a = ddg.mZ.n().a(dci.h, Integer.valueOf(1)).a(dci.i, dqt.a).a(dci.j, Integer.valueOf(0));
   private static final dqh b = a.a(dci.i, dqt.c).a(dci.j, Integer.valueOf(1));
   private static final dqh c = a.a(dci.i, dqt.c);
   private static final dqh d = a.a(dci.i, dqt.b);

   public dyh(Codec<ebr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzf<ebr> $$0) {
      int $$1 = 0;
      in $$2 = $$0.e();
      day $$3 = $$0.b();
      ayg $$4 = $$0.d();
      ebr $$5 = $$0.f();
      in.a $$6 = $$2.j();
      in.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (ddg.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dvz.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, ddg.l.n(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(is.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(is.a, 1), c, 2);
               $$3.a($$6.c(is.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
