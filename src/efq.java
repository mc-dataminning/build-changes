import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class efq extends efz<ehz> {
   private static final ImmutableList<djn> a = ImmutableList.of(djp.I, djp.fI, djp.fJ, djp.fK, djp.fL, djp.cD, djp.cA);
   private static final jn[] b = jn.values();
   private static final double c = 0.9;

   public efq(Codec<ehz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(egb<ehz> $$0) {
      boolean $$1 = false;
      azh $$2 = $$0.d();
      dhh $$3 = $$0.b();
      ehz $$4 = $$0.f();
      ji $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (ji $$13 : ji.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            ji $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(dgk $$0, ji $$1, ehz $$2) {
      dwy $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (jn $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != jn.b || !$$5 && $$4 == jn.b) {
               return false;
            }
         }

         return true;
      }
   }
}
