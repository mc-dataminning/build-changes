import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class ebc extends ebk<edk> {
   private static final ImmutableList<dfh> a = ImmutableList.of(dfj.F, dfj.fn, dfj.fo, dfj.fp, dfj.fq, dfj.cv, dfj.ct);
   private static final jf[] b = jf.values();
   private static final double c = 0.9;

   public ebc(Codec<edk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<edk> $$0) {
      boolean $$1 = false;
      ayo $$2 = $$0.d();
      ddb $$3 = $$0.b();
      edk $$4 = $$0.f();
      ja $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (ja $$13 : ja.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            ja $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(dcg $$0, ja $$1, edk $$2) {
      dsk $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (jf $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != jf.b || !$$5 && $$4 == jf.b) {
               return false;
            }
         }

         return true;
      }
   }
}
