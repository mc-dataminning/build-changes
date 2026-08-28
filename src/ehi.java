import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class ehi extends ehr<ejr> {
   private static final ImmutableList<dku> a = ImmutableList.of(dkw.I, dkw.fI, dkw.fJ, dkw.fK, dkw.fL, dkw.cD, dkw.cA);
   private static final jo[] b = jo.values();
   private static final double c = 0.9;

   public ehi(Codec<ejr> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<ejr> $$0) {
      boolean $$1 = false;
      azs $$2 = $$0.d();
      dio $$3 = $$0.b();
      ejr $$4 = $$0.f();
      jj $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (jj $$13 : jj.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            jj $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(dhq $$0, jj $$1, ejr $$2) {
      dym $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (jo $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != jo.b || !$$5 && $$4 == jo.b) {
               return false;
            }
         }

         return true;
      }
   }
}
