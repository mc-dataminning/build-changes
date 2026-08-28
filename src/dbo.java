import java.util.ArrayList;
import java.util.List;

public class dbo extends dbl {
   private static final dbr c = dbr.a(cxl.rx);
   private static final dbr d = dbr.a(cxl.qb);
   private static final dbr e = dbr.a(cxl.vw);

   public dbo(dbi $$0) {
      super($$0);
   }

   public boolean a(dbj $$0, dgz $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cxh $$5 = $$0.a($$4);
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

   public cxh a(dbj $$0, jt.a $$1) {
      List<czu> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxh $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               czu $$6 = $$5.a(kv.ag);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cxh $$7 = new cxh(cxl.vv, 3);
      $$7.b(kv.ah, new czv($$3, $$2));
      return $$7;
   }

   @Override
   public dcf<dbo> a() {
      return dcf.g;
   }
}
