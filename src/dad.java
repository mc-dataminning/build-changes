import java.util.ArrayList;
import java.util.List;

public class dad extends dab {
   private static final dag a = dag.a(cvw.qP);
   private static final dag b = dag.a(cvw.pv);
   private static final dag c = dag.a(cvw.ux);

   public dad(czy $$0) {
      super($$0);
   }

   public boolean a(czz $$0, dej $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
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

   public cvs a(czz $$0, jq.a $$1) {
      List<cyl> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cvs $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cyl $$6 = $$5.a(ks.Z);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cvs $$7 = new cvs(cvw.uw, 3);
      $$7.b(ks.aa, new cym($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cvs a(jq.a $$0) {
      return new cvs(cvw.uw);
   }

   @Override
   public dap<?> ar_() {
      return dap.g;
   }
}
