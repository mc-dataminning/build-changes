import java.util.ArrayList;
import java.util.List;

public class dce extends dcb {
   private static final dch c = dch.a(cyc.rz);
   private static final dch d = dch.a(cyc.qd);
   private static final dch e = dch.a(cyc.vy);

   public dce(dby $$0) {
      super($$0);
   }

   public boolean a(dbz $$0, dhp $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxy $$5 = $$0.a($$4);
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

   public cxy a(dbz $$0, ju.a $$1) {
      List<dak> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               dak $$6 = $$5.a(kx.ag);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cxy $$7 = new cxy(cyc.vx, 3);
      $$7.b(kx.ah, new dal($$3, $$2));
      return $$7;
   }

   @Override
   public dcv<dce> a() {
      return dcv.g;
   }
}
