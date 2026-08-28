import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class eji extends eje<ejj> {
   public eji(Codec<ejj> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejg<ejj> $$0) {
      azv $$1 = $$0.d();
      dju $$2 = $$0.b();
      iu $$3 = $$0.e();
      dst $$4 = dst.a($$1);
      ejj $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      euw $$7 = $$2.a().p().aY();
      euv $$8 = $$7.a($$5.b.get($$6));
      euv $$9 = $$7.a($$5.c.get($$6));
      dic $$10 = new dic($$3);
      eql $$11 = new eql($$10.d() - 16, $$2.G_(), $$10.e() - 16, $$10.f() + 16, $$2.ao(), $$10.g() + 16);
      eur $$12 = new eur().a($$4).a($$11).a($$1);
      jz $$13 = $$8.a($$4);
      iu $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(efy.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.G_() + 10);
      iu $$19 = $$8.a($$14.h($$18), drc.a, $$4);
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

   private static int a(dju $$0, eql $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dzz $$3 = $$0.a_($$2x);
         if ($$3.l() || $$3.a(dmc.K) || $$3.a(dmc.J)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
