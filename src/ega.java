import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class ega extends efw<egb> {
   public ega(Codec<egb> $$0) {
      super($$0);
   }

   @Override
   public boolean a(efy<egb> $$0) {
      azg $$1 = $$0.d();
      dhe $$2 = $$0.b();
      ji $$3 = $$0.e();
      dqc $$4 = dqc.a($$1);
      egb $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      ern $$7 = $$2.a().p().aY();
      erm $$8 = $$7.a($$5.b.get($$6));
      erm $$9 = $$7.a($$5.c.get($$6));
      dfm $$10 = new dfm($$3);
      enc $$11 = new enc($$10.d() - 16, $$2.L_(), $$10.e() - 16, $$10.f() + 16, $$2.an(), $$10.g() + 16);
      eri $$12 = new eri().a($$4).a($$11).a($$1);
      km $$13 = $$8.a($$4);
      ji $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(ecq.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.L_() + 10);
      ji $$19 = $$8.a($$14.h($$18), doj.a, $$4);
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

   private static int a(dhe $$0, enc $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dwv $$3 = $$0.a_($$2x);
         if ($$3.l() || $$3.a(djm.K) || $$3.a(djm.J)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
