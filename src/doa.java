import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class doa extends dnw<dob> {
   public doa(Codec<dob> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dny<dob> $$0) {
      asc $$1 = $$0.d();
      cqp $$2 = $$0.b();
      gw $$3 = $$0.e();
      czh $$4 = czh.a($$1);
      dob $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      dzc $$7 = $$2.C().n().aS();
      dzb $$8 = $$7.a($$5.b.get($$6));
      dzb $$9 = $$7.a($$5.c.get($$6));
      cpc $$10 = new cpc($$3);
      dva $$11 = new dva($$10.d() - 16, $$2.H_(), $$10.e() - 16, $$10.f() + 16, $$2.aj(), $$10.g() + 16);
      dyx $$12 = new dyx().a($$4).a($$11).a($$1);
      ib $$13 = $$8.a($$4);
      gw $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dks.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.H_() + 10);
      gw $$19 = $$8.a($$14.h($$18), cxq.a, $$4);
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

   private static int a(cqp $$0, dva $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dfj $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(csw.H) || $$3.a(csw.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
