import com.mojang.serialization.Codec;

public class eci extends ebe<edz> {
   public eci(Codec<edz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebg<edz> $$0) {
      dcz $$1 = $$0.b();
      ja $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         edz $$3 = $$0.f();
         aym $$4 = $$0.d();
         dma $$5 = dma.b();
         int $$6 = $$3.f() + $$3.d();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            for (int $$8 = 0; $$8 < $$3.a(); $$8++) {
               $$5.a($$2, $$3.b());
            }

            boolean $$9 = $$7 < $$3.f();

            for (int $$10 = 0; $$10 < $$3.c(); $$10++) {
               $$5.a($$1, $$2, $$4, $$9);
            }

            $$5.j();
         }

         ja $$11 = $$2.d();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).r($$1, $$11)) {
            $$1.a($$2, dfh.qU.o(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            ja $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).i() && $$1.a_($$14.d()).d($$1, $$14.d(), jf.b)) {
               $$1.a($$14, dfh.qV.o().a(dlz.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(dce $$0, ja $$1) {
      dsh $$2 = $$0.a_($$1);
      if ($$2.b() instanceof dlv) {
         return true;
      } else {
         return !$$2.i() && (!$$2.a(dfh.G) || !$$2.u().b()) ? false : jf.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).r($$0, $$1x));
      }
   }
}
