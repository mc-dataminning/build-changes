import java.util.ArrayList;
import java.util.List;

public class daw extends dat {
   private static final daz c = daz.a(cws.rv);
   private static final daz d = daz.a(cws.pZ);
   private static final daz e = daz.a(cws.vu);

   public daw(daq $$0) {
      super($$0);
   }

   public boolean a(dar $$0, dgh $$1) {
      if ($$0.e() < 2) {
         return false;
      } else {
         boolean $$2 = false;
         int $$3 = 0;

         for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
            cwo $$5 = $$0.a($$4);
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

   public cwo a(dar $$0, jt.a $$1) {
      List<czd> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cwo $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               czd $$6 = $$5.a(kv.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cwo $$7 = new cwo(cws.vt, 3);
      $$7.b(kv.af, new cze($$3, $$2));
      return $$7;
   }

   @Override
   public dbn<daw> a() {
      return dbn.g;
   }
}
