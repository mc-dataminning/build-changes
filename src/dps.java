import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dps extends dqa<dsa> {
   private static final ImmutableList<cvf> a = ImmutableList.of(cvh.F, cvh.fn, cvh.fo, cvh.fp, cvh.fq, cvh.cv, cvh.ct);
   private static final ib[] b = ib.values();
   private static final double c = 0.9;

   public dps(Codec<dsa> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dsa> $$0) {
      boolean $$1 = false;
      atw $$2 = $$0.d();
      csz $$3 = $$0.b();
      dsa $$4 = $$0.f();
      hx $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (hx $$13 : hx.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            hx $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(csg $$0, hx $$1, dsa $$2) {
      dhn $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ib $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != ib.b || !$$5 && $$4 == ib.b) {
               return false;
            }
         }

         return true;
      }
   }
}
