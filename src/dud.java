import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class dud extends dtz<due> {
   public dud(Codec<due> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dub<due> $$0) {
      awp $$1 = $$0.d();
      cwm $$2 = $$0.b();
      hz $$3 = $$0.e();
      dfe $$4 = dfe.a($$1);
      due $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      efm $$7 = $$2.E().o().aZ();
      efl $$8 = $$7.a($$5.b.get($$6));
      efl $$9 = $$7.a($$5.c.get($$6));
      cuy $$10 = new cuy($$3);
      ebd $$11 = new ebd($$10.d() - 16, $$2.J_(), $$10.e() - 16, $$10.f() + 16, $$2.ak(), $$10.g() + 16);
      efh $$12 = new efh().a($$4).a($$11).a($$1);
      jd $$13 = $$8.a($$4);
      hz $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dqv.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.J_() + 10);
      hz $$19 = $$8.a($$14.h($$18), ddo.a, $$4);
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

   private static int a(cwm $$0, ebd $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dlj $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(cyu.H) || $$3.a(cyu.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
