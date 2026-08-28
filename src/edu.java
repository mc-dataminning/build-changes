import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class edu extends edq<edv> {
   public edu(Codec<edv> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<edv> $$0) {
      azl $$1 = $$0.d();
      dfd $$2 = $$0.b();
      je $$3 = $$0.e();
      dnx $$4 = dnx.a($$1);
      edv $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      epf $$7 = $$2.E().o().aZ();
      epe $$8 = $$7.a($$5.b.get($$6));
      epe $$9 = $$7.a($$5.c.get($$6));
      ddm $$10 = new ddm($$3);
      eku $$11 = new eku($$10.d() - 16, $$2.G_(), $$10.e() - 16, $$10.f() + 16, $$2.an(), $$10.g() + 16);
      epa $$12 = new epa().a($$4).a($$11).a($$1);
      ki $$13 = $$8.a($$4);
      je $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(eak.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.G_() + 10);
      je $$19 = $$8.a($$14.h($$18), dmg.a, $$4);
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

   private static int a(dfd $$0, eku $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         duo $$3 = $$0.a_($$2x);
         if ($$3.l() || $$3.a(dhl.H) || $$3.a(dhl.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
