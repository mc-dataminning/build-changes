import com.mojang.serialization.Codec;

public class dqy extends dru<dui> {
   private static final djh a = cws.mZ.o().a(cvu.h, Integer.valueOf(1)).a(cvu.i, djt.a).a(cvu.j, Integer.valueOf(0));
   private static final djh b = a.a(cvu.i, djt.c).a(cvu.j, Integer.valueOf(1));
   private static final djh c = a.a(cvu.i, djt.c);
   private static final djh d = a.a(cvu.i, djt.b);

   public dqy(Codec<dui> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<dui> $$0) {
      int $$1 = 0;
      hx $$2 = $$0.e();
      cuk $$3 = $$0.b();
      auv $$4 = $$0.d();
      dui $$5 = $$0.f();
      hx.a $$6 = $$2.j();
      hx.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (cws.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(doq.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cws.l.o(), 2);
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
