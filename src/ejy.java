import com.mojang.serialization.Codec;

public class ejy extends ekw<enl> {
   private static final ebq a = dnq.nF.m().b(dms.b, Integer.valueOf(1)).b(dms.c, ecc.a).b(dms.d, Integer.valueOf(0));
   private static final ebq b = a.b(dms.c, ecc.c).b(dms.d, Integer.valueOf(1));
   private static final ebq c = a.b(dms.c, ecc.c);
   private static final ebq d = a.b(dms.c, ecc.b);

   public ejy(Codec<enl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<enl> $$0) {
      int $$1 = 0;
      iw $$2 = $$0.e();
      dli $$3 = $$0.b();
      bai $$4 = $$0.d();
      enl $$5 = $$0.f();
      iw.a $$6 = $$2.k();
      iw.a $$7 = $$2.k();
      if ($$3.v($$6)) {
         if (dnq.nF.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(ehp.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dnq.l.m(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.v($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(jc.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(jc.a, 1), c, 2);
               $$3.a($$6.c(jc.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
