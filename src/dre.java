import com.mojang.serialization.Codec;

public class dre extends dqa<dsv> {
   public dre(Codec<dsv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsv> $$0) {
      csz $$1 = $$0.b();
      hx $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         dsv $$3 = $$0.f();
         atw $$4 = $$0.d();
         dbz $$5 = dbz.b();
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

         hx $$11 = $$2.d();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).r($$1, $$11)) {
            $$1.a($$2, cvh.qU.o(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            hx $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).i() && $$1.a_($$14.d()).d($$1, $$14.d(), ib.b)) {
               $$1.a($$14, cvh.qV.o().a(dby.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(csg $$0, hx $$1) {
      dhn $$2 = $$0.a_($$1);
      if ($$2.b() instanceof dbu) {
         return true;
      } else {
         return !$$2.i() && (!$$2.a(cvh.G) || !$$2.u().b()) ? false : ib.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).r($$0, $$1x));
      }
   }
}
