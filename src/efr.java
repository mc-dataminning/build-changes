import com.mojang.serialization.Codec;

public class efr extends ego<ejc> {
   private static final dxn a = dkg.nu.m().b(dji.h, Integer.valueOf(1)).b(dji.i, dxz.a).b(dji.j, Integer.valueOf(0));
   private static final dxn b = a.b(dji.i, dxz.c).b(dji.j, Integer.valueOf(1));
   private static final dxn c = a.b(dji.i, dxz.c);
   private static final dxn d = a.b(dji.i, dxz.b);

   public efr(Codec<ejc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egq<ejc> $$0) {
      int $$1 = 0;
      jh $$2 = $$0.e();
      dhy $$3 = $$0.b();
      bam $$4 = $$0.d();
      ejc $$5 = $$0.f();
      jh.a $$6 = $$2.k();
      jh.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (dkg.nu.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(edi.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dkg.l.m(), 2);
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
