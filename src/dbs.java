import java.util.ArrayList;
import java.util.List;

public class dbs extends dbq {
   private static final dbv c = dbv.a(cxo.rm);
   private static final dbv d = dbv.a(cxo.pQ);
   private static final dbv e = dbv.a(cxo.vl);

   public dbs(dbn $$0) {
      super($$0);
   }

   public boolean a(dbo $$0, dha $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
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

   public cxk a(dbo $$0, js.a $$1) {
      List<czz> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cxk $$5 = $$0.a($$4);
         if (!$$5.f()) {
            if (d.a($$5)) {
               $$3++;
            } else if (e.a($$5)) {
               czz $$6 = $$5.a(ku.ae);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cxk $$7 = new cxk(cxo.vk, 3);
      $$7.b(ku.af, new daa($$3, $$2));
      return $$7;
   }

   @Override
   public dci<dbs> a() {
      return dci.g;
   }
}
