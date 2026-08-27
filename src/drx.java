import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class drx extends drt<dry> {
   public drx(Codec<dry> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drv<dry> $$0) {
      auu $$1 = $$0.d();
      cuj $$2 = $$0.b();
      hx $$3 = $$0.e();
      ddb $$4 = ddb.a($$1);
      dry $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      edg $$7 = $$2.E().o().aX();
      edf $$8 = $$7.a($$5.b.get($$6));
      edf $$9 = $$7.a($$5.c.get($$6));
      csv $$10 = new csv($$3);
      dyx $$11 = new dyx($$10.d() - 16, $$2.J_(), $$10.e() - 16, $$10.f() + 16, $$2.al(), $$10.g() + 16);
      edb $$12 = new edb().a($$4).a($$11).a($$1);
      jb $$13 = $$8.a($$4);
      hx $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dop.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.J_() + 10);
      hx $$19 = $$8.a($$14.h($$18), dbl.a, $$4);
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

   private static int a(cuj $$0, dyx $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         djg $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(cwr.H) || $$3.a(cwr.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
