import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class eko extends ekk<ekp> {
   public eko(Codec<ekp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<ekp> $$0) {
      azx $$1 = $$0.d();
      dkw $$2 = $$0.b();
      iv $$3 = $$0.e();
      dtw $$4 = dtw.a($$1);
      ekp $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      ewe $$7 = $$2.a().p().aY();
      ewd $$8 = $$7.a($$5.b.get($$6));
      ewd $$9 = $$7.a($$5.c.get($$6));
      djc $$10 = new djc($$3);
      ert $$11 = new ert($$10.d() - 16, $$2.K_(), $$10.e() - 16, $$10.f() + 16, $$2.ao(), $$10.g() + 16);
      evz $$12 = new evz().a($$4).a($$11).a($$1);
      ka $$13 = $$8.a($$4);
      iv $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(ehd.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.K_() + 10);
      iv $$19 = $$8.a($$14.h($$18), dsf.a, $$4);
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

   private static int a(dkw $$0, ert $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         ebe $$3 = $$0.a_($$2x);
         if ($$3.l() || $$3.a(dne.K) || $$3.a(dne.J)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
