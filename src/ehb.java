import com.mojang.serialization.Codec;

public class ehb extends efx<eis> {
   public ehb(Codec<eis> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efz<eis> $$0) {
      dhf $$1 = $$0.b();
      ji $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         eis $$3 = $$0.f();
         azh $$4 = $$0.d();
         dql $$5 = dql.b();
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

         ji $$11 = $$2.e();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).m($$1, $$11)) {
            $$1.a($$2, djn.rw.m(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            ji $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).l() && $$1.a_($$14.e()).c($$1, $$14.e(), jn.b)) {
               $$1.a($$14, djn.rx.m().b(dqk.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(dgi $$0, ji $$1) {
      dww $$2 = $$0.a_($$1);
      if ($$2.b() instanceof dqg) {
         return true;
      } else {
         return !$$2.l() && (!$$2.a(djn.J) || !$$2.y().b()) ? false : jn.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).m($$0, $$1x));
      }
   }
}
