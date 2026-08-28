import java.util.ArrayList;
import java.util.List;

public class dav extends das {
   private static final day c = day.a(cwr.rv);
   private static final day d = day.a(cwr.pZ);
   private static final day e = day.a(cwr.vu);

   public dav(dap $$0) {
      super($$0);
   }

   public boolean a(daq $$0, dgg $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwn $$5 = $$0.a($$4);
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

   public cwn a(daq $$0, jt.a $$1) {
      List<czc> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwn $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               czc $$6 = $$5.a(kv.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cwn $$7 = new cwn(cwr.vt, 3);
      $$7.b(kv.af, new czd($$3, $$2));
      return $$7;
   }

   @Override
   public dbm<dav> a() {
      return dbm.g;
   }
}
