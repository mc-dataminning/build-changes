import com.google.common.collect.Lists;
import java.util.List;

public class coo extends cok {
   private static final coq a = coq.a(clr.un);

   public coo(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckd) {
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

   public clo a(chh $$0, it $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      clo $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
         clj $$6 = $$5.d();
         if ($$6 instanceof ckd) {
            $$2.add(((ckd)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return clo.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cox<?> as_() {
      return cox.i;
   }
}
