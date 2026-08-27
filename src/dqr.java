import com.mojang.serialization.Codec;

public class dqr extends drn<dub> {
   private static final dja a = cwl.mZ.o().a(cvn.h, Integer.valueOf(1)).a(cvn.i, djm.a).a(cvn.j, Integer.valueOf(0));
   private static final dja b = a.a(cvn.i, djm.c).a(cvn.j, Integer.valueOf(1));
   private static final dja c = a.a(cvn.i, djm.c);
   private static final dja d = a.a(cvn.i, djm.b);

   public dqr(Codec<dub> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drp<dub> $$0) {
      int $$1 = 0;
      hx $$2 = $$0.e();
      cud $$3 = $$0.b();
      aup $$4 = $$0.d();
      dub $$5 = $$0.f();
      hx.a $$6 = $$2.j();
      hx.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (cwl.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(doj.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cwl.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(ic.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(ic.a, 1), c, 2);
               $$3.a($$6.c(ic.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
