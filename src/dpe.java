import com.mojang.serialization.Codec;

public class dpe extends dqa<dso> {
   private static final dhn a = cvh.mZ.o().a(cuj.h, Integer.valueOf(1)).a(cuj.i, dhz.a).a(cuj.j, Integer.valueOf(0));
   private static final dhn b = a.a(cuj.i, dhz.c).a(cuj.j, Integer.valueOf(1));
   private static final dhn c = a.a(cuj.i, dhz.c);
   private static final dhn d = a.a(cuj.i, dhz.b);

   public dpe(Codec<dso> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dso> $$0) {
      int $$1 = 0;
      hx $$2 = $$0.e();
      csz $$3 = $$0.b();
      atw $$4 = $$0.d();
      dso $$5 = $$0.f();
      hx.a $$6 = $$2.j();
      hx.a $$7 = $$2.j();
      if ($$3.t($$6)) {
         if (cvh.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dmw.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cvh.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.t($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ib.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ib.a, 1), c, 2);
               $$3.a($$6.c(ib.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
