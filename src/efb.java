import com.mojang.serialization.Codec;

public class efb extends efy<eim> {
   private static final dwx a = djo.nB.m().b(diq.h, Integer.valueOf(1)).b(diq.i, dxj.a).b(diq.j, Integer.valueOf(0));
   private static final dwx b = a.b(diq.i, dxj.c).b(diq.j, Integer.valueOf(1));
   private static final dwx c = a.b(diq.i, dxj.c);
   private static final dwx d = a.b(diq.i, dxj.b);

   public efb(Codec<eim> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ega<eim> $$0) {
      int $$1 = 0;
      ji $$2 = $$0.e();
      dhg $$3 = $$0.b();
      azh $$4 = $$0.d();
      eim $$5 = $$0.f();
      ji.a $$6 = $$2.k();
      ji.a $$7 = $$2.k();
      if ($$3.u($$6)) {
         if (djo.nB.m().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(ecs.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, djo.l.m(), 2);
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
