import com.google.common.collect.Lists;
import java.util.List;

public class cqf extends cqc {
   private static final cqh a = cqh.a(cnj.ur);

   public cqf(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof clw) {
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

   public cng a(ciz $$0, iu $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cng $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         cnb $$6 = $$5.d();
         if ($$6 instanceof clw) {
            $$2.add(((clw)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cng.f;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cqo<?> at_() {
      return cqo.i;
   }
}
