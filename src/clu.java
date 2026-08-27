import com.google.common.collect.Lists;
import java.util.List;

public class clu extends clr {
   private static final clw a = clw.a(ciz.tB);

   public clu(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      boolean $$2 = false;
      boolean $$3 = false;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chl) {
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

   public ciw a(ceq $$0, ht $$1) {
      List<Integer> $$2 = Lists.newArrayList();
      ciw $$3 = null;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         cir $$6 = $$5.d();
         if ($$6 instanceof chl) {
            $$2.add(((chl)$$6).d().f());
         } else if (a.a($$5)) {
            $$3 = $$5.c(1);
         }
      }

      if ($$3 != null && !$$2.isEmpty()) {
         $$3.a("Explosion").b("FadeColors", $$2);
         return $$3;
      } else {
         return ciw.b;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.i;
   }
}
