import java.util.ArrayList;
import java.util.List;

public class cwa extends cvy {
   private static final cwd a = cwd.a(csg.qO);
   private static final cwd b = cwd.a(csg.pu);
   private static final cwd c = cwd.a(csg.uv);

   public cwa(cvw $$0) {
      super($$0);
   }

   public boolean a(cnx $$0, czu $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
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

   public csd a(cnx $$0, jj $$1) {
      List<cuu> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         csd $$5 = $$0.a($$4);
         if (!$$5.d()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cuu $$6 = $$5.a(jz.J);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      csd $$7 = new csd(csg.uu, 3);
      $$7.b(jz.K, new cuv($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public csd a(jj $$0) {
      return new csd(csg.uu);
   }

   @Override
   public cwk<?> ao_() {
      return cwk.g;
   }
}
