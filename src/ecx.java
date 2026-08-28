import com.mojang.serialization.Codec;

public class ecx extends edu<egi> {
   private static final dus a = dho.mZ.n().b(dgq.h, Integer.valueOf(1)).b(dgq.i, dve.a).b(dgq.j, Integer.valueOf(0));
   private static final dus b = a.b(dgq.i, dve.c).b(dgq.j, Integer.valueOf(1));
   private static final dus c = a.b(dgq.i, dve.c);
   private static final dus d = a.b(dgq.i, dve.b);

   public ecx(Codec<egi> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<egi> $$0) {
      int $$1 = 0;
      jf $$2 = $$0.e();
      dfg $$3 = $$0.b();
      azn $$4 = $$0.d();
      egi $$5 = $$0.f();
      jf.a $$6 = $$2.k();
      jf.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (dho.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(eao.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dho.l.n(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(jk.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(jk.a, 1), c, 2);
               $$3.a($$6.c(jk.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
