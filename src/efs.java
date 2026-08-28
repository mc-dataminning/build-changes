import com.mojang.serialization.Codec;

public class efs extends egp<ejd> {
   private static final dxo a = dkf.nB.m().b(djh.h, Integer.valueOf(1)).b(djh.i, dya.a).b(djh.j, Integer.valueOf(0));
   private static final dxo b = a.b(djh.i, dya.c).b(djh.j, Integer.valueOf(1));
   private static final dxo c = a.b(djh.i, dya.c);
   private static final dxo d = a.b(djh.i, dya.b);

   public efs(Codec<ejd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<ejd> $$0) {
      int $$1 = 0;
      jh $$2 = $$0.e();
      dhx $$3 = $$0.b();
      bac $$4 = $$0.d();
      ejd $$5 = $$0.f();
      jh.a $$6 = $$2.k();
      jh.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (dkf.nB.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(edj.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dkf.l.m(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(jm.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(jm.a, 1), c, 2);
               $$3.a($$6.c(jm.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
