import java.util.ArrayList;
import java.util.List;

public class dbx extends dbu {
   private static final dca c = dca.a(cxt.rm);
   private static final dca d = dca.a(cxt.pQ);
   private static final dca e = dca.a(cxt.vl);

   public dbx(dbr $$0) {
      super($$0);
   }

   public boolean a(dbs $$0, dhi $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxp $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (c.a($$5)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else if (d.a($$5)) {
                  if (++$$3 > 3) {
                     return false;
                  }
               } else if (!e.a($$5)) {
                  return false;
               }
            }
         }

         return $$2 && $$3 >= 1;
      }
   }

   public cxp a(dbs $$0, js.a $$1) {
      List<dae> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               dae $$6 = $$5.a(ku.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cxp $$7 = new cxp(cxt.vk, 3);
      $$7.b(ku.af, new daf($$3, $$2));
      return $$7;
   }

   @Override
   public dco<dbx> a() {
      return dco.g;
   }
}
