import com.mojang.serialization.Codec;
import org.apache.commons.lang3.mutable.MutableInt;

public class eab extends dzx<eac> {
   public eab(Codec<eac> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dzz<eac> $$0) {
      ayk $$1 = $$0.d();
      dbs $$2 = $$0.b();
      io $$3 = $$0.e();
      dkl $$4 = dkl.a($$1);
      eac $$5 = $$0.f();
      int $$6 = $$1.a($$5.b.size());
      elk $$7 = $$2.E().o().ba();
      elj $$8 = $$7.a($$5.b.get($$6));
      elj $$9 = $$7.a($$5.c.get($$6));
      dae $$10 = new dae($$3);
      ehb $$11 = new ehb($$10.d() - 16, $$2.I_(), $$10.e() - 16, $$10.f() + 16, $$2.al(), $$10.g() + 16);
      elf $$12 = new elf().a($$4).a($$11).a($$1);
      js $$13 = $$8.a($$4);
      io $$14 = $$3.b(-$$13.u() / 2, 0, -$$13.w() / 2);
      int $$15 = $$3.v();

      for (int $$16 = 0; $$16 < $$13.u(); $$16++) {
         for (int $$17 = 0; $$17 < $$13.w(); $$17++) {
            $$15 = Math.min($$15, $$2.a(dwt.a.c, $$14.u() + $$16, $$14.w() + $$17));
         }
      }

      int $$18 = Math.max($$15 - 15 - $$1.a(10), $$2.I_() + 10);
      io $$19 = $$8.a($$14.h($$18), div.a, $$4);
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

   private static int a(dbs $$0, ehb $$1) {
      MutableInt $$2 = new MutableInt(0);
      $$1.a($$2x -> {
         drb $$3 = $$0.a_($$2x);
         if ($$3.i() || $$3.a(dea.H) || $$3.a(dea.G)) {
            $$2.add(1);
         }
      });
      return $$2.getValue();
   }
}
