import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class ekq extends ekm<ekr> {
   public ekq(Codec<ekr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<ekr> $$0) {
      azz $$1 = $$0.d();
      dky $$2 = $$0.b();
      iw $$3 = $$0.e();
      dty $$4 = dty.a($$1);
      ekr $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      ewg $$7 = $$2.a().p().aY();
      ewf $$8 = $$7.a($$5.b.get($$6));
      ewf $$9 = $$7.a($$5.c.get($$6));
      dje $$10 = new dje($$3);
      erv $$11 = new erv($$10.d() - 16, $$2.K_(), $$10.e() - 16, $$10.f() + 16, $$2.ao(), $$10.g() + 16);
      ewb $$12 = new ewb().a($$4).a($$11).a($$1);
      kb $$13 = $$8.a($$4);
      iw $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(ehf.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.K_() + 10);
      iw $$19 = $$8.a($$14.h($$18), dsh.a, $$4);
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

   private static int a(dky $$0, erv $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         ebg $$3 = $$0.a_($$2x);
         if ($$3.l() || $$3.a(dng.K) || $$3.a(dng.J)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
