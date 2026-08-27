import com.google.common.collect.Lists;
import java.util.List;

public class cnw extends cof {
   public cnw(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      clj $$2 = clj.b;
      List<clj> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckb) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof cjy)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public clj a(chc $$0, ip $$1) {
      List<cjy> $$2 = Lists.newArrayList();
      clj $$3 = clj.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cle $$6 = $$5.d();
            if ($$6 instanceof ckb) {
               if (!$$3.b()) {
                  return clj.b;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof cjy)) {
                  return clj.b;
               }

               $$2.add((cjy)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? ckb.a($$3, $$2) : clj.b;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cos<?> aq_() {
      return cos.c;
   }
}
