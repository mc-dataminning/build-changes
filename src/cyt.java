import java.util.ArrayList;
import java.util.List;

public class cyt extends cyr {
   private static final cyw a = cyw.a(cut.qO);
   private static final cyw b = cyw.a(cut.pu);
   private static final cyw c = cyw.a(cut.uv);

   public cyt(cyo $$0) {
      super($$0);
   }

   public boolean a(cyp $$0, dcw $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
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

   public cuq a(cyp $$0, jo.a $$1) {
      List<cxl> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuq $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cxl $$6 = $$5.a(kq.U);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cuq $$7 = new cuq(cut.uu, 3);
      $$7.b(kq.V, new cxm($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuq a(jo.a $$0) {
      return new cuq(cut.uu);
   }

   @Override
   public cze<?> at_() {
      return cze.g;
   }
}
