import com.google.common.collect.Lists;
import java.util.List;

public class cxs extends cyb {
   public cxs(cxy $$0) {
      super($$0);
   }

   public boolean a(cxz $$0, dcg $$1) {
      cud $$2 = cud.l;
      List<cud> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awf.by)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof csx)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public cud a(cxz $$0, jl.a $$1) {
      List<csx> $$2 = Lists.newArrayList();
      cud $$3 = cud.l;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cud $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awf.by)) {
               if (!$$3.e()) {
                  return cud.l;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof csx $$6)) {
                  return cud.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cwu.a($$3, $$2) : cud.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyo<?> ap_() {
      return cyo.c;
   }
}
