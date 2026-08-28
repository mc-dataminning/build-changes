import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class ekm extends ekw<emw> {
   private static final ImmutableList<dno> a = ImmutableList.of(dnq.I, dnq.fM, dnq.fN, dnq.fO, dnq.fP, dnq.cG, dnq.cD);
   private static final jc[] b = jc.values();
   private static final double c = 0.9;

   public ekm(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<emw> $$0) {
      boolean $$1 = false;
      bai $$2 = $$0.d();
      dli $$3 = $$0.b();
      emw $$4 = $$0.f();
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

   private static boolean a(dkk $$0, iw $$1, emw $$2) {
      ebq $$3 = $$0.a_($$1);
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
