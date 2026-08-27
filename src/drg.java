import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class drg extends drc<drh> {
   public drg(Codec<drh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dre<drh> $$0) {
      auf $$1 = $$0.d();
      ctt $$2 = $$0.b();
      hv $$3 = $$0.e();
      dcl $$4 = dcl.a($$1);
      drh $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      ecp $$7 = $$2.D().n().aX();
      eco $$8 = $$7.a($$5.b.get($$6));
      eco $$9 = $$7.a($$5.c.get($$6));
      csf $$10 = new csf($$3);
      dyg $$11 = new dyg($$10.d() - 16, $$2.J_(), $$10.e() - 16, $$10.f() + 16, $$2.ak(), $$10.g() + 16);
      eck $$12 = new eck().a($$4).a($$11).a($$1);
      iz $$13 = $$8.a($$4);
      hv $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dny.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.J_() + 10);
      hv $$19 = $$8.a($$14.h($$18), dav.a, $$4);
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

   private static int a(ctt $$0, dyg $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dip $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(cwb.H) || $$3.a(cwb.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
