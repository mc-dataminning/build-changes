import com.mojang.serialization.Codec;

public class efz extends egw<ejk> {
   private static final dxv a = dko.nu.m().b(djq.h, Integer.valueOf(1)).b(djq.i, dyh.a).b(djq.j, Integer.valueOf(0));
   private static final dxv b = a.b(djq.i, dyh.c).b(djq.j, Integer.valueOf(1));
   private static final dxv c = a.b(djq.i, dyh.c);
   private static final dxv d = a.b(djq.i, dyh.b);

   public efz(Codec<ejk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egy<ejk> $$0) {
      int $$1 = 0;
      jh $$2 = $$0.e();
      dig $$3 = $$0.b();
      bam $$4 = $$0.d();
      ejk $$5 = $$0.f();
      jh.a $$6 = $$2.k();
      jh.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (dko.nu.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(edq.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dko.l.m(), 2);
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
