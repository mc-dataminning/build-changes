import java.util.ArrayList;
import java.util.List;

public class ddi extends ddf {
   private static final ddl c = ddl.a(czc.rB);
   private static final ddl d = ddl.a(czc.qf);
   private static final ddl e = ddl.a(czc.vA);

   public ddi(ddc $$0) {
      super($$0);
   }

   public boolean a(ddd $$0, div $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cyy $$5 = $$0.a($$4);
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

   public cyy a(ddd $$0, jg.a $$1) {
      List<dbm> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cyy $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               dbm $$6 = $$5.a(kj.ai);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cyy $$7 = new cyy(czc.vz, 3);
      $$7.b(kj.aj, new dbn($$3, $$2));
      return $$7;
   }

   @Override
   public ddz<ddi> a() {
      return ddz.g;
   }
}
