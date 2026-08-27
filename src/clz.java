import com.google.common.collect.Lists;
import java.util.List;

public class clz extends clw {
   private static final cmb a = cmb.a(cjd.tB);

   public clz(clt $$0) {
      super($$0);
   }

   public boolean a(ceu $$0, cpq $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chp) {
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

   public cja a(ceu $$0, hu $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cja $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
         civ $$6 = $$5.d();
         if ($$6 instanceof chp) {
            $$2.add(((chp)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cja.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmh<?> ai_() {
      return cmh.i;
   }
}
