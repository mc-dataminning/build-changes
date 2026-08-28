import com.mojang.serialization.Codec;

public class dzx extends eat<edh> {
   private static final drx a = dew.mZ.n().a(ddy.h, Integer.valueOf(1)).a(ddy.i, dsj.a).a(ddy.j, Integer.valueOf(0));
   private static final drx b = a.a(ddy.i, dsj.c).a(ddy.j, Integer.valueOf(1));
   private static final drx c = a.a(ddy.i, dsj.c);
   private static final drx d = a.a(ddy.i, dsj.b);

   public dzx(Codec<edh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eav<edh> $$0) {
      int $$1 = 0;
      iz $$2 = $$0.e();
      dco $$3 = $$0.b();
      azc $$4 = $$0.d();
      edh $$5 = $$0.f();
      iz.a $$6 = $$2.j();
      iz.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dew.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dxp.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dew.l.n(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(je.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(je.a, 1), c, 2);
               $$3.a($$6.c(je.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
