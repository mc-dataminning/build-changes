import com.google.common.collect.Lists;
import java.util.List;

public class cxp extends cxy {
   public cxp(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      cua $$2 = cua.l;
      List<cua> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awd.by)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof csu)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public cua a(cxw $$0, jl.a $$1) {
      List<csu> $$2 = Lists.newArrayList();
      cua $$3 = cua.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cua $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awd.by)) {
               if (!$$3.e()) {
                  return cua.l;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof csu $$6)) {
                  return cua.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cwr.a($$3, $$2) : cua.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyl<?> ap_() {
      return cyl.c;
   }
}
