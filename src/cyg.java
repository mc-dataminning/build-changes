import com.google.common.collect.Lists;
import java.util.List;

public class cyg extends cyo {
   public cyg(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      cuq $$2 = cuq.l;
      List<cuq> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awy.by)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof ctk)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public cuq a(cql $$0, jk.a $$1) {
      List<ctk> $$2 = Lists.newArrayList();
      cuq $$3 = cuq.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awy.by)) {
               if (!$$3.e()) {
                  return cuq.l;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof ctk $$6)) {
                  return cuq.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cxi.a($$3, $$2) : cuq.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cza<?> ao_() {
      return cza.c;
   }
}
