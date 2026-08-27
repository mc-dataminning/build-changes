import java.util.ArrayList;
import java.util.List;

public class cxo extends cxm {
   private static final cxr a = cxr.a(ctr.qO);
   private static final cxr b = cxr.a(ctr.pu);
   private static final cxr c = cxr.a(ctr.uv);

   public cxo(cxk $$0) {
      super($$0);
   }

   public boolean a(cpj $$0, dax $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
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

   public cto a(cpj $$0, iz.a $$1) {
      List<cwh> $$2 = new ArrayList<>();
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cto $$5 = $$0.a($$4);
         if (!$$5.e()) {
            if (b.a($$5)) {
               $$3++;
            } else if (c.a($$5)) {
               cwh $$6 = $$5.a(kb.S);
               if ($$6 != null) {
                  $$2.add($$6);
               }
            }
         }
      }

      cto $$7 = new cto(ctr.uu, 3);
      $$7.b(kb.T, new cwi($$3, $$2));
      return $$7;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cto a(iz.a $$0) {
      return new cto(ctr.uu);
   }

   @Override
   public cxy<?> ao_() {
      return cxy.g;
   }
}
