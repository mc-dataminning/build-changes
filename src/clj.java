import com.google.common.collect.Lists;
import java.util.List;

public class clj extends clr {
   public clj(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      ciw $$2 = ciw.b;
      List<ciw> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof cho) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof chl)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public ciw a(ceq $$0, ht $$1) {
      List<chl> $$2 = Lists.newArrayList();
      ciw $$3 = ciw.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cir $$6 = $$5.d();
            if ($$6 instanceof cho) {
               if (!$$3.b()) {
                  return ciw.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof chl)) {
                  return ciw.b;
               }

               $$2.add((chl)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? cho.a($$3, $$2) : ciw.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmb<?> aj_() {
      return cmb.c;
   }
}
