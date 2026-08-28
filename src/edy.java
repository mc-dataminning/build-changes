import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class edy extends edu<edz> {
   public edy(Codec<edz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<edz> $$0) {
      azn $$1 = $$0.d();
      dfg $$2 = $$0.b();
      jf $$3 = $$0.e();
      doa $$4 = doa.a($$1);
      edz $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      epj $$7 = $$2.E().o().aZ();
      epi $$8 = $$7.a($$5.b.get($$6));
      epi $$9 = $$7.a($$5.c.get($$6));
      ddp $$10 = new ddp($$3);
      eky $$11 = new eky($$10.d() - 16, $$2.H_(), $$10.e() - 16, $$10.f() + 16, $$2.an(), $$10.g() + 16);
      epe $$12 = new epe().a($$4).a($$11).a($$1);
      kj $$13 = $$8.a($$4);
      jf $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(eao.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.H_() + 10);
      jf $$19 = $$8.a($$14.h($$18), dmj.a, $$4);
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

   private static int a(dfg $$0, eky $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dus $$3 = $$0.a_($$2x);
         if ($$3.l() || $$3.a(dho.H) || $$3.a(dho.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
