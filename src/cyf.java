import com.google.common.collect.Lists;
import java.util.List;

public class cyf extends cyn {
   public cyf(cyl $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, dby $$1) {
      cup $$2 = cup.l;
      List<cup> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awy.by)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof ctj)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public cup a(cqk $$0, jk.a $$1) {
      List<ctj> $$2 = Lists.newArrayList();
      cup $$3 = cup.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awy.by)) {
               if (!$$3.e()) {
                  return cup.l;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof ctj $$6)) {
                  return cup.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cxh.a($$3, $$2) : cup.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyz<?> ao_() {
      return cyz.c;
   }
}
