import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class edl extends edu<efu> {
   private static final ImmutableList<dhm> a = ImmutableList.of(dho.F, dho.fn, dho.fo, dho.fp, dho.fq, dho.cv, dho.ct);
   private static final jk[] b = jk.values();
   private static final double c = 0.9;

   public edl(Codec<efu> $$0) {
      super($$0);
   }

   @Override
   public boolean a(edw<efu> $$0) {
      boolean $$1 = false;
      azn $$2 = $$0.d();
      dfg $$3 = $$0.b();
      efu $$4 = $$0.f();
      jf $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (jf $$13 : jf.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            jf $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(dek $$0, jf $$1, efu $$2) {
      dus $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (jk $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != jk.b || !$$5 && $$4 == jk.b) {
               return false;
            }
         }

         return true;
      }
   }
}
