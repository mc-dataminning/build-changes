import com.mojang.serialization.Codec;

public class eez extends efw<eik> {
   private static final dwv a = djm.nB.m().b(dio.h, Integer.valueOf(1)).b(dio.i, dxh.a).b(dio.j, Integer.valueOf(0));
   private static final dwv b = a.b(dio.i, dxh.c).b(dio.j, Integer.valueOf(1));
   private static final dwv c = a.b(dio.i, dxh.c);
   private static final dwv d = a.b(dio.i, dxh.b);

   public eez(Codec<eik> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<eik> $$0) {
      int $$1 = 0;
      ji $$2 = $$0.e();
      dhe $$3 = $$0.b();
      azg $$4 = $$0.d();
      eik $$5 = $$0.f();
      ji.a $$6 = $$2.k();
      ji.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (djm.nB.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(ecq.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, djm.l.m(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(jn.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(jn.a, 1), c, 2);
               $$3.a($$6.c(jn.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
