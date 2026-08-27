import com.mojang.serialization.Codec;

public class duw extends dts<dwn> {
   public duw(Codec<dwn> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dwn> $$0) {
      cwi $$1 = $$0.b();
      hz $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         dwn $$3 = $$0.f();
         awo $$4 = $$0.d();
         dfi $$5 = dfi.b();
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

         hz $$11 = $$2.d();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).r($$1, $$11)) {
            $$1.a($$2, cyq.qU.o(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            hz $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).i() && $$1.a_($$14.d()).d($$1, $$14.d(), ie.b)) {
               $$1.a($$14, cyq.qV.o().a(dfh.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(cvo $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      if ($$2.b() instanceof dfd) {
         return true;
      } else {
         return !$$2.i() && (!$$2.a(cyq.G) || !$$2.u().b()) ? false : ie.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).r($$0, $$1x));
      }
   }
}
