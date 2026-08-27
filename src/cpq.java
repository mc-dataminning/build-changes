import com.google.common.collect.Lists;
import java.util.List;

public class cpq extends cpn {
   private static final cps a = cps.a(cmu.uo);

   public cpq(cpl $$0) {
      super($$0);
   }

   public boolean a(cik $$0, cti $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof clg) {
               $$2 = true;
            } else {
               if (!a.a($$5)) {
                  return false;
               }

               if ($$3) {
                  return false;
               }

               $$3 = true;
            }
         }
      }

      return $$3 && $$2;
   }

   public cmr a(cik $$0, iu $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cmr $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmr $$5 = $$0.a($$4);
         cmm $$6 = $$5.d();
         if ($$6 instanceof clg) {
            $$2.add(((clg)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cmr.f;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cpz<?> ar_() {
      return cpz.i;
   }
}
