import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class eaq extends eay<ecy> {
   private static final ImmutableList<dez> a = ImmutableList.of(dfb.F, dfb.fn, dfb.fo, dfb.fp, dfb.fq, dfb.cv, dfb.ct);
   private static final je[] b = je.values();
   private static final double c = 0.9;

   public eaq(Codec<ecy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eba<ecy> $$0) {
      boolean $$1 = false;
      azh $$2 = $$0.d();
      dct $$3 = $$0.b();
      ecy $$4 = $$0.f();
      iz $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (iz $$13 : iz.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            iz $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(dbz $$0, iz $$1, ecy $$2) {
      dsc $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (je $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != je.b || !$$5 && $$4 == je.b) {
               return false;
            }
         }

         return true;
      }
   }
}
