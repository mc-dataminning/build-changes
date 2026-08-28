import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class ebo extends ebk<ebp> {
   public ebo(Codec<ebp> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<ebp> $$0) {
      ayo $$1 = $$0.d();
      ddb $$2 = $$0.b();
      ja $$3 = $$0.e();
      dlu $$4 = dlu.a($$1);
      ebp $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      emx $$7 = $$2.E().o().bb();
      emw $$8 = $$7.a($$5.b.get($$6));
      emw $$9 = $$7.a($$5.c.get($$6));
      dbm $$10 = new dbm($$3);
      eio $$11 = new eio($$10.d() - 16, $$2.I_(), $$10.e() - 16, $$10.f() + 16, $$2.am(), $$10.g() + 16);
      ems $$12 = new ems().a($$4).a($$11).a($$1);
      ke $$13 = $$8.a($$4);
      ja $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dyf.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.I_() + 10);
      ja $$19 = $$8.a($$14.h($$18), dke.a, $$4);
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

   private static int a(ddb $$0, eio $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dsk $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(dfj.H) || $$3.a(dfj.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
