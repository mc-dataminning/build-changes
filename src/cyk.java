import java.util.ArrayList;
import java.util.List;

public class cyk extends cyi {
   private static final cyn a = cyn.a(cun.qO);
   private static final cyn b = cyn.a(cun.pu);
   private static final cyn c = cyn.a(cun.uv);

   public cyk(cyg $$0) {
      super($$0);
   }

   public boolean a(cqf $$0, dbt $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
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

   public cuk a(cqf $$0, jk.a $$1) {
      List<cxd> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cuk $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cxd $$6 = $$5.a(km.S);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cuk $$7 = new cuk(cun.uu, 3);
      $$7.b(km.T, new cxe($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cuk a(jk.a $$0) {
      return new cuk(cun.uu);
   }

   @Override
   public cyu<?> ap_() {
      return cyu.g;
   }
}
