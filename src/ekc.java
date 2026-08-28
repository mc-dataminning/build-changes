import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class ekc extends ekm<emm> {
   private static final ImmutableList<dne> a = ImmutableList.of(dng.I, dng.fM, dng.fN, dng.fO, dng.fP, dng.cG, dng.cD);
   private static final jc[] b = jc.values();
   private static final double c = 0.9;

   public ekc(Codec<emm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eko<emm> $$0) {
      boolean $$1 = false;
      azz $$2 = $$0.d();
      dky $$3 = $$0.b();
      emm $$4 = $$0.f();
      iw $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (iw $$13 : iw.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            iw $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(dka $$0, iw $$1, emm $$2) {
      ebg $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (jc $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != jc.b || !$$5 && $$4 == jc.b) {
               return false;
            }
         }

         return true;
      }
   }
}
