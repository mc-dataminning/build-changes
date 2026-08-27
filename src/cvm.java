import java.util.ArrayList;
import java.util.List;

public class cvm extends cvk {
   private static final cvp a = cvp.a(crv.qN);
   private static final cvp b = cvp.a(crv.pt);
   private static final cvp c = cvp.a(crv.ut);

   public cvm(cvi $$0) {
      super($$0);
   }

   public boolean a(cnm $$0, czg $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
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

   public crs a(cnm $$0, jb $$1) {
      List<cug> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         crs $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cug $$6 = $$5.a(jr.J);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      crs $$7 = new crs(crv.us, 3);
      $$7.b(jr.K, new cuh($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public crs a(jb $$0) {
      return new crs(crv.us);
   }

   @Override
   public cvw<?> ao_() {
      return cvw.g;
   }
}
