import com.google.common.collect.Lists;
import java.util.List;

public class csa extends crx {
   private static final csc a = csc.a(cpg.ur);

   public csa(crv $$0) {
      super($$0);
   }

   public boolean a(ckv $$0, cvr $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cns) {
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

   public cpd a(ckv $$0, iw $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cpd $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpd $$5 = $$0.a($$4);
         coy $$6 = $$5.d();
         if ($$6 instanceof cns) {
            $$2.add(((cns)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cpd.h;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csj<?> at_() {
      return csj.i;
   }
}
