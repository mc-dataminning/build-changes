import com.google.common.collect.Lists;
import java.util.List;

public class cpu extends cqc {
   public cpu(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      cng $$2 = cng.f;
      List<cng> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof clz) {
               if (!$$2.b()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.d() instanceof clw)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.b() && !$$3.isEmpty();
   }

   public cng a(ciz $$0, iu $$1) {
      List<clw> $$2 = Lists.newArrayList();
      cng $$3 = cng.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            cnb $$6 = $$5.d();
            if ($$6 instanceof clz) {
               if (!$$3.b()) {
                  return cng.f;
               }

               $$3 = $$5.p();
            } else {
               if (!($$6 instanceof clw)) {
                  return cng.f;
               }

               $$2.add((clw)$$6);
            }
         }
      }

      return !$$3.b() && !$$2.isEmpty() ? clz.a($$3, $$2) : cng.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cqo<?> at_() {
      return cqo.c;
   }
}
