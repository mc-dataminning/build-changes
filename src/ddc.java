import java.util.ArrayList;
import java.util.List;

public class ddc extends dcz {
   private static final ddf c = ddf.a(cyw.rz);
   private static final ddf d = ddf.a(cyw.qd);
   private static final ddf e = ddf.a(cyw.vy);

   public ddc(dcw $$0) {
      super($$0);
   }

   public boolean a(dcx $$0, dip $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cys $$5 = $$0.a($$4);
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

   public cys a(dcx $$0, jg.a $$1) {
      List<dbg> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cys $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               dbg $$6 = $$5.a(kj.ai);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cys $$7 = new cys(cyw.vx, 3);
      $$7.b(kj.aj, new dbh($$3, $$2));
      return $$7;
   }

   @Override
   public ddt<ddc> a() {
      return ddt.g;
   }
}
