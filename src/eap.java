import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class eap extends eax<ecx> {
   private static final ImmutableList<dey> a = ImmutableList.of(dfa.F, dfa.fn, dfa.fo, dfa.fp, dfa.fq, dfa.cv, dfa.ct);
   private static final je[] b = je.values();
   private static final double c = 0.9;

   public eap(Codec<ecx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<ecx> $$0) {
      boolean $$1 = false;
      azg $$2 = $$0.d();
      dcs $$3 = $$0.b();
      ecx $$4 = $$0.f();
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

   private static boolean a(dby $$0, iz $$1, ecx $$2) {
      dsb $$3 = $$0.a_($$1);
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
