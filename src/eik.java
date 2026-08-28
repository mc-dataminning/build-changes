import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class eik extends eit<ekt> {
   private static final ImmutableList<dlu> a = ImmutableList.of(dlw.I, dlw.fI, dlw.fJ, dlw.fK, dlw.fL, dlw.cD, dlw.cA);
   private static final ja[] b = ja.values();
   private static final double c = 0.9;

   public eik(Codec<ekt> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eiv<ekt> $$0) {
      boolean $$1 = false;
      azt $$2 = $$0.d();
      djo $$3 = $$0.b();
      ekt $$4 = $$0.f();
      iu $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (iu $$13 : iu.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            iu $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(diq $$0, iu $$1, ekt $$2) {
      dzo $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ja $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != ja.b || !$$5 && $$4 == ja.b) {
               return false;
            }
         }

         return true;
      }
   }
}
