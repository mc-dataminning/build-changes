import java.util.ArrayList;
import java.util.List;

public class cyr extends cyp {
   private static final cyu a = cyu.a(cuu.qO);
   private static final cyu b = cyu.a(cuu.pu);
   private static final cyu c = cyu.a(cuu.uv);

   public cyr(cyn $$0) {
      super($$0);
   }

   public boolean a(cqm $$0, dca $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
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

   public cur a(cqm $$0, jk.a $$1) {
      List<cxk> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cur $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cxk $$6 = $$5.a(km.T);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cur $$7 = new cur(cuu.uu, 3);
      $$7.b(km.U, new cxl($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cur a(jk.a $$0) {
      return new cur(cuu.uu);
   }

   @Override
   public czb<?> ao_() {
      return czb.g;
   }
}
