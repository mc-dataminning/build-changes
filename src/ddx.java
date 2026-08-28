import java.util.ArrayList;
import java.util.List;

public class ddx extends ddu {
   private static final dea d = dea.a(czr.rE);
   private static final dea e = dea.a(czr.qi);
   private static final dea f = dea.a(czr.vF);

   public ddx(ddr $$0) {
      super($$0);
   }

   public boolean a(dds $$0, djm $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czn $$5 = $$0.a($$4);
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

   public czn a(dds $$0, jh.a $$1) {
      List<dcb> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czn $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (e.a($$5)) {
               $$3++;
            } else if (f.a($$5)) {
               dcb $$6 = $$5.a(kk.ai);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      czn $$7 = new czn(czr.vE, 3);
      $$7.b(kk.aj, new dcc($$3, $$2));
      return $$7;
   }

   @Override
   public deo<ddx> a() {
      return deo.g;
   }
}
