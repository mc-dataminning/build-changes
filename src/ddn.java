import java.util.ArrayList;
import java.util.List;

public class ddn extends ddk {
   private static final ddq c = ddq.a(czh.rE);
   private static final ddq d = ddq.a(czh.qi);
   private static final ddq e = ddq.a(czh.vF);

   public ddn(ddh $$0) {
      super($$0);
   }

   public boolean a(ddi $$0, dja $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            czd $$5 = $$0.a($$4);
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

   public czd a(ddi $$0, jg.a $$1) {
      List<dbr> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         czd $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               dbr $$6 = $$5.a(kj.ai);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      czd $$7 = new czd(czh.vE, 3);
      $$7.b(kj.aj, new dbs($$3, $$2));
      return $$7;
   }

   @Override
   public dee<ddn> a() {
      return dee.g;
   }
}
