import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dtk extends dts<dvs> {
   private static final ImmutableList<cyo> a = ImmutableList.of(cyq.F, cyq.fn, cyq.fo, cyq.fp, cyq.fq, cyq.cv, cyq.ct);
   private static final ie[] b = ie.values();
   private static final double c = 0.9;

   public dtk(Codec<dvs> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dtu<dvs> $$0) {
      boolean $$1 = false;
      awo $$2 = $$0.d();
      cwi $$3 = $$0.b();
      dvs $$4 = $$0.f();
      hz $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (hz $$13 : hz.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            hz $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(cvo $$0, hz $$1, dvs $$2) {
      dlf $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ie $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != ie.b || !$$5 && $$4 == ie.b) {
               return false;
            }
         }

         return true;
      }
   }
}
