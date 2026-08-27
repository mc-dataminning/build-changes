import com.google.common.collect.Lists;
import java.util.List;

public class ctk extends cth {
   private static final ctm a = ctm.a(cqp.ut);

   public ctk(ctf $$0) {
      super($$0);
   }

   public boolean a(cmg $$0, cxb $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cpe) {
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

   public cqm a(cmg $$0, iz $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cqm $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqm $$5 = $$0.a($$4);
         cqh $$6 = $$5.d();
         if ($$6 instanceof cpe) {
            $$2.add(((cpe)$$6).c().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.b("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cqm.h;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public ctt<?> ar_() {
      return ctt.i;
   }
}
