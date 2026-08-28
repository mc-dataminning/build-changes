import java.util.ArrayList;
import java.util.List;

public class dax extends dau {
   private static final dba c = dba.a(cwt.rv);
   private static final dba d = dba.a(cwt.pZ);
   private static final dba e = dba.a(cwt.vu);

   public dax(dar $$0) {
      super($$0);
   }

   public boolean a(das $$0, dgi $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwp $$5 = $$0.a($$4);
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

   public cwp a(das $$0, jt.a $$1) {
      List<cze> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwp $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               cze $$6 = $$5.a(kv.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cwp $$7 = new cwp(cwt.vt, 3);
      $$7.b(kv.af, new czf($$3, $$2));
      return $$7;
   }

   @Override
   public dbo<dax> a() {
      return dbo.g;
   }
}
