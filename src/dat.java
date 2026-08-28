import java.util.ArrayList;
import java.util.List;

public class dat extends dar {
   private static final daw a = daw.a(cwq.qP);
   private static final daw b = daw.a(cwq.pv);
   private static final daw c = daw.a(cwq.uN);

   public dat(dao $$0) {
      super($$0);
   }

   public boolean a(dap $$0, dfm $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
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

   public cwm a(dap $$0, js.a $$1) {
      List<czb> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwm $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               czb $$6 = $$5.a(ku.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cwm $$7 = new cwm(cwq.uM, 3);
      $$7.b(ku.af, new czc($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cwm a(js.a $$0) {
      return new cwm(cwq.uM);
   }

   @Override
   public dbf<?> ap_() {
      return dbf.g;
   }
}
