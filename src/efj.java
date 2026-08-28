import com.mojang.serialization.Codec;

public class efj extends eef<eha> {
   public efj(Codec<eha> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<eha> $$0) {
      dfs $$1 = $$0.b();
      jg $$2 = $$0.e();
      if (!this.a($$1, $$2)) {
         return false;
      } else {
         eha $$3 = $$0.f();
         azr $$4 = $$0.d();
         dot $$5 = dot.b();
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

         jg $$11 = $$2.e();
         if ($$4.i() <= $$3.h() && $$1.a_($$11).m($$1, $$11)) {
            $$1.a($$2, dia.qU.m(), 3);
         }

         int $$12 = $$3.g().a($$4);

         for (int $$13 = 0; $$13 < $$12; $$13++) {
            jg $$14 = $$2.b($$4.a(5) - 2, 0, $$4.a(5) - 2);
            if ($$1.a_($$14).l() && $$1.a_($$14.e()).c($$1, $$14.e(), jl.b)) {
               $$1.a($$14, dia.qV.m().b(dos.d, Boolean.valueOf(true)), 3);
            }
         }

         return true;
      }
   }

   private boolean a(dew $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      if ($$2.b() instanceof doo) {
         return true;
      } else {
         return !$$2.l() && (!$$2.a(dia.G) || !$$2.y().b()) ? false : jl.a().map($$1::a).anyMatch($$1x -> $$0.a_($$1x).m($$0, $$1x));
      }
   }
}
