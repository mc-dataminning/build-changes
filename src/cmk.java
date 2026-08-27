import com.google.common.collect.Lists;
import java.util.List;

public class cmk extends cmh {
   private static final cmm a = cmm.a(cjo.tB);

   public cmk(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cia) {
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

   public cjl a(cff $$0, hr $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      cjl $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
         cjg $$6 = $$5.d();
         if ($$6 instanceof cia) {
            $$2.add(((cia)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return cjl.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cms<?> an_() {
      return cms.i;
   }
}
