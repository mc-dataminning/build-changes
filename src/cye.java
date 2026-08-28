import com.google.common.collect.Lists;
import java.util.List;

public class cye extends cym {
   public cye(cyk $$0) {
      super($$0);
   }

   public boolean a(cqj $$0, dbx $$1) {
      cuo $$2 = cuo.l;
      List<cuo> $$3 = Lists.newArrayList();

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awx.by)) {
               if (!$$2.e()) {
                  return false;
               }

               $$2 = $$5;
            } else {
               if (!($$5.g() instanceof cti)) {
                  return false;
               }

               $$3.add($$5);
            }
         }
      }

      return !$$2.e() && !$$3.isEmpty();
   }

   public cuo a(cqj $$0, jk.a $$1) {
      List<cti> $$2 = Lists.newArrayList();
      cuo $$3 = cuo.l;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if ($$5.a(awx.by)) {
               if (!$$3.e()) {
                  return cuo.l;
               }

               $$3 = $$5.s();
            } else {
               if (!($$5.g() instanceof cti $$6)) {
                  return cuo.l;
               }

               $$2.add($$6);
            }
         }
      }

      return !$$3.e() && !$$2.isEmpty() ? cxg.a($$3, $$2) : cuo.l;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cyy<?> ao_() {
      return cyy.c;
   }
}
