import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class ebp extends ebl<ebq> {
   public ebp(Codec<ebq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<ebq> $$0) {
      ayo $$1 = $$0.d();
      ddc $$2 = $$0.b();
      ja $$3 = $$0.e();
      dlv $$4 = dlv.a($$1);
      ebq $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      emz $$7 = $$2.E().o().bb();
      emy $$8 = $$7.a($$5.b.get($$6));
      emy $$9 = $$7.a($$5.c.get($$6));
      dbn $$10 = new dbn($$3);
      eip $$11 = new eip($$10.d() - 16, $$2.I_(), $$10.e() - 16, $$10.f() + 16, $$2.am(), $$10.g() + 16);
      emu $$12 = new emu().a($$4).a($$11).a($$1);
      ke $$13 = $$8.a($$4);
      ja $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dyg.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.I_() + 10);
      ja $$19 = $$8.a($$14.h($$18), dkf.a, $$4);
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

   private static int a(ddc $$0, eip $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dsl $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(dfk.H) || $$3.a(dfk.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
