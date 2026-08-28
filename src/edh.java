import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class edh extends edq<efq> {
   private static final ImmutableList<dhj> a = ImmutableList.of(dhl.F, dhl.fn, dhl.fo, dhl.fp, dhl.fq, dhl.cv, dhl.ct);
   private static final jj[] b = jj.values();
   private static final double c = 0.9;

   public edh(Codec<efq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<efq> $$0) {
      boolean $$1 = false;
      azl $$2 = $$0.d();
      dfd $$3 = $$0.b();
      efq $$4 = $$0.f();
      je $$5 = $$0.e();
      boolean $$6 = $$2.j() < 0.9;
      int $$7 = $$6 ? $$4.d().a($$2) : 0;
      int $$8 = $$6 ? $$4.d().a($$2) : 0;
      boolean $$9 = $$6 && $$7 != 0 && $$8 != 0;
      int $$10 = $$4.c().a($$2);
      int $$11 = $$4.c().a($$2);
      int $$12 = Math.max($$10, $$11);

      for (je $$13 : je.a($$5, $$10, 0, $$11)) {
         if ($$13.k($$5) > $$12) {
            break;
         }

         if (a($$3, $$13, $$4)) {
            if ($$9) {
               $$1 = true;
               this.a($$3, $$13, $$4.b());
            }

            je $$14 = $$13.b($$7, 0, $$8);
            if (a($$3, $$14, $$4)) {
               $$1 = true;
               this.a($$3, $$14, $$4.a());
            }
         }
      }

      return $$1;
   }

   private static boolean a(deh $$0, je $$1, efq $$2) {
      duo $$3 = $$0.a_($$1);
      if ($$3.a($$2.a().b())) {
         return false;
      } else if (a.contains($$3.b())) {
         return false;
      } else {
         for (jj $$4 : b) {
            boolean $$5 = $$0.a_($$1.a($$4)).l();
            if ($$5 && $$4 != jj.b || !$$5 && $$4 == jj.b) {
               return false;
            }
         }

         return true;
      }
   }
}
