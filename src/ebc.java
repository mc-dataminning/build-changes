import com.mojang.serialization.Codec;

public class ebc extends eca<eeu> {
   private static final dtc a = dfe.nX.n().a(def.h, Integer.valueOf(1)).a(def.i, dto.a).a(def.j, Integer.valueOf(0));
   private static final dtc b = a.a(def.i, dto.c).a(def.j, Integer.valueOf(1));
   private static final dtc c = a.a(def.i, dto.c);
   private static final dtc d = a.a(def.i, dto.b);

   public ebc(Codec<eeu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ecc<eeu> $$0) {
      int $$1 = 0;
      ir $$2 = $$0.e();
      dcv $$3 = $$0.b();
      ayt $$4 = $$0.d();
      eeu $$5 = $$0.f();
      ir.a $$6 = $$2.j();
      ir.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dfe.nX.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dyu.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dfe.p.n(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(iw.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(iw.a, 1), c, 2);
               $$3.a($$6.c(iw.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
