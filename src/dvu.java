import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class dvu extends dvq<dvv> {
   public dvu(Codec<dvv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dvs<dvv> $$0) {
      axd $$1 = $$0.d();
      cxu $$2 = $$0.b();
      ib $$3 = $$0.e();
      dgm $$4 = dgm.a($$1);
      dvv $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      ehd $$7 = $$2.E().o().bb();
      ehc $$8 = $$7.a($$5.b.get($$6));
      ehc $$9 = $$7.a($$5.c.get($$6));
      cwg $$10 = new cwg($$3);
      ecu $$11 = new ecu($$10.d() - 16, $$2.I_(), $$10.e() - 16, $$10.f() + 16, $$2.ak(), $$10.g() + 16);
      egy $$12 = new egy().a($$4).a($$11).a($$1);
      jg $$13 = $$8.a($$4);
      ib $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dsm.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.I_() + 10);
      ib $$19 = $$8.a($$14.h($$18), dew.a, $$4);
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

   private static int a(cxu $$0, ecu $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dmz $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(dac.H) || $$3.a(dac.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
