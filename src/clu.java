import com.google.common.collect.Lists;
import java.util.List;

public class clu extends cmd {
   public clu(cma $$0) {
      super($$0);
   }

   public boolean a(cfb $$0, cpx $$1) {
      cjh $$2 = cjh.b;
      List<cjh> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof chz) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof chw)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cjh a(cfb $$0, hu $$1) {
      List<chw> $$2 = Lists.newArrayList();
      cjh $$3 = cjh.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cjc $$6 = $$5.d();
            if ($$6 instanceof chz) {
               if (!$$3.b()) {
                  return cjh.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof chw)) {
                  return cjh.b;
               }

               $$2.add((chw)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? chz.a($$3, $$2) : cjh.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cmo<?> an_() {
      return cmo.c;
   }
}
