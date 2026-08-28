import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class ela extends ekw<elb> {
   public ela(Codec<elb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<elb> $$0) {
      bai $$1 = $$0.d();
      dli $$2 = $$0.b();
      iw $$3 = $$0.e();
      dui $$4 = dui.a($$1);
      elb $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      ewq $$7 = $$2.a().p().aY();
      ewp $$8 = $$7.a($$5.b.get($$6));
      ewp $$9 = $$7.a($$5.c.get($$6));
      djo $$10 = new djo($$3);
      esf $$11 = new esf($$10.d() - 16, $$2.K_(), $$10.e() - 16, $$10.f() + 16, $$2.ao(), $$10.g() + 16);
      ewl $$12 = new ewl().a($$4).a($$11).a($$1);
      kb $$13 = $$8.a($$4);
      iw $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(ehp.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.K_() + 10);
      iw $$19 = $$8.a($$14.h($$18), dsr.a, $$4);
      if (a($$2, $$8.b($$12, $$19)) > $$5.f) {
         return false;
      } else {
         $$12.b();
         $$5.d.a().a().forEach($$12::a);
         $$8.a($$2, $$19, $$19, $$12, $$1, 260);
         $$12.b();
         $$5.e.a().a().forEach($$12::a);
         $$9.a($$2, $$19, $$19, $$12, $$1, 260);
         return true;
      }
   }

   private static int a(dli $$0, esf $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         ebq $$3 = $$0.a_($$2x);
         if ($$3.l() || $$3.a(dnq.K) || $$3.a(dnq.J)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
