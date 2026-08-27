import com.google.common.collect.Lists;
import java.util.List;

public class cpx extends cpu {
   private static final cpz a = cpz.a(cnb.uo);

   public cpx(cps $$0) {
      super($$0);
   }

   public boolean a(cir $$0, ctp $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cln) {
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

   public cmy a(cir $$0, iu $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cmy $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
         cmt $$6 = $$5.d();
         if ($$6 instanceof cln) {
            $$2.add(((cln)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cmy.f;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cqg<?> ar_() {
      return cqg.i;
   }
}
