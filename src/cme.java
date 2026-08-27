import com.google.common.collect.Lists;
import java.util.List;

public class cme extends cmb {
   private static final cmg a = cmg.a(cji.tB);

   public cme(cly $$0) {
      super($$0);
   }

   public boolean a(cez $$0, cpv $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chu) {
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

   public cjf a(cez $$0, hr $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cjf $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjf $$5 = $$0.a($$4);
         cja $$6 = $$5.d();
         if ($$6 instanceof chu) {
            $$2.add(((chu)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cjf.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmm<?> an_() {
      return cmm.i;
   }
}
