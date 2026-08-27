import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class dnv extends dnr<dnw> {
   public dnv(Codec<dnw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnt<dnw> $$0) {
      arx $$1 = $$0.d();
      cqk $$2 = $$0.b();
      gw $$3 = $$0.e();
      czc $$4 = czc.a($$1);
      dnw $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      dyx $$7 = $$2.C().n().aS();
      dyw $$8 = $$7.a($$5.b.get($$6));
      dyw $$9 = $$7.a($$5.c.get($$6));
      cox $$10 = new cox($$3);
      duv $$11 = new duv($$10.d() - 16, $$2.C_(), $$10.e() - 16, $$10.f() + 16, $$2.aj(), $$10.g() + 16);
      dys $$12 = new dys().a($$4).a($$11).a($$1);
      ib $$13 = $$8.a($$4);
      gw $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dkn.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.C_() + 10);
      gw $$19 = $$8.a($$14.h($$18), cxl.a, $$4);
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

   private static int a(cqk $$0, duv $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dfe $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(csr.H) || $$3.a(csr.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
