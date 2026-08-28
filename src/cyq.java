import java.util.ArrayList;
import java.util.List;

public class cyq extends cyo {
   private static final cyt a = cyt.a(cut.qO);
   private static final cyt b = cyt.a(cut.pu);
   private static final cyt c = cyt.a(cut.uv);

   public cyq(cym $$0) {
      super($$0);
   }

   public boolean a(cql $$0, dbz $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (a.a($$5)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else if (b.a($$5)) {
               if (++$$3 > 3) {
                  return false;
               }
            } else if (!c.a($$5)) {
               return false;
            }
         }
      }

      return $$2 && $$3 >= 1;
   }

   public cuq a(cql $$0, jk.a $$1) {
      List<cxj> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cxj $$6 = $$5.a(km.T);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cuq $$7 = new cuq(cut.uu, 3);
      $$7.b(km.U, new cxk($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuq a(jk.a $$0) {
      return new cuq(cut.uu);
   }

   @Override
   public cza<?> ao_() {
      return cza.g;
   }
}
