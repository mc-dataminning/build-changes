import java.util.ArrayList;
import java.util.List;

public class cyn extends cyl {
   private static final cyq a = cyq.a(cuq.qO);
   private static final cyq b = cyq.a(cuq.pu);
   private static final cyq c = cyq.a(cuq.uv);

   public cyn(cyj $$0) {
      super($$0);
   }

   public boolean a(cqi $$0, dbw $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
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

   public cun a(cqi $$0, jk.a $$1) {
      List<cxg> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cun $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cxg $$6 = $$5.a(km.S);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cun $$7 = new cun(cuq.uu, 3);
      $$7.b(km.T, new cxh($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cun a(jk.a $$0) {
      return new cun(cuq.uu);
   }

   @Override
   public cyx<?> ap_() {
      return cyx.g;
   }
}
