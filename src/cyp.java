import java.util.ArrayList;
import java.util.List;

public class cyp extends cyn {
   private static final cys a = cys.a(cus.qO);
   private static final cys b = cys.a(cus.pu);
   private static final cys c = cys.a(cus.uv);

   public cyp(cyl $$0) {
      super($$0);
   }

   public boolean a(cqk $$0, dby $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
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

   public cup a(cqk $$0, jk.a $$1) {
      List<cxi> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cup $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cxi $$6 = $$5.a(km.T);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cup $$7 = new cup(cus.uu, 3);
      $$7.b(km.U, new cxj($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cup a(jk.a $$0) {
      return new cup(cus.uu);
   }

   @Override
   public cyz<?> ao_() {
      return cyz.g;
   }
}
