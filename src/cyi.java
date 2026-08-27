import com.google.common.collect.Lists;
import java.util.List;

public class cyi extends cyq {
   public cyi(cyo $$0) {
      super($$0);
   }

   public boolean a(cpw $$0, dca $$1) {
      cuh $$2 = cuh.i;
      List<cuh> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(awm.bA)) {
               if (!$$2.d()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.f() instanceof csz)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.d() && !$$3.isEmpty();
   }

   public cuh a(cpw $$0, jc.a $$1) {
      List<csz> $$2 = Lists.newArrayList();
      cuh $$3 = cuh.i;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuh $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if ($$5.a(awm.bA)) {
               if (!$$3.d()) {
                  return cuh.i;
               }

               $$3 = $$5.r();
            } else {
               if (!($$5.f() instanceof csz $$6)) {
                  return cuh.i;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.d() && !$$2.isEmpty() ? cxi.a($$3, $$2) : cuh.i;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cze<?> ao_() {
      return cze.d;
   }
}
