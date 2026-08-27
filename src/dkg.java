import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class dkg extends dko<dmo> {
   private static final ImmutableList<cpn> a = ImmutableList.of(cpo.F, cpo.fn, cpo.fo, cpo.fp, cpo.fq, cpo.cv, cpo.ct);
   private static final ha[] b = ha.values();
   private static final double c = 0.9;

   public dkg(Codec<dmo> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dkq<dmo> $$0) {
      boolean $$1 = false;
      apf $$2 = $$0.d();
      cng $$3 = $$0.b();
      dmo $$4 = $$0.f();
      gu $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (gu $$13 : gu.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            gu $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(cmn $$0, gu $$1, dmo $$2) {
      dcb $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (ha $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).i();
            if ($$5 && $$4 != ha.b || !$$5 && $$4 == ha.b) {
               return false;
            }
         }

         return true;
      }
   }
}
