import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class ehv extends ehr<ehw> {
   public ehv(Codec<ehw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ehw> $$0) {
      azs $$1 = $$0.d();
      dio $$2 = $$0.b();
      jj $$3 = $$0.e();
      drm $$4 = drm.a($$1);
      ehw $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      etj $$7 = $$2.a().p().aY();
      eti $$8 = $$7.a($$5.b.get($$6));
      eti $$9 = $$7.a($$5.c.get($$6));
      dgw $$10 = new dgw($$3);
      eoy $$11 = new eoy($$10.d() - 16, $$2.G_(), $$10.e() - 16, $$10.f() + 16, $$2.ao(), $$10.g() + 16);
      ete $$12 = new ete().a($$4).a($$11).a($$1);
      kn $$13 = $$8.a($$4);
      jj $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(eel.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.G_() + 10);
      jj $$19 = $$8.a($$14.h($$18), dpv.a, $$4);
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

   private static int a(dio $$0, eoy $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         dym $$3 = $$0.a_($$2x);
         if ($$3.l() || $$3.a(dkw.K) || $$3.a(dkw.J)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
