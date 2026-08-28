import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class ebb extends eax<ebc> {
   public ebb(Codec<ebc> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<ebc> $$0) {
      azg $$1 = $$0.d();
      dcs $$2 = $$0.b();
      iz $$3 = $$0.e();
      dll $$4 = dll.a($$1);
      ebc $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      emk $$7 = $$2.E().o().ba();
      emj $$8 = $$7.a($$5.b.get($$6));
      emj $$9 = $$7.a($$5.c.get($$6));
      dbe $$10 = new dbe($$3);
      eib $$11 = new eib($$10.d() - 16, $$2.I_(), $$10.e() - 16, $$10.f() + 16, $$2.am(), $$10.g() + 16);
      emf $$12 = new emf().a($$4).a($$11).a($$1);
      kd $$13 = $$8.a($$4);
      iz $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dxt.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.I_() + 10);
      iz $$19 = $$8.a($$14.h($$18), djv.a, $$4);
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

   private static int a(dcs $$0, eib $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dsb $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(dfa.H) || $$3.a(dfa.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
