import com.google.common.collect.Lists;
import java.util.List;

public class cxr extends cya {
   public cxr(cxx $$0) {
      super($$0);
   }

   public boolean a(cxy $$0, dcf $$1) {
      cuc $$2 = cuc.l;
      List<cuc> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awf.by)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof csw)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public cuc a(cxy $$0, jl.a $$1) {
      List<csw> $$2 = Lists.newArrayList();
      cuc $$3 = cuc.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuc $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awf.by)) {
               if (!$$3.e()) {
                  return cuc.l;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof csw $$6)) {
                  return cuc.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cwt.a($$3, $$2) : cuc.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyn<?> ap_() {
      return cyn.c;
   }
}
