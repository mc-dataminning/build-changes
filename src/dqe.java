import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class dqe extends dqa<dqf> {
   public dqe(Codec<dqf> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dqf> $$0) {
      atw $$1 = $$0.d();
      csz $$2 = $$0.b();
      hx $$3 = $$0.e();
      dbr $$4 = dbr.a($$1);
      dqf $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      ebn $$7 = $$2.D().n().aX();
      ebm $$8 = $$7.a($$5.b.get($$6));
      ebm $$9 = $$7.a($$5.c.get($$6));
      crm $$10 = new crm($$3);
      dxe $$11 = new dxe($$10.d() - 16, $$2.J_(), $$10.e() - 16, $$10.f() + 16, $$2.ak(), $$10.g() + 16);
      ebi $$12 = new ebi().a($$4).a($$11).a($$1);
      ja $$13 = $$8.a($$4);
      hx $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dmw.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.J_() + 10);
      hx $$19 = $$8.a($$14.h($$18), dab.a, $$4);
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

   private static int a(csz $$0, dxe $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dhn $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(cvh.H) || $$3.a(cvh.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
