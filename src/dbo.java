import java.util.ArrayList;
import java.util.List;

public class dbo extends dbl {
   private static final dbr c = dbr.a(cxk.rv);
   private static final dbr d = dbr.a(cxk.pZ);
   private static final dbr e = dbr.a(cxk.vu);

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
            cxg $$5 = $$0.a($$4);
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

   public cxg a(dbj $$0, js.a $$1) {
      List<czv> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxg $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               czv $$6 = $$5.a(ku.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cxg $$7 = new cxg(cxk.vt, 3);
      $$7.b(ku.af, new czw($$3, $$2));
      return $$7;
   }

   @Override
   public dcf<dbo> a() {
      return dcf.g;
   }
}
