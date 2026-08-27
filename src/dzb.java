import com.mojang.serialization.Codec;

public class dzb extends dzx<ecl> {
   private static final drb a = dea.mZ.n().a(ddc.h, Integer.valueOf(1)).a(ddc.i, drn.a).a(ddc.j, Integer.valueOf(0));
   private static final drb b = a.a(ddc.i, drn.c).a(ddc.j, Integer.valueOf(1));
   private static final drb c = a.a(ddc.i, drn.c);
   private static final drb d = a.a(ddc.i, drn.b);

   public dzb(Codec<ecl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<ecl> $$0) {
      int $$1 = 0;
      io $$2 = $$0.e();
      dbs $$3 = $$0.b();
      ayk $$4 = $$0.d();
      ecl $$5 = $$0.f();
      io.a $$6 = $$2.j();
      io.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dea.mZ.n().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dwt.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dea.l.n(), 2);
                        }
                     }
                  }
               }
            }

            for (int $$14 = 0; $$14 < $$8 && $$3.u($$6); $$14++) {
               $$3.a($$6, a, 2);
               $$6.c(it.b, 1);
            }

            if ($$6.v() - $$2.v() >= 3) {
               $$3.a($$6, b, 2);
               $$3.a($$6.c(it.a, 1), c, 2);
               $$3.a($$6.c(it.a, 1), d, 2);
            }
         }

         $$1++;
      }

      return $$1 > 0;
   }
}
