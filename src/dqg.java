import com.mojang.serialization.Codec;

public class dqg extends drc<dtq> {
   private static final dip a = cwb.mZ.o().a(cvd.h, Integer.valueOf(1)).a(cvd.i, djb.a).a(cvd.j, Integer.valueOf(0));
   private static final dip b = a.a(cvd.i, djb.c).a(cvd.j, Integer.valueOf(1));
   private static final dip c = a.a(cvd.i, djb.c);
   private static final dip d = a.a(cvd.i, djb.b);

   public dqg(Codec<dtq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<dtq> $$0) {
      int $$1 = 0;
      hv $$2 = $$0.e();
      ctt $$3 = $$0.b();
      auf $$4 = $$0.d();
      dtq $$5 = $$0.f();
      hv.a $$6 = $$2.j();
      hv.a $$7 = $$2.j();
      if ($$3.t($$6)) {
         if (cwb.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dny.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cwb.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.t($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ia.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ia.a, 1), c, 2);
               $$3.a($$6.c(ia.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
