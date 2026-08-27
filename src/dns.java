import com.mojang.serialization.Codec;

public class dns extends doo<drc> {
   private static final dgb a = cuc.mZ.o().a(cte.h, Integer.valueOf(1)).a(cte.i, dgn.a).a(cte.j, Integer.valueOf(0));
   private static final dgb b = a.a(cte.i, dgn.c).a(cte.j, Integer.valueOf(1));
   private static final dgb c = a.a(cte.i, dgn.c);
   private static final dgb d = a.a(cte.i, dgn.b);

   public dns(Codec<drc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(doq<drc> $$0) {
      int $$1 = 0;
      ht $$2 = $$0.e();
      crt $$3 = $$0.b();
      ate $$4 = $$0.d();
      drc $$5 = $$0.f();
      ht.a $$6 = $$2.j();
      ht.a $$7 = $$2.j();
      if ($$3.t($$6)) {
         if (cuc.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dlk.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, cuc.l.o(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.t($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(hx.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(hx.a, 1), c, 2);
               $$3.a($$6.c(hx.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
