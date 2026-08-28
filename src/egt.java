import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class egt extends egp<egu> {
   public egt(Codec<egu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egr<egu> $$0) {
      bac $$1 = $$0.d();
      dhx $$2 = $$0.b();
      jh $$3 = $$0.e();
      dqv $$4 = dqv.a($$1);
      egu $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      esg $$7 = $$2.a().p().aY();
      esf $$8 = $$7.a($$5.b.get($$6));
      esf $$9 = $$7.a($$5.c.get($$6));
      dgf $$10 = new dgf($$3);
      env $$11 = new env($$10.d() - 16, $$2.L_(), $$10.e() - 16, $$10.f() + 16, $$2.an(), $$10.g() + 16);
      esb $$12 = new esb().a($$4).a($$11).a($$1);
      kl $$13 = $$8.a($$4);
      jh $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(edj.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.L_() + 10);
      jh $$19 = $$8.a($$14.h($$18), dpc.a, $$4);
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

   private static int a(dhx $$0, env $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dxo $$3 = $$0.a_($$2x);
         if ($$3.l() || $$3.a(dkf.K) || $$3.a(dkf.J)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
