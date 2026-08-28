import java.util.ArrayList;
import java.util.List;

public class ddu extends ddr {
   private static final ddx d = ddx.a(czo.rE);
   private static final ddx e = ddx.a(czo.qi);
   private static final ddx f = ddx.a(czo.vF);

   public ddu(ddo $$0) {
      super($$0);
   }

   public boolean a(ddp $$0, djh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czk $$5 = $$0.a($$4);
            if (!$$5.f()) {
               if (d.a($$5)) {
                  if ($$2) {
                     return false;
                  }

                  $$2 = true;
               } else if (e.a($$5)) {
                  if (++$$3 > 3) {
                     return false;
                  }
               } else if (!f.a($$5)) {
                  return false;
               }
            }
         }

         return $$2 && $$3 >= 1;
      }
   }

   public czk a(ddp $$0, jh.a $$1) {
      List<dby> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (e.a($$5)) {
               $$3++;
            } else if (f.a($$5)) {
               dby $$6 = $$5.a(kk.ai);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      czk $$7 = new czk(czo.vE, 3);
      $$7.b(kk.aj, new dbz($$3, $$2));
      return $$7;
   }

   @Override
   public del<ddu> a() {
      return del.g;
   }
}
