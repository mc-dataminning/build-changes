import com.mojang.serialization.Codec;

public class eab extends eax<edl> {
   private static final dsb a = dfa.mZ.o().a(dec.h, Integer.valueOf(1)).a(dec.i, dsn.a).a(dec.j, Integer.valueOf(0));
   private static final dsb b = a.a(dec.i, dsn.c).a(dec.j, Integer.valueOf(1));
   private static final dsb c = a.a(dec.i, dsn.c);
   private static final dsb d = a.a(dec.i, dsn.b);

   public eab(Codec<edl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edl> $$0) {
      int $$1 = 0;
      iz $$2 = $$0.e();
      dcs $$3 = $$0.b();
      azg $$4 = $$0.d();
      edl $$5 = $$0.f();
      iz.a $$6 = $$2.j();
      iz.a $$7 = $$2.j();
      if ($$3.u($$6)) {
         if (dfa.mZ.o().a($$3, $$6)) {
            int $$8 = $$4.a(12) + 5;
            if ($$4.i() < $$5.l) {
               int $$9 = $$4.a(4) + 1;

               for (int $$10 = $$2.u() - $$9; $$10 <= $$2.u() + $$9; $$10++) {
                  for (int $$11 = $$2.w() - $$9; $$11 <= $$2.w() + $$9; $$11++) {
                     int $$12 = $$10 - $$2.u();
                     int $$13 = $$11 - $$2.w();
                     if ($$12 * $$12 + $$13 * $$13 <= $$9 * $$9) {
                        $$7.d($$10, $$3.a(dxt.a.b, $$10, $$11) - 1, $$11);
                        if (b($$3.a_($$7))) {
                           $$3.a($$7, dfa.l.o(), 2);
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
