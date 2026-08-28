import java.util.ArrayList;
import java.util.List;

public class dai extends dag {
   private static final dal a = dal.a(cwf.qP);
   private static final dal b = dal.a(cwf.pv);
   private static final dal c = dal.a(cwf.ux);

   public dai(dad $$0) {
      super($$0);
   }

   public boolean a(dae $$0, dfb $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
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

   public cwb a(dae $$0, js.a $$1) {
      List<cyq> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwb $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cyq $$6 = $$5.a(ku.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cwb $$7 = new cwb(cwf.uw, 3);
      $$7.b(ku.af, new cyr($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwb a(js.a $$0) {
      return new cwb(cwf.uw);
   }

   @Override
   public dau<?> aq_() {
      return dau.g;
   }
}
