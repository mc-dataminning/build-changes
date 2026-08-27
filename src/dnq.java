import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class dnq extends dnm<dnr> {
   public dnq(Codec<dnr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dno<dnr> $$0) {
      aru $$1 = $$0.d();
      cqf $$2 = $$0.b();
      gu $$3 = $$0.e();
      cyx $$4 = cyx.a($$1);
      dnr $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      dys $$7 = $$2.C().n().aS();
      dyr $$8 = $$7.a($$5.b.get($$6));
      dyr $$9 = $$7.a($$5.c.get($$6));
      cos $$10 = new cos($$3);
      duq $$11 = new duq($$10.d() - 16, $$2.C_(), $$10.e() - 16, $$10.f() + 16, $$2.aj(), $$10.g() + 16);
      dyn $$12 = new dyn().a($$4).a($$11).a($$1);
      hz $$13 = $$8.a($$4);
      gu $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dki.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.C_() + 10);
      gu $$19 = $$8.a($$14.h($$18), cxg.a, $$4);
      if (a($$2, $$8.b($$12, $$19)) > $$5.f) {
         return false;
      } else {
         $$12.b();
         $$5.d.a().a().forEach($$12::a);
         $$8.a($$2, $$19, $$19, $$12, $$1, 4);
         $$12.b();
         $$5.e.a().a().forEach($$12::a);
         $$9.a($$2, $$19, $$19, $$12, $$1, 4);
         return true;
      }
   }

   private static int a(cqf $$0, duq $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dez $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(csm.H) || $$3.a(csm.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
