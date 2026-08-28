import com.mojang.serialization.Codec;

public class ehw extends eit<elh> {
   private static final dzo a = dlw.nB.m().b(dky.b, Integer.valueOf(1)).b(dky.c, eaa.a).b(dky.d, Integer.valueOf(0));
   private static final dzo b = a.b(dky.c, eaa.c).b(dky.d, Integer.valueOf(1));
   private static final dzo c = a.b(dky.c, eaa.c);
   private static final dzo d = a.b(dky.c, eaa.b);

   public ehw(Codec<elh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<elh> $$0) {
      int $$1 = 0;
      iu $$2 = $$0.e();
      djo $$3 = $$0.b();
      azt $$4 = $$0.d();
      elh $$5 = $$0.f();
      iu.a $$6 = $$2.k();
      iu.a $$7 = $$2.k();
      if ($$3.v($$6)) {
         if (dlw.nB.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(efn.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dlw.l.m(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.v($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ja.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ja.a, 1), c, 2);
               $$3.a($$6.c(ja.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
