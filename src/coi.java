import com.google.common.collect.Lists;
import java.util.List;

public class coi extends cof {
   private static final cok a = cok.a(clm.un);

   public coi(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cjy) {
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

   public clj a(chc $$0, ip $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      clj $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         cle $$6 = $$5.d();
         if ($$6 instanceof cjy) {
            $$2.add(((cjy)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return clj.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cos<?> aq_() {
      return cos.i;
   }
}
