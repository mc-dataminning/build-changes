import com.google.common.collect.Lists;
import java.util.List;

public class coa extends cnx {
   private static final coc a = coc.a(cle.tC);

   public coa(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cjq) {
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

   public clb a(cgu $$0, ip $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      clb $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         ckw $$6 = $$5.d();
         if ($$6 instanceof cjq) {
            $$2.add(((cjq)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return clb.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public coj<?> aq_() {
      return coj.i;
   }
}
