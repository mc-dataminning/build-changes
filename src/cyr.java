import java.util.ArrayList;
import java.util.List;

public class cyr extends cyp {
   private static final cyu a = cyu.a(cur.qO);
   private static final cyu b = cyu.a(cur.pu);
   private static final cyu c = cyu.a(cur.uv);

   public cyr(cym $$0) {
      super($$0);
   }

   public boolean a(cyn $$0, dcu $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (a.a($$5)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else if (b.a($$5)) {
               if (++$$3 > 3) {
                  return false;
               }
            } else if (!c.a($$5)) {
               return false;
            }
         }
      }

      return $$2 && $$3 >= 1;
   }

   public cuo a(cyn $$0, jo.a $$1) {
      List<cxj> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.a(); $$4++) {
         cuo $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cxj $$6 = $$5.a(kq.U);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cuo $$7 = new cuo(cur.uu, 3);
      $$7.b(kq.V, new cxk($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuo a(jo.a $$0) {
      return new cuo(cur.uu);
   }

   @Override
   public czc<?> ap_() {
      return czc.g;
   }
}
