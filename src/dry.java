import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class dry extends dru<drz> {
   public dry(Codec<drz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<drz> $$0) {
      auv $$1 = $$0.d();
      cuk $$2 = $$0.b();
      hx $$3 = $$0.e();
      ddc $$4 = ddc.a($$1);
      drz $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      edh $$7 = $$2.E().o().aX();
      edg $$8 = $$7.a($$5.b.get($$6));
      edg $$9 = $$7.a($$5.c.get($$6));
      csw $$10 = new csw($$3);
      dyy $$11 = new dyy($$10.d() - 16, $$2.J_(), $$10.e() - 16, $$10.f() + 16, $$2.al(), $$10.g() + 16);
      edc $$12 = new edc().a($$4).a($$11).a($$1);
      jb $$13 = $$8.a($$4);
      hx $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(doq.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.J_() + 10);
      hx $$19 = $$8.a($$14.h($$18), dbm.a, $$4);
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

   private static int a(cuk $$0, dyy $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         djh $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(cws.H) || $$3.a(cws.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
